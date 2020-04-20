package typings.haversine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.haversine.mod._ParamType because Already inherited */ trait CoordinateLonLat extends _Coordinate {
  var lat: Double
  var lon: Double
}

object CoordinateLonLat {
  @scala.inline
  def apply(lat: Double, lon: Double): CoordinateLonLat = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoordinateLonLat]
  }
}

