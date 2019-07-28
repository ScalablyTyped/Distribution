package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import typings.kendoDashUi.kendoNs.datavizNs.mapNs.layerNs.Shape
import typings.kendoDashUi.kendoNs.drawingNs.Group
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapShapeFeatureCreatedEvent extends MapEvent {
  var dataItem: js.UndefOr[js.Any] = js.undefined
  var group: js.UndefOr[Group] = js.undefined
  var layer: js.UndefOr[Shape] = js.undefined
  var properties: js.UndefOr[js.Any] = js.undefined
}

object MapShapeFeatureCreatedEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Map,
    dataItem: js.Any = null,
    group: Group = null,
    layer: Shape = null,
    properties: js.Any = null
  ): MapShapeFeatureCreatedEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (dataItem != null) __obj.updateDynamic("dataItem")(dataItem)
    if (group != null) __obj.updateDynamic("group")(group)
    if (layer != null) __obj.updateDynamic("layer")(layer)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[MapShapeFeatureCreatedEvent]
  }
}

