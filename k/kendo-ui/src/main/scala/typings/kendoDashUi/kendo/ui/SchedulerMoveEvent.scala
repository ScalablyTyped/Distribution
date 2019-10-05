package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerMoveEvent extends SchedulerEvent {
  var event: js.UndefOr[typings.kendoDashUi.kendo.data.SchedulerEvent] = js.undefined
  var slot: js.UndefOr[js.Any] = js.undefined
}

object SchedulerMoveEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Scheduler,
    event: typings.kendoDashUi.kendo.data.SchedulerEvent = null,
    slot: js.Any = null
  ): SchedulerMoveEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (event != null) __obj.updateDynamic("event")(event)
    if (slot != null) __obj.updateDynamic("slot")(slot)
    __obj.asInstanceOf[SchedulerMoveEvent]
  }
}

