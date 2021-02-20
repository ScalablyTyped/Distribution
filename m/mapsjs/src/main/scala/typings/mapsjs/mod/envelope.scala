package typings.mapsjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mapsjs", "envelope")
@js.native
class envelope protected () extends StObject {
  def this(minX: Double, minY: Double, maxX: Double, maxY: Double) = this()
  
  /**
    * Tests whether the given point is contained within this envelope.
    * @param {point} pt Point to test.
    * @returns {boolean} Result of containment test.
    */
  def contains(pt: point): Boolean = js.native
  
  /**
    * Create a new envelope from this one plus a bleed ratio.
    * @param {number} bleed The bleed ratio.
    * @returns {envelope} A new envelope.
    */
  def createFromBleed(bleed: Double): envelope = js.native
  
  /**
    * Creates a new envelope from this one plus x and y margins.
    * @param {number} marginX The x margin.
    * @param {number} marginY The y margin.
    * @returns {envelope} A new envelope.
    */
  def createFromMargins(marginX: Double, marginY: Double): envelope = js.native
  
  /**
    * Equality comparer between this and another envelope.
    * @param {envelope} env Envelope to compare.
    * @return {boolean} Result of equality comparison.
    */
  def equals(env: envelope): Boolean = js.native
  
  /**
    * Gets area of the envelope.
    * @return {number} Area of the envelope.
    */
  def getArea(): Double = js.native
  
  /**
    * Gets the aspect of the envelope.
    * @returns {number} Width-to-height ratio.
    */
  def getAspect(): Double = js.native
  
  /**
    * Gets the center point of the envelope.
    * @returns {point} Center as a point.
    */
  def getCenter(): point = js.native
  
  /**
    * Gets height of the envelope.
    * @returns {number} Height of the envelope.
    */
  def getHeight(): Double = js.native
  
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
  def getMaxX(): Double = js.native
  
  /**
    * Gets the maximum y coordinate of the envelope
    * @returns {number} The maximum y coordinate.
    */
  def getMaxY(): Double = js.native
  
  /**
    * Gets the minimum x coordinate of the envelope.
    * @returns {number} The minimum x coordinate. 
    */
  def getMinX(): Double = js.native
  
  /**
    * Gets the minimum y coordinate of the envelope
    * @returns {number} The minimum y coordinate.
    */
  def getMinY(): Double = js.native
  
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
  def getWidth(): Double = js.native
  
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
object envelope {
  
  @JSImport("mapsjs", "envelope.createFromCenterAndMargins")
  @js.native
  def createFromCenterAndMargins(centerPtX: Double, centerPtY: Double, marginX: Double, marginY: Double): envelope = js.native
  
  @JSImport("mapsjs", "envelope.createFromMdnXml")
  @js.native
  def createFromMdnXml(xml: String): envelope = js.native
  
  @JSImport("mapsjs", "envelope.createFromPoints")
  @js.native
  def createFromPoints(pt1: point, pt2: point): envelope = js.native
  
  @JSImport("mapsjs", "envelope.intersects")
  @js.native
  def intersects(env1: envelope, env2: envelope): Boolean = js.native
  
  @JSImport("mapsjs", "envelope.union")
  @js.native
  def union(env1: envelope, env2: envelope): envelope = js.native
}
