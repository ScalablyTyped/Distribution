package typings.jssip.mod

import typings.jssip.mod.RTCSession.DTMF
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionNewDtmfEvent extends js.Object {
  var dtmf: DTMF
  var originator: String
  var request: IncomingRequest | OutgoingRequest
}

object SessionNewDtmfEvent {
  @scala.inline
  def apply(dtmf: DTMF, originator: String, request: IncomingRequest | OutgoingRequest): SessionNewDtmfEvent = {
    val __obj = js.Dynamic.literal(dtmf = dtmf.asInstanceOf[js.Any], originator = originator.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionNewDtmfEvent]
  }
}

