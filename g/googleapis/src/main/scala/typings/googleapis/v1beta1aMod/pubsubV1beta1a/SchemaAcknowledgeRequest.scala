package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for the Acknowledge method.
  */
@js.native
trait SchemaAcknowledgeRequest extends js.Object {
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
  implicit class SchemaAcknowledgeRequestOps[Self <: SchemaAcknowledgeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAckIdVarargs(value: String*): Self = this.set("ackId", js.Array(value :_*))
    @scala.inline
    def setAckId(value: js.Array[String]): Self = this.set("ackId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAckId: Self = this.set("ackId", js.undefined)
    @scala.inline
    def setSubscription(value: String): Self = this.set("subscription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscription: Self = this.set("subscription", js.undefined)
  }
  
}

