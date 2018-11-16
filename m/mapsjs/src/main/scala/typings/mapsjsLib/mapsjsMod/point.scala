package typings
package mapsjsLib.mapsjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapsjs", "point")
@js.native
class point protected () extends js.Object {
  def this(x: scala.Double, y: scala.Double) = this()
  /**
  	 * Creates new n-sided polygon around this point.
  	 * @param {number} sides Number of polygon sides.
  	 * @param {number} radius Distance to polygon points.
  	 * @returns {polygon} The generated polygon.
  	 */
  def convertToPoly(side: scala.Double, radius: scala.Double): mapsjsLib.mapsjsMod.geometryNs.polygon = js.native
  /** 
  	 * Creates a point from this point offset by a given x and y distance.
  	 * @param {number} dx The x offset.
  	 * @param {number} dy The y offset.
  	 * @returns {point} The offset point.
  	 */
  def createOffsetBy(dx: scala.Double, dy: scala.Double): point = js.native
  /**
  	 * Computes distance between this point and a given point in projected
  	 * map units.
  	 * @param {point} pt Point to which to compute distance.
  	 * @returns {number} Distance from this point to the given point in
  	 * projected map units.
  	 */
  def distanceTo(pt: point): scala.Double = js.native
  /**
  	 * Equality comparer between this point and a given reference point.
  	 * @param {point} pt Reference point.
  	 * @returns {boolean} Result of the equality test.
  	 */
  def equals(pt: point): scala.Boolean = js.native
  /**
  	 * Returns this point's bounding box.
  	 * @returns {envelope} The bounding box of the point as an envelope.
  	 */
  def getBounds(): envelope = js.native
  /**
  	 * Returns the x coordinate.
  	 * @returns {number} The x coordinate.
  	 */
  def getX(): scala.Double = js.native
  /**
  	 * Returns the y coordinate.
  	 * @returns {number} The y coordinate.
  	 */
  def getY(): scala.Double = js.native
  /**
  	 * Returns the x and y coordinates of this point as a pointObject.
  	 * @returns {pointObject} Representaton of this point as an pointObject.
  	 */
  def toProps(): pointObject = js.native
}

