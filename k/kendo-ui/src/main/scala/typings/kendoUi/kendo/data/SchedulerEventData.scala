package typings.kendoUi.kendo.data

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerEventData extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var end: js.UndefOr[Date] = js.undefined
  var endTimezone: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[js.Any] = js.undefined
  var isAllDay: js.UndefOr[Boolean] = js.undefined
  var recurrenceException: js.UndefOr[String] = js.undefined
  var recurrenceId: js.UndefOr[js.Any] = js.undefined
  var recurrenceRule: js.UndefOr[String] = js.undefined
  var start: js.UndefOr[Date] = js.undefined
  var startTimezone: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object SchedulerEventData {
  @scala.inline
  def apply(
    description: String = null,
    end: Date = null,
    endTimezone: String = null,
    id: js.Any = null,
    isAllDay: js.UndefOr[Boolean] = js.undefined,
    recurrenceException: String = null,
    recurrenceId: js.Any = null,
    recurrenceRule: String = null,
    start: Date = null,
    startTimezone: String = null,
    title: String = null
  ): SchedulerEventData = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (endTimezone != null) __obj.updateDynamic("endTimezone")(endTimezone.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isAllDay)) __obj.updateDynamic("isAllDay")(isAllDay.get.asInstanceOf[js.Any])
    if (recurrenceException != null) __obj.updateDynamic("recurrenceException")(recurrenceException.asInstanceOf[js.Any])
    if (recurrenceId != null) __obj.updateDynamic("recurrenceId")(recurrenceId.asInstanceOf[js.Any])
    if (recurrenceRule != null) __obj.updateDynamic("recurrenceRule")(recurrenceRule.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (startTimezone != null) __obj.updateDynamic("startTimezone")(startTimezone.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerEventData]
  }
}

