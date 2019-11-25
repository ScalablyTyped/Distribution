package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerMessagesRecurrenceEditorWeekdays extends js.Object {
  var day: js.UndefOr[String] = js.undefined
  var weekday: js.UndefOr[String] = js.undefined
  var weekend: js.UndefOr[String] = js.undefined
}

object SchedulerMessagesRecurrenceEditorWeekdays {
  @scala.inline
  def apply(day: String = null, weekday: String = null, weekend: String = null): SchedulerMessagesRecurrenceEditorWeekdays = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (weekday != null) __obj.updateDynamic("weekday")(weekday.asInstanceOf[js.Any])
    if (weekend != null) __obj.updateDynamic("weekend")(weekend.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerMessagesRecurrenceEditorWeekdays]
  }
}

