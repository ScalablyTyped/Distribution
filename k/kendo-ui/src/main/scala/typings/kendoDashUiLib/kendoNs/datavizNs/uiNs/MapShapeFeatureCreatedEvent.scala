package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapShapeFeatureCreatedEvent extends MapEvent {
  var dataItem: js.UndefOr[js.Any] = js.undefined
  var group: js.UndefOr[kendoDashUiLib.kendoNs.drawingNs.Group] = js.undefined
  var layer: js.UndefOr[kendoDashUiLib.kendoNs.datavizNs.mapNs.layerNs.Shape] = js.undefined
  var properties: js.UndefOr[js.Any] = js.undefined
}

object MapShapeFeatureCreatedEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Map,
    dataItem: js.Any = null,
    group: kendoDashUiLib.kendoNs.drawingNs.Group = null,
    layer: kendoDashUiLib.kendoNs.datavizNs.mapNs.layerNs.Shape = null,
    properties: js.Any = null
  ): MapShapeFeatureCreatedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (dataItem != null) __obj.updateDynamic("dataItem")(dataItem)
    if (group != null) __obj.updateDynamic("group")(group)
    if (layer != null) __obj.updateDynamic("layer")(layer)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[MapShapeFeatureCreatedEvent]
  }
}

