package typings.kendoDashUi.kendoNs.uiNs

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
    if (daily != null) __obj.updateDynamic("daily")(daily)
    if (monthly != null) __obj.updateDynamic("monthly")(monthly)
    if (never != null) __obj.updateDynamic("never")(never)
    if (weekly != null) __obj.updateDynamic("weekly")(weekly)
    if (yearly != null) __obj.updateDynamic("yearly")(yearly)
    __obj.asInstanceOf[SchedulerMessagesRecurrenceEditorFrequencies]
  }
}

