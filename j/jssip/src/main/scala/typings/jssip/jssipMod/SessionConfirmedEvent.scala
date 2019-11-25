package typings.jssip.jssipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionConfirmedEvent extends js.Object {
  var originator: String
  var response: js.UndefOr[IncomingResponse] = js.undefined
}

object SessionConfirmedEvent {
  @scala.inline
  def apply(originator: String, response: IncomingResponse = null): SessionConfirmedEvent = {
    val __obj = js.Dynamic.literal(originator = originator.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionConfirmedEvent]
  }
}

