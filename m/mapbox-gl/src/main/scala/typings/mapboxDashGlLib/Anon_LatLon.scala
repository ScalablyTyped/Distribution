package typings
package mapboxDashGlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LatLon
  extends mapboxDashGlLib.mapboxDashGlMod.mapboxglNs._LngLatLike {
  var lat: scala.Double
  var lon: scala.Double
}

object Anon_LatLon {
  @scala.inline
  def apply(lat: scala.Double, lon: scala.Double): Anon_LatLon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lat")(lat)
    __obj.updateDynamic("lon")(lon)
    __obj.asInstanceOf[Anon_LatLon]
  }
}

