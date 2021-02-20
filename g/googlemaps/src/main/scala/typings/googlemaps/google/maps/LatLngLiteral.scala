package typings.googlemaps.google.maps

import typings.googlemaps.google.maps.places._LocationBias
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object literals are accepted in place of {@link LatLng} objects, as a convenience, in many places. These are
  * converted to {@link LatLng} objects when the Maps API encounters them.
  *
  * **LatLng object literals are not supported in the Geometry library.**
  * @example
  * map.setCenter({lat: -34, lng: 151});
  * new google.maps.Marker({position: {lat: -34, lng: 151}, map: map});
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#LatLngLiteral Maps JavaScript API}
  */
@js.native
trait LatLngLiteral extends _LocationBias {
  
  /**
    * Latitude in degrees. Values will be clamped to the range [-90, 90]. This means that if the value specified is
    * less than -90, it will be set to -90. And if the value is greater than 90, it will be set to 90.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#LatLngLiteral.lat Maps JavaScript API}
    */
  var lat: Double = js.native
  
  /**
    * Longitude in degrees. Values outside the range [-180, 180] will be wrapped so that they fall within the
    * range. For example, a value of -190 will be converted to 170. A value of 190 will be converted to -170. This
    * reflects the fact that longitudes wrap around the globe.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#LatLngLiteral.lng Maps JavaScript API}
    */
  var lng: Double = js.native
}
object LatLngLiteral {
  
  @scala.inline
  def apply(lat: Double, lng: Double): LatLngLiteral = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
    __obj.asInstanceOf[LatLngLiteral]
  }
  
  @scala.inline
  implicit class LatLngLiteralMutableBuilder[Self <: LatLngLiteral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLng(value: Double): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
  }
}
