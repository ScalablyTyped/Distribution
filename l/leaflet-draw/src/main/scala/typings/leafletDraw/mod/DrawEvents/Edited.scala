package typings.leafletDraw.mod.DrawEvents

import typings.leaflet.mod.LayerGroup_
import typings.leaflet.mod.LeafletEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Edited extends LeafletEvent {
  /**
    * List of all layers just edited on the map.
    */
  var layers: LayerGroup_[_]
}

object Edited {
  @scala.inline
  def apply(
    layer: js.Any,
    layers: LayerGroup_[_],
    propagatedFrom: js.Any,
    sourceTarget: js.Any,
    target: js.Any,
    `type`: String
  ): Edited = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edited]
  }
}

