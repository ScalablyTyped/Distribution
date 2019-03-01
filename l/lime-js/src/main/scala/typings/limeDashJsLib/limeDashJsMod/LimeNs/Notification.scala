package typings
package limeDashJsLib.limeDashJsMod.LimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notification extends Envelope {
  var event: java.lang.String
  var reason: js.UndefOr[Reason] = js.undefined
}

object Notification {
  @scala.inline
  def apply(
    event: java.lang.String,
    from: java.lang.String = null,
    id: java.lang.String = null,
    metadata: js.Any = null,
    pp: java.lang.String = null,
    reason: Reason = null,
    to: java.lang.String = null
  ): Notification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("event")(event)
    if (from != null) __obj.updateDynamic("from")(from)
    if (id != null) __obj.updateDynamic("id")(id)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (pp != null) __obj.updateDynamic("pp")(pp)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[Notification]
  }
}

