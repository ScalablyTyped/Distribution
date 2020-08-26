package typings.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionEndedEvent extends js.Object {
  var cause: String = js.native
  var message: js.UndefOr[IncomingResponse] = js.native
  var originator: String = js.native
}

object SessionEndedEvent {
  @scala.inline
  def apply(cause: String, originator: String): SessionEndedEvent = {
    val __obj = js.Dynamic.literal(cause = cause.asInstanceOf[js.Any], originator = originator.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionEndedEvent]
  }
  @scala.inline
  implicit class SessionEndedEventOps[Self <: SessionEndedEvent] (val x: Self) extends AnyVal {
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
    def setCause(value: String): Self = this.set("cause", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginator(value: String): Self = this.set("originator", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: IncomingResponse): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
  
}

