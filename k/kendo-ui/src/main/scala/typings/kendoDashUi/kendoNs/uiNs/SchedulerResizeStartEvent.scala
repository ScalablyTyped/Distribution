package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerResizeStartEvent extends SchedulerEvent {
  var event: js.UndefOr[typings.kendoDashUi.kendoNs.dataNs.SchedulerEvent] = js.undefined
}

object SchedulerResizeStartEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Scheduler,
    event: typings.kendoDashUi.kendoNs.dataNs.SchedulerEvent = null
  ): SchedulerResizeStartEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (event != null) __obj.updateDynamic("event")(event)
    __obj.asInstanceOf[SchedulerResizeStartEvent]
  }
}

