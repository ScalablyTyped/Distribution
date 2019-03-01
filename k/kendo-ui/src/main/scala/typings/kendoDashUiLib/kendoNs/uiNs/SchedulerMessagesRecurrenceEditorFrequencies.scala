package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerMessagesRecurrenceEditorFrequencies extends js.Object {
  var daily: js.UndefOr[java.lang.String] = js.undefined
  var monthly: js.UndefOr[java.lang.String] = js.undefined
  var never: js.UndefOr[java.lang.String] = js.undefined
  var weekly: js.UndefOr[java.lang.String] = js.undefined
  var yearly: js.UndefOr[java.lang.String] = js.undefined
}

object SchedulerMessagesRecurrenceEditorFrequencies {
  @scala.inline
  def apply(
    daily: java.lang.String = null,
    monthly: java.lang.String = null,
    never: java.lang.String = null,
    weekly: java.lang.String = null,
    yearly: java.lang.String = null
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

