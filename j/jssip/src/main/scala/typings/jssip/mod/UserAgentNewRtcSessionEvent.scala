package typings.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserAgentNewRtcSessionEvent extends js.Object {
  var originator: String
  var request: IncomingRequest | OutgoingRequest
  var session: RTCSession
}

object UserAgentNewRtcSessionEvent {
  @scala.inline
  def apply(originator: String, request: IncomingRequest | OutgoingRequest, session: RTCSession): UserAgentNewRtcSessionEvent = {
    val __obj = js.Dynamic.literal(originator = originator.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserAgentNewRtcSessionEvent]
  }
}

