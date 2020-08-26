package typings.googleapis.pubsubV1Mod.pubsubV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for the Acknowledge method.
  */
@js.native
trait SchemaAcknowledgeRequest extends js.Object {
  /**
    * The acknowledgment ID for the messages being acknowledged that was
    * returned by the Pub/Sub system in the `Pull` response. Must not be empty.
    */
  var ackIds: js.UndefOr[js.Array[String]] = js.native
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
    def setAckIdsVarargs(value: String*): Self = this.set("ackIds", js.Array(value :_*))
    @scala.inline
    def setAckIds(value: js.Array[String]): Self = this.set("ackIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAckIds: Self = this.set("ackIds", js.undefined)
  }
  
}

