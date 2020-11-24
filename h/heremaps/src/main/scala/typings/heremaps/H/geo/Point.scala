package typings.heremaps.H.geo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Class represents a geographical point, which is defined by the latitude, longitude and optional altitude.
  * @property lat {H.geo.Latitude} - The latitude coordinate.
  * @property lng {H.geo.Longitude} - The longitude coordinate.
  * @property alt {H.geo.Altitude} - The altitude coordinate.
  * @property ctx {H.geo.AltitudeContext} - The altitude context.
  */
@js.native
trait Point
  extends AbstractGeometry
     with IPoint {
  
  @JSName("alt")
  var alt_Point: Altitude = js.native
  
  @JSName("ctx")
  var ctx_Point: AltitudeContext = js.native
  
  /**
    * To calculate the distance between this point and the supplied other point. The method uses the Haversine formula. The altitude is not considered.
    * @param other {H.geo.IPoint}
    * @returns {number} - The distance between the given location and the location supplied by the caller in meters.
    */
  def distance(other: IPoint): Double = js.native
  
  /**
    * To compare this point with a supplied other point for equality. Two points are considered equal if they have the same lat and lng as well as equivalent values for alt and ctx.
    * @param other {H.geo.IPoint}
    * @returns {boolean} - Whether the two points are equal.
    */
  def equals(other: IPoint): Boolean = js.native
  
  /**
    * This method calculates the geographic point of a destination point using the distance and bearing specified by the caller.
    * The altitude is ignored, instead the WGS84 Mean Radius is taken.
    * @param bearing {number} - The bearing to use in the calculation in degrees.
    * @param distance {number} - The distance to the destination in meters.
    * @param opt_overGreatCircle {boolean=} - If true the computation uses the 'Great Circle' otherwise 'Rhumb Line'.
    * @returns {H.geo.Point} - The calculated point
    */
  def walk(bearing: Double, distance: Double): Point = js.native
  def walk(bearing: Double, distance: Double, opt_overGreatCircle: Boolean): Point = js.native
}
