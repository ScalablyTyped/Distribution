package typings.kendoDashUi.kendoNs.uiNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerChangeEvent extends SchedulerEvent {
  var end: js.UndefOr[Date] = js.undefined
  var events: js.UndefOr[js.Any] = js.undefined
  var resources: js.UndefOr[js.Any] = js.undefined
  var slots: js.UndefOr[js.Any] = js.undefined
  var start: js.UndefOr[Date] = js.undefined
}

object SchedulerChangeEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Scheduler,
    end: Date = null,
    events: js.Any = null,
    resources: js.Any = null,
    slots: js.Any = null,
    start: Date = null
  ): SchedulerChangeEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (end != null) __obj.updateDynamic("end")(end)
    if (events != null) __obj.updateDynamic("events")(events)
    if (resources != null) __obj.updateDynamic("resources")(resources)
    if (slots != null) __obj.updateDynamic("slots")(slots)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[SchedulerChangeEvent]
  }
}

