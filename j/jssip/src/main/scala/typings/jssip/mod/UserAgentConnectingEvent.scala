package typings.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserAgentConnectingEvent extends js.Object {
  var attempts: Double = js.native
  var socket: Socket = js.native
}

object UserAgentConnectingEvent {
  @scala.inline
  def apply(attempts: Double, socket: Socket): UserAgentConnectingEvent = {
    val __obj = js.Dynamic.literal(attempts = attempts.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgentConnectingEvent]
  }
  @scala.inline
  implicit class UserAgentConnectingEventOps[Self <: UserAgentConnectingEvent] (val x: Self) extends AnyVal {
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
    def setAttempts(value: Double): Self = this.set("attempts", value.asInstanceOf[js.Any])
    @scala.inline
    def setSocket(value: Socket): Self = this.set("socket", value.asInstanceOf[js.Any])
  }
  
}

