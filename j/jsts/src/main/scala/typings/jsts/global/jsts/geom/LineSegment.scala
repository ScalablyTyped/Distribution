package typings.jsts.global.jsts.geom

import typings.jsts.jstsNumbers.`-1`
import typings.jsts.jstsNumbers.`0`
import typings.jsts.jstsNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsts.geom.LineSegment")
@js.native
class LineSegment protected ()
  extends typings.jsts.jsts.geom.LineSegment {
  def this(p0: typings.jsts.jsts.geom.Coordinate, p1: typings.jsts.jsts.geom.Coordinate) = this()
  /* CompleteClass */
  override var p0: typings.jsts.jsts.geom.Coordinate = js.native
  /* CompleteClass */
  override var p1: typings.jsts.jsts.geom.Coordinate = js.native
  /**
    * Computes the angle that the vector defined by this segment
    * makes with the X-axis.
    * The angle will be in the range [ -PI, PI ] radians.
    *
    * @return {number} the angle this segment makes with the X-axis (in radians)
    */
  /* CompleteClass */
  override def angle(): Double = js.native
  /**
    * Computes the closest point on this line segment to another point.
    *
    * @param {Coordinate}
    *          p the point to find the closest point to.
    * @return {Coordinate} a Coordinate which is the closest point on the line
    *         segment to the point p.
    */
  /* CompleteClass */
  override def closestPoint(p: typings.jsts.jsts.geom.Coordinate): typings.jsts.jsts.geom.Coordinate = js.native
  /**
    * Computes the closest points on two line segments.
    *
    * @param {LineSegment}
    *          line the segment to find the closest point to.
    * @return {[]} a pair of Coordinates which are the closest points on the line
    *         segments.
    */
  /* CompleteClass */
  override def closestPoints(line: typings.jsts.jsts.geom.LineSegment): js.Tuple2[typings.jsts.jsts.geom.Coordinate, typings.jsts.jsts.geom.Coordinate] = js.native
  /**
    *  Compares this object with the specified object for order.
    *  Uses the standard lexicographic ordering for the points in the LineSegment.
    *
    *@param {Object} o  the <code>LineSegment</code> with which this <code>LineSegment</code>
    *      is being compared
    *@return {number} a negative integer, zero, or a positive integer as this <code>LineSegment</code>
    *      is less than, equal to, or greater than the specified <code>LineSegment</code>
    */
  /* CompleteClass */
  override def compareTo(o: typings.jsts.jsts.geom.LineSegment): Double = js.native
  /**
    * Computes the distance between this line segment and another segment.
    *
    * @param {jsts.geom.LineSegment} ls
    * @return {number} the distance to the other segment
    */
  /* CompleteClass */
  override def distance1(ls: typings.jsts.jsts.geom.LineSegment): Double = js.native
  /**
    * Computes the distance between this line segment and a given point.
    *
    * @param {jsts.geom.Coordinate}
    *          p the coordinate.
    * @return {number}
    *          the distance from this segment to the given point.
    */
  /* CompleteClass */
  override def distance2(p: typings.jsts.jsts.geom.Coordinate): Double = js.native
  /**
    * Computes the perpendicular distance between the (infinite) line defined
    * by this line segment and a point.
    *
    * @param {jsts.geom.Coordinate} p the coordinate
    * @return {number} the perpendicular distance between the defined line and the given point
    */
  /* CompleteClass */
  override def distancePerpendicular(p: typings.jsts.jsts.geom.Coordinate): Double = js.native
  /**
    *  Returns <code>true</code> if <code>other</code> has the same values for
    *  its points.
    *
    * @param {Object} o a <code>LineSegment</code> with which to do the comparison.
    * @return {boolean} <code>true</code> if <code>other</code> is a <code>LineSegment</code>
    *      with the same values for the x and y ordinates.
    */
  /* CompleteClass */
  override def equals(o: typings.jsts.jsts.geom.LineSegment): Boolean = js.native
  /**
    *  Returns <code>true</code> if <code>other</code> is
    *  topologically equal to this LineSegment (e.g. irrespective
    *  of orientation).
    *
    * @param {jsts.geom.LineSegment} other  a <code>LineSegment</code> with which to do the comparison.
    * @return {boolean} <code>true</code> if <code>other</code> is a <code>LineSegment</code>
    *      with the same values for the x and y ordinates.
    */
  /* CompleteClass */
  override def equalsTopo(other: typings.jsts.jsts.geom.LineSegment): Boolean = js.native
  /**
    * @param {number} i
    * @return {jsts.geom.Coordinate}
    */
  /* CompleteClass */
  override def getCoordinate(): Double = js.native
  /**
    * Computes the length of the line segment.
    *
    * @return {number} the length of the line segment.
    */
  /* CompleteClass */
  override def getLength(): Double = js.native
  /**
    * Computes an intersection point between two line segments, if there is one.
    * There may be 0, 1 or many intersection points between two segments. If there
    * are 0, null is returned. If there is 1 or more, exactly one of them is
    * returned (chosen at the discretion of the algorithm). If more information is
    * required about the details of the intersection, the
    * {@link RobustLineIntersector} class should be used.
    *
    * @param {LineSegment}
    *          line a line segment.
    * @return {Coordinate} an intersection point, or <code>null</code> if there
    *         is none.
    *
    * @see RobustLineIntersector
    */
  /* CompleteClass */
  override def intersection(line: typings.jsts.jsts.geom.LineSegment): typings.jsts.jsts.geom.Coordinate | Null = js.native
  /**
    * Tests whether the segment is horizontal.
    *
    * @return {boolean} <code>true</code> if the segment is horizontal.
    */
  /* CompleteClass */
  override def isHorizontal(): Boolean = js.native
  /**
    * Tests whether the segment is vertical.
    *
    * @return {boolean} <code>true</code> if the segment is vertical.
    */
  /* CompleteClass */
  override def isVertical(): Boolean = js.native
  /**
    * Computes the intersection point of the lines of infinite extent defined
    * by two line segments (if there is one).
    * There may be 0, 1 or an infinite number of intersection points
    * between two lines.
    * If there is a unique intersection point, it is returned.
    * Otherwise, <tt>null</tt> is returned.
    * If more information is required about the details of the intersection,
    * the {@link RobustLineIntersector} class should be used.
    *
    * @param {jsts.geom.LineSegment} line a line segment defining an straight line with infinite extent
    * @return {jsts.geom.Coordinate} an intersection point,
    * or <code>null</code> if there is no point of intersection
    * or an infinite number of intersection points
    *
    * @see RobustLineIntersector
    */
  /* CompleteClass */
  override def lineIntersection(line: typings.jsts.jsts.geom.LineSegment): typings.jsts.jsts.geom.Coordinate | Null = js.native
  /**
    * Computes the midpoint of the segment
    *
    * @return {jsts.geom.Coordinate} the midpoint of the segment
    */
  /* CompleteClass */
  override def midPoint(): typings.jsts.jsts.geom.Coordinate = js.native
  /**
    * Puts the line segment into a normalized form.
    * This is useful for using line segments in maps and indexes when
    * topological equality rather than exact equality is desired.
    * A segment in normalized form has the first point smaller
    * than the second (according to the standard ordering on {@link Coordinate}).
    */
  /* CompleteClass */
  override def normalize(): Unit = js.native
  /**
    * Determines the orientation of a LineSegment relative to this segment.
    * The concept of orientation is specified as follows:
    * Given two line segments A and L,
    * <ul>
    * <li>A is to the left of a segment L if A lies wholly in the
    * closed half-plane lying to the left of L
    * <li>A is to the right of a segment L if A lies wholly in the
    * closed half-plane lying to the right of L
    * <li>otherwise, A has indeterminate orientation relative to L. This
    * happens if A is collinear with L or if A crosses the line determined by L.
    * </ul>
    *
    * @param {jsts.geom.LineSegment} seg the LineSegment to compare
    *
    * @return 1 if <code>seg</code> is to the left of this segment<br />
    * -1 if <code>seg</code> is to the right of this segment<br />
    * 0 if <code>seg</code> has indeterminate orientation relative to this segment
    */
  /* CompleteClass */
  override def orientationIndex1(seg: typings.jsts.jsts.geom.LineSegment): `1` | `-1` | `0` = js.native
  /**
    * Determines the orientation index of a {@link Coordinate} relative to this segment.
    * The orientation index is as defined in {@link CGAlgorithms#computeOrientation}.
    *
    * @param {jsts.geom.Coordinate} p the coordinate to compare
    *
    * @return 1 (LEFT) if <code>p</code> is to the left of this segment
    * @return -1 (RIGHT) if <code>p</code> is to the right of this segment
    * @return 0 (COLLINEAR) if <code>p</code> is collinear with this segment
    *
    * @see CGAlgorithms#computeOrientation(Coordinate, Coordinate, Coordinate)
    */
  /* CompleteClass */
  override def orientationIndex2(p: typings.jsts.jsts.geom.Coordinate): `1` | `-1` | `0` = js.native
  /**
    * Computes the {@link Coordinate} that lies a given
    * fraction along the line defined by this segment.
    * A fraction of <code>0.0</code> returns the start point of the segment;
    * a fraction of <code>1.0</code> returns the end point of the segment.
    * If the fraction is < 0.0 or > 1.0 the point returned
    * will lie before the start or beyond the end of the segment.
    *
    * @param {number} segmentLengthFraction the fraction of the segment length along the line
    * @return {jsts.geom.Coordinate} the point at that distance
    */
  /* CompleteClass */
  override def pointAlong(segmentLengthFraction: Double): typings.jsts.jsts.geom.Coordinate = js.native
  /**
    * Computes the {@link Coordinate} that lies a given
    * fraction along the line defined by this segment and offset from
    * the segment by a given distance.
    * A fraction of <code>0.0</code> offsets from the start point of the segment;
    * a fraction of <code>1.0</code> offsets from the end point of the segment.
    * The computed point is offset to the left of the line if the offset distance is
    * positive, to the right if negative.
    *
    * @param {number} segmentLengthFraction the fraction of the segment length along the line
    * @param {number} offsetDistance the distance the point is offset from the segment
    *    (positive is to the left, negative is to the right)
    * @return {jsts.geom.Coordinate} the point at that distance and offset
    */
  /* CompleteClass */
  override def pointAlongOffset(segmentLengthFraction: Double, offsetDistance: Double): typings.jsts.jsts.geom.Coordinate = js.native
  /**
    * Compute the projection of a point onto the line determined
    * by this line segment.
    * <p>
    * Note that the projected point
    * may lie outside the line segment.  If this is the case,
    * the projection factor will lie outside the range [0.0, 1.0].
    * @param {jsts.geom.Coordinate} p
    * @return {jsts.geom.Coordinate}
    */
  /* CompleteClass */
  override def project1(p: typings.jsts.jsts.geom.Coordinate): typings.jsts.jsts.geom.Coordinate = js.native
  /**
    * Project a line segment onto this line segment and return the resulting
    * line segment.  The returned line segment will be a subset of
    * the target line line segment.  This subset may be null, if
    * the segments are oriented in such a way that there is no projection.
    * <p>
    * Note that the returned line may have zero length (i.e. the same endpoints).
    * This can happen for instance if the lines are perpendicular to one another.
    *
    * @param {jsts.geom.LineSegment} seg the line segment to project
    * @return {jsts.geom.LineSegment} the projected line segment, or <code>null</code> if there is no overlap
    */
  /* CompleteClass */
  override def project2(seg: typings.jsts.jsts.geom.LineSegment): typings.jsts.jsts.geom.LineSegment = js.native
  /**
    * Computes the Projection Factor for the projection of the point p onto this
    * LineSegment. The Projection Factor is the constant r by which the vector for
    * this segment must be multiplied to equal the vector for the projection of
    * <tt>p<//t> on the line
    * defined by this segment.
    * <p>
    * The projection factor returned will be in the range <tt>(-inf, +inf)</tt>.
    *
    * @param {Coordinate} p the point to compute the factor for.
    * @return {double} the projection factor for the point.
    */
  /* CompleteClass */
  override def projectionFactor(p: typings.jsts.jsts.geom.Coordinate): Double = js.native
  /**
    * Reverses the direction of the line segment.
    */
  /* CompleteClass */
  override def reverse(): Unit = js.native
  /**
    * Computes the fraction of distance (in <tt>[0.0, 1.0]</tt>)
    * that the projection of a point occurs along this line segment.
    * If the point is beyond either ends of the line segment,
    * the closest fractional value (<tt>0.0</tt> or <tt>1.0</tt>) is returned.
    * <p>
    * Essentially, this is the {@link #projectionFactor} clamped to
    * the range <tt>[0.0, 1.0]</tt>.
    * If the segment has zero length, 1.0 is returned.
    *
    * @param {jsts.geom.Coordinate} inputPt the point
    * @return {number} the fraction along the line segment the projection of the point occurs
    */
  /* CompleteClass */
  override def segmentFraction(inputPt: typings.jsts.jsts.geom.Coordinate): Double = js.native
  /* CompleteClass */
  override def setCoordinates(ls: typings.jsts.jsts.geom.LineSegment): Unit = js.native
  /* CompleteClass */
  override def setCoordinates2(p0: typings.jsts.jsts.geom.Coordinate, p1: typings.jsts.jsts.geom.Coordinate): Unit = js.native
  /**
    * Creates a LineString with the same coordinates as this segment
    *
    * @param {jsts.geom.GeometryFactory} geomFactory the geometery factory to use
    * @return {jsts.geom.LineString} a LineString with the same geometry as this segment
    */
  /* CompleteClass */
  override def toGeometry(geomFactory: typings.jsts.jsts.geom.GeometryFactory): typings.jsts.jsts.geom.LineString = js.native
}

/* static members */
@JSGlobal("jsts.geom.LineSegment")
@js.native
object LineSegment extends js.Object {
  /**
    * Computes the midpoint of a segment
    *
    * @param {jsts.geom.Coordinate} p0
    * @param {jsts.geom.Coordinate} p1
    * @return {jsts.geom.Coordinate} the midpoint of the segment
    */
  def midPoint(p0: typings.jsts.jsts.geom.Coordinate, p1: typings.jsts.jsts.geom.Coordinate): typings.jsts.jsts.geom.Coordinate = js.native
}

