package typings.jssip.jssipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionFailedEvent extends js.Object {
  var cause: String
  var message: js.UndefOr[IncomingResponse] = js.undefined
  var originator: String
}

object SessionFailedEvent {
  @scala.inline
  def apply(cause: String, originator: String, message: IncomingResponse = null): SessionFailedEvent = {
    val __obj = js.Dynamic.literal(cause = cause, originator = originator)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[SessionFailedEvent]
  }
}

