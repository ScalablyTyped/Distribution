package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerMessagesViews extends js.Object {
  var agenda: js.UndefOr[String] = js.undefined
  var day: js.UndefOr[String] = js.undefined
  var month: js.UndefOr[String] = js.undefined
  var week: js.UndefOr[String] = js.undefined
}

object SchedulerMessagesViews {
  @scala.inline
  def apply(agenda: String = null, day: String = null, month: String = null, week: String = null): SchedulerMessagesViews = {
    val __obj = js.Dynamic.literal()
    if (agenda != null) __obj.updateDynamic("agenda")(agenda.asInstanceOf[js.Any])
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (week != null) __obj.updateDynamic("week")(week.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerMessagesViews]
  }
}

