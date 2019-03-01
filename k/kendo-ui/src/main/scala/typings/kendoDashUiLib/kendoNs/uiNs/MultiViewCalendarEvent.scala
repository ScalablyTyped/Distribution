package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiViewCalendarEvent extends js.Object {
  var preventDefault: js.Function
  var sender: MultiViewCalendar
  def isDefaultPrevented(): scala.Boolean
}

object MultiViewCalendarEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: MultiViewCalendar
  ): MultiViewCalendarEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[MultiViewCalendarEvent]
  }
}

