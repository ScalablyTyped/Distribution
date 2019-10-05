package typings.kendoDashUi.kendo.ui

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerResizeEndEvent extends SchedulerEvent {
  var end: js.UndefOr[Date] = js.undefined
  var event: js.UndefOr[typings.kendoDashUi.kendo.data.SchedulerEvent] = js.undefined
  var slot: js.UndefOr[js.Any] = js.undefined
  var start: js.UndefOr[Date] = js.undefined
}

object SchedulerResizeEndEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Scheduler,
    end: Date = null,
    event: typings.kendoDashUi.kendo.data.SchedulerEvent = null,
    slot: js.Any = null,
    start: Date = null
  ): SchedulerResizeEndEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (end != null) __obj.updateDynamic("end")(end)
    if (event != null) __obj.updateDynamic("event")(event)
    if (slot != null) __obj.updateDynamic("slot")(slot)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[SchedulerResizeEndEvent]
  }
}

