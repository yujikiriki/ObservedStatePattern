package com.lsc.pqr.example.listeners;

import java.util.List;

import co.s4n.os.EntityState;
import co.s4n.os.events.DomainEvent;
import co.s4n.os.events.EntityStateChangeListener;
import co.s4n.os.exceptions.BusinessException;

/**
 * EntityWithStates
 * NotificationXXXEventListener
 * @author Yuji Kiriki.
 * Nov 23, 2010
 */

public class NotificationXXXEventListener extends EntityStateChangeListener
{
//------------------------------
//        Attributes
//------------------------------
	
//------------------------------
//        Constructors
//------------------------------

	/**
	 * Constructor
	 */
	public NotificationXXXEventListener( List< DomainEvent< EntityState >> interestingDomainEvents )
	{
		super( interestingDomainEvents );
	}

//------------------------------
//          Methods
//------------------------------
	
	@Override
	public void update( ) throws BusinessException
	{
		throw new UnsupportedOperationException( "Fuck you!!! Don't touch my buttons." );
	}

	@Override
	public void update( DomainEvent< EntityState > message ) throws BusinessException
	{
		if( amIInterested( message ) )
			System.out.println( "Take your notification mother fucker!!!" );
		else
			System.out.println( "I'm not interested mother fucker ;-)" );
	}
	
//------------------------------
//       Private methods
//------------------------------
	
}



