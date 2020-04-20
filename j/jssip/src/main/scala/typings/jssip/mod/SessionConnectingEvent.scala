package typings.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionConnectingEvent extends js.Object {
  var request: IncomingRequest | OutgoingRequest
}

object SessionConnectingEvent {
  @scala.inline
  def apply(request: IncomingRequest | OutgoingRequest): SessionConnectingEvent = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionConnectingEvent]
  }
}

