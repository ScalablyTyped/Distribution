package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerMessagesRecurrenceEditorDaily extends js.Object {
  var interval: js.UndefOr[java.lang.String] = js.undefined
  var repeatEvery: js.UndefOr[java.lang.String] = js.undefined
}

object SchedulerMessagesRecurrenceEditorDaily {
  @scala.inline
  def apply(interval: java.lang.String = null, repeatEvery: java.lang.String = null): SchedulerMessagesRecurrenceEditorDaily = {
    val __obj = js.Dynamic.literal()
    if (interval != null) __obj.updateDynamic("interval")(interval)
    if (repeatEvery != null) __obj.updateDynamic("repeatEvery")(repeatEvery)
    __obj.asInstanceOf[SchedulerMessagesRecurrenceEditorDaily]
  }
}

