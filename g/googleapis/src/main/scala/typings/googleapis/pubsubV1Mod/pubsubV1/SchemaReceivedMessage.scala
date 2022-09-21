package typings.googleapis.pubsubV1Mod.pubsubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReceivedMessage extends StObject {
  
  /**
    * This ID can be used to acknowledge the received message.
    */
  var ackId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The approximate number of times that Cloud Pub/Sub has attempted to deliver the associated message to a subscriber. More precisely, this is 1 + (number of NACKs) + (number of ack_deadline exceeds) for this message. A NACK is any call to ModifyAckDeadline with a 0 deadline. An ack_deadline exceeds event is whenever a message is not acknowledged within ack_deadline. Note that ack_deadline is initially Subscription.ackDeadlineSeconds, but may get extended automatically by the client library. Upon the first delivery of a given message, `delivery_attempt` will have a value of 1. The value is calculated at best effort and is approximate. If a DeadLetterPolicy is not set on the subscription, this will be 0.
    */
  var deliveryAttempt: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The message.
    */
  var message: js.UndefOr[SchemaPubsubMessage] = js.undefined
}
object SchemaReceivedMessage {
  
  inline def apply(): SchemaReceivedMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReceivedMessage]
  }
  
  extension [Self <: SchemaReceivedMessage](x: Self) {
    
    inline def setAckId(value: String): Self = StObject.set(x, "ackId", value.asInstanceOf[js.Any])
    
    inline def setAckIdNull: Self = StObject.set(x, "ackId", null)
    
    inline def setAckIdUndefined: Self = StObject.set(x, "ackId", js.undefined)
    
    inline def setDeliveryAttempt(value: Double): Self = StObject.set(x, "deliveryAttempt", value.asInstanceOf[js.Any])
    
    inline def setDeliveryAttemptNull: Self = StObject.set(x, "deliveryAttempt", null)
    
    inline def setDeliveryAttemptUndefined: Self = StObject.set(x, "deliveryAttempt", js.undefined)
    
    inline def setMessage(value: SchemaPubsubMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
