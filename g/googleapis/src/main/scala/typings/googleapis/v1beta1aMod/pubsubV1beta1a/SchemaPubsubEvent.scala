package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An event indicating a received message or truncation event.
  */
trait SchemaPubsubEvent extends StObject {
  
  /**
    * Indicates that this subscription has been deleted. (Note that pull
    * subscribers will always receive NOT_FOUND in response in their pull
    * request on the subscription, rather than seeing this boolean.)
    */
  var deleted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A received message.
    */
  var message: js.UndefOr[SchemaPubsubMessage] = js.undefined
  
  /**
    * The subscription that received the event.
    */
  var subscription: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates that this subscription has been truncated.
    */
  var truncated: js.UndefOr[Boolean] = js.undefined
}
object SchemaPubsubEvent {
  
  @scala.inline
  def apply(): SchemaPubsubEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPubsubEvent]
  }
  
  @scala.inline
  implicit class SchemaPubsubEventMutableBuilder[Self <: SchemaPubsubEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    @scala.inline
    def setMessage(value: SchemaPubsubMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
    
    @scala.inline
    def setTruncated(value: Boolean): Self = StObject.set(x, "truncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTruncatedUndefined: Self = StObject.set(x, "truncated", js.undefined)
  }
}
