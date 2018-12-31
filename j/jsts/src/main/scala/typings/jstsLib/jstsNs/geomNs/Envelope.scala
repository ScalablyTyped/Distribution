package typings
package jstsLib.jstsNs.geomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsts.geom.Envelope")
@js.native
class Envelope protected () extends js.Object {
  /**
    * Initialize an <code>Envelope</code> from an existing Envelope.
    *
    * @param {jsts.geom.Envelope} env the Envelope to initialize from.
    */
  def this(env: Envelope) = this()
  /**
    * Initialize an <code>Envelope</code> to a region defined by a single
    * Coordinate.
    *
    * @param {jsts.geom.Coordinate} p the Coordinate.
    */
  def this(p: Coordinate) = this()
  /**
    * Initialize an <code>Envelope</code> to a region defined by two Coordinates.
    *
    * @param {jsts.geom.Coordinate} p1 the first Coordinate.
    * @param {jsts.geom.Coordinate} p2 the second Coordinate.
    */
  def this(p1: Coordinate, p2: Coordinate) = this()
  /**
    * Creates an <code>Envelope</code> for a region defined by maximum and
    * minimum values.
    *
    * @param {number} x1 the first x-value.
    * @param {number} x2 the second x-value.
    * @param {number} y1 the first y-value.
    * @param {number} y2 the second y-value.
    */
  def this(x1: scala.Double, x2: scala.Double, y1: scala.Double, y2: scala.Double) = this()
  /**
    * the maximum x-coordinate.
    */
  var maxx: scala.Double = js.native
  /**
    * the maximum y-coordinate.
    */
  var maxy: scala.Double = js.native
  /**
    * the minimum x-coordinate.
    */
  var minx: scala.Double = js.native
  /**
    * the minimum y-coordinate.
    */
  var miny: scala.Double = js.native
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
  def contains(other: Envelope): scala.Boolean = js.native
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
  def contains(p: Coordinate): scala.Boolean = js.native
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
  def contains(x: scala.Double, y: scala.Double): scala.Boolean = js.native
  /**
    * Tests if the <code>Envelope other</code> lies wholely inside this
    * <code>Envelope</code> (inclusive of the boundary).
    *
    * @param {jsts.geom.Envelope}
    *          other the <code>Envelope</code> to check.
    * @return {boolean} true if this <code>Envelope</code> covers the
    *         <code>other.</code>
    */
  def covers(other: Envelope): scala.Boolean = js.native
  /**
    * Tests if the given point lies in or on the envelope.
    *
    * @param {jsts.geom.Coordinate}
    *          p the point which this <code>Envelope</code> is being checked for
    *          containing.
    * @return {boolean} <code>true</code> if the point lies in the interior or on
    *         the boundary of this <code>Envelope</code>.
    */
  def covers(p: Coordinate): scala.Boolean = js.native
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
  def covers(x: scala.Double, y: scala.Double): scala.Boolean = js.native
  /**
    * Computes the distance between this and another <code>Envelope</code>.
    *
    * @param {jsts.geom.Envelope}
    *          env The <code>Envelope</code> to test this <code>Envelope</code>
    *          against.
    * @return {number} The distance between overlapping Envelopes is 0. Otherwise,
    *         the distance is the Euclidean distance between the closest points.
    */
  def distance(env: Envelope): scala.Double = js.native
  /**
    * @param {jsts.geom.Envelope}
    *          other the <code>Envelope</code> to check against.
    * @return {boolean} true if envelopes are equal.
    */
  def equals(other: Envelope): scala.Boolean = js.native
  /**
    * Expands this envelope by a given distance in all directions. Both positive
    * and negative distances are supported.
    *
    * @param {number}
    *          deltaX the distance to expand the envelope along the the X axis.
    * @param {number}
    *          deltaY the distance to expand the envelope along the the Y axis.
    */
  def expandBy(deltaX: scala.Double, deltaY: scala.Double): scala.Unit = js.native
  /**
    * Expands this envelope by a given distance in all directions. Both positive
    * and negative distances are supported.
    *
    * @param {number} distance the distance to expand the envelope.
    */
  def expandBy(distance: scala.Double): scala.Unit = js.native
  /**
    * Enlarges this <code>Envelope</code> so that it contains the
    * <code>other</code> Envelope. Has no effect if <code>other</code> is
    * wholly on or within the envelope.
    *
    * @param {jsts.geom.Envelope} other the <code>Envelope</code> to expand to include.
    */
  def expandToInclude(other: Envelope): scala.Unit = js.native
  /**
    * Enlarges this <code>Envelope</code> so that it contains the given
    * {@link Coordinate}. Has no effect if the point is already on or within the
    * envelope.
    *
    * @param {jsts.geom.Coordinate} p the Coordinate to expand to include.
    */
  def expandToInclude(p: Coordinate): scala.Unit = js.native
  /**
    * Enlarges this <code>Envelope</code> so that it contains the given point.
    * Has no effect if the point is already on or within the envelope.
    *
    * @param {number} x the value to lower the minimum x to or to raise the maximum x to.
    * @param {number} y the value to lower the minimum y to or to raise the maximum y to.
    */
  def expandToInclude(x: scala.Double, y: scala.Double): scala.Unit = js.native
  /**
    * Gets the area of this envelope.
    *
    * @return {number} the area of the envelope, 0.0 if the envelope is null.
    */
  def getArea(): scala.Double = js.native
  /**
    * Returns the difference between the maximum and minimum y values.
    *
    * @return {number} max y - min y, or 0 if this is a null <code>Envelope.</code>
    */
  def getHeight(): scala.Double = js.native
  /**
    * Returns the <code>Envelope</code>s maximum x-value. min x > max x
    * indicates that this is a null <code>Envelope</code>.
    *
    * @return {number} the maximum x-coordinate.
    */
  def getMaxX(): scala.Double = js.native
  /**
    * Returns the <code>Envelope</code>s maximum y-value. min y > max y
    * indicates that this is a null <code>Envelope</code>.
    *
    * @return {number} the maximum y-coordinate.
    */
  def getMaxY(): scala.Double = js.native
  /**
    * Returns the <code>Envelope</code>s minimum x-value. min x > max x
    * indicates that this is a null <code>Envelope</code>.
    *
    * @return {number} the minimum x-coordinate.
    */
  def getMinX(): scala.Double = js.native
  /**
    * Returns the <code>Envelope</code>s minimum y-value. min y > max y
    * indicates that this is a null <code>Envelope</code>.
    *
    * @return {number} the minimum y-coordinate.
    */
  def getMinY(): scala.Double = js.native
  /**
    * Returns the difference between the maximum and minimum x values.
    *
    * @return {number} max x - min x, or 0 if this is a null <code>Envelope.</code>
    */
  def getWidth(): scala.Double = js.native
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
  def intersects(other: Envelope): scala.Boolean = js.native
  /**
    * Check if the point <code>p</code> overlaps (lies inside) the region of this
    * <code>Envelope</code>.
    *
    * @param {jsts.geom.Coordinate}
    *          p the <code>Coordinate</code> to be tested.
    * @return {boolean} <code>true</code> if the point overlaps this
    *         <code>Envelope.</code>
    */
  def intersects(p: Coordinate): scala.Boolean = js.native
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
  def intersects(x: scala.Double, y: scala.Double): scala.Boolean = js.native
  /**
    * Returns <code>true</code> if this <code>Envelope</code> is a "null"
    * envelope.
    *
    * @return {boolean} <code>true</code> if this <code>Envelope</code> is
    *         uninitialized or is the envelope of the empty geometry.
    */
  def isNull(): scala.Boolean = js.native
  /**
    * Makes this <code>Envelope</code> a "null" envelope, that is, the envelope
    * of the empty geometry.
    */
  def setToNull(): scala.Unit = js.native
  /**
    * Translates this envelope by given amounts in the X and Y direction.
    *
    * @param {number}
    *          transX the amount to translate along the X axis.
    * @param {number}
    *          transY the amount to translate along the Y axis.
    */
  def translate(transX: scala.Double, transY: scala.Double): scala.Unit = js.native
}

@JSGlobal("jsts.geom.Envelope")
@js.native
object Envelope extends js.Object {
  /**
    * Test the point q to see whether it intersects the Envelope defined by p1-p2
    *
    * NOTE: calls intersectsEnvelope if four arguments are given to simulate
    * overloaded function
    *
    * @param {jsts.geom.Coordinate}
    *          p1 one extremal point of the envelope.
    * @param {jsts.geom.Coordinate}
    *          p2 another extremal point of the envelope.
    * @param {jsts.geom.Coordinate}
    *          q the point to test for intersection.
    * @return {boolean} <code>true</code> if q intersects the envelope p1-p2.
    */
  def intersects(
    p1: jstsLib.jstsNs.geomNs.Coordinate,
    p2: jstsLib.jstsNs.geomNs.Coordinate,
    q: jstsLib.jstsNs.geomNs.Coordinate
  ): scala.Boolean = js.native
  /**
    * Test the envelope defined by p1-p2 for intersection with the envelope defined
    * by q1-q2
    *
    * @param {jsts.geom.Coordinate}
    *          p1 one extremal point of the envelope P.
    * @param {jsts.geom.Coordinate}
    *          p2 another extremal point of the envelope P.
    * @param {jsts.geom.Coordinate}
    *          q1 one extremal point of the envelope Q.
    * @param {jsts.geom.Coordinate}
    *          q2 another extremal point of the envelope Q.
    * @return {boolean} <code>true</code> if Q intersects P.
    */
  def intersectsEnvelope(
    p1: jstsLib.jstsNs.geomNs.Coordinate,
    p2: jstsLib.jstsNs.geomNs.Coordinate,
    q1: jstsLib.jstsNs.geomNs.Coordinate,
    q2: jstsLib.jstsNs.geomNs.Coordinate
  ): scala.Boolean = js.native
}

