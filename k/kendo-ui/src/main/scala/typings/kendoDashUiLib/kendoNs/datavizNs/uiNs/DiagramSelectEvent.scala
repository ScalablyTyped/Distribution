package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramSelectEvent extends DiagramEvent {
  var deselected: js.UndefOr[js.Any] = js.undefined
  var selected: js.UndefOr[js.Any] = js.undefined
}

object DiagramSelectEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Diagram,
    deselected: js.Any = null,
    selected: js.Any = null
  ): DiagramSelectEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (deselected != null) __obj.updateDynamic("deselected")(deselected)
    if (selected != null) __obj.updateDynamic("selected")(selected)
    __obj.asInstanceOf[DiagramSelectEvent]
  }
}

