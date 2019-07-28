package typings.kendoDashUi.kendoNs.uiNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerMoveEndEvent extends SchedulerEvent {
  var end: js.UndefOr[Date] = js.undefined
  var event: js.UndefOr[typings.kendoDashUi.kendoNs.dataNs.SchedulerEvent] = js.undefined
  var resources: js.UndefOr[js.Any] = js.undefined
  var slot: js.UndefOr[js.Any] = js.undefined
  var start: js.UndefOr[Date] = js.undefined
}

object SchedulerMoveEndEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Scheduler,
    end: Date = null,
    event: typings.kendoDashUi.kendoNs.dataNs.SchedulerEvent = null,
    resources: js.Any = null,
    slot: js.Any = null,
    start: Date = null
  ): SchedulerMoveEndEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (end != null) __obj.updateDynamic("end")(end)
    if (event != null) __obj.updateDynamic("event")(event)
    if (resources != null) __obj.updateDynamic("resources")(resources)
    if (slot != null) __obj.updateDynamic("slot")(slot)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[SchedulerMoveEndEvent]
  }
}

