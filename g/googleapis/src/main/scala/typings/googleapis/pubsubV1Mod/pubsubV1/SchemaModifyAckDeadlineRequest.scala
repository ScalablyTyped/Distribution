package typings.googleapis.pubsubV1Mod.pubsubV1

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
    * the Pub/Sub system. For example, if the value is 10, the new ack deadline
    * will expire 10 seconds after the `ModifyAckDeadline` call was made.
    * Specifying zero might immediately make the message available for delivery
    * to another subscriber client. This typically results in an increase in
    * the rate of message redeliveries (that is, duplicates). The minimum
    * deadline you can specify is 0 seconds. The maximum deadline you can
    * specify is 600 seconds (10 minutes).
    */
  var ackDeadlineSeconds: js.UndefOr[Double] = js.native
  
  /**
    * List of acknowledgment IDs.
    */
  var ackIds: js.UndefOr[js.Array[String]] = js.native
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
    def setAckIds(value: js.Array[String]): Self = StObject.set(x, "ackIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAckIdsUndefined: Self = StObject.set(x, "ackIds", js.undefined)
    
    @scala.inline
    def setAckIdsVarargs(value: String*): Self = StObject.set(x, "ackIds", js.Array(value :_*))
  }
}
