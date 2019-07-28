package typings.haversine.haversineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.haversine.haversineMod._ParamType because Already inherited */ trait CoordinateLatLng extends _Coordinate {
  var lat: Double
  var lng: Double
}

object CoordinateLatLng {
  @scala.inline
  def apply(lat: Double, lng: Double): CoordinateLatLng = {
    val __obj = js.Dynamic.literal(lat = lat, lng = lng)
  
    __obj.asInstanceOf[CoordinateLatLng]
  }
}

