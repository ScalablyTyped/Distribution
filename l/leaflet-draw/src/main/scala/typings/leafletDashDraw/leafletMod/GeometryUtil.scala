package typings.leafletDashDraw.leafletMod

import typings.leaflet.leafletMod.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "GeometryUtil")
@js.native
object GeometryUtil extends js.Object {
  /**
    * Returns n in specified number format (if defined) and precision
    */
  def formattedNumber(n: String, precision: Double): String = js.native
  /**
    * Returns the area of a polygon drawn with leaflet.draw
    */
  def geodesicArea(coordinates: js.Array[LatLngLiteral]): Double = js.native
  /**
    * Returns true if the Leaflet version is 0.7.x, false otherwise.
    */
  def isVersion07x(): Boolean = js.native
  /**
    * Returns a readable area string in yards or metric
    */
  def readableArea(area: Double): String = js.native
  def readableArea(area: Double, isMetric: Boolean): String = js.native
  def readableArea(area: Double, isMetric: Boolean, precision: PrecisionOptions): String = js.native
  /**
    * Converts a metric distance to one of [ feet, nauticalMile, metric or yards ] string
    * The value will be rounded as defined by the precision option object.
    */
  def readableDistance(distance: Double): String = js.native
  def readableDistance(distance: Double, isMetric: Boolean): String = js.native
  def readableDistance(distance: Double, isMetric: Boolean, isFeet: Boolean): String = js.native
  def readableDistance(distance: Double, isMetric: Boolean, isFeet: Boolean, isNauticalMile: Boolean): String = js.native
  def readableDistance(
    distance: Double,
    isMetric: Boolean,
    isFeet: Boolean,
    isNauticalMile: Boolean,
    precision: PrecisionOptions
  ): String = js.native
}

