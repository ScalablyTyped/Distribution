package typings.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserAgentDisconnectedEvent extends js.Object {
  var code: Double = js.native
  var error: Boolean = js.native
  var reason: String = js.native
  var socket: Socket = js.native
}

object UserAgentDisconnectedEvent {
  @scala.inline
  def apply(code: Double, error: Boolean, reason: String, socket: Socket): UserAgentDisconnectedEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgentDisconnectedEvent]
  }
  @scala.inline
  implicit class UserAgentDisconnectedEventOps[Self <: UserAgentDisconnectedEvent] (val x: Self) extends AnyVal {
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
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: Boolean): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setSocket(value: Socket): Self = this.set("socket", value.asInstanceOf[js.Any])
  }
  
}

