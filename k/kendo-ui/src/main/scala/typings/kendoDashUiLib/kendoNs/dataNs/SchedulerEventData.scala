package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerEventData extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var end: js.UndefOr[stdLib.Date] = js.undefined
  var endTimezone: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[js.Any] = js.undefined
  var isAllDay: js.UndefOr[scala.Boolean] = js.undefined
  var recurrenceException: js.UndefOr[java.lang.String] = js.undefined
  var recurrenceId: js.UndefOr[js.Any] = js.undefined
  var recurrenceRule: js.UndefOr[java.lang.String] = js.undefined
  var start: js.UndefOr[stdLib.Date] = js.undefined
  var startTimezone: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object SchedulerEventData {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    end: stdLib.Date = null,
    endTimezone: java.lang.String = null,
    id: js.Any = null,
    isAllDay: js.UndefOr[scala.Boolean] = js.undefined,
    recurrenceException: java.lang.String = null,
    recurrenceId: js.Any = null,
    recurrenceRule: java.lang.String = null,
    start: stdLib.Date = null,
    startTimezone: java.lang.String = null,
    title: java.lang.String = null
  ): SchedulerEventData = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (end != null) __obj.updateDynamic("end")(end)
    if (endTimezone != null) __obj.updateDynamic("endTimezone")(endTimezone)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isAllDay)) __obj.updateDynamic("isAllDay")(isAllDay)
    if (recurrenceException != null) __obj.updateDynamic("recurrenceException")(recurrenceException)
    if (recurrenceId != null) __obj.updateDynamic("recurrenceId")(recurrenceId)
    if (recurrenceRule != null) __obj.updateDynamic("recurrenceRule")(recurrenceRule)
    if (start != null) __obj.updateDynamic("start")(start)
    if (startTimezone != null) __obj.updateDynamic("startTimezone")(startTimezone)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[SchedulerEventData]
  }
}

