package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramPanEvent extends DiagramEvent {
  var pan: js.UndefOr[kendoDashUiLib.kendoNs.datavizNs.diagramNs.Point] = js.undefined
}

object DiagramPanEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => scala.Boolean,
    preventDefault: js.Function,
    sender: Diagram,
    pan: kendoDashUiLib.kendoNs.datavizNs.diagramNs.Point = null
  ): DiagramPanEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (pan != null) __obj.updateDynamic("pan")(pan)
    __obj.asInstanceOf[DiagramPanEvent]
  }
}

