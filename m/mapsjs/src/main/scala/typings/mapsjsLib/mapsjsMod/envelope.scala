package typings
package mapsjsLib.mapsjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapsjs", "envelope")
@js.native
class envelope protected () extends js.Object {
  def this(minX: scala.Double, minY: scala.Double, maxX: scala.Double, maxY: scala.Double) = this()
  /**
  	 * Tests whether the given point is contained within this envelope.
  	 * @param {point} pt Point to test.
  	 * @returns {boolean} Result of containment test.
  	 */
  def contains(pt: point): scala.Boolean = js.native
  /**
  	 * Create a new envelope from this one plus a bleed ratio.
  	 * @param {number} bleed The bleed ratio.
  	 * @returns {envelope} A new envelope.
  	 */
  def createFromBleed(bleed: scala.Double): envelope = js.native
  /**
    * Creates a new envelope from this one plus x and y margins.
    * @param {number} marginX The x margin.
    * @param {number} marginY The y margin.
    * @returns {envelope} A new envelope.
    */
  def createFromMargins(marginX: scala.Double, marginY: scala.Double): envelope = js.native
  /**
  	 * Equality comparer between this and another envelope.
  	 * @param {envelope} env Envelope to compare.
  	 * @return {boolean} Result of equality comparison.
  	 */
  def equals(env: envelope): scala.Boolean = js.native
  /**
  	 * Gets area of the envelope.
  	 * @return {number} Area of the envelope.
  	 */
  def getArea(): scala.Double = js.native
  /**
  	 * Gets the aspect of the envelope.
  	 * @returns {number} Width-to-height ratio.
  	 */
  def getAspect(): scala.Double = js.native
  /**
  	 * Gets the center point of the envelope.
  	 * @returns {point} Center as a point.
  	 */
  def getCenter(): point = js.native
  /**
  	 * Gets height of the envelope.
  	 * @returns {number} Height of the envelope.
  	 */
  def getHeight(): scala.Double = js.native
  /**
  	 * Gets lower left of this envelope.
  	 * @returns {point} A new point.
  	 */
  def getLL(): point = js.native
  /**
  	 * Gets lower right of this envelope.
  	 * @returns {point} A new point.
  	 */
  def getLR(): point = js.native
  /** 
  	 * Gets the maximum x coordinate of the envelope
  	 * @returns {number} The maximum x coordinate.
  	 */
  def getMaxX(): scala.Double = js.native
  /**
  	 * Gets the maximum y coordinate of the envelope
  	 * @returns {number} The maximum y coordinate.
  	 */
  def getMaxY(): scala.Double = js.native
  /**
    * Gets the minimum x coordinate of the envelope.
    * @returns {number} The minimum x coordinate. 
    */
  def getMinX(): scala.Double = js.native
  /**
  	 * Gets the minimum y coordinate of the envelope
  	 * @returns {number} The minimum y coordinate.
  	 */
  def getMinY(): scala.Double = js.native
  /**
  	 * Gets upper left coordinate of this envelope.
  	 * @returns {point} A new point.
  	 */
  def getUL(): point = js.native
  /**
  	 * Gets upper right of this envelope.
  	 * @returns {point} A new point.
  	 */
  def getUR(): point = js.native
  /**
  	 * Gets the width of the envelope.
  	 * @returns {number} Width of the envelope.
  	 */
  def getWidth(): scala.Double = js.native
  /**
  	 * Create a closed geometry from this envelope.
    * @returns {geometry} A new closed path geometry.
  	 */
  def toGeometry(): geometry = js.native
  /**
  	 * Returns the minimum and maximum coordinates of this envelope as an envObject.
  	 * @returns {envObject} Representaton of this envelope as an envObject.
  	 */
  def toObject(): envObject = js.native
}

