package typings.jssip.mod

import typings.jssip.anon.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserAgentSipEvent extends js.Object {
  var event: Event
  var request: IncomingRequest
}

object UserAgentSipEvent {
  @scala.inline
  def apply(event: Event, request: IncomingRequest): UserAgentSipEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgentSipEvent]
  }
}

