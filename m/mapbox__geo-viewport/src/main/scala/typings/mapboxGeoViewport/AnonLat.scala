package typings.mapboxGeoViewport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLat extends js.Object {
  var lat: Double
  var lon: Double
}

object AnonLat {
  @scala.inline
  def apply(lat: Double, lon: Double): AnonLat = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLat]
  }
}

