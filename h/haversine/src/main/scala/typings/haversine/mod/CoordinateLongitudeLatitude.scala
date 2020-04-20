package typings.haversine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.haversine.mod._ParamType because Already inherited */ trait CoordinateLongitudeLatitude extends _Coordinate {
  var latitude: Double
  var longitude: Double
}

object CoordinateLongitudeLatitude {
  @scala.inline
  def apply(latitude: Double, longitude: Double): CoordinateLongitudeLatitude = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoordinateLongitudeLatitude]
  }
}

