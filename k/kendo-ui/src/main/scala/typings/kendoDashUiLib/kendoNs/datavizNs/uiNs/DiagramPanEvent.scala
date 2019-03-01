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
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Diagram,
    pan: kendoDashUiLib.kendoNs.datavizNs.diagramNs.Point = null
  ): DiagramPanEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (pan != null) __obj.updateDynamic("pan")(pan)
    __obj.asInstanceOf[DiagramPanEvent]
  }
}

