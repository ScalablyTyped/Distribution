package typings.jsts.jsts.geom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Envelope extends js.Object {
  
  /**
    * Computes the coordinate of the centre of this envelope (as long as it is
    * non-null
    *
    * @return {jsts.geom.Coordinate} the centre coordinate of this envelope <code>null</code>
    *         if the envelope is null.
    */
  def centre(): Coordinate = js.native
  
  /**
    * Tests if the <code>Envelope other</code> lies wholely inside this
    * <code>Envelope</code> (inclusive of the boundary).
    * <p>
    * Note that this is <b>not</b> the same definition as the SFS
    * <tt>contains</tt>, which would exclude the envelope boundary.
    *
    * @param {jsts.geom.Envelope}
    *          other the <code>Envelope</code> to check.
    * @return {boolean} true if <code>other</code> is contained in this
    *         <code>Envelope.</code>
    *
    * @see covers(Envelope)
    */
  def contains(other: Envelope): Boolean = js.native
  /**
    * Tests if the given point lies in or on the envelope.
    * <p>
    * Note that this is <b>not</b> the same definition as the SFS
    * <tt>contains</tt>, which would exclude the envelope boundary.
    *
    * @param {jsts.geom.Coordinate}
    *          p the point which this <code>Envelope</code> is being checked for
    *          containing.
    * @return {boolean} <code>true</code> if the point lies in the interior or on
    *         the boundary of this <code>Envelope</code>.
    *
    * @see covers(Coordinate)
    */
  def contains(p: Coordinate): Boolean = js.native
  /**
    * Tests if the given point lies in or on the envelope.
    * <p>
    * Note that this is <b>not</b> the same definition as the SFS
    * <tt>contains</tt>, which would exclude the envelope boundary.
    *
    * @param {number}
    *          x the x-coordinate of the point which this <code>Envelope</code>
    *          is being checked for containing.
    * @param {number}
    *          y the y-coordinate of the point which this <code>Envelope</code>
    *          is being checked for containing.
    * @return {boolean} <code>true</code> if <code>(x, y)</code> lies in the
    *         interior or on the boundary of this <code>Envelope</code>.
    *
    * @see covers(double, double)
    */
  def contains(x: Double, y: Double): Boolean = js.native
  
  /**
    * Tests if the <code>Envelope other</code> lies wholely inside this
    * <code>Envelope</code> (inclusive of the boundary).
    *
    * @param {jsts.geom.Envelope}
    *          other the <code>Envelope</code> to check.
    * @return {boolean} true if this <code>Envelope</code> covers the
    *         <code>other.</code>
    */
  def covers(other: Envelope): Boolean = js.native
  /**
    * Tests if the given point lies in or on the envelope.
    *
    * @param {jsts.geom.Coordinate}
    *          p the point which this <code>Envelope</code> is being checked for
    *          containing.
    * @return {boolean} <code>true</code> if the point lies in the interior or on
    *         the boundary of this <code>Envelope</code>.
    */
  def covers(p: Coordinate): Boolean = js.native
  /**
    * Tests if the given point lies in or on the envelope.
    *
    * @param {number}
    *          x the x-coordinate of the point which this <code>Envelope</code>
    *          is being checked for containing.
    * @param {number}
    *          y the y-coordinate of the point which this <code>Envelope</code>
    *          is being checked for containing.
    * @return {boolean} <code>true</code> if <code>(x, y)</code> lies in the
    *         interior or on the boundary of this <code>Envelope</code>.
    */
  def covers(x: Double, y: Double): Boolean = js.native
  
  /**
    * Computes the distance between this and another <code>Envelope</code>.
    *
    * @param {jsts.geom.Envelope}
    *          env The <code>Envelope</code> to test this <code>Envelope</code>
    *          against.
    * @return {number} The distance between overlapping Envelopes is 0. Otherwise,
    *         the distance is the Euclidean distance between the closest points.
    */
  def distance(env: Envelope): Double = js.native
  
  /**
    * @param {jsts.geom.Envelope}
    *          other the <code>Envelope</code> to check against.
    * @return {boolean} true if envelopes are equal.
    */
  def equals(other: Envelope): Boolean = js.native
  
  /**
    * Expands this envelope by a given distance in all directions. Both positive
    * and negative distances are supported.
    *
    * @param {number}
    *          deltaX the distance to expand the envelope along the the X axis.
    * @param {number}
    *          deltaY the distance to expand the envelope along the the Y axis.
    */
  def expandBy(deltaX: Double, deltaY: Double): Unit = js.native
  /**
    * Expands this envelope by a given distance in all directions. Both positive
    * and negative distances are supported.
    *
    * @param {number} distance the distance to expand the envelope.
    */
  def expandBy(distance: Double): Unit = js.native
  
  /**
    * Enlarges this <code>Envelope</code> so that it contains the
    * <code>other</code> Envelope. Has no effect if <code>other</code> is
    * wholly on or within the envelope.
    *
    * @param {jsts.geom.Envelope} other the <code>Envelope</code> to expand to include.
    */
  def expandToInclude(other: Envelope): Unit = js.native
  /**
    * Enlarges this <code>Envelope</code> so that it contains the given
    * {@link Coordinate}. Has no effect if the point is already on or within the
    * envelope.
    *
    * @param {jsts.geom.Coordinate} p the Coordinate to expand to include.
    */
  def expandToInclude(p: Coordinate): Unit = js.native
  /**
    * Enlarges this <code>Envelope</code> so that it contains the given point.
    * Has no effect if the point is already on or within the envelope.
    *
    * @param {number} x the value to lower the minimum x to or to raise the maximum x to.
    * @param {number} y the value to lower the minimum y to or to raise the maximum y to.
    */
  def expandToInclude(x: Double, y: Double): Unit = js.native
  
  /**
    * Gets the area of this envelope.
    *
    * @return {number} the area of the envelope, 0.0 if the envelope is null.
    */
  def getArea(): Double = js.native
  
  /**
    * Returns the difference between the maximum and minimum y values.
    *
    * @return {number} max y - min y, or 0 if this is a null <code>Envelope.</code>
    */
  def getHeight(): Double = js.native
  
  /**
    * Returns the <code>Envelope</code>s maximum x-value. min x > max x
    * indicates that this is a null <code>Envelope</code>.
    *
    * @return {number} the maximum x-coordinate.
    */
  def getMaxX(): Double = js.native
  
  /**
    * Returns the <code>Envelope</code>s maximum y-value. min y > max y
    * indicates that this is a null <code>Envelope</code>.
    *
    * @return {number} the maximum y-coordinate.
    */
  def getMaxY(): Double = js.native
  
  /**
    * Returns the <code>Envelope</code>s minimum x-value. min x > max x
    * indicates that this is a null <code>Envelope</code>.
    *
    * @return {number} the minimum x-coordinate.
    */
  def getMinX(): Double = js.native
  
  /**
    * Returns the <code>Envelope</code>s minimum y-value. min y > max y
    * indicates that this is a null <code>Envelope</code>.
    *
    * @return {number} the minimum y-coordinate.
    */
  def getMinY(): Double = js.native
  
  /**
    * Returns the difference between the maximum and minimum x values.
    *
    * @return {number} max x - min x, or 0 if this is a null <code>Envelope.</code>
    */
  def getWidth(): Double = js.native
  
  /**
    * Computes the intersection of two {@link Envelopes}
    *
    * @param {jsts.geom.Envelope}
    *          env the envelope to intersect with.
    * @return {jsts.geom.Envelope} a new Envelope representing the intersection of
    *         the envelopes (this will be the null envelope if either argument is
    *         null, or they do not intersect.
    */
  def intersection(env: Envelope): Envelope = js.native
  
  /**
    * Check if the region defined by <code>other</code> overlaps (intersects) the
    * region of this <code>Envelope</code>.
    *
    * @param {jsts.geom.Envelope}
    *          other the <code>Envelope</code> which this <code>Envelope</code>
    *          is being checked for overlapping.
    * @return {boolean} <code>true</code> if the <code>Envelope</code>s
    *         overlap.
    */
  def intersects(other: Envelope): Boolean = js.native
  /**
    * Check if the point <code>p</code> overlaps (lies inside) the region of this
    * <code>Envelope</code>.
    *
    * @param {jsts.geom.Coordinate}
    *          p the <code>Coordinate</code> to be tested.
    * @return {boolean} <code>true</code> if the point overlaps this
    *         <code>Envelope.</code>
    */
  def intersects(p: Coordinate): Boolean = js.native
  /**
    * Check if the point <code>(x, y)</code> overlaps (lies inside) the region of
    * this <code>Envelope</code>.
    *
    * @param {number}
    *          x the x-ordinate of the point.
    * @param {number}
    *          y the y-ordinate of the point.
    * @return {boolean} <code>true</code> if the point overlaps this
    *         <code>Envelope.</code>
    */
  def intersects(x: Double, y: Double): Boolean = js.native
  
  /**
    * Returns <code>true</code> if this <code>Envelope</code> is a "null"
    * envelope.
    *
    * @return {boolean} <code>true</code> if this <code>Envelope</code> is
    *         uninitialized or is the envelope of the empty geometry.
    */
  def isNull(): Boolean = js.native
  
  /**
    * the maximum x-coordinate.
    */
  var maxx: Double = js.native
  
  /**
    * the maximum y-coordinate.
    */
  var maxy: Double = js.native
  
  /**
    * the minimum x-coordinate.
    */
  var minx: Double = js.native
  
  /**
    * the minimum y-coordinate.
    */
  var miny: Double = js.native
  
  /**
    * Makes this <code>Envelope</code> a "null" envelope, that is, the envelope
    * of the empty geometry.
    */
  def setToNull(): Unit = js.native
  
  /**
    * Translates this envelope by given amounts in the X and Y direction.
    *
    * @param {number}
    *          transX the amount to translate along the X axis.
    * @param {number}
    *          transY the amount to translate along the Y axis.
    */
  def translate(transX: Double, transY: Double): Unit = js.native
}
