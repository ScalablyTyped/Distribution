package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerMessagesRecurrenceEditorMonthly extends js.Object {
  var day: js.UndefOr[String] = js.undefined
  var interval: js.UndefOr[String] = js.undefined
  var repeatEvery: js.UndefOr[String] = js.undefined
  var repeatOn: js.UndefOr[String] = js.undefined
}

object SchedulerMessagesRecurrenceEditorMonthly {
  @scala.inline
  def apply(day: String = null, interval: String = null, repeatEvery: String = null, repeatOn: String = null): SchedulerMessagesRecurrenceEditorMonthly = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (repeatEvery != null) __obj.updateDynamic("repeatEvery")(repeatEvery.asInstanceOf[js.Any])
    if (repeatOn != null) __obj.updateDynamic("repeatOn")(repeatOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerMessagesRecurrenceEditorMonthly]
  }
}

