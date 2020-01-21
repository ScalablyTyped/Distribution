package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerMessagesRecurrenceEditor extends js.Object {
  var daily: js.UndefOr[SchedulerMessagesRecurrenceEditorDaily] = js.undefined
  var end: js.UndefOr[SchedulerMessagesRecurrenceEditorEnd] = js.undefined
  var frequencies: js.UndefOr[SchedulerMessagesRecurrenceEditorFrequencies] = js.undefined
  var monthly: js.UndefOr[SchedulerMessagesRecurrenceEditorMonthly] = js.undefined
  var offsetPositions: js.UndefOr[SchedulerMessagesRecurrenceEditorOffsetPositions] = js.undefined
  var recurrenceEditorTitle: js.UndefOr[String] = js.undefined
  var weekdays: js.UndefOr[SchedulerMessagesRecurrenceEditorWeekdays] = js.undefined
  var weekly: js.UndefOr[SchedulerMessagesRecurrenceEditorWeekly] = js.undefined
  var yearly: js.UndefOr[SchedulerMessagesRecurrenceEditorYearly] = js.undefined
}

object SchedulerMessagesRecurrenceEditor {
  @scala.inline
  def apply(
    daily: SchedulerMessagesRecurrenceEditorDaily = null,
    end: SchedulerMessagesRecurrenceEditorEnd = null,
    frequencies: SchedulerMessagesRecurrenceEditorFrequencies = null,
    monthly: SchedulerMessagesRecurrenceEditorMonthly = null,
    offsetPositions: SchedulerMessagesRecurrenceEditorOffsetPositions = null,
    recurrenceEditorTitle: String = null,
    weekdays: SchedulerMessagesRecurrenceEditorWeekdays = null,
    weekly: SchedulerMessagesRecurrenceEditorWeekly = null,
    yearly: SchedulerMessagesRecurrenceEditorYearly = null
  ): SchedulerMessagesRecurrenceEditor = {
    val __obj = js.Dynamic.literal()
    if (daily != null) __obj.updateDynamic("daily")(daily.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (frequencies != null) __obj.updateDynamic("frequencies")(frequencies.asInstanceOf[js.Any])
    if (monthly != null) __obj.updateDynamic("monthly")(monthly.asInstanceOf[js.Any])
    if (offsetPositions != null) __obj.updateDynamic("offsetPositions")(offsetPositions.asInstanceOf[js.Any])
    if (recurrenceEditorTitle != null) __obj.updateDynamic("recurrenceEditorTitle")(recurrenceEditorTitle.asInstanceOf[js.Any])
    if (weekdays != null) __obj.updateDynamic("weekdays")(weekdays.asInstanceOf[js.Any])
    if (weekly != null) __obj.updateDynamic("weekly")(weekly.asInstanceOf[js.Any])
    if (yearly != null) __obj.updateDynamic("yearly")(yearly.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerMessagesRecurrenceEditor]
  }
}

