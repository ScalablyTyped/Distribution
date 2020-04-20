package typings.haversine.mod

import typings.haversine.AnonCoordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.haversine.mod._ParamType because Already inherited */ trait GeoJSON extends _Coordinate {
  var geometry: AnonCoordinates
}

object GeoJSON {
  @scala.inline
  def apply(geometry: AnonCoordinates): GeoJSON = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoJSON]
  }
}

