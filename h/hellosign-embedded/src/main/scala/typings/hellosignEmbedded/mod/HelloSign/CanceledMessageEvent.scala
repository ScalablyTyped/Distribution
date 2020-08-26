package typings.hellosignEmbedded.mod.HelloSign

import typings.hellosignEmbedded.hellosignEmbeddedStrings.signature_request_canceled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanceledMessageEvent extends MessageEvent {
  var event: signature_request_canceled = js.native
}

object CanceledMessageEvent {
  @scala.inline
  def apply(event: signature_request_canceled): CanceledMessageEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanceledMessageEvent]
  }
  @scala.inline
  implicit class CanceledMessageEventOps[Self <: CanceledMessageEvent] (val x: Self) extends AnyVal {
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
    def setEvent(value: signature_request_canceled): Self = this.set("event", value.asInstanceOf[js.Any])
  }
  
}

