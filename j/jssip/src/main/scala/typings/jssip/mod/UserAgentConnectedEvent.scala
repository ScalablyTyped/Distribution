package typings.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserAgentConnectedEvent extends js.Object {
  var socket: Socket
}

object UserAgentConnectedEvent {
  @scala.inline
  def apply(socket: Socket): UserAgentConnectedEvent = {
    val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserAgentConnectedEvent]
  }
}

