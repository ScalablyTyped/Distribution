package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttMessagesViews extends js.Object {
  var day: js.UndefOr[String] = js.undefined
  var end: js.UndefOr[String] = js.undefined
  var month: js.UndefOr[String] = js.undefined
  var start: js.UndefOr[String] = js.undefined
  var week: js.UndefOr[String] = js.undefined
  var year: js.UndefOr[String] = js.undefined
}

object GanttMessagesViews {
  @scala.inline
  def apply(
    day: String = null,
    end: String = null,
    month: String = null,
    start: String = null,
    week: String = null,
    year: String = null
  ): GanttMessagesViews = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (week != null) __obj.updateDynamic("week")(week.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    __obj.asInstanceOf[GanttMessagesViews]
  }
}

