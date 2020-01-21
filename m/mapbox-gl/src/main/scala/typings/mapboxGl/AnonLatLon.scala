package typings.mapboxGl

import typings.mapboxGl.mod._LngLatLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLatLon extends _LngLatLike {
  var lat: Double
  var lon: Double
}

object AnonLatLon {
  @scala.inline
  def apply(lat: Double, lon: Double): AnonLatLon = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLatLon]
  }
}

