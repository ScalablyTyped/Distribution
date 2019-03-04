package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoJSONEvent extends LeafletEvent {
  var geometryType: java.lang.String
  var id: java.lang.String
  var layer: Layer
  var properties: js.Any
}

object GeoJSONEvent {
  @scala.inline
  def apply(
    geometryType: java.lang.String,
    id: java.lang.String,
    layer: Layer,
    properties: js.Any,
    target: js.Any,
    `type`: java.lang.String
  ): GeoJSONEvent = {
    val __obj = js.Dynamic.literal(geometryType = geometryType, id = id, layer = layer, properties = properties, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GeoJSONEvent]
  }
}

