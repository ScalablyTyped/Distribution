package typings.googlemaps.google.maps.Data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetGeometryEvent extends js.Object {
  var feature: Feature
  var newGeometry: Geometry
  var oldGeometry: Geometry
}

object SetGeometryEvent {
  @scala.inline
  def apply(feature: Feature, newGeometry: Geometry, oldGeometry: Geometry): SetGeometryEvent = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], newGeometry = newGeometry.asInstanceOf[js.Any], oldGeometry = oldGeometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetGeometryEvent]
  }
}

