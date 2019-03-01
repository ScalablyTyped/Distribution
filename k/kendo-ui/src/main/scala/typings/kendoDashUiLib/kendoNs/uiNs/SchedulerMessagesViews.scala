package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerMessagesViews extends js.Object {
  var agenda: js.UndefOr[java.lang.String] = js.undefined
  var day: js.UndefOr[java.lang.String] = js.undefined
  var month: js.UndefOr[java.lang.String] = js.undefined
  var week: js.UndefOr[java.lang.String] = js.undefined
}

object SchedulerMessagesViews {
  @scala.inline
  def apply(
    agenda: java.lang.String = null,
    day: java.lang.String = null,
    month: java.lang.String = null,
    week: java.lang.String = null
  ): SchedulerMessagesViews = {
    val __obj = js.Dynamic.literal()
    if (agenda != null) __obj.updateDynamic("agenda")(agenda)
    if (day != null) __obj.updateDynamic("day")(day)
    if (month != null) __obj.updateDynamic("month")(month)
    if (week != null) __obj.updateDynamic("week")(week)
    __obj.asInstanceOf[SchedulerMessagesViews]
  }
}

