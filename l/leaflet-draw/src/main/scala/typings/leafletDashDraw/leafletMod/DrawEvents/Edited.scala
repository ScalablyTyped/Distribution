package typings.leafletDashDraw.leafletMod.DrawEvents

import typings.leaflet.leafletMod.LayerGroup
import typings.leaflet.leafletMod.LeafletEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Edited extends LeafletEvent {
  /**
    * List of all layers just edited on the map.
    */
  var layers: LayerGroup[_]
}

object Edited {
  @scala.inline
  def apply(
    layer: js.Any,
    layers: LayerGroup[_],
    propagatedFrom: js.Any,
    sourceTarget: js.Any,
    target: js.Any,
    `type`: String
  ): Edited = {
    val __obj = js.Dynamic.literal(layer = layer, layers = layers, propagatedFrom = propagatedFrom, sourceTarget = sourceTarget, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Edited]
  }
}

