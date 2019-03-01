package typings
package haversineLib.haversineMod.haversineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoordinateLonLat extends _Coordinate {
  var lat: scala.Double
  var lon: scala.Double
}

object CoordinateLonLat {
  @scala.inline
  def apply(lat: scala.Double, lon: scala.Double): CoordinateLonLat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lat")(lat)
    __obj.updateDynamic("lon")(lon)
    __obj.asInstanceOf[CoordinateLonLat]
  }
}

