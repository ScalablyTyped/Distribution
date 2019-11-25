package typings.jssip.jssipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserAgentRegisteredEvent extends js.Object {
  var response: IncomingResponse
}

object UserAgentRegisteredEvent {
  @scala.inline
  def apply(response: IncomingResponse): UserAgentRegisteredEvent = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserAgentRegisteredEvent]
  }
}

