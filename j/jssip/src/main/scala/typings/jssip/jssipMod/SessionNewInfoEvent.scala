package typings.jssip.jssipMod

import typings.jssip.jssipMod.RTCSessionNs.Info
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
    val __obj = js.Dynamic.literal(info = info, originator = originator, request = request.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SessionNewInfoEvent]
  }
}

