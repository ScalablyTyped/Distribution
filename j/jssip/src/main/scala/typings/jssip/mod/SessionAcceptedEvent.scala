package typings.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionAcceptedEvent extends js.Object {
  var originator: String = js.native
  var response: js.UndefOr[IncomingResponse] = js.native
}

object SessionAcceptedEvent {
  @scala.inline
  def apply(originator: String): SessionAcceptedEvent = {
    val __obj = js.Dynamic.literal(originator = originator.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionAcceptedEvent]
  }
  @scala.inline
  implicit class SessionAcceptedEventOps[Self <: SessionAcceptedEvent] (val x: Self) extends AnyVal {
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
    def setOriginator(value: String): Self = this.set("originator", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: IncomingResponse): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
  }
  
}

