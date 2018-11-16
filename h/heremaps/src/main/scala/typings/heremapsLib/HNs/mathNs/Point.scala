package typings
package heremapsLib.HNs.mathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Class represents a 2-dimensional point, defined by x and y coordinates.
         * @property x {number} - The point's coordinate on X-axis.
         * @property y {number} - The point's coordinate on Y-axis.
         */
@JSGlobal("H.math.Point")
@js.native
class Point protected () extends IPoint {
  /**
               * Constructor
               * @param x {number} - The point's coordinate on X-axis.
               * @param y {number} - The point's coordinate on Y-axis.
               */
  def this(x: scala.Double, y: scala.Double) = this()
  /* CompleteClass */
  override var x: scala.Double = js.native
  /* CompleteClass */
  override var y: scala.Double = js.native
  /**
               * This method adds given point coordinates to the current one.
               * @param other {H.math.IPoint} - The point to add
               * @returns {H.math.Point} - the point itself after adding
               */
  def add(other: IPoint): Point = js.native
  /**
               * Rounds the x and y coordinates to the next greater integer values.
               * @returns {H.math.Point} - the point itself after ceiling
               */
  def ceil(): Point = js.native
  /**
               * This method creates a copy of the current point.
               * @param opt_out {H.math.Point=} - An optional point to store the copied values
               * @returns {H.math.Point} - The clone of the point
               */
  def clone(opt_out: Point): Point = js.native
  /**
               * This method calculates the distance to a point supplied by the caller.
               * @param other {H.math.IPoint}
               * @returns {number}
               */
  def distance(other: IPoint): scala.Double = js.native
  /**
               * This method compares current point coordinates with the supplied point coordinates.
               * @param other {H.math.IPoint} - The point to compare to.
               * @returns {boolean} - True if the points are equal
               */
  def equals(other: IPoint): scala.Boolean = js.native
  /**
               * Rounds the x and y coordinates to the next smaller integer values.
               * @returns {H.math.Point} - the point itself after flooring
               */
  def floor(): Point = js.native
  /**
               * Calculates the closest point on a given line
               * @param start {H.math.IPoint} - The start point of the line
               * @param end {H.math.IPoint} - The end point of the line
               * @returns {H.math.IPoint} - the closest point
               */
  def getNearest(start: IPoint, end: IPoint): IPoint = js.native
  /**
               * This method rounds the x and y coordinates of the point.
               * @returns {H.math.Point} - the point itself after rounding
               */
  def round(): Point = js.native
  /**
               * This method scales the current point coordinates by the given factor(s).
               * @param factor {number} - multiplication factor
               * @param opt_factorY {number=} - If omitted, the factor argument is used
               * @returns {H.math.Point} - the point itself after scaling
               */
  def scale(factor: scala.Double): Point = js.native
  /**
               * This method scales the current point coordinates by the given factor(s).
               * @param factor {number} - multiplication factor
               * @param opt_factorY {number=} - If omitted, the factor argument is used
               * @returns {H.math.Point} - the point itself after scaling
               */
  def scale(factor: scala.Double, opt_factorY: scala.Double): Point = js.native
  /**
               * Sets the x and y coordinate of this point
               * @param x {number} - The point's coordinate on X-axis.
               * @param y {number} - The point's coordinate on Y-axis.
               */
  def set(x: scala.Double, y: scala.Double): scala.Unit = js.native
  /**
               * This method subtracts given point coordinates from the current point.
               * @param other {H.math.IPoint} - The point to subtract
               * @returns {H.math.Point} - the point itself after subtracting
               */
  def sub(other: IPoint): Point = js.native
}

/**
         * Class represents a 2-dimensional point, defined by x and y coordinates.
         * @property x {number} - The point's coordinate on X-axis.
         * @property y {number} - The point's coordinate on Y-axis.
         */
@JSGlobal("H.math.Point")
@js.native
object Point extends js.Object {
  /**
               * This method creates a Point instance from a given IPoint object.
               * @param iPoint {H.math.IPoint} - The IPoint object to use
               * @returns {H.math.Point} - the created Point instance
               */
  def fromIPoint(iPoint: heremapsLib.HNs.mathNs.IPoint): heremapsLib.HNs.mathNs.Point = js.native
}

