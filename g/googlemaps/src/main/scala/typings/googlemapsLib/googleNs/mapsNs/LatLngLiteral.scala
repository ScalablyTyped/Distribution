package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LatLngLiteral
  extends googlemapsLib.googleNs.mapsNs.placesNs._LocationBias {
  var lat: scala.Double
  var lng: scala.Double
}

object LatLngLiteral {
  @scala.inline
  def apply(lat: scala.Double, lng: scala.Double): LatLngLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lat")(lat)
    __obj.updateDynamic("lng")(lng)
    __obj.asInstanceOf[LatLngLiteral]
  }
}

