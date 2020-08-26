package typings.hellosignEmbedded.mod.HelloSign

import typings.hellosignEmbedded.hellosignEmbeddedStrings.signature_request_declined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclinedMessageEvent extends MessageEvent {
  var event: signature_request_declined = js.native
  var signature_id: String = js.native
}

object DeclinedMessageEvent {
  @scala.inline
  def apply(event: signature_request_declined, signature_id: String): DeclinedMessageEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], signature_id = signature_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclinedMessageEvent]
  }
  @scala.inline
  implicit class DeclinedMessageEventOps[Self <: DeclinedMessageEvent] (val x: Self) extends AnyVal {
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
    def setEvent(value: signature_request_declined): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignature_id(value: String): Self = this.set("signature_id", value.asInstanceOf[js.Any])
  }
  
}

