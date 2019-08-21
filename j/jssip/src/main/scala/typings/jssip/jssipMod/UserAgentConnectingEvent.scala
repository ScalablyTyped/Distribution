package typings.jssip.jssipMod

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
    val __obj = js.Dynamic.literal(attempts = attempts, socket = socket)
  
    __obj.asInstanceOf[UserAgentConnectingEvent]
  }
}

