package typings.haversine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.haversine.mod._ParamType because Already inherited */ trait CoordinateLatLng extends _Coordinate {
  var lat: Double
  var lng: Double
}

object CoordinateLatLng {
  @scala.inline
  def apply(lat: Double, lng: Double): CoordinateLatLng = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CoordinateLatLng]
  }
}

