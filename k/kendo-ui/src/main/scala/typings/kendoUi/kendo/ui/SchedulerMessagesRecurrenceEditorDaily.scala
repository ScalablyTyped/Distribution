package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerMessagesRecurrenceEditorDaily extends js.Object {
  var interval: js.UndefOr[String] = js.undefined
  var repeatEvery: js.UndefOr[String] = js.undefined
}

object SchedulerMessagesRecurrenceEditorDaily {
  @scala.inline
  def apply(interval: String = null, repeatEvery: String = null): SchedulerMessagesRecurrenceEditorDaily = {
    val __obj = js.Dynamic.literal()
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (repeatEvery != null) __obj.updateDynamic("repeatEvery")(repeatEvery.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerMessagesRecurrenceEditorDaily]
  }
}

