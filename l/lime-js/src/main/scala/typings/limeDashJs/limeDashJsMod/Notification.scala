package typings.limeDashJs.limeDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notification extends Envelope {
  var event: String
  var reason: js.UndefOr[Reason] = js.undefined
}

object Notification {
  @scala.inline
  def apply(
    event: String,
    from: String = null,
    id: String = null,
    metadata: js.Any = null,
    pp: String = null,
    reason: Reason = null,
    to: String = null
  ): Notification = {
    val __obj = js.Dynamic.literal(event = event)
    if (from != null) __obj.updateDynamic("from")(from)
    if (id != null) __obj.updateDynamic("id")(id)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (pp != null) __obj.updateDynamic("pp")(pp)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[Notification]
  }
}

