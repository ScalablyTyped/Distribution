package typings.jsts.jsts.geom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Coordinate extends js.Object {
  /**
    * Gets or sets the x value.
    */
  var x: Double
  /**
    * Gets or sets the y value.
    */
  var y: Double
  /**
    * Gets or sets the z value.
    */
  var z: Double
  /**
    * Compares this {@link Coordinate} with the specified {@link Coordinate} for
    * order. This method ignores the z value when making the comparison. Returns:
    * <UL>
    * <LI> -1 : this.x < other.x || ((this.x == other.x) && (this.y < other.y))
    * <LI> 0 : this.x == other.x && this.y = other.y
    * <LI> 1 : this.x > other.x || ((this.x == other.x) && (this.y > other.y))
    *
    * </UL>
    * Note: This method assumes that ordinate values are valid numbers. NaN
    * values are not handled correctly.
    *
    * @param {Coordinate}
    *          other the <code>Coordinate</code> with which this
    *          <code>Coordinate</code> is being compared.
    * @return {number} -1, zero, or 1 as explained above.
    */
  def compareTo(other: Coordinate): Double
  /**
    * Computes the 2-dimensional Euclidean distance to another location. The
    * Z-ordinate is ignored.
    *
    * @param {Coordinate}
    *          p a point.
    * @return {number} the 2-dimensional Euclidean distance between the
    *         locations.
    */
  def distance(p: Coordinate): Double
  /**
    * Returns <code>true</code> if <code>other</code> has the same values for
    * the x and y ordinates. Since Coordinates are 2.5D, this routine ignores the
    * z value when making the comparison.
    *
    * @param {Coordinate}
    *          other a <code>Coordinate</code> with which to do the comparison.
    * @return {boolean} <code>true</code> if <code>other</code> is a
    *         <code>Coordinate</code> with the same values for the x and y
    *         ordinates.
    */
  def equals(other: Coordinate): Boolean
  /**
    * Returns whether the planar projections of the two <code>Coordinate</code>s
    * are equal.
    *
    * @param {Coordinate}
    *          other a <code>Coordinate</code> with which to do the 2D
    *          comparison.
    * @return {boolean} <code>true</code> if the x- and y-coordinates are
    *         equal; the z-coordinates do not have to be equal.
    */
  def equals2D(other: Coordinate): Boolean
  /**
    * Sets this <code>Coordinate</code>s (x,y,z) values to that of
    * <code>other</code>.
    *
    * @param {Coordinate}
    *          other the <code>Coordinate</code> to copy.
    */
  def setCoordinate(other: Coordinate): Unit
}

object Coordinate {
  @scala.inline
  def apply(
    compareTo: Coordinate => Double,
    distance: Coordinate => Double,
    equals: Coordinate => Boolean,
    equals2D: Coordinate => Boolean,
    setCoordinate: Coordinate => Unit,
    x: Double,
    y: Double,
    z: Double
  ): Coordinate = {
    val __obj = js.Dynamic.literal(compareTo = js.Any.fromFunction1(compareTo), distance = js.Any.fromFunction1(distance), equals = js.Any.fromFunction1(equals), equals2D = js.Any.fromFunction1(equals2D), setCoordinate = js.Any.fromFunction1(setCoordinate), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coordinate]
  }
}

