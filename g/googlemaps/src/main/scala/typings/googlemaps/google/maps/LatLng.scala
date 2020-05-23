package typings.googlemaps.google.maps

import typings.googlemaps.google.maps.places._LocationBias
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A LatLng is a point in geographical coordinates: latitude and longitude.
  *
  * * Latitude ranges between -90 and 90 degrees, inclusive. Values above or
  *   below this range will be clamped to the range [-90, 90]. This means
  *   that if the value specified is less than -90, it will be set to -90.
  *   And if the value is greater than 90, it will be set to 90.
  * * Longitude ranges between -180 and 180 degrees, inclusive. Values above
  *   or below this range will be wrapped so that they fall within the
  *   range. For example, a value of -190 will be converted to 170. A value
  *   of 190 will be converted to -170. This reflects the fact that
  *   longitudes wrap around the globe.
  *
  * Although the default map projection associates longitude with the
  * x-coordinate of the map, and latitude with the y-coordinate, the
  * latitude coordinate is always written first, followed by the longitude.
  * Notice that you cannot modify the coordinates of a LatLng. If you want
  * to compute another point, you have to create a new one.
  */
@js.native
trait LatLng extends _LocationBias {
  /** Comparison function. */
  def equals(other: LatLng): Boolean = js.native
  /** Returns the latitude in degrees. */
  def lat(): Double = js.native
  /** Returns the longitude in degrees. */
  def lng(): Double = js.native
  /**
    * Converts to JSON representation. This function is intended to be used
    * via JSON.stringify.
    */
  def toJSON(): LatLngLiteral = js.native
  /**
    * Returns a string of the form "lat,lng". We round the lat/lng values to 6
    * decimal places by default.
    */
  def toUrlValue(): String = js.native
  def toUrlValue(precision: Double): String = js.native
}

