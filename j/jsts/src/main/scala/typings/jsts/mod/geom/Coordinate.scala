package typings.jsts.mod.geom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsts", "geom.Coordinate")
@js.native
class Coordinate protected ()
  extends typings.jsts.jsts.geom.Coordinate {
  /**
    * @constructor
    */
  def this(c: typings.jsts.jsts.geom.Coordinate) = this()
  /**
    * @constructor
    */
  def this(x: Double, y: Double) = this()
  /**
    * Gets or sets the x value.
    */
  /* CompleteClass */
  override var x: Double = js.native
  /**
    * Gets or sets the y value.
    */
  /* CompleteClass */
  override var y: Double = js.native
  /**
    * Gets or sets the z value.
    */
  /* CompleteClass */
  override var z: Double = js.native
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
  /* CompleteClass */
  override def compareTo(other: typings.jsts.jsts.geom.Coordinate): Double = js.native
  /**
    * Computes the 2-dimensional Euclidean distance to another location. The
    * Z-ordinate is ignored.
    *
    * @param {Coordinate}
    *          p a point.
    * @return {number} the 2-dimensional Euclidean distance between the
    *         locations.
    */
  /* CompleteClass */
  override def distance(p: typings.jsts.jsts.geom.Coordinate): Double = js.native
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
  /* CompleteClass */
  override def equals(other: typings.jsts.jsts.geom.Coordinate): Boolean = js.native
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
  /* CompleteClass */
  override def equals2D(other: typings.jsts.jsts.geom.Coordinate): Boolean = js.native
  /**
    * Sets this <code>Coordinate</code>s (x,y,z) values to that of
    * <code>other</code>.
    *
    * @param {Coordinate}
    *          other the <code>Coordinate</code> to copy.
    */
  /* CompleteClass */
  override def setCoordinate(other: typings.jsts.jsts.geom.Coordinate): Unit = js.native
}

