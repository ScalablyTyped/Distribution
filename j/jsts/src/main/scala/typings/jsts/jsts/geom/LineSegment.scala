package typings.jsts.jsts.geom

import typings.jsts.jstsNumbers.`-1`
import typings.jsts.jstsNumbers.`0`
import typings.jsts.jstsNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineSegment extends js.Object {
  
  /**
    * Computes the angle that the vector defined by this segment
    * makes with the X-axis.
    * The angle will be in the range [ -PI, PI ] radians.
    *
    * @return {number} the angle this segment makes with the X-axis (in radians)
    */
  def angle(): Double = js.native
  
  /**
    * Computes the closest point on this line segment to another point.
    *
    * @param {Coordinate}
    *          p the point to find the closest point to.
    * @return {Coordinate} a Coordinate which is the closest point on the line
    *         segment to the point p.
    */
  def closestPoint(p: Coordinate): Coordinate = js.native
  
  /**
    * Computes the closest points on two line segments.
    *
    * @param {LineSegment}
    *          line the segment to find the closest point to.
    * @return {[]} a pair of Coordinates which are the closest points on the line
    *         segments.
    */
  def closestPoints(line: LineSegment): js.Tuple2[Coordinate, Coordinate] = js.native
  
  /**
    *  Compares this object with the specified object for order.
    *  Uses the standard lexicographic ordering for the points in the LineSegment.
    *
    *@param {Object} o  the <code>LineSegment</code> with which this <code>LineSegment</code>
    *      is being compared
    *@return {number} a negative integer, zero, or a positive integer as this <code>LineSegment</code>
    *      is less than, equal to, or greater than the specified <code>LineSegment</code>
    */
  def compareTo(o: LineSegment): Double = js.native
  
  /**
    * Computes the distance between this line segment and another segment.
    *
    * @param {jsts.geom.LineSegment} ls
    * @return {number} the distance to the other segment
    */
  def distance1(ls: LineSegment): Double = js.native
  
  /**
    * Computes the distance between this line segment and a given point.
    *
    * @param {jsts.geom.Coordinate}
    *          p the coordinate.
    * @return {number}
    *          the distance from this segment to the given point.
    */
  def distance2(p: Coordinate): Double = js.native
  
  /**
    * Computes the perpendicular distance between the (infinite) line defined
    * by this line segment and a point.
    *
    * @param {jsts.geom.Coordinate} p the coordinate
    * @return {number} the perpendicular distance between the defined line and the given point
    */
  def distancePerpendicular(p: Coordinate): Double = js.native
  
  /**
    *  Returns <code>true</code> if <code>other</code> has the same values for
    *  its points.
    *
    * @param {Object} o a <code>LineSegment</code> with which to do the comparison.
    * @return {boolean} <code>true</code> if <code>other</code> is a <code>LineSegment</code>
    *      with the same values for the x and y ordinates.
    */
  def equals(o: LineSegment): Boolean = js.native
  
  /**
    *  Returns <code>true</code> if <code>other</code> is
    *  topologically equal to this LineSegment (e.g. irrespective
    *  of orientation).
    *
    * @param {jsts.geom.LineSegment} other  a <code>LineSegment</code> with which to do the comparison.
    * @return {boolean} <code>true</code> if <code>other</code> is a <code>LineSegment</code>
    *      with the same values for the x and y ordinates.
    */
  def equalsTopo(other: LineSegment): Boolean = js.native
  
  /**
    * @param {number} i
    * @return {jsts.geom.Coordinate}
    */
  def getCoordinate(): Double = js.native
  
  /**
    * Computes the length of the line segment.
    *
    * @return {number} the length of the line segment.
    */
  def getLength(): Double = js.native
  
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
  def intersection(line: LineSegment): Coordinate | Null = js.native
  
  /**
    * Tests whether the segment is horizontal.
    *
    * @return {boolean} <code>true</code> if the segment is horizontal.
    */
  def isHorizontal(): Boolean = js.native
  
  /**
    * Tests whether the segment is vertical.
    *
    * @return {boolean} <code>true</code> if the segment is vertical.
    */
  def isVertical(): Boolean = js.native
  
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
  def lineIntersection(line: LineSegment): Coordinate | Null = js.native
  
  /**
    * Computes the midpoint of the segment
    *
    * @return {jsts.geom.Coordinate} the midpoint of the segment
    */
  def midPoint(): Coordinate = js.native
  
  /**
    * Puts the line segment into a normalized form.
    * This is useful for using line segments in maps and indexes when
    * topological equality rather than exact equality is desired.
    * A segment in normalized form has the first point smaller
    * than the second (according to the standard ordering on {@link Coordinate}).
    */
  def normalize(): Unit = js.native
  
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
  def orientationIndex1(seg: LineSegment): `1` | `-1` | `0` = js.native
  
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
  def orientationIndex2(p: Coordinate): `1` | `-1` | `0` = js.native
  
  var p0: Coordinate = js.native
  
  var p1: Coordinate = js.native
  
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
  def pointAlong(segmentLengthFraction: Double): Coordinate = js.native
  
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
  def pointAlongOffset(segmentLengthFraction: Double, offsetDistance: Double): Coordinate = js.native
  
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
  def project1(p: Coordinate): Coordinate = js.native
  
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
  def project2(seg: LineSegment): LineSegment = js.native
  
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
  def projectionFactor(p: Coordinate): Double = js.native
  
  /**
    * Reverses the direction of the line segment.
    */
  def reverse(): Unit = js.native
  
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
  def segmentFraction(inputPt: Coordinate): Double = js.native
  
  def setCoordinates(ls: LineSegment): Unit = js.native
  
  def setCoordinates2(p0: Coordinate, p1: Coordinate): Unit = js.native
  
  /**
    * Creates a LineString with the same coordinates as this segment
    *
    * @param {jsts.geom.GeometryFactory} geomFactory the geometery factory to use
    * @return {jsts.geom.LineString} a LineString with the same geometry as this segment
    */
  def toGeometry(geomFactory: GeometryFactory): LineString = js.native
}
object LineSegment {
  
  @scala.inline
  def apply(
    angle: () => Double,
    closestPoint: Coordinate => Coordinate,
    closestPoints: LineSegment => js.Tuple2[Coordinate, Coordinate],
    compareTo: LineSegment => Double,
    distance1: LineSegment => Double,
    distance2: Coordinate => Double,
    distancePerpendicular: Coordinate => Double,
    equals: LineSegment => Boolean,
    equalsTopo: LineSegment => Boolean,
    getCoordinate: () => Double,
    getLength: () => Double,
    intersection: LineSegment => Coordinate | Null,
    isHorizontal: () => Boolean,
    isVertical: () => Boolean,
    lineIntersection: LineSegment => Coordinate | Null,
    midPoint: () => Coordinate,
    normalize: () => Unit,
    orientationIndex1: LineSegment => `1` | `-1` | `0`,
    orientationIndex2: Coordinate => `1` | `-1` | `0`,
    p0: Coordinate,
    p1: Coordinate,
    pointAlong: Double => Coordinate,
    pointAlongOffset: (Double, Double) => Coordinate,
    project1: Coordinate => Coordinate,
    project2: LineSegment => LineSegment,
    projectionFactor: Coordinate => Double,
    reverse: () => Unit,
    segmentFraction: Coordinate => Double,
    setCoordinates: LineSegment => Unit,
    setCoordinates2: (Coordinate, Coordinate) => Unit,
    toGeometry: GeometryFactory => LineString
  ): LineSegment = {
    val __obj = js.Dynamic.literal(angle = js.Any.fromFunction0(angle), closestPoint = js.Any.fromFunction1(closestPoint), closestPoints = js.Any.fromFunction1(closestPoints), compareTo = js.Any.fromFunction1(compareTo), distance1 = js.Any.fromFunction1(distance1), distance2 = js.Any.fromFunction1(distance2), distancePerpendicular = js.Any.fromFunction1(distancePerpendicular), equals = js.Any.fromFunction1(equals), equalsTopo = js.Any.fromFunction1(equalsTopo), getCoordinate = js.Any.fromFunction0(getCoordinate), getLength = js.Any.fromFunction0(getLength), intersection = js.Any.fromFunction1(intersection), isHorizontal = js.Any.fromFunction0(isHorizontal), isVertical = js.Any.fromFunction0(isVertical), lineIntersection = js.Any.fromFunction1(lineIntersection), midPoint = js.Any.fromFunction0(midPoint), normalize = js.Any.fromFunction0(normalize), orientationIndex1 = js.Any.fromFunction1(orientationIndex1), orientationIndex2 = js.Any.fromFunction1(orientationIndex2), p0 = p0.asInstanceOf[js.Any], p1 = p1.asInstanceOf[js.Any], pointAlong = js.Any.fromFunction1(pointAlong), pointAlongOffset = js.Any.fromFunction2(pointAlongOffset), project1 = js.Any.fromFunction1(project1), project2 = js.Any.fromFunction1(project2), projectionFactor = js.Any.fromFunction1(projectionFactor), reverse = js.Any.fromFunction0(reverse), segmentFraction = js.Any.fromFunction1(segmentFraction), setCoordinates = js.Any.fromFunction1(setCoordinates), setCoordinates2 = js.Any.fromFunction2(setCoordinates2), toGeometry = js.Any.fromFunction1(toGeometry))
    __obj.asInstanceOf[LineSegment]
  }
  
  @scala.inline
  implicit class LineSegmentOps[Self <: LineSegment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAngle(value: () => Double): Self = this.set("angle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClosestPoint(value: Coordinate => Coordinate): Self = this.set("closestPoint", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClosestPoints(value: LineSegment => js.Tuple2[Coordinate, Coordinate]): Self = this.set("closestPoints", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompareTo(value: LineSegment => Double): Self = this.set("compareTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDistance1(value: LineSegment => Double): Self = this.set("distance1", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDistance2(value: Coordinate => Double): Self = this.set("distance2", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDistancePerpendicular(value: Coordinate => Double): Self = this.set("distancePerpendicular", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEquals(value: LineSegment => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEqualsTopo(value: LineSegment => Boolean): Self = this.set("equalsTopo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCoordinate(value: () => Double): Self = this.set("getCoordinate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLength(value: () => Double): Self = this.set("getLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIntersection(value: LineSegment => Coordinate | Null): Self = this.set("intersection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsHorizontal(value: () => Boolean): Self = this.set("isHorizontal", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsVertical(value: () => Boolean): Self = this.set("isVertical", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLineIntersection(value: LineSegment => Coordinate | Null): Self = this.set("lineIntersection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMidPoint(value: () => Coordinate): Self = this.set("midPoint", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNormalize(value: () => Unit): Self = this.set("normalize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOrientationIndex1(value: LineSegment => `1` | `-1` | `0`): Self = this.set("orientationIndex1", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOrientationIndex2(value: Coordinate => `1` | `-1` | `0`): Self = this.set("orientationIndex2", js.Any.fromFunction1(value))
    
    @scala.inline
    def setP0(value: Coordinate): Self = this.set("p0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP1(value: Coordinate): Self = this.set("p1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointAlong(value: Double => Coordinate): Self = this.set("pointAlong", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPointAlongOffset(value: (Double, Double) => Coordinate): Self = this.set("pointAlongOffset", js.Any.fromFunction2(value))
    
    @scala.inline
    def setProject1(value: Coordinate => Coordinate): Self = this.set("project1", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProject2(value: LineSegment => LineSegment): Self = this.set("project2", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProjectionFactor(value: Coordinate => Double): Self = this.set("projectionFactor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReverse(value: () => Unit): Self = this.set("reverse", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSegmentFraction(value: Coordinate => Double): Self = this.set("segmentFraction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetCoordinates(value: LineSegment => Unit): Self = this.set("setCoordinates", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetCoordinates2(value: (Coordinate, Coordinate) => Unit): Self = this.set("setCoordinates2", js.Any.fromFunction2(value))
    
    @scala.inline
    def setToGeometry(value: GeometryFactory => LineString): Self = this.set("toGeometry", js.Any.fromFunction1(value))
  }
}
