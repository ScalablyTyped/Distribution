package typings.leafletDashDraw.leafletMod.DrawEvents

import typings.leaflet.leafletMod.LayerGroup
import typings.leaflet.leafletMod.LeafletEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawVertex extends LeafletEvent {
  /**
    * List of all layers just being added from the map.
    */
  var layers: LayerGroup[_]
}

object DrawVertex {
  @scala.inline
  def apply(
    layer: js.Any,
    layers: LayerGroup[_],
    propagatedFrom: js.Any,
    sourceTarget: js.Any,
    target: js.Any,
    `type`: String
  ): DrawVertex = {
    val __obj = js.Dynamic.literal(layer = layer, layers = layers, propagatedFrom = propagatedFrom, sourceTarget = sourceTarget, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DrawVertex]
  }
}

