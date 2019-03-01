package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapShapeCreatedEvent extends MapEvent {
  var layer: js.UndefOr[kendoDashUiLib.kendoNs.datavizNs.mapNs.layerNs.Shape] = js.undefined
  var originalEvent: js.UndefOr[js.Any] = js.undefined
  var shape: js.UndefOr[kendoDashUiLib.kendoNs.drawingNs.Element] = js.undefined
}

object MapShapeCreatedEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Map,
    layer: kendoDashUiLib.kendoNs.datavizNs.mapNs.layerNs.Shape = null,
    originalEvent: js.Any = null,
    shape: kendoDashUiLib.kendoNs.drawingNs.Element = null
  ): MapShapeCreatedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (layer != null) __obj.updateDynamic("layer")(layer)
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent)
    if (shape != null) __obj.updateDynamic("shape")(shape)
    __obj.asInstanceOf[MapShapeCreatedEvent]
  }
}

