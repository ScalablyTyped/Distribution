package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerSaveEvent extends SchedulerEvent {
  var container: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
  var event: js.UndefOr[kendoDashUiLib.kendoNs.dataNs.SchedulerEvent] = js.undefined
}

object SchedulerSaveEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Scheduler,
    container: kendoDashUiLib.JQuery = null,
    event: kendoDashUiLib.kendoNs.dataNs.SchedulerEvent = null
  ): SchedulerSaveEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (container != null) __obj.updateDynamic("container")(container)
    if (event != null) __obj.updateDynamic("event")(event)
    __obj.asInstanceOf[SchedulerSaveEvent]
  }
}

