package typings.jssip.jssipMod

import typings.jssip.Anon_Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserAgentSipEvent extends js.Object {
  var event: Anon_Event
  var request: IncomingRequest
}

object UserAgentSipEvent {
  @scala.inline
  def apply(event: Anon_Event, request: IncomingRequest): UserAgentSipEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserAgentSipEvent]
  }
}

