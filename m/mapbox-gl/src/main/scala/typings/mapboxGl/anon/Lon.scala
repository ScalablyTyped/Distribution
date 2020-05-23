package typings.mapboxGl.anon

import typings.mapboxGl.mod._LngLatLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lon extends _LngLatLike {
  var lat: Double
  var lon: Double
}

object Lon {
  @scala.inline
  def apply(lat: Double, lon: Double): Lon = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lon]
  }
}

