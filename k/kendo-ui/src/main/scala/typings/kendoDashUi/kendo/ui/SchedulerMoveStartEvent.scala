package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerMoveStartEvent extends SchedulerEvent {
  var event: js.UndefOr[typings.kendoDashUi.kendo.data.SchedulerEvent] = js.undefined
}

object SchedulerMoveStartEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Scheduler,
    event: typings.kendoDashUi.kendo.data.SchedulerEvent = null
  ): SchedulerMoveStartEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (event != null) __obj.updateDynamic("event")(event)
    __obj.asInstanceOf[SchedulerMoveStartEvent]
  }
}

