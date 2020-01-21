package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerMessagesRecurrenceEditorFrequencies extends js.Object {
  var daily: js.UndefOr[String] = js.undefined
  var monthly: js.UndefOr[String] = js.undefined
  var never: js.UndefOr[String] = js.undefined
  var weekly: js.UndefOr[String] = js.undefined
  var yearly: js.UndefOr[String] = js.undefined
}

object SchedulerMessagesRecurrenceEditorFrequencies {
  @scala.inline
  def apply(
    daily: String = null,
    monthly: String = null,
    never: String = null,
    weekly: String = null,
    yearly: String = null
  ): SchedulerMessagesRecurrenceEditorFrequencies = {
    val __obj = js.Dynamic.literal()
    if (daily != null) __obj.updateDynamic("daily")(daily.asInstanceOf[js.Any])
    if (monthly != null) __obj.updateDynamic("monthly")(monthly.asInstanceOf[js.Any])
    if (never != null) __obj.updateDynamic("never")(never.asInstanceOf[js.Any])
    if (weekly != null) __obj.updateDynamic("weekly")(weekly.asInstanceOf[js.Any])
    if (yearly != null) __obj.updateDynamic("yearly")(yearly.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerMessagesRecurrenceEditorFrequencies]
  }
}

