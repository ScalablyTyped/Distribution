package typings.hellosignEmbedded.mod.HelloSign

import typings.hellosignEmbedded.anon.Ccemailaddresses
import typings.hellosignEmbedded.hellosignEmbeddedStrings.signature_request_sent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SentMessageEvent extends MessageEvent {
  var event: signature_request_sent = js.native
  var signature_request_id: String = js.native
  var signature_request_info: Ccemailaddresses = js.native
}

object SentMessageEvent {
  @scala.inline
  def apply(
    event: signature_request_sent,
    signature_request_id: String,
    signature_request_info: Ccemailaddresses
  ): SentMessageEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], signature_request_id = signature_request_id.asInstanceOf[js.Any], signature_request_info = signature_request_info.asInstanceOf[js.Any])
    __obj.asInstanceOf[SentMessageEvent]
  }
  @scala.inline
  implicit class SentMessageEventOps[Self <: SentMessageEvent] (val x: Self) extends AnyVal {
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
    def setEvent(value: signature_request_sent): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignature_request_id(value: String): Self = this.set("signature_request_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignature_request_info(value: Ccemailaddresses): Self = this.set("signature_request_info", value.asInstanceOf[js.Any])
  }
  
}

