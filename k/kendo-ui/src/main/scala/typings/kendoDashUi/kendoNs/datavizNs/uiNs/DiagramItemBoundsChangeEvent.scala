package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import typings.kendoDashUi.kendoNs.datavizNs.diagramNs.Rect
import typings.kendoDashUi.kendoNs.datavizNs.diagramNs.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramItemBoundsChangeEvent extends DiagramEvent {
  var bounds: js.UndefOr[Rect] = js.undefined
  var item: js.UndefOr[Shape] = js.undefined
}

object DiagramItemBoundsChangeEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Diagram,
    bounds: Rect = null,
    item: Shape = null
  ): DiagramItemBoundsChangeEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds)
    if (item != null) __obj.updateDynamic("item")(item)
    __obj.asInstanceOf[DiagramItemBoundsChangeEvent]
  }
}

