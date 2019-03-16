package typings
package haversineLib.haversineMod.haversineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoordinateLatLng extends _Coordinate {
  var lat: scala.Double
  var lng: scala.Double
}

object CoordinateLatLng {
  @scala.inline
  def apply(lat: scala.Double, lng: scala.Double): CoordinateLatLng = {
    val __obj = js.Dynamic.literal(lat = lat, lng = lng)
  
    __obj.asInstanceOf[CoordinateLatLng]
  }
}

