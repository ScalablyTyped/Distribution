package typings.heremaps.HNs.mathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class defines a rectangle in 2-dimensional geometric space. It is used to represent the area in projected space.
  */
@JSGlobal("H.math.Rect")
@js.native
class Rect protected () extends js.Object {
  /**
    * Constructor
    * @param left {number} - The rectangle's left edge x value
    * @param top {number} - The rectangle's top edge y value
    * @param right {number} - The rectangle's right edge x value
    * @param bottom {number} - The rectangle's bottom edge y value
    */
  def this(left: Double, top: Double, right: Double, bottom: Double) = this()
  /**
    * Method checks if provided coordinates lie within rectangle.
    * @param x {number} - x-coordinate to check
    * @param y {number} - y-coordinate to check
    * @returns {boolean} - returns true if coordinates lie within rectangle, if parameters are isNaN returns false
    */
  def containsXY(x: Double, y: Double): Boolean = js.native
  /**
    * To get the rectangle's bottom-right vertex
    * @returns {H.math.Point}
    */
  def getBottomRight(): Point = js.native
  /**
    * To get the rectangle's top-left vertex
    * @returns {H.math.Point}
    */
  def getTopLeft(): Point = js.native
  /**
    * To set all values of the rectangle's edges
    * @param left {number} - The rectangle's left edge x value
    * @param top {number} - The rectangle's top edge y value
    * @param right {number} - The rectangle's right edge x value
    * @param bottom {number} - The rectangle's bottom edge y value
    */
  def set(left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
}

/* static members */
@JSGlobal("H.math.Rect")
@js.native
object Rect extends js.Object {
  /**
    * To create a rectangle from a top-left and bottom-right point pair.
    * @param topLeft {H.math.IPoint} - the top-left vertex of the rectanle
    * @param bottomRight {H.math.IPoint} - the bottom-right vertex of the rectanle
    * @returns {H.math.Rect} - returns the rectangular area defined by the top-left and bottom-right vertices
    */
  def fromPoints(topLeft: IPoint, bottomRight: IPoint): Rect = js.native
}

