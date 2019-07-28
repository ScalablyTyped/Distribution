package typings.kendoDashUi.kendoNs.uiNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerNavigateEvent extends SchedulerEvent {
  var action: js.UndefOr[String] = js.undefined
  var date: js.UndefOr[Date] = js.undefined
  var view: js.UndefOr[String] = js.undefined
}

object SchedulerNavigateEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Scheduler,
    action: String = null,
    date: Date = null,
    view: String = null
  ): SchedulerNavigateEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (action != null) __obj.updateDynamic("action")(action)
    if (date != null) __obj.updateDynamic("date")(date)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[SchedulerNavigateEvent]
  }
}

