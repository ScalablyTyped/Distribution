package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.LatLng")
@js.native
class LatLng protected ()
  extends googlemapsLib.googleNs.mapsNs.placesNs._LocationBias {
  /**
    * Creates a LatLng object representing a geographic point.
    * @param literal Object literal.
    * @param noWrap Set noWrap to true to enable values outside of this range.
    */
  def this(literal: LatLngLiteral) = this()
  /**
    * Creates a LatLng object representing a geographic point.
    * Note the ordering of latitude and longitude.
    * @param lat Latitude is specified in degrees within the range [-90, 90].
    * @param lng Longitude is specified in degrees within the range [-180,
    *     180].
    * @param noWrap Set noWrap to true to enable values outside of this range.
    */
  def this(lat: scala.Double, lng: scala.Double) = this()
  def this(literal: LatLngLiteral, noWrap: scala.Boolean) = this()
  def this(lat: scala.Double, lng: scala.Double, noWrap: scala.Boolean) = this()
  /** Comparison function. */
  def equals(other: LatLng): scala.Boolean = js.native
  /** Returns the latitude in degrees. */
  def lat(): scala.Double = js.native
  /** Returns the longitude in degrees. */
  def lng(): scala.Double = js.native
  /**
    * Converts to JSON representation. This function is intended to be used
    * via JSON.stringify.
    */
  def toJSON(): LatLngLiteral = js.native
  /**
    * Returns a string of the form "lat,lng". We round the lat/lng values to 6
    * decimal places by default.
    */
  def toUrlValue(): java.lang.String = js.native
  def toUrlValue(precision: scala.Double): java.lang.String = js.native
}

