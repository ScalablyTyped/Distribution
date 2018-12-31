package typings
package heremapsLib.HNs.geoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class represents a geographical point, which is defined by the latitude, longitude and optional altitude.
  * @property lat {H.geo.Latitude} - The latitude coordinate.
  * @property lng {H.geo.Longitude} - The longitude coordinate.
  * @property alt {H.geo.Altitude} - The altitude coordinate.
  * @property ctx {H.geo.AltitudeContext} - The altitude context.
  */
@JSGlobal("H.geo.Point")
@js.native
class Point protected () extends IPoint {
  /**
    * Constructor
    * @property lat {H.geo.Latitude} - The latitude coordinate.
    * @property lng {H.geo.Longitude} - The longitude coordinate.
    * @property opt_alt {H.geo.Altitude=} - The altitude coordinate.
    * @property opt_ctx {H.geo.AltitudeContext=} - The altitude context.
    */
  def this(lat: Latitude, lng: Longitude) = this()
  def this(lat: Latitude, lng: Longitude, opt_alt: Altitude) = this()
  def this(lat: Latitude, lng: Longitude, opt_alt: Altitude, opt_ctx: AltitudeContext) = this()
  @JSName("alt")
  var alt_Point: Altitude = js.native
  @JSName("ctx")
  var ctx_Point: AltitudeContext = js.native
  /* CompleteClass */
  override var lat: Latitude = js.native
  /* CompleteClass */
  override var lng: Longitude = js.native
  /**
    * To calculate the distance between this point and the supplied other point. The method uses the Haversine formula. The altitude is not considered.
    * @param other {H.geo.IPoint}
    * @returns {number} - The distance between the given location and the location supplied by the caller in meters.
    */
  def distance(other: IPoint): scala.Double = js.native
  /**
    * To compare this point with a supplied other point for equality. Two points are considered equal if they have the same lat and lng as well as equivalent values for alt and ctx.
    * @param other {H.geo.IPoint}
    * @returns {boolean} - Whether the two points are equal.
    */
  def equals(other: IPoint): scala.Boolean = js.native
  /**
    * This method calculates the geographic point of a destination point using the distance and bearing specified by the caller.
    * The altitude is ignored, instead the WGS84 Mean Radius is taken.
    * @param bearing {number} - The bearing to use in the calculation in degrees.
    * @param distance {number} - The distance to the destination in meters.
    * @param opt_overGreatCircle {boolean=} - If true the computation uses the 'Great Circle' otherwise 'Rhumb Line'.
    * @returns {H.geo.Point} - The calculated point
    */
  def walk(bearing: scala.Double, distance: scala.Double): Point = js.native
  def walk(bearing: scala.Double, distance: scala.Double, opt_overGreatCircle: scala.Boolean): Point = js.native
}

/**
  * Class represents a geographical point, which is defined by the latitude, longitude and optional altitude.
  * @property lat {H.geo.Latitude} - The latitude coordinate.
  * @property lng {H.geo.Longitude} - The longitude coordinate.
  * @property alt {H.geo.Altitude} - The altitude coordinate.
  * @property ctx {H.geo.AltitudeContext} - The altitude context.
  */
@JSGlobal("H.geo.Point")
@js.native
object Point extends js.Object {
  /**
    * This method creates a Point instance from a given IPoint object.
    * @param iPoint {H.geo.IPoint} - The IPoint object to use
    * @returns {H.geo.Point} - the created Point instance
    */
  def fromIPoint(iPoint: heremapsLib.HNs.geoNs.IPoint): heremapsLib.HNs.geoNs.Point = js.native
  /**
    * This method validates the given IPoint. It checks, if lat, lng, alt and ctx have valid types. Additionally the value of the lat property is clamped into a range of -90 ... +90
    * and the value of the lng property is modulo into a range of -180 ... +180 plus validates the values of the alt and ctx properties
    * @param point {H.geo.IPoint} - The point to validate
    * @param opt_caller {Function=} - The caller to use for InvalidArgumentError. If omitted no error is thrown
    * @param opt_argNr {number=} - The argument number to use for InvalidArgumentError.
    * @returns {boolean} - if the given point could validate
    */
  def validate(point: heremapsLib.HNs.geoNs.IPoint): scala.Boolean = js.native
  def validate(point: heremapsLib.HNs.geoNs.IPoint, opt_caller: js.Function0[scala.Unit]): scala.Boolean = js.native
  def validate(point: heremapsLib.HNs.geoNs.IPoint, opt_caller: js.Function0[scala.Unit], opt_argNr: scala.Double): scala.Boolean = js.native
}

