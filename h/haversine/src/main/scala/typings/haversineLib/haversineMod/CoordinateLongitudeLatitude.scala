package typings
package haversineLib.haversineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- haversineLib.haversineMod._ParamType because Already inherited */ trait CoordinateLongitudeLatitude extends _Coordinate {
  var latitude: scala.Double
  var longitude: scala.Double
}

object CoordinateLongitudeLatitude {
  @scala.inline
  def apply(latitude: scala.Double, longitude: scala.Double): CoordinateLongitudeLatitude = {
    val __obj = js.Dynamic.literal(latitude = latitude, longitude = longitude)
  
    __obj.asInstanceOf[CoordinateLongitudeLatitude]
  }
}

