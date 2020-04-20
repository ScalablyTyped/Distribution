package typings.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserAgentDisconnectedEvent extends js.Object {
  var code: Double
  var error: Boolean
  var reason: String
  var socket: Socket
}

object UserAgentDisconnectedEvent {
  @scala.inline
  def apply(code: Double, error: Boolean, reason: String, socket: Socket): UserAgentDisconnectedEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgentDisconnectedEvent]
  }
}

