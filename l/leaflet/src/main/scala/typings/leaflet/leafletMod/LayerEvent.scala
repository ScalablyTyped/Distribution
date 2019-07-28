package typings.leaflet.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerEvent extends LeafletEvent {
  var layer: Layer
}

object LayerEvent {
  @scala.inline
  def apply(layer: Layer, target: js.Any, `type`: String): LayerEvent = {
    val __obj = js.Dynamic.literal(layer = layer, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LayerEvent]
  }
}

