package typings
package jstsLib.jstsNs.geomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsts.geom.Geometry")
@js.native
/**
  * Creates a new <tt>Geometry</tt> via the specified GeometryFactory.
  */
class Geometry () extends js.Object {
  def this(factory: js.Any) = this()
  /**
    * The bounding box of this <code>Geometry</code>.
    */
  var envelope: Envelope = js.native
  /**
    * Performs an operation with or on this <code>Geometry</code> and its
    * subelement <code>Geometry</code>s (if any). Only GeometryCollections and
    * subclasses have subelement Geometry's.
    *
    * @param filter
    *          the filter to apply to this <code>Geometry</code> (and its
    *          children, if it is a <code>GeometryCollection</code>).
    */
  @JSName("apply")
  def apply(filter: js.Any): scala.Unit = js.native
  /**
    * Computes a buffer area around this geometry having the given width and with a
    * specified accuracy of approximation for circular arcs, and using a specified
    * end cap style.
    * <p>
    * Mathematically-exact buffer area boundaries can contain circular arcs. To
    * represent these arcs using linear geometry they must be approximated with
    * line segments. The <code>quadrantSegments</code> argument allows
    * controlling the accuracy of the approximation by specifying the number of
    * line segments used to represent a quadrant of a circle
    * <p>
    * The end cap style specifies the buffer geometry that will be created at the
    * ends of linestrings. The styles provided are:
    * <ul>
    * <li><tt>BufferOp.CAP_ROUND</tt> - (default) a semi-circle
    * <li><tt>BufferOp.CAP_BUTT</tt> - a straight line perpendicular to the end
    * segment
    * <li><tt>BufferOp.CAP_SQUARE</tt> - a half-square
    * </ul>
    * <p>
    * The buffer operation always returns a polygonal result. The negative or
    * zero-distance buffer of lines and points is always an empty {@link Polygon}.
    * This is also the result for the buffers of degenerate (zero-area) polygons.
    *
    * @param {number}
    *          distance the width of the buffer (may be positive, negative or 0).
    * @param {number}
    *          quadrantSegments the number of line segments used to represent a
    *          quadrant of a circle.
    * @param {number}
    *          endCapStyle the end cap style to use.
    * @return {Geometry} a polygonal geometry representing the buffer region (which
    *         may be empty).
    *
    * @throws TopologyException
    *           if a robustness error occurs
    *
    * @see #buffer(double)
    * @see #buffer(double, int)
    * @see BufferOp
    */
  def buffer(distance: scala.Double, quadrantSegments: scala.Double, endCapStyle: scala.Double): Geometry = js.native
  /**
    * Throws an exception if <code>g</code>'s class is
    * <code>GeometryCollection</code> . (Its subclasses do not trigger an
    * exception).
    *
    * @param {Geometry}
    *          g the <code>Geometry</code> to check.
    * @throws Error
    *           if <code>g</code> is a <code>GeometryCollection</code> but not
    *           one of its subclasses
    */
  def checkNotGeometryCollection(g: Geometry): scala.Unit = js.native
  /**
    * Returns the first non-zero result of <code>compareTo</code> encountered as
    * the two <code>Collection</code>s are iterated over. If, by the time one of
    * the iterations is complete, no non-zero result has been encountered, returns
    * 0 if the other iteration is also complete. If <code>b</code> completes
    * before <code>a</code>, a positive number is returned; if a before b, a
    * negative number.
    *
    * @param {Array}
    *          a a <code>Collection</code> of <code>Comparable</code>s.
    * @param {Array}
    *          b a <code>Collection</code> of <code>Comparable</code>s.
    * @return {number} the first non-zero <code>compareTo</code> result, if any;
    *         otherwise, zero.
    */
  def compare(a: js.Array[_], b: js.Array[_]): scala.Double = js.native
  /**
    * Returns whether this <code>Geometry</code> is greater than, equal to, or
    * less than another <code>Geometry</code>.
    * <P>
    *
    * If their classes are different, they are compared using the following
    * ordering:
    * <UL>
    * <LI> Point (lowest)
    * <LI> MultiPoint
    * <LI> LineString
    * <LI> LinearRing
    * <LI> MultiLineString
    * <LI> Polygon
    * <LI> MultiPolygon
    * <LI> GeometryCollection (highest)
    * </UL>
    * If the two <code>Geometry</code>s have the same class, their first
    * elements are compared. If those are the same, the second elements are
    * compared, etc.
    *
    * @param {Geometry}
    *          other a <code>Geometry</code> with which to compare this
    *          <code>Geometry.</code>
    * @return {number} a positive number, 0, or a negative number, depending on
    *         whether this object is greater than, equal to, or less than
    *         <code>o</code>, as defined in "Normal Form For Geometry" in the
    *         JTS Technical Specifications.
    */
  def compareTo(o: Geometry): scala.Double = js.native
  /**
    * Returns whether this <code>Geometry</code> is greater than, equal to, or
    * less than another <code>Geometry</code> having the same class.
    *
    * @param o
    *          a <code>Geometry</code> having the same class as this
    *          <code>Geometry.</code>
    * @return a positive number, 0, or a negative number, depending on whether this
    *         object is greater than, equal to, or less than <code>o</code>, as
    *         defined in "Normal Form For Geometry" in the JTS Technical
    *         Specifications.
    */
  def compareToSameClass(o: Geometry): scala.Double = js.native
  /**
    * Returns the minimum and maximum x and y values in this <code>Geometry</code>,
    * or a null <code>Envelope</code> if this <code>Geometry</code> is empty.
    * Unlike <code>getEnvelopeInternal</code>, this method calculates the
    * <code>Envelope</code> each time it is called;
    * <code>getEnvelopeInternal</code> caches the result of this method.
    *
    * @return {Envelope} this <code>Geometry</code>s bounding box; if the
    *         <code>Geometry</code> is empty, <code>Envelope#isNull</code> will
    *         return <code>true.</code>
    */
  def computeEnvelopeInternal(): Envelope = js.native
  /**
    * Tests whether this geometry contains the specified geometry.
    * <p>
    * The <code>contains</code> predicate has the following equivalent
    * definitions:
    * <ul>
    * <li>Every point of the other geometry is a point of this geometry, and the
    * interiors of the two geometries have at least one point in common.
    * <li>The DE-9IM Intersection Matrix for the two geometries matches
    * <code>[T*****FF*]</code>
    * <li><code>g.within(this)</code> (<code>contains</code> is the converse
    * of <code>within</code>)
    * </ul>
    * An implication of the definition is that "Geometries do not contain their
    * boundary". In other words, if a geometry A is a subset of the points in the
    * boundary of a geometry B, <code>B.contains(A) = false</code>
    *
    * @param {Geometry}
    *          g the <code>Geometry</code> with which to compare this
    *          <code>Geometry.</code>
    * @return {boolean} <code>true</code> if this <code>Geometry</code>
    *         contains <code>g.</code>
    *
    * @see Geometry#within
    */
  def contains(g: Geometry): scala.Boolean = js.native
  /**
    * Computes the smallest convex <code>Polygon</code> that contains all the
    * points in the <code>Geometry</code>. This obviously applies only to
    * <code>Geometry</code> s which contain 3 or more points; the results for
    * degenerate cases are specified as follows: <TABLE>
    * <TR>
    * <TH> Number of <code>Point</code>s in argument <code>Geometry</code>
    * </TH>
    * <TH> <code>Geometry</code> class of result </TH>
    * </TR>
    * <TR>
    * <TD> 0 </TD>
    * <TD> empty <code>GeometryCollection</code> </TD>
    * </TR>
    * <TR>
    * <TD> 1 </TD>
    * <TD> <code>Point</code> </TD>
    * </TR>
    * <TR>
    * <TD> 2 </TD>
    * <TD> <code>LineString</code> </TD>
    * </TR>
    * <TR>
    * <TD> 3 or more </TD>
    * <TD> <code>Polygon</code> </TD>
    * </TR>
    * </TABLE>
    *
    * @return {Geometry} the minimum-area convex polygon containing this
    *         <code>Geometry</code>' s points.
    */
  def convexHull(): Geometry = js.native
  /**
    * Tests whether this geometry is covered by the specified geometry.
    * <p>
    * The <code>coveredBy</code> predicate has the following equivalent
    * definitions:
    * <ul>
    * <li>Every point of this geometry is a point of the other geometry.
    * <li>The DE-9IM Intersection Matrix for the two geometries matches
    * <code>[T*F**F***]</code> or <code>[*TF**F***]</code> or
    * <code>[**FT*F***]</code> or <code>[**F*TF***]</code>
    * <li><code>g.covers(this)</code> (<code>coveredBy</code> is the converse
    * of <code>covers</code>)
    * </ul>
    * If either geometry is empty, the value of this predicate is <tt>false</tt>.
    * <p>
    * This predicate is similar to {@link #within}, but is more inclusive (i.e.
    * returns <tt>true</tt> for more cases).
    *
    * @param {Geometry}
    *          g the <code>Geometry</code> with which to compare this
    *          <code>Geometry.</code>
    * @return {boolean} <code>true</code> if this <code>Geometry</code> is
    *         covered by <code>g.</code>
    *
    * @see Geometry#within
    * @see Geometry#covers
    */
  def coveredBy(g: Geometry): scala.Boolean = js.native
  /**
    * Tests whether this geometry covers the specified geometry.
    * <p>
    * The <code>covers</code> predicate has the following equivalent definitions:
    * <ul>
    * <li>Every point of the other geometry is a point of this geometry.
    * <li>The DE-9IM Intersection Matrix for the two geometries matches
    * <code>[T*****FF*]</code> or <code>[*T****FF*]</code> or
    * <code>[***T**FF*]</code> or <code>[****T*FF*]</code>
    * <li><code>g.coveredBy(this)</code> (<code>covers</code> is the converse
    * of <code>coveredBy</code>)
    * </ul>
    * If either geometry is empty, the value of this predicate is <tt>false</tt>.
    * <p>
    * This predicate is similar to {@link #contains}, but is more inclusive (i.e.
    * returns <tt>true</tt> for more cases). In particular, unlike
    * <code>contains</code> it does not distinguish between points in the
    * boundary and in the interior of geometries. For most situations,
    * <code>covers</code> should be used in preference to <code>contains</code>.
    * As an added benefit, <code>covers</code> is more amenable to optimization,
    * and hence should be more performant.
    *
    * @param {Geometry}
    *          g the <code>Geometry</code> with which to compare this
    *          <code>Geometry.</code>
    * @return {boolean} <code>true</code> if this <code>Geometry</code> covers
    *         <code>g.</code>
    *
    * @see Geometry#contains
    * @see Geometry#coveredBy
    */
  def covers(g: Geometry): scala.Boolean = js.native
  /**
    * Tests whether this geometry crosses the specified geometry.
    * <p>
    * The <code>crosses</code> predicate has the following equivalent
    * definitions:
    * <ul>
    * <li>The geometries have some but not all interior points in common.
    * <li>The DE-9IM Intersection Matrix for the two geometries matches
    * <ul>
    * <li><code>[T*T******]</code> (for P/L, P/A, and L/A situations)
    * <li><code>[T*****T**]</code> (for L/P, A/P, and A/L situations)
    * <li><code>[0********]</code> (for L/L situations)
    * </ul>
    * </ul>
    * For any other combination of dimensions this predicate returns
    * <code>false</code>.
    * <p>
    * The SFS defined this predicate only for P/L, P/A, L/L, and L/A situations.
    * JTS extends the definition to apply to L/P, A/P and A/L situations as well,
    * in order to make the relation symmetric.
    *
    * @param {Geometry}
    *          g the <code>Geometry</code> with which to compare this
    *          <code>Geometry.</code>
    * @return {boolean} <code>true</code> if the two <code>Geometry</code>s
    *         cross.
    */
  def crosses(g: Geometry): scala.Boolean = js.native
  /**
    * Computes a <code>Geometry</code> representing the points making up this
    * <code>Geometry</code> that do not make up <code>other</code>. This
    * method returns the closure of the resultant <code>Geometry</code>.
    *
    * @param {Geometry}
    *          other the <code>Geometry</code> with which to compute the
    *          difference.
    * @return {Geometry} the point set difference of this <code>Geometry</code>
    *         with <code>other.</code>
    * @throws TopologyException
    *           if a robustness error occurs
    * @throws IllegalArgumentException
    *           if either input is a non-empty GeometryCollection
    */
  def difference(other: Geometry): Geometry = js.native
  /**
    * Tests whether this geometry is disjoint from the specified geometry.
    * <p>
    * The <code>disjoint</code> predicate has the following equivalent
    * definitions:
    * <ul>
    * <li>The two geometries have no point in common
    * <li>The DE-9IM Intersection Matrix for the two geometries matches
    * <code>[FF*FF****]</code>
    * <li><code>! g.intersects(this)</code> (<code>disjoint</code> is the
    * inverse of <code>intersects</code>)
    * </ul>
    *
    * @param {Geometry}
    *          g the <code>Geometry</code> with which to compare this
    *          <code>Geometry.</code>
    * @return {boolean} <code>true</code> if the two <code>Geometry</code>s
    *         are disjoint.
    *
    * @see Geometry#intersects
    */
  def disjoint(g: Geometry): scala.Boolean = js.native
  /**
    * Returns the minimum distance between this <code>Geometry</code> and the
    * <code>Geometry</code> g
    *
    * @param {Geometry}
    *          g the <code>Geometry</code> from which to compute the distance.
    * @return {number} the distance between the geometries. 0 if either input
    *         geometry is empty.
    * @throws IllegalArgumentException
    *           if g is null
    */
  def distance(g: Geometry): scala.Double = js.native
  /**
    * @param {jsts.geom.Coordinate}
    *          a first Coordinate to compare.
    * @param {jsts.geom.Coordinate}
    *          b second Coordinate to compare.
    * @param {number}
    *          tolerance tolerance when comparing.
    * @return {boolean} true if equal.
    */
  def equal(a: Coordinate, b: Coordinate, tolerance: scala.Double): scala.Boolean = js.native
  /**
    * Returns true if the two <code>Geometry</code>s are exactly equal, up to a
    * specified distance tolerance. Two Geometries are exactly equal within a
    * distance tolerance if and only if:
    * <ul>
    * <li>they have the same class
    * <li>they have the same values for their vertices, within the given tolerance
    * distance, in exactly the same order.
    * </ul>
    * If this and the other <code>Geometry</code>s are composites and any
    * children are not <code>Geometry</code>s, returns <code>false</code>.
    *
    * @param {Geometry}
    *          other the <code>Geometry</code> with which to compare this
    *          <code>Geometry.</code>
    * @param {number}
    *          tolerance distance at or below which two <code>Coordinate</code>s
    *          are considered equal.
    * @return {boolean}
    */
  def equalsExact(other: Geometry, tolerance: scala.Double): scala.Boolean = js.native
  /**
    * Tests whether two geometries are exactly equal in their normalized forms.
    * This is a convenience method which creates normalized versions of both
    * geometries before computing {@link #equalsExact(Geometry)}. This method is
    * relatively expensive to compute. For maximum performance, the client should
    * instead perform normalization itself at an appropriate point during
    * execution.
    *
    * @param {Geometry}
    *          g a Geometry.
    * @return {boolean} true if the input geometries are exactly equal in their
    *         normalized form.
    */
  def equalsNorm(g: Geometry): scala.Boolean = js.native
  /**
    * Tests whether this geometry is topologically equal to the argument geometry
    * as defined by the SFS <tt>equals</tt> predicate.
    * <p>
    * The SFS <code>equals</code> predicate has the following equivalent
    * definitions:
    * <ul>
    * <li>The two geometries have at least one point in common, and no point of
    * either geometry lies in the exterior of the other geometry.
    * <li>The DE-9IM Intersection Matrix for the two geometries matches the
    * pattern <tt>T*F**FFF*</tt>
    * <pre>
    * T*F
    * **F
    * FF*
    * </pre>
    *
    * </ul>
    * <b>Note</b> that this method computes <b>topologically equality</b>. For
    * structural equality, see {@link #equalsExact(Geometry)}.
    *
    * @param {Geometry}
    *          g the <code>Geometry</code> with which to compare this
    *          <code>Geometry.</code>
    * @return {boolean} <code>true</code> if the two <code>Geometry</code>s
    *         are topologically equal.
    *
    * @see #equalsExact(Geometry)
    */
  def equalsTopo(g: Geometry): scala.Boolean = js.native
  /**
    * Returns the area of this <code>Geometry</code>. Areal Geometries have a
    * non-zero area. They override this function to compute the area. Others return
    * 0.0
    *
    * @return the area of the Geometry.
    */
  def getArea(): scala.Double = js.native
  /**
    * Returns the boundary, or an empty geometry of appropriate dimension if this
    * <code>Geometry</code> is empty. (In the case of zero-dimensional
    * geometries, ' an empty GeometryCollection is returned.) For a discussion of
    * this function, see the OpenGIS Simple Features Specification. As stated in
    * SFS Section 2.1.13.1, "the boundary of a Geometry is a set of Geometries of
    * the next lower dimension."
    *
    * @return {Geometry} the closure of the combinatorial boundary of this
    *         <code>Geometry.</code>
    */
  def getBoundary(): Geometry = js.native
  /**
    * Returns the dimension of this <code>Geometry</code>s inherent boundary.
    *
    * @return {number} the dimension of the boundary of the class implementing this
    *         interface, whether or not this object is the empty geometry. Returns
    *         <code>Dimension.FALSE</code> if the boundary is the empty geometry.
    */
  def getBoundaryDimension(): scala.Double = js.native
  /**
    * Computes the centroid of this <code>Geometry</code>. The centroid is equal
    * to the centroid of the set of component Geometries of highest dimension
    * (since the lower-dimension geometries contribute zero "weight" to the
    * centroid)
    *
    * @return a {@link Point} which is the centroid of this Geometry.
    */
  def getCentroid(): Point = js.native
  /**
    * Returns a vertex of this <code>Geometry</code> (usually, but not
    * necessarily, the first one). The returned coordinate should not be assumed to
    * be an actual Coordinate object used in the internal representation.
    *
    * @return {Coordinate} a {@link Coordinate} which is a vertex of this
    *         <code>Geometry</code>. null if this Geometry is empty.
    */
  def getCoordinate(): Coordinate = js.native
  /**
    * Returns an array containing the values of all the vertices for this geometry.
    * If the geometry is a composite, the array will contain all the vertices for
    * the components, in the order in which the components occur in the geometry.
    * <p>
    * In general, the array cannot be assumed to be the actual internal storage for
    * the vertices. Thus modifying the array may not modify the geometry itself.
    * Use the {@link CoordinateSequence#setOrdinate} method (possibly on the
    * components) to modify the underlying data. If the coordinates are modified,
    * {@link #geometryChanged} must be called afterwards.
    *
    * @return {Coordinate[]} the vertices of this <code>Geometry.</code>
    * @see geometryChanged
    * @see CoordinateSequence#setOrdinate
    */
  def getCoordinates(): js.Array[Coordinate] = js.native
  /**
    * Returns the dimension of this geometry. The dimension of a geometry is is the
    * topological dimension of its embedding in the 2-D Euclidean plane. In the JTS
    * spatial model, dimension values are in the set {0,1,2}.
    * <p>
    * Note that this is a different concept to the dimension of the vertex
    * {@link Coordinate}s. The geometry dimension can never be greater than the
    * coordinate dimension. For example, a 0-dimensional geometry (e.g. a Point)
    * may have a coordinate dimension of 3 (X,Y,Z).
    *
    * @return {number} the topological dimension of this geometry.
    */
  def getDimension(): scala.Double = js.native
  /**
    * Returns this <code>Geometry</code>s bounding box. If this
    * <code>Geometry</code> is the empty geometry, returns an empty
    * <code>Point</code>. If the <code>Geometry</code> is a point, returns a
    * non-empty <code>Point</code>. Otherwise, returns a <code>Polygon</code>
    * whose points are (minx, miny), (maxx, miny), (maxx, maxy), (minx, maxy),
    * (minx, miny).
    *
    * @return {Geometry} an empty <code>Point</code> (for empty
    *         <code>Geometry</code>s), a <code>Point</code> (for
    *         <code>Point</code>s) or a <code>Polygon</code> (in all other
    *         cases).
    */
  def getEnvelope(): Geometry = js.native
  /**
    * Returns the minimum and maximum x and y values in this <code>Geometry</code>,
    * or a null <code>Envelope</code> if this <code>Geometry</code> is empty.
    *
    * @return {Envelope} this <code>Geometry</code>s bounding box; if the
    *         <code>Geometry</code> is empty, <code>Envelope#isNull</code> will
    *         return <code>true.</code>
    */
  def getEnvelopeInternal(): Envelope = js.native
  /**
    * Gets the factory which contains the context in which this geometry was created.
    *
    * @return {jsts.geom.GeometryFactory} the factory for this geometry.
    */
  def getFactory(): js.Any = js.native
  /**
    * Returns an element {@link Geometry} from a {@link GeometryCollection} (or
    * <code>this</code>, if the geometry is not a collection).
    *
    * @param {number} n The index of the geometry element.
    *
    * @return {Geometry} the n'th geometry contained in this geometry.
    */
  def getGeometryN(n: scala.Double): Geometry = js.native
  /**
    * Returns the name of this object's <code>com.vivid.jts.geom</code> interface.
    *
    * @return {string} The name of this <code>Geometry</code>s most specific <code>jsts.geom</code> interface.
    */
  def getGeometryType(): java.lang.String = js.native
  /**
    * Computes an interior point of this <code>Geometry</code>. An interior
    * point is guaranteed to lie in the interior of the Geometry, if it possible to
    * calculate such a point exactly. Otherwise, the point may lie on the boundary
    * of the geometry.
    *
    * @return {Point} a {@link Point} which is in the interior of this Geometry.
    */
  def getInteriorPoint(): Point = js.native
  /**
    * Returns the length of this <code>Geometry</code>. Linear geometries return
    * their length. Areal geometries return their perimeter. They override this
    * function to compute the area. Others return 0.0
    *
    * @return the length of the Geometry.
    */
  def getLength(): scala.Double = js.native
  /**
    *Returns the number of {@link Geometry}s in a {@link GeometryCollection}
    * (or 1, if the geometry is not a collection).
    *
    * @return {number} the number of geometries contained in this geometry.
    */
  def getNumGeometries(): scala.Double = js.native
  /**
    * Returns the count of this <code>Geometry</code>s vertices. The
    * <code>Geometry</code> s contained by composite <code>Geometry</code>s
    * must be Geometry's; that is, they must implement <code>getNumPoints</code>
    *
    * @return {number} the number of vertices in this <code>Geometry.</code>
    */
  def getNumPoints(): scala.Double = js.native
  /**
    * Returns the <code>PrecisionModel</code> used by the <code>Geometry</code>.
    *
    * @return {PrecisionModel} the specification of the grid of allowable points, for this
    * <code>Geometry</code> and all other <code>Geometry</code>s.
    */
  def getPrecisionModel(): PrecisionModel = js.native
  /**
    * Computes a <code>Geometry</code> representing the points shared by this
    * <code>Geometry</code> and <code>other</code>. {@link GeometryCollection}s
    * support intersection with homogeneous collection types, with the semantics
    * that the result is a {@link GeometryCollection} of the intersection of each
    * element of the target with the argument.
    *
    * @param {Geometry}
    *          other the <code>Geometry</code> with which to compute the
    *          intersection.
    * @return {Geometry} the points common to the two <code>Geometry</code>s.
    * @throws TopologyException
    *           if a robustness error occurs
    * @throws IllegalArgumentException
    *           if the argument is a non-empty GeometryCollection
    */
  def intersection(other: Geometry): Geometry = js.native
  /**
    * Tests whether this geometry intersects the specified geometry.
    * <p>
    * The <code>intersects</code> predicate has the following equivalent
    * definitions:
    * <ul>
    * <li>The two geometries have at least one point in common
    * <li>The DE-9IM Intersection Matrix for the two geometries matches
    * <code>[T********]</code> or <code>[*T*******]</code> or
    * <code>[***T*****]</code> or <code>[****T****]</code>
    * <li><code>! g.disjoint(this)</code> (<code>intersects</code> is the
    * inverse of <code>disjoint</code>)
    * </ul>
    *
    * @param {Geometry}
    *          g the <code>Geometry</code> with which to compare this
    *          <code>Geometry.</code>
    * @return {boolean} <code>true</code> if the two <code>Geometry</code>s
    *         intersect.
    *
    * @see Geometry#disjoint
    */
  def intersects(g: Geometry): scala.Boolean = js.native
  /**
    * Returns whether or not the set of points in this <code>Geometry</code> is
    * empty.
    *
    * @return {boolean} <code>true</code> if this <code>Geometry</code> equals
    *         the empty geometry.
    */
  def isEmpty(): scala.Boolean = js.native
  /**
    * Returns whether the two <code>Geometry</code>s are equal, from the point
    * of view of the <code>equalsExact</code> method. Called by
    * <code>equalsExact</code> . In general, two <code>Geometry</code> classes
    * are considered to be "equivalent" only if they are the same class. An
    * exception is <code>LineString</code> , which is considered to be equivalent
    * to its subclasses.
    *
    * @param {Geometry}
    *          other the <code>Geometry</code> with which to compare this
    *          <code>Geometry</code> for equality.
    * @return {boolean} <code>true</code> if the classes of the two
    *         <code>Geometry</code> s are considered to be equal by the
    *         <code>equalsExact</code> method.
    */
  def isEquivalentClass(other: Geometry): scala.Boolean = js.native
  /**
    *
    * @return {boolean} true if this is a GeometryCollection.
    */
  def isGeometryCollection(): scala.Boolean = js.native
  /**
    *
    * @return {boolean} true if this is a GeometryCollection but not subclass.
    */
  def isGeometryCollectionBase(): scala.Boolean = js.native
  def isRectangle(): scala.Boolean = js.native
  /**
    * Tests whether this {@link Geometry} is simple. In general, the SFS
    * specification of simplicity follows the rule:
    * <UL>
    * <LI> A Geometry is simple iff the only self-intersections are at boundary
    * points.
    * </UL>
    * Simplicity is defined for each {@link Geometry} subclass as follows:
    * <ul>
    * <li>Valid polygonal geometries are simple by definition, so
    * <code>isSimple</code> trivially returns true.
    * <li>Linear geometries are simple iff they do not self-intersect at points
    * other than boundary points.
    * <li>Zero-dimensional geometries (points) are simple iff they have no
    * repeated points.
    * <li>Empty <code>Geometry</code>s are always simple
    * <ul>
    *
    * @return {boolean} <code>true</code> if this <code>Geometry</code> has any
    *         points of self-tangency, self-intersection or other anomalous points.
    * @see #isValid
    */
  def isSimple(): scala.Boolean = js.native
  /**
    * Tests the validity of this <code>Geometry</code>. Subclasses provide their
    * own definition of "valid".
    *
    * @return {boolean} <code>true</code> if this <code>Geometry</code> is
    *         valid.
    *
    * @see IsValidOp
    */
  def isValid(): scala.Boolean = js.native
  /**
    * Tests whether the distance from this <code>Geometry</code> to another is
    * less than or equal to a specified value.
    *
    * @param {Geometry}
    *          geom the Geometry to check the distance to.
    * @param {number}
    *          distance the distance value to compare.
    * @return {boolean} <code>true</code> if the geometries are less than
    *         <code>distance</code> apart.
    */
  def isWithinDistance(geom: Geometry, distance: scala.Double): scala.Boolean = js.native
  /**
    * Creates a new Geometry which is a normalized copy of this Geometry.
    *
    * @return a normalized copy of this geometry.
    * @see #normalize()
    */
  def norm(): Geometry = js.native
  /**
    * Converts this <code>Geometry</code> to <b>normal form</b> (or <b>
    * canonical form</b> ). Normal form is a unique representation for
    * <code>Geometry</code> s. It can be used to test whether two
    * <code>Geometry</code>s are equal in a way that is independent of the
    * ordering of the coordinates within them. Normal form equality is a stronger
    * condition than topological equality, but weaker than pointwise equality. The
    * definitions for normal form use the standard lexicographical ordering for
    * coordinates. "Sorted in order of coordinates" means the obvious extension of
    * this ordering to sequences of coordinates.
    */
  def normalize(): scala.Unit = js.native
  /**
    * Tests whether this geometry overlaps the specified geometry.
    * <p>
    * The <code>overlaps</code> predicate has the following equivalent
    * definitions:
    * <ul>
    * <li>The geometries have at least one point each not shared by the other (or
    * equivalently neither covers the other), they have the same dimension, and the
    * intersection of the interiors of the two geometries has the same dimension as
    * the geometries themselves.
    * <li>The DE-9IM Intersection Matrix for the two geometries matches
    * <code>[T*T***T**]</code> (for two points or two surfaces) or
    * <code>[1*T***T**]</code> (for two curves)
    * </ul>
    * If the geometries are of different dimension this predicate returns
    * <code>false</code>.
    *
    * @param {Geometry}
    *          g the <code>Geometry</code> with which to compare this
    *          <code>Geometry.</code>
    * @return {boolean} <code>true</code> if the two <code>Geometry</code>s
    *         overlap.
    */
  def overlaps(g: Geometry): scala.Boolean = js.native
  /**
    * Tests whether the elements in the DE-9IM {@link IntersectionMatrix} for the
    * two <code>Geometry</code>s match the elements in
    * <code>intersectionPattern</code>. The pattern is a 9-character string,
    * with symbols drawn from the following set:
    * <UL>
    * <LI> 0 (dimension 0)
    * <LI> 1 (dimension 1)
    * <LI> 2 (dimension 2)
    * <LI> T ( matches 0, 1 or 2)
    * <LI> F ( matches FALSE)
    * <LI> * ( matches any value)
    * </UL>
    * For more information on the DE-9IM, see the <i>OpenGIS Simple Features
    * Specification</i>.
    *
    * @param {Geometry}
    *          other the <code>Geometry</code> with which to compare this
    *          <code>Geometry.</code>
    * @param {string}
    *          intersectionPattern the pattern against which to check the
    *          intersection matrix for the two <code>Geometry</code>s.
    * @return {boolean} <code>true</code> if the DE-9IM intersection matrix for
    *         the two <code>Geometry</code>s match
    *         <code>intersectionPattern.</code>
    * @see IntersectionMatrix
    */
  def relate(g: Geometry, intersectionPattern: java.lang.String): scala.Boolean = js.native
  /**
    * Returns the DE-9IM {@link IntersectionMatrix} for the two
    * <code>Geometry</code>s.
    *
    * @param {Geometry}
    *          g the <code>Geometry</code> with which to compare this
    *          <code>Geometry.</code>
    * @return {IntersectionMatrix} an {@link IntersectionMatrix} describing the
    *         intersections of the interiors, boundaries and exteriors of the two
    *         <code>Geometry</code>s.
    */
  def relate2(g: Geometry): js.Any = js.native
  /**
    * Returns a set combining the points in this <code>Geometry</code> not in
    * <code>other</code>, and the points in <code>other</code> not in this
    * <code>Geometry</code>. This method returns the closure of the resultant
    * <code>Geometry</code>.
    *
    * @param {Geometry}
    *          other the <code>Geometry</code> with which to compute the
    *          symmetric difference.
    * @return {Geometry} the point set symmetric difference of this
    *         <code>Geometry</code> with <code>other.</code>
    * @throws TopologyException
    *           if a robustness error occurs
    * @throws IllegalArgumentException
    *           if either input is a non-empty GeometryCollection
    */
  def symDifference(other: Geometry): Geometry = js.native
  /**
    * Tests whether this geometry touches the specified geometry.
    * <p>
    * The <code>touches</code> predicate has the following equivalent
    * definitions:
    * <ul>
    * <li>The geometries have at least one point in common, but their interiors do
    * not intersect.
    * <li>The DE-9IM Intersection Matrix for the two geometries matches
    * <code>[FT*******]</code> or <code>[F**T*****]</code> or
    * <code>[F***T****]</code>
    * </ul>
    * If both geometries have dimension 0, this predicate returns
    * <code>false</code>
    *
    * @param {Geometry}
    *          g the <code>Geometry</code> with which to compare this
    *          <code>Geometry.</code>
    * @return {boolean} <code>true</code> if the two <code>Geometry</code>s
    *         touch; Returns <code>false</code> if both <code>Geometry</code>s
    *         are points.
    */
  def touches(g: Geometry): scala.Boolean = js.native
  /**
    * Computes a <code>Geometry</code> representing all the points in this
    * <code>Geometry</code> and <code>other</code>.
    *
    * Or without arguments:
    *
    * Computes the union of all the elements of this geometry. Heterogeneous
    * {@link GeometryCollection}s are fully supported.
    *
    * The result obeys the following contract:
    * <ul>
    * <li>Unioning a set of {@link LineString}s has the effect of fully noding
    * and dissolving the linework.
    * <li>Unioning a set of {@link Polygon}s will always return a
    * {@link Polygonal} geometry (unlike {link #union(Geometry)}, which may return
    * geometrys of lower dimension if a topology collapse occurred.
    * </ul>
    *
    * @param {Geometry}
    *          other the <code>Geometry</code> with which to compute the union.
    * @return {Geometry} a set combining the points of this <code>Geometry</code>
    *         and the points of <code>other.</code>
    * @throws TopologyException
    *           if a robustness error occurs
    * @throws IllegalArgumentException
    *           if either input is a non-empty GeometryCollection
    */
  def union(other: Geometry): Geometry = js.native
  /**
    * Tests whether this geometry is within the specified geometry.
    * <p>
    * The <code>within</code> predicate has the following equivalent definitions:
    * <ul>
    * <li>Every point of this geometry is a point of the other geometry, and the
    * interiors of the two geometries have at least one point in common.
    * <li>The DE-9IM Intersection Matrix for the two geometries matches
    * <code>[T*F**F***]</code>
    * <li><code>g.contains(this)</code> (<code>within</code> is the converse
    * of <code>contains</code>)
    * </ul>
    * An implication of the definition is that "The boundary of a Geometry is not
    * within the Geometry". In other words, if a geometry A is a subset of the
    * points in the boundary of a geomtry B, <code>A.within(B) = false</code>
    *
    * @param {Geometry}
    *          g the <code>Geometry</code> with which to compare this
    *          <code>Geometry.</code>
    * @return {boolean} <code>true</code> if this <code>Geometry</code> is
    *         within <code>other.</code>
    *
    * @see Geometry#contains
    */
  def within(g: Geometry): scala.Boolean = js.native
}

