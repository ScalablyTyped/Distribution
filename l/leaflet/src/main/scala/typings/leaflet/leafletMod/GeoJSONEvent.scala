package typings.leaflet.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoJSONEvent extends LeafletEvent {
  var geometryType: String
  var id: String
  var layer: Layer
  var properties: js.Any
}

object GeoJSONEvent {
  @scala.inline
  def apply(geometryType: String, id: String, layer: Layer, properties: js.Any, target: js.Any, `type`: String): GeoJSONEvent = {
    val __obj = js.Dynamic.literal(geometryType = geometryType, id = id, layer = layer, properties = properties, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GeoJSONEvent]
  }
}

