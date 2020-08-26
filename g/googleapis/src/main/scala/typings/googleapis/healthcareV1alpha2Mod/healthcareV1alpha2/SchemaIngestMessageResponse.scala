package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Acknowledges that a message has been ingested into the specified HL7v2
  * store.
  */
@js.native
trait SchemaIngestMessageResponse extends js.Object {
  /**
    * HL7v2 ACK message.
    */
  var hl7Ack: js.UndefOr[String] = js.native
  /**
    * Created message resource.
    */
  var message: js.UndefOr[SchemaMessage] = js.native
}

object SchemaIngestMessageResponse {
  @scala.inline
  def apply(): SchemaIngestMessageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIngestMessageResponse]
  }
  @scala.inline
  implicit class SchemaIngestMessageResponseOps[Self <: SchemaIngestMessageResponse] (val x: Self) extends AnyVal {
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
    def setHl7Ack(value: String): Self = this.set("hl7Ack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHl7Ack: Self = this.set("hl7Ack", js.undefined)
    @scala.inline
    def setMessage(value: SchemaMessage): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
  
}

