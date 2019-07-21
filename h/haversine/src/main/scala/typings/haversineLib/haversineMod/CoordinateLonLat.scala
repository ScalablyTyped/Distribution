package typings
package haversineLib.haversineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- haversineLib.haversineMod._ParamType because Already inherited */ trait CoordinateLonLat extends _Coordinate {
  var lat: scala.Double
  var lon: scala.Double
}

object CoordinateLonLat {
  @scala.inline
  def apply(lat: scala.Double, lon: scala.Double): CoordinateLonLat = {
    val __obj = js.Dynamic.literal(lat = lat, lon = lon)
  
    __obj.asInstanceOf[CoordinateLonLat]
  }
}

