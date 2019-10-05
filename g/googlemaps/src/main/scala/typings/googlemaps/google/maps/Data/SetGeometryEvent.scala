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
    val __obj = js.Dynamic.literal(feature = feature, newGeometry = newGeometry, oldGeometry = oldGeometry)
  
    __obj.asInstanceOf[SetGeometryEvent]
  }
}

