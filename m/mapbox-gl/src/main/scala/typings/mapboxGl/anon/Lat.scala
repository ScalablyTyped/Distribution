package typings.mapboxGl.anon

import typings.mapboxGl.mod._LngLatLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lat extends _LngLatLike {
  var lat: Double
  var lng: Double
}

object Lat {
  @scala.inline
  def apply(lat: Double, lng: Double): Lat = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lat]
  }
}

