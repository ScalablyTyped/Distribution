package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAcknowledgeRequest extends StObject {
  
  /**
    * The acknowledgment ID for the message being acknowledged. This was returned by the Pub/Sub system in the Pull response.
    */
  var ackId: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The subscription whose message is being acknowledged.
    */
  var subscription: js.UndefOr[String | Null] = js.undefined
}
object SchemaAcknowledgeRequest {
  
  inline def apply(): SchemaAcknowledgeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAcknowledgeRequest]
  }
  
  extension [Self <: SchemaAcknowledgeRequest](x: Self) {
    
    inline def setAckId(value: js.Array[String]): Self = StObject.set(x, "ackId", value.asInstanceOf[js.Any])
    
    inline def setAckIdNull: Self = StObject.set(x, "ackId", null)
    
    inline def setAckIdUndefined: Self = StObject.set(x, "ackId", js.undefined)
    
    inline def setAckIdVarargs(value: String*): Self = StObject.set(x, "ackId", js.Array(value*))
    
    inline def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionNull: Self = StObject.set(x, "subscription", null)
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
  }
}
