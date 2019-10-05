package typings.kendoDashUi.kendo.dataviz.ui

import typings.kendoDashUi.kendo.dataviz.map.layer.Shape
import typings.kendoDashUi.kendo.drawing.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapShapeMouseEnterEvent extends MapEvent {
  var layer: js.UndefOr[Shape] = js.undefined
  var originalEvent: js.UndefOr[js.Any] = js.undefined
  var shape: js.UndefOr[Element] = js.undefined
}

object MapShapeMouseEnterEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Map,
    layer: Shape = null,
    originalEvent: js.Any = null,
    shape: Element = null
  ): MapShapeMouseEnterEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (layer != null) __obj.updateDynamic("layer")(layer)
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent)
    if (shape != null) __obj.updateDynamic("shape")(shape)
    __obj.asInstanceOf[MapShapeMouseEnterEvent]
  }
}

