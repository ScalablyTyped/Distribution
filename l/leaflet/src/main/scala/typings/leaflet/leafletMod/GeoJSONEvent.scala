package typings.leaflet.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoJSONEvent extends LeafletEvent {
  var geometryType: String
  var id: String
  @JSName("layer")
  var layer_GeoJSONEvent: Layer
  var properties: js.Any
}

object GeoJSONEvent {
  @scala.inline
  def apply(
    geometryType: String,
    id: String,
    layer: Layer,
    propagatedFrom: js.Any,
    properties: js.Any,
    sourceTarget: js.Any,
    target: js.Any,
    `type`: String
  ): GeoJSONEvent = {
    val __obj = js.Dynamic.literal(geometryType = geometryType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoJSONEvent]
  }
}

