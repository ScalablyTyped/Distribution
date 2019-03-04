package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerAddEvent extends SchedulerEvent {
  var event: js.UndefOr[js.Any] = js.undefined
}

object SchedulerAddEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Scheduler,
    event: js.Any = null
  ): SchedulerAddEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (event != null) __obj.updateDynamic("event")(event)
    __obj.asInstanceOf[SchedulerAddEvent]
  }
}

