package typings.jssip.mod

import typings.jssip.mod.RTCSession.DTMF
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionNewDtmfEvent extends js.Object {
  var dtmf: DTMF = js.native
  var originator: String = js.native
  var request: IncomingRequest | OutgoingRequest = js.native
}

object SessionNewDtmfEvent {
  @scala.inline
  def apply(dtmf: DTMF, originator: String, request: IncomingRequest | OutgoingRequest): SessionNewDtmfEvent = {
    val __obj = js.Dynamic.literal(dtmf = dtmf.asInstanceOf[js.Any], originator = originator.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionNewDtmfEvent]
  }
  @scala.inline
  implicit class SessionNewDtmfEventOps[Self <: SessionNewDtmfEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDtmf(value: DTMF): Self = this.set("dtmf", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginator(value: String): Self = this.set("originator", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: IncomingRequest | OutgoingRequest): Self = this.set("request", value.asInstanceOf[js.Any])
  }
  
}

