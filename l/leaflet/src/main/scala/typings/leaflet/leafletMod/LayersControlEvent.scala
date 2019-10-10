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
    val __obj = js.Dynamic.literal(layer = layer, name = name, propagatedFrom = propagatedFrom, sourceTarget = sourceTarget, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LayersControlEvent]
  }
}

