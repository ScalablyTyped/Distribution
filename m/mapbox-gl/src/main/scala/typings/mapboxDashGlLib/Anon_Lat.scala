package typings
package mapboxDashGlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Lat
  extends mapboxDashGlLib.mapboxDashGlMod._LngLatLike {
  var lat: scala.Double
  var lng: scala.Double
}

object Anon_Lat {
  @scala.inline
  def apply(lat: scala.Double, lng: scala.Double): Anon_Lat = {
    val __obj = js.Dynamic.literal(lat = lat, lng = lng)
  
    __obj.asInstanceOf[Anon_Lat]
  }
}

