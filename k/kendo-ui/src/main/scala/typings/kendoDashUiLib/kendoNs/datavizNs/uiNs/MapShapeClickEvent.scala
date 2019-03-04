package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapShapeClickEvent extends MapEvent {
  var layer: js.UndefOr[kendoDashUiLib.kendoNs.datavizNs.mapNs.layerNs.Shape] = js.undefined
  var originalEvent: js.UndefOr[js.Any] = js.undefined
  var shape: js.UndefOr[kendoDashUiLib.kendoNs.drawingNs.Element] = js.undefined
}

object MapShapeClickEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Map,
    layer: kendoDashUiLib.kendoNs.datavizNs.mapNs.layerNs.Shape = null,
    originalEvent: js.Any = null,
    shape: kendoDashUiLib.kendoNs.drawingNs.Element = null
  ): MapShapeClickEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (layer != null) __obj.updateDynamic("layer")(layer)
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent)
    if (shape != null) __obj.updateDynamic("shape")(shape)
    __obj.asInstanceOf[MapShapeClickEvent]
  }
}

