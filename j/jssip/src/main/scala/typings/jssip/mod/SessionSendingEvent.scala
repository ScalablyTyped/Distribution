package typings.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionSendingEvent extends js.Object {
  var request: OutgoingRequest
}

object SessionSendingEvent {
  @scala.inline
  def apply(request: OutgoingRequest): SessionSendingEvent = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SessionSendingEvent]
  }
}

