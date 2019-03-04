package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerMoveStartEvent extends SchedulerEvent {
  var event: js.UndefOr[kendoDashUiLib.kendoNs.dataNs.SchedulerEvent] = js.undefined
}

object SchedulerMoveStartEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Scheduler,
    event: kendoDashUiLib.kendoNs.dataNs.SchedulerEvent = null
  ): SchedulerMoveStartEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (event != null) __obj.updateDynamic("event")(event)
    __obj.asInstanceOf[SchedulerMoveStartEvent]
  }
}

