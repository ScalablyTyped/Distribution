package typings
package leafletDashDrawLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet.GeometryUtil")
@js.native
object GeometryUtilNs extends js.Object {
  /**
  		 * Returns n in specified number format (if defined) and precision
  		 */
  def formattedNumber(n: java.lang.String, precision: scala.Double): java.lang.String = js.native
  /**
  		 * Returns the area of a polygon drawn with leaflet.draw
  		 */
  def geodesicArea(coordinates: js.Array[leafletLib.leafletMod.LatLngLiteral]): scala.Double = js.native
  /**
  		 * Returns true if the Leaflet version is 0.7.x, false otherwise.
  		 */
  def isVersion07x(): scala.Boolean = js.native
  /**
  		 * Returns a readable area string in yards or metric
  		 */
  def readableArea(area: scala.Double): java.lang.String = js.native
  /**
  		 * Returns a readable area string in yards or metric
  		 */
  def readableArea(area: scala.Double, isMetric: scala.Boolean): java.lang.String = js.native
  /**
  		 * Returns a readable area string in yards or metric
  		 */
  def readableArea(
    area: scala.Double,
    isMetric: scala.Boolean,
    precision: leafletDashDrawLib.leafletMod.PrecisionOptions
  ): java.lang.String = js.native
  /**
  		 * Converts metric distance to distance string.
  		 * The value will be rounded as defined by the precision option object.
  		 */
  def readableDistance(distance: scala.Double): java.lang.String = js.native
  /**
  		 * Converts metric distance to distance string.
  		 * The value will be rounded as defined by the precision option object.
  		 */
  def readableDistance(distance: scala.Double, isMetric: scala.Boolean): java.lang.String = js.native
  /**
  		 * Converts metric distance to distance string.
  		 * The value will be rounded as defined by the precision option object.
  		 */
  def readableDistance(distance: scala.Double, isMetric: scala.Boolean, isFeet: scala.Boolean): java.lang.String = js.native
  /**
  		 * Converts metric distance to distance string.
  		 * The value will be rounded as defined by the precision option object.
  		 */
  def readableDistance(
    distance: scala.Double,
    isMetric: scala.Boolean,
    isFeet: scala.Boolean,
    isNauticalMile: scala.Boolean
  ): java.lang.String = js.native
  /**
  		 * Converts metric distance to distance string.
  		 * The value will be rounded as defined by the precision option object.
  		 */
  def readableDistance(
    distance: scala.Double,
    isMetric: scala.Boolean,
    isFeet: scala.Boolean,
    isNauticalMile: scala.Boolean,
    precision: leafletDashDrawLib.leafletMod.PrecisionOptions
  ): java.lang.String = js.native
}

