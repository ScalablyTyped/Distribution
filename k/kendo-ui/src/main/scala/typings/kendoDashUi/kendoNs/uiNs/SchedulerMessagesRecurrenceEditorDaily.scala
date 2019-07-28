package typings.kendoDashUi.kendoNs.uiNs

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
    if (interval != null) __obj.updateDynamic("interval")(interval)
    if (repeatEvery != null) __obj.updateDynamic("repeatEvery")(repeatEvery)
    __obj.asInstanceOf[SchedulerMessagesRecurrenceEditorDaily]
  }
}

