package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramItemBoundsChangeEvent extends DiagramEvent {
  var bounds: js.UndefOr[kendoDashUiLib.kendoNs.datavizNs.diagramNs.Rect] = js.undefined
  var item: js.UndefOr[kendoDashUiLib.kendoNs.datavizNs.diagramNs.Shape] = js.undefined
}

object DiagramItemBoundsChangeEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => scala.Boolean,
    preventDefault: js.Function,
    sender: Diagram,
    bounds: kendoDashUiLib.kendoNs.datavizNs.diagramNs.Rect = null,
    item: kendoDashUiLib.kendoNs.datavizNs.diagramNs.Shape = null
  ): DiagramItemBoundsChangeEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds)
    if (item != null) __obj.updateDynamic("item")(item)
    __obj.asInstanceOf[DiagramItemBoundsChangeEvent]
  }
}

