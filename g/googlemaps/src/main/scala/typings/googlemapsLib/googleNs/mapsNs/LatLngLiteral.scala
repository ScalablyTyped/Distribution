package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LatLngLiteral
  extends googlemapsLib.googleNs.mapsNs.placesNs._LocationBias {
  /**
    * Latitude in degrees. Values will be clamped to the range [-90, 90]. This
    * means that if the value specified is less than -90, it will be set to
    * -90. And if the value is greater than 90, it will be set to 90.
    */
  var lat: scala.Double
  /**
    * Longitude in degrees. Values outside the range [-180, 180] will be
    * wrapped so that they fall within the range. For example, a value of -190
    * will be converted to 170. A value of 190 will be converted to -170. This
    * reflects the fact that longitudes wrap around the globe.
    */
  var lng: scala.Double
}

object LatLngLiteral {
  @scala.inline
  def apply(lat: scala.Double, lng: scala.Double): LatLngLiteral = {
    val __obj = js.Dynamic.literal(lat = lat, lng = lng)
  
    __obj.asInstanceOf[LatLngLiteral]
  }
}

