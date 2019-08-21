package typings.jssip.jssipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionSendingEvent extends js.Object {
  var request: OutgoingRequest
}

object SessionSendingEvent {
  @scala.inline
  def apply(request: OutgoingRequest): SessionSendingEvent = {
    val __obj = js.Dynamic.literal(request = request)
  
    __obj.asInstanceOf[SessionSendingEvent]
  }
}

