package typings.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserAgentUnregisteredEvent extends js.Object {
  var cause: js.UndefOr[String] = js.undefined
  var response: IncomingResponse
}

object UserAgentUnregisteredEvent {
  @scala.inline
  def apply(response: IncomingResponse, cause: String = null): UserAgentUnregisteredEvent = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
    if (cause != null) __obj.updateDynamic("cause")(cause.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgentUnregisteredEvent]
  }
}

