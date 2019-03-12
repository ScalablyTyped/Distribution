package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerNavigateEvent extends SchedulerEvent {
  var action: js.UndefOr[java.lang.String] = js.undefined
  var date: js.UndefOr[stdLib.Date] = js.undefined
  var view: js.UndefOr[java.lang.String] = js.undefined
}

object SchedulerNavigateEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => scala.Boolean,
    preventDefault: js.Function,
    sender: Scheduler,
    action: java.lang.String = null,
    date: stdLib.Date = null,
    view: java.lang.String = null
  ): SchedulerNavigateEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (action != null) __obj.updateDynamic("action")(action)
    if (date != null) __obj.updateDynamic("date")(date)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[SchedulerNavigateEvent]
  }
}

