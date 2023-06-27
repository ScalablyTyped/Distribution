package typings.mapsjs.mod

import typings.mapsjs.mod.geometry.polygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mapsjs", "point")
@js.native
open class point protected () extends StObject {
  def this(x: Double, y: Double) = this()
  
  /**
    * Creates new n-sided polygon around this point.
    * @param {number} sides Number of polygon sides.
    * @param {number} radius Distance to polygon points.
    * @returns {polygon} The generated polygon.
    */
  def convertToPoly(side: Double, radius: Double): polygon = js.native
  
  /**
    * Creates a point from this point offset by a given x and y distance.
    * @param {number} dx The x offset.
    * @param {number} dy The y offset.
    * @returns {point} The offset point.
    */
  def createOffsetBy(dx: Double, dy: Double): point = js.native
  
  /**
    * Computes distance between this point and a given point in projected
    * map units.
    * @param {point} pt Point to which to compute distance.
    * @returns {number} Distance from this point to the given point in
    * projected map units.
    */
  def distanceTo(pt: point): Double = js.native
  
  /**
    * Equality comparer between this point and a given reference point.
    * @param {point} pt Reference point.
    * @returns {boolean} Result of the equality test.
    */
  def equals(pt: point): Boolean = js.native
  
  /**
    * Returns this point's bounding box.
    * @returns {envelope} The bounding box of the point as an envelope.
    */
  def getBounds(): envelope = js.native
  
  /**
    * Returns the x coordinate.
    * @returns {number} The x coordinate.
    */
  def getX(): Double = js.native
  
  /**
    * Returns the y coordinate.
    * @returns {number} The y coordinate.
    */
  def getY(): Double = js.native
  
  /**
    * Returns the x and y coordinates of this point as a pointObject.
    * @returns {pointObject} Representaton of this point as an pointObject.
    */
  def toProps(): pointObject = js.native
}
object point {
  
  @JSImport("mapsjs", "point")
  @js.native
  val ^ : js.Any = js.native
  
  inline def distance(x1: Double, y1: Double, x2: Double, y2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def midpoint(x1: Double, y1: Double, x2: Double, y2: Double): point = (^.asInstanceOf[js.Dynamic].applyDynamic("midpoint")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[point]
}
