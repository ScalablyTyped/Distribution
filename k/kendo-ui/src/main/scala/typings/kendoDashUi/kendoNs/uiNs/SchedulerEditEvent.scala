package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerEditEvent extends SchedulerEvent {
  var container: js.UndefOr[JQuery] = js.undefined
  var event: js.UndefOr[typings.kendoDashUi.kendoNs.dataNs.SchedulerEvent] = js.undefined
}

object SchedulerEditEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Scheduler,
    container: JQuery = null,
    event: typings.kendoDashUi.kendoNs.dataNs.SchedulerEvent = null
  ): SchedulerEditEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (container != null) __obj.updateDynamic("container")(container)
    if (event != null) __obj.updateDynamic("event")(event)
    __obj.asInstanceOf[SchedulerEditEvent]
  }
}

