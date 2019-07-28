package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerRemoveEvent extends SchedulerEvent {
  var event: js.UndefOr[typings.kendoDashUi.kendoNs.dataNs.SchedulerEvent] = js.undefined
}

object SchedulerRemoveEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Scheduler,
    event: typings.kendoDashUi.kendoNs.dataNs.SchedulerEvent = null
  ): SchedulerRemoveEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (event != null) __obj.updateDynamic("event")(event)
    __obj.asInstanceOf[SchedulerRemoveEvent]
  }
}

