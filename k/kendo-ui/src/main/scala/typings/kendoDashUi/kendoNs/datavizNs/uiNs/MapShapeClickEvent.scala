package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import typings.kendoDashUi.kendoNs.datavizNs.mapNs.layerNs.Shape
import typings.kendoDashUi.kendoNs.drawingNs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapShapeClickEvent extends MapEvent {
  var layer: js.UndefOr[Shape] = js.undefined
  var originalEvent: js.UndefOr[js.Any] = js.undefined
  var shape: js.UndefOr[Element] = js.undefined
}

object MapShapeClickEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Map,
    layer: Shape = null,
    originalEvent: js.Any = null,
    shape: Element = null
  ): MapShapeClickEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (layer != null) __obj.updateDynamic("layer")(layer)
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent)
    if (shape != null) __obj.updateDynamic("shape")(shape)
    __obj.asInstanceOf[MapShapeClickEvent]
  }
}

