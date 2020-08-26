package typings.hellosignEmbedded.mod.HelloSign

import typings.hellosignEmbedded.hellosignEmbeddedStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorMessageEvent extends MessageEvent {
  var description: String = js.native
  var event: error = js.native
}

object ErrorMessageEvent {
  @scala.inline
  def apply(description: String, event: error): ErrorMessageEvent = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorMessageEvent]
  }
  @scala.inline
  implicit class ErrorMessageEventOps[Self <: ErrorMessageEvent] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvent(value: error): Self = this.set("event", value.asInstanceOf[js.Any])
  }
  
}

