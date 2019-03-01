package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttMessagesViews extends js.Object {
  var day: js.UndefOr[java.lang.String] = js.undefined
  var end: js.UndefOr[java.lang.String] = js.undefined
  var month: js.UndefOr[java.lang.String] = js.undefined
  var start: js.UndefOr[java.lang.String] = js.undefined
  var week: js.UndefOr[java.lang.String] = js.undefined
  var year: js.UndefOr[java.lang.String] = js.undefined
}

object GanttMessagesViews {
  @scala.inline
  def apply(
    day: java.lang.String = null,
    end: java.lang.String = null,
    month: java.lang.String = null,
    start: java.lang.String = null,
    week: java.lang.String = null,
    year: java.lang.String = null
  ): GanttMessagesViews = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day)
    if (end != null) __obj.updateDynamic("end")(end)
    if (month != null) __obj.updateDynamic("month")(month)
    if (start != null) __obj.updateDynamic("start")(start)
    if (week != null) __obj.updateDynamic("week")(week)
    if (year != null) __obj.updateDynamic("year")(year)
    __obj.asInstanceOf[GanttMessagesViews]
  }
}

