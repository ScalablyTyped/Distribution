package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerCancelEvent extends SchedulerEvent {
  var container: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
  var event: js.UndefOr[kendoDashUiLib.kendoNs.dataNs.SchedulerEvent] = js.undefined
}

object SchedulerCancelEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Scheduler,
    container: kendoDashUiLib.JQuery = null,
    event: kendoDashUiLib.kendoNs.dataNs.SchedulerEvent = null
  ): SchedulerCancelEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (container != null) __obj.updateDynamic("container")(container)
    if (event != null) __obj.updateDynamic("event")(event)
    __obj.asInstanceOf[SchedulerCancelEvent]
  }
}

