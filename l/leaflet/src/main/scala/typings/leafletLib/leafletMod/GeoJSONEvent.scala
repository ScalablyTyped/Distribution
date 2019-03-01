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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("geometryType")(geometryType)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("layer")(layer)
    __obj.updateDynamic("properties")(properties)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[GeoJSONEvent]
  }
}

