package typings.googlemaps.google.maps

import typings.googlemaps.google.maps.places._LocationBias
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A LatLng is a point in geographical coordinates: latitude and longitude.
  *
  * * Latitude ranges between -90 and 90 degrees, inclusive. Values above or below this range will be clamped to the
  *   range [-90, 90]. This means that if the value specified is less than -90, it will be set to -90. And if the
  *   value is greater than 90, it will be set to 90.
  * * Longitude ranges between -180 and 180 degrees, inclusive. Values above or below this range will be wrapped so
  *   that they fall within the range. For example, a value of -190 will be converted to 170. A value of 190 will be
  *   converted to -170. This reflects the fact that longitudes wrap around the globe.
  *
  * Although the default map projection associates longitude with the x-coordinate of the map, and latitude with the
  * y-coordinate, the latitude coordinate is always written first, followed by the longitude.
  * Notice that you cannot modify the coordinates of a LatLng. If you want to compute another point, you have to
  * create a new one.
  * @example <caption>Most methods that accept LatLng objects also accept a {@link LatLngLiteral} object, so that the following are equivalent:</caption>
  * map.setCenter(new google.maps.LatLng(-34, 151));
  * map.setCenter({lat: -34, lng: 151});
  * @example <caption>The constructor also accepts literal objects, and converts them to instances of LatLng:</caption>
  * myLatLng = new google.maps.LatLng({lat: -34, lng: 151});
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#LatLng Maps JavaScript API}
  */
@js.native
trait LatLng extends _LocationBias {
  
  /**
    * Comparison function.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#LatLng.equals Maps JavaScript API}
    */
  def equals(other: LatLng): Boolean = js.native
  
  /**
    * Returns the latitude in degrees.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#LatLng.lat Maps JavaScript API}
    */
  def lat(): Double = js.native
  
  /**
    * Returns the longitude in degrees.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#LatLng.lng Maps JavaScript API}
    */
  def lng(): Double = js.native
  
  /**
    * Converts to JSON representation. This function is intended to be used via {@link JSON.stringify}.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#LatLng.toJSON Maps JavaScript API}
    */
  def toJSON(): LatLngLiteral = js.native
  
  /**
    * Returns a string of the form "lat,lng" for this LatLng. We round the lat/lng values to 6 decimal places by
    * default.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#LatLng.toUrlValue Maps JavaScript API}
    */
  def toUrlValue(): String = js.native
  def toUrlValue(precision: Double): String = js.native
}
