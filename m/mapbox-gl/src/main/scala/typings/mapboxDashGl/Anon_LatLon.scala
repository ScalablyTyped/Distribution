package typings.mapboxDashGl

import typings.mapboxDashGl.mapboxDashGlMod._LngLatLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LatLon extends _LngLatLike {
  var lat: Double
  var lon: Double
}

object Anon_LatLon {
  @scala.inline
  def apply(lat: Double, lon: Double): Anon_LatLon = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_LatLon]
  }
}

