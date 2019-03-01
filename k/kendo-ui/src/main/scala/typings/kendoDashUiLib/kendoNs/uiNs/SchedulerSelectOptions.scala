package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerSelectOptions extends js.Object {
  var end: js.UndefOr[stdLib.Date] = js.undefined
  var events: js.UndefOr[js.Any] = js.undefined
  var isAllDay: js.UndefOr[scala.Boolean] = js.undefined
  var resources: js.UndefOr[js.Any] = js.undefined
  var start: js.UndefOr[stdLib.Date] = js.undefined
}

object SchedulerSelectOptions {
  @scala.inline
  def apply(
    end: stdLib.Date = null,
    events: js.Any = null,
    isAllDay: js.UndefOr[scala.Boolean] = js.undefined,
    resources: js.Any = null,
    start: stdLib.Date = null
  ): SchedulerSelectOptions = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end)
    if (events != null) __obj.updateDynamic("events")(events)
    if (!js.isUndefined(isAllDay)) __obj.updateDynamic("isAllDay")(isAllDay)
    if (resources != null) __obj.updateDynamic("resources")(resources)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[SchedulerSelectOptions]
  }
}

