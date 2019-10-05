package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerMessagesRecurrenceEditorYearly extends js.Object {
  var interval: js.UndefOr[String] = js.undefined
  var of: js.UndefOr[String] = js.undefined
  var repeatEvery: js.UndefOr[String] = js.undefined
  var repeatOn: js.UndefOr[String] = js.undefined
}

object SchedulerMessagesRecurrenceEditorYearly {
  @scala.inline
  def apply(interval: String = null, of: String = null, repeatEvery: String = null, repeatOn: String = null): SchedulerMessagesRecurrenceEditorYearly = {
    val __obj = js.Dynamic.literal()
    if (interval != null) __obj.updateDynamic("interval")(interval)
    if (of != null) __obj.updateDynamic("of")(of)
    if (repeatEvery != null) __obj.updateDynamic("repeatEvery")(repeatEvery)
    if (repeatOn != null) __obj.updateDynamic("repeatOn")(repeatOn)
    __obj.asInstanceOf[SchedulerMessagesRecurrenceEditorYearly]
  }
}

