package typings.jssip.jssipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserAgentNewMessageEvent extends js.Object {
  var message: Message
  var originator: String
  var request: IncomingRequest | OutgoingRequest
}

object UserAgentNewMessageEvent {
  @scala.inline
  def apply(message: Message, originator: String, request: IncomingRequest | OutgoingRequest): UserAgentNewMessageEvent = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], originator = originator.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserAgentNewMessageEvent]
  }
}

