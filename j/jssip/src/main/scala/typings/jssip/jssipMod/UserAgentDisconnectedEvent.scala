package typings.jssip.jssipMod

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
    val __obj = js.Dynamic.literal(code = code, error = error, reason = reason, socket = socket)
  
    __obj.asInstanceOf[UserAgentDisconnectedEvent]
  }
}

