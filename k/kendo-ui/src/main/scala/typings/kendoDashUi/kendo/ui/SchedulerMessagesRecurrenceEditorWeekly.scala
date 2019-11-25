package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerMessagesRecurrenceEditorWeekly extends js.Object {
  var interval: js.UndefOr[String] = js.undefined
  var repeatEvery: js.UndefOr[String] = js.undefined
  var repeatOn: js.UndefOr[String] = js.undefined
}

object SchedulerMessagesRecurrenceEditorWeekly {
  @scala.inline
  def apply(interval: String = null, repeatEvery: String = null, repeatOn: String = null): SchedulerMessagesRecurrenceEditorWeekly = {
    val __obj = js.Dynamic.literal()
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (repeatEvery != null) __obj.updateDynamic("repeatEvery")(repeatEvery.asInstanceOf[js.Any])
    if (repeatOn != null) __obj.updateDynamic("repeatOn")(repeatOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerMessagesRecurrenceEditorWeekly]
  }
}

