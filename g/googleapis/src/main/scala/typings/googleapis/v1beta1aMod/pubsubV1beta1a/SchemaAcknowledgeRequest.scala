package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for the Acknowledge method.
  */
@js.native
trait SchemaAcknowledgeRequest extends StObject {
  
  /**
    * The acknowledgment ID for the message being acknowledged. This was
    * returned by the Pub/Sub system in the Pull response.
    */
  var ackId: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The subscription whose message is being acknowledged.
    */
  var subscription: js.UndefOr[String] = js.native
}
object SchemaAcknowledgeRequest {
  
  @scala.inline
  def apply(): SchemaAcknowledgeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAcknowledgeRequest]
  }
  
  @scala.inline
  implicit class SchemaAcknowledgeRequestMutableBuilder[Self <: SchemaAcknowledgeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAckId(value: js.Array[String]): Self = StObject.set(x, "ackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAckIdUndefined: Self = StObject.set(x, "ackId", js.undefined)
    
    @scala.inline
    def setAckIdVarargs(value: String*): Self = StObject.set(x, "ackId", js.Array(value :_*))
    
    @scala.inline
    def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
  }
}
