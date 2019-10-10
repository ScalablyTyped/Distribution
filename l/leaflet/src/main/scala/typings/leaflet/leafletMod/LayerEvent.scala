package typings.leaflet.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerEvent extends LeafletEvent {
  @JSName("layer")
  var layer_LayerEvent: Layer
}

object LayerEvent {
  @scala.inline
  def apply(layer: Layer, propagatedFrom: js.Any, sourceTarget: js.Any, target: js.Any, `type`: String): LayerEvent = {
    val __obj = js.Dynamic.literal(layer = layer, propagatedFrom = propagatedFrom, sourceTarget = sourceTarget, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LayerEvent]
  }
}

