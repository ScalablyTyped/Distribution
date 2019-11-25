package typings.leaflet.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayersControlEvent extends LayerEvent {
  var name: String
}

object LayersControlEvent {
  @scala.inline
  def apply(
    layer: Layer,
    name: String,
    propagatedFrom: js.Any,
    sourceTarget: js.Any,
    target: js.Any,
    `type`: String
  ): LayersControlEvent = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayersControlEvent]
  }
}

