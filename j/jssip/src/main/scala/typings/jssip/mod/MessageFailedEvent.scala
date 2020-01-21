package typings.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageFailedEvent extends js.Object {
  var cause: js.UndefOr[String] = js.undefined
  var originator: String
  var response: js.UndefOr[IncomingResponse] = js.undefined
}

object MessageFailedEvent {
  @scala.inline
  def apply(originator: String, cause: String = null, response: IncomingResponse = null): MessageFailedEvent = {
    val __obj = js.Dynamic.literal(originator = originator.asInstanceOf[js.Any])
    if (cause != null) __obj.updateDynamic("cause")(cause.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageFailedEvent]
  }
}

