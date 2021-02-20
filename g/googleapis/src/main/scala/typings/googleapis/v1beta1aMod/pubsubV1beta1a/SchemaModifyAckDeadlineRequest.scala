package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for the ModifyAckDeadline method.
  */
@js.native
trait SchemaModifyAckDeadlineRequest extends StObject {
  
  /**
    * The new ack deadline with respect to the time this request was sent to
    * the Pub/Sub system. Must be &gt;= 0. For example, if the value is 10, the
    * new ack deadline will expire 10 seconds after the ModifyAckDeadline call
    * was made. Specifying zero may immediately make the message available for
    * another pull request.
    */
  var ackDeadlineSeconds: js.UndefOr[Double] = js.native
  
  /**
    * The acknowledgment ID. Either this or ack_ids must be populated, not
    * both.
    */
  var ackId: js.UndefOr[String] = js.native
  
  /**
    * List of acknowledgment IDs. Either this field or ack_id should be
    * populated, not both.
    */
  var ackIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Next Index: 5 The name of the subscription from which messages are being
    * pulled.
    */
  var subscription: js.UndefOr[String] = js.native
}
object SchemaModifyAckDeadlineRequest {
  
  @scala.inline
  def apply(): SchemaModifyAckDeadlineRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModifyAckDeadlineRequest]
  }
  
  @scala.inline
  implicit class SchemaModifyAckDeadlineRequestMutableBuilder[Self <: SchemaModifyAckDeadlineRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAckDeadlineSeconds(value: Double): Self = StObject.set(x, "ackDeadlineSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAckDeadlineSecondsUndefined: Self = StObject.set(x, "ackDeadlineSeconds", js.undefined)
    
    @scala.inline
    def setAckId(value: String): Self = StObject.set(x, "ackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAckIdUndefined: Self = StObject.set(x, "ackId", js.undefined)
    
    @scala.inline
    def setAckIds(value: js.Array[String]): Self = StObject.set(x, "ackIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAckIdsUndefined: Self = StObject.set(x, "ackIds", js.undefined)
    
    @scala.inline
    def setAckIdsVarargs(value: String*): Self = StObject.set(x, "ackIds", js.Array(value :_*))
    
    @scala.inline
    def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
  }
}
