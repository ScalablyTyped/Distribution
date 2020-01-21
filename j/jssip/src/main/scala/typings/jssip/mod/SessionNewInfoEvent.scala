package typings.jssip.mod

import typings.jssip.mod.RTCSession.Info
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionNewInfoEvent extends js.Object {
  var info: Info
  var originator: String
  var request: IncomingRequest | OutgoingRequest
}

object SessionNewInfoEvent {
  @scala.inline
  def apply(info: Info, originator: String, request: IncomingRequest | OutgoingRequest): SessionNewInfoEvent = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], originator = originator.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SessionNewInfoEvent]
  }
}

