package typings.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionConnectingEvent extends js.Object {
  var request: IncomingRequest | OutgoingRequest = js.native
}

object SessionConnectingEvent {
  @scala.inline
  def apply(request: IncomingRequest | OutgoingRequest): SessionConnectingEvent = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionConnectingEvent]
  }
  @scala.inline
  implicit class SessionConnectingEventOps[Self <: SessionConnectingEvent] (val x: Self) extends AnyVal {
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
    def setRequest(value: IncomingRequest | OutgoingRequest): Self = this.set("request", value.asInstanceOf[js.Any])
  }
  
}

