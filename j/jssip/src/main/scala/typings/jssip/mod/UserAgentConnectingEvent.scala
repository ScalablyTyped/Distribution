package typings.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserAgentConnectingEvent extends js.Object {
  var attempts: Double
  var socket: Socket
}

object UserAgentConnectingEvent {
  @scala.inline
  def apply(attempts: Double, socket: Socket): UserAgentConnectingEvent = {
    val __obj = js.Dynamic.literal(attempts = attempts.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgentConnectingEvent]
  }
}

