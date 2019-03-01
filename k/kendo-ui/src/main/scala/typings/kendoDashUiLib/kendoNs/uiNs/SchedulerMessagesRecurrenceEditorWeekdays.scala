package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerMessagesRecurrenceEditorWeekdays extends js.Object {
  var day: js.UndefOr[java.lang.String] = js.undefined
  var weekday: js.UndefOr[java.lang.String] = js.undefined
  var weekend: js.UndefOr[java.lang.String] = js.undefined
}

object SchedulerMessagesRecurrenceEditorWeekdays {
  @scala.inline
  def apply(day: java.lang.String = null, weekday: java.lang.String = null, weekend: java.lang.String = null): SchedulerMessagesRecurrenceEditorWeekdays = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day)
    if (weekday != null) __obj.updateDynamic("weekday")(weekday)
    if (weekend != null) __obj.updateDynamic("weekend")(weekend)
    __obj.asInstanceOf[SchedulerMessagesRecurrenceEditorWeekdays]
  }
}

