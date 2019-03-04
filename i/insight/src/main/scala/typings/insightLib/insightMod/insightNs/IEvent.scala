package typings
package insightLib.insightMod.insightNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEvent extends js.Object {
  var action: java.lang.String
  var category: java.lang.String
  var label: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object IEvent {
  @scala.inline
  def apply(
    action: java.lang.String,
    category: java.lang.String,
    label: java.lang.String = null,
    value: scala.Double | java.lang.String = null
  ): IEvent = {
    val __obj = js.Dynamic.literal(action = action, category = category)
    if (label != null) __obj.updateDynamic("label")(label)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEvent]
  }
}

