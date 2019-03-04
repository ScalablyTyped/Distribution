package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramMouseLeaveEvent extends DiagramEvent {
  var item: js.UndefOr[js.Any] = js.undefined
}

object DiagramMouseLeaveEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Diagram,
    item: js.Any = null
  ): DiagramMouseLeaveEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (item != null) __obj.updateDynamic("item")(item)
    __obj.asInstanceOf[DiagramMouseLeaveEvent]
  }
}

