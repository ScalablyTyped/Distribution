package typings.mapboxGl

import typings.mapboxGl.mod._LngLatLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLon extends _LngLatLike {
  var lat: Double
  var lon: Double
}

object AnonLon {
  @scala.inline
  def apply(lat: Double, lon: Double): AnonLon = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLon]
  }
}

