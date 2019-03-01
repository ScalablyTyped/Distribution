package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerMoveEndEvent extends SchedulerEvent {
  var end: js.UndefOr[stdLib.Date] = js.undefined
  var event: js.UndefOr[kendoDashUiLib.kendoNs.dataNs.SchedulerEvent] = js.undefined
  var resources: js.UndefOr[js.Any] = js.undefined
  var slot: js.UndefOr[js.Any] = js.undefined
  var start: js.UndefOr[stdLib.Date] = js.undefined
}

object SchedulerMoveEndEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Scheduler,
    end: stdLib.Date = null,
    event: kendoDashUiLib.kendoNs.dataNs.SchedulerEvent = null,
    resources: js.Any = null,
    slot: js.Any = null,
    start: stdLib.Date = null
  ): SchedulerMoveEndEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (end != null) __obj.updateDynamic("end")(end)
    if (event != null) __obj.updateDynamic("event")(event)
    if (resources != null) __obj.updateDynamic("resources")(resources)
    if (slot != null) __obj.updateDynamic("slot")(slot)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[SchedulerMoveEndEvent]
  }
}

