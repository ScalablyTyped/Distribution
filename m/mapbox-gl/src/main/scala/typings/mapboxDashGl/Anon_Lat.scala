package typings.mapboxDashGl

import typings.mapboxDashGl.mapboxDashGlMod._LngLatLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Lat extends _LngLatLike {
  var lat: Double
  var lng: Double
}

object Anon_Lat {
  @scala.inline
  def apply(lat: Double, lng: Double): Anon_Lat = {
    val __obj = js.Dynamic.literal(lat = lat, lng = lng)
  
    __obj.asInstanceOf[Anon_Lat]
  }
}

