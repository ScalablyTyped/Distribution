package typings.leaflet.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayersControlEvent extends LayerEvent {
  var name: String
}

object LayersControlEvent {
  @scala.inline
  def apply(layer: Layer, name: String, target: js.Any, `type`: String): LayersControlEvent = {
    val __obj = js.Dynamic.literal(layer = layer, name = name, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LayersControlEvent]
  }
}

