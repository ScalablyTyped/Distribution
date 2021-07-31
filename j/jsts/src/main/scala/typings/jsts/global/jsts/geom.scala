package typings.jsts.global.jsts

import typings.jsts.jstsNumbers.`-1`
import typings.jsts.jstsNumbers.`0`
import typings.jsts.jstsNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geom {
  
  @JSGlobal("jsts.geom.Coordinate")
  @js.native
  class Coordinate protected ()
    extends StObject
       with typings.jsts.jsts.geom.Coordinate {
    /**
      * @constructor
      */
    def this(c: typings.jsts.jsts.geom.Coordinate) = this()
    /**
      * @constructor
      */
    def this(x: Double, y: Double) = this()
    
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
    
    /**
      * Gets or sets the x value.
      */
    /* CompleteClass */
    var x: Double = js.native
    
    /**
      * Gets or sets the y value.
      */
    /* CompleteClass */
    var y: Double = js.native
    
    /**
      * Gets or sets the z value.
      */
    /* CompleteClass */
    var z: Double = js.native
  }
  
  @JSGlobal("jsts.geom.CoordinateSequence")
  @js.native
  class CoordinateSequence ()
    extends StObject
       with typings.jsts.jsts.geom.CoordinateSequence
  /* static members */
  object CoordinateSequence {
    
    @JSGlobal("jsts.geom.CoordinateSequence")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("jsts.geom.CoordinateSequence.M")
    @js.native
    def M: Double = js.native
    @scala.inline
    def M_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("M")(x.asInstanceOf[js.Any])
    
    @JSGlobal("jsts.geom.CoordinateSequence.X")
    @js.native
    def X: Double = js.native
    @scala.inline
    def X_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("X")(x.asInstanceOf[js.Any])
    
    @JSGlobal("jsts.geom.CoordinateSequence.Y")
    @js.native
    def Y: Double = js.native
    @scala.inline
    def Y_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Y")(x.asInstanceOf[js.Any])
    
    @JSGlobal("jsts.geom.CoordinateSequence.Z")
    @js.native
    def Z: Double = js.native
    @scala.inline
    def Z_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Z")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("jsts.geom.Envelope")
  @js.native
  class Envelope protected ()
    extends StObject
       with typings.jsts.jsts.geom.Envelope {
    /**
      * Initialize an <code>Envelope</code> from an existing Envelope.
      *
      * @param {jsts.geom.Envelope} env the Envelope to initialize from.
      */
    def this(env: typings.jsts.jsts.geom.Envelope) = this()
    /**
      * Initialize an <code>Envelope</code> to a region defined by a single
      * Coordinate.
      *
      * @param {jsts.geom.Coordinate} p the Coordinate.
      */
    def this(p: typings.jsts.jsts.geom.Coordinate) = this()
    /**
      * Initialize an <code>Envelope</code> to a region defined by two Coordinates.
      *
      * @param {jsts.geom.Coordinate} p1 the first Coordinate.
      * @param {jsts.geom.Coordinate} p2 the second Coordinate.
      */
    def this(p1: typings.jsts.jsts.geom.Coordinate, p2: typings.jsts.jsts.geom.Coordinate) = this()
    /**
      * Creates an <code>Envelope</code> for a region defined by maximum and
      * minimum values.
      *
      * @param {number} x1 the first x-value.
      * @param {number} x2 the second x-value.
      * @param {number} y1 the first y-value.
      * @param {number} y2 the second y-value.
      */
    def this(x1: Double, x2: Double, y1: Double, y2: Double) = this()
  }
  /* static members */
  object Envelope {
    
    @JSGlobal("jsts.geom.Envelope")
    @js.native
    val ^ : js.Any = js.native
    
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
    @scala.inline
    def intersects(
      p1: typings.jsts.jsts.geom.Coordinate,
      p2: typings.jsts.jsts.geom.Coordinate,
      q: typings.jsts.jsts.geom.Coordinate
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersects")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
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
    @scala.inline
    def intersectsEnvelope(
      p1: typings.jsts.jsts.geom.Coordinate,
      p2: typings.jsts.jsts.geom.Coordinate,
      q1: typings.jsts.jsts.geom.Coordinate,
      q2: typings.jsts.jsts.geom.Coordinate
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectsEnvelope")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], q1.asInstanceOf[js.Any], q2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  @JSGlobal("jsts.geom.Geometry")
  @js.native
  /**
    * Creates a new <tt>Geometry</tt> via the specified GeometryFactory.
    */
  class Geometry ()
    extends StObject
       with typings.jsts.jsts.geom.Geometry {
    def this(factory: js.Any) = this()
    
    /**
      * Performs an operation with or on this <code>Geometry</code> and its
      * subelement <code>Geometry</code>s (if any). Only GeometryCollections and
      * subclasses have subelement Geometry's.
      *
      * @param filter
      *          the filter to apply to this <code>Geometry</code> (and its
      *          children, if it is a <code>GeometryCollection</code>).
      */
    /* CompleteClass */
    @JSName("apply")
    override def apply(filter: js.Any): Unit = js.native
    
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
    /* CompleteClass */
    override def buffer(distance: Double, quadrantSegments: Double, endCapStyle: Double): typings.jsts.jsts.geom.Geometry = js.native
    
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
    /* CompleteClass */
    override def checkNotGeometryCollection(g: typings.jsts.jsts.geom.Geometry): Unit = js.native
    
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
    /* CompleteClass */
    override def compare(a: js.Array[js.Any], b: js.Array[js.Any]): Double = js.native
    
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
    /* CompleteClass */
    override def compareTo(o: typings.jsts.jsts.geom.Geometry): Double = js.native
    
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
    /* CompleteClass */
    override def compareToSameClass(o: typings.jsts.jsts.geom.Geometry): Double = js.native
    
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
    /* CompleteClass */
    override def computeEnvelopeInternal(): typings.jsts.jsts.geom.Envelope = js.native
    
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
    /* CompleteClass */
    override def contains(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def convexHull(): typings.jsts.jsts.geom.Geometry = js.native
    
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
    /* CompleteClass */
    override def coveredBy(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def covers(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def crosses(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def difference(other: typings.jsts.jsts.geom.Geometry): typings.jsts.jsts.geom.Geometry = js.native
    
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
    /* CompleteClass */
    override def disjoint(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def distance(g: typings.jsts.jsts.geom.Geometry): Double = js.native
    
    /**
      * The bounding box of this <code>Geometry</code>.
      */
    /* CompleteClass */
    var envelope: typings.jsts.jsts.geom.Envelope = js.native
    
    /**
      * @param {jsts.geom.Coordinate}
      *          a first Coordinate to compare.
      * @param {jsts.geom.Coordinate}
      *          b second Coordinate to compare.
      * @param {number}
      *          tolerance tolerance when comparing.
      * @return {boolean} true if equal.
      */
    /* CompleteClass */
    override def equal(a: typings.jsts.jsts.geom.Coordinate, b: typings.jsts.jsts.geom.Coordinate, tolerance: Double): Boolean = js.native
    
    /**
      * Tests whether this geometry is structurally and numerically equal to a given
      * <tt>Object</tt>. If the argument <tt>Object</tt> is not a
      * <tt>Geometry</tt>, the result is <tt>false</tt>. Otherwise, the result
      * is computed using {@link #equalsExact(Geometry)}.
      * <p>
      * This method is provided to fulfill the Java contract for value-based object
      * equality. In conjunction with {@link #hashCode()} it provides semantics which
      * are most useful for using <tt>Geometry</tt>s as keys and values in Java
      * collections.
      * <p>
      * Note that to produce the expected result the input geometries should be in
      * normal form. It is the caller's responsibility to perform this where required
      * (using {@link Geometry#norm() or {@link #normalize()} as appropriate).
      *
      * @param {Object}
      *          o the Object to compare.
      * @return {boolean} true if this geometry is exactly equal to the argument.
      *
      * @see #equalsExact(Geometry)
      * @see #hashCode()
      * @see #norm()
      * @see #normalize()
      */
    /* CompleteClass */
    override def equals(o: js.Object): Boolean = js.native
    
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
    /* CompleteClass */
    override def equalsExact(other: typings.jsts.jsts.geom.Geometry, tolerance: Double): Boolean = js.native
    
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
    /* CompleteClass */
    override def equalsNorm(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def equalsTopo(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
    /**
      * Returns the area of this <code>Geometry</code>. Areal Geometries have a
      * non-zero area. They override this function to compute the area. Others return
      * 0.0
      *
      * @return the area of the Geometry.
      */
    /* CompleteClass */
    override def getArea(): Double = js.native
    
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
    /* CompleteClass */
    override def getBoundary(): typings.jsts.jsts.geom.Geometry = js.native
    
    /**
      * Returns the dimension of this <code>Geometry</code>s inherent boundary.
      *
      * @return {number} the dimension of the boundary of the class implementing this
      *         interface, whether or not this object is the empty geometry. Returns
      *         <code>Dimension.FALSE</code> if the boundary is the empty geometry.
      */
    /* CompleteClass */
    override def getBoundaryDimension(): Double = js.native
    
    /**
      * Computes the centroid of this <code>Geometry</code>. The centroid is equal
      * to the centroid of the set of component Geometries of highest dimension
      * (since the lower-dimension geometries contribute zero "weight" to the
      * centroid)
      *
      * @return a {@link Point} which is the centroid of this Geometry.
      */
    /* CompleteClass */
    override def getCentroid(): typings.jsts.jsts.geom.Point = js.native
    
    /**
      * Returns a vertex of this <code>Geometry</code> (usually, but not
      * necessarily, the first one). The returned coordinate should not be assumed to
      * be an actual Coordinate object used in the internal representation.
      *
      * @return {Coordinate} a {@link Coordinate} which is a vertex of this
      *         <code>Geometry</code>. null if this Geometry is empty.
      */
    /* CompleteClass */
    override def getCoordinate(): typings.jsts.jsts.geom.Coordinate = js.native
    
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
    /* CompleteClass */
    override def getCoordinates(): js.Array[typings.jsts.jsts.geom.Coordinate] = js.native
    
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
    /* CompleteClass */
    override def getDimension(): Double = js.native
    
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
    /* CompleteClass */
    override def getEnvelope(): typings.jsts.jsts.geom.Geometry = js.native
    
    /**
      * Returns the minimum and maximum x and y values in this <code>Geometry</code>,
      * or a null <code>Envelope</code> if this <code>Geometry</code> is empty.
      *
      * @return {Envelope} this <code>Geometry</code>s bounding box; if the
      *         <code>Geometry</code> is empty, <code>Envelope#isNull</code> will
      *         return <code>true.</code>
      */
    /* CompleteClass */
    override def getEnvelopeInternal(): typings.jsts.jsts.geom.Envelope = js.native
    
    /**
      * Gets the factory which contains the context in which this geometry was created.
      *
      * @return {jsts.geom.GeometryFactory} the factory for this geometry.
      */
    /* CompleteClass */
    override def getFactory(): js.Any = js.native
    
    /**
      * Returns an element {@link Geometry} from a {@link GeometryCollection} (or
      * <code>this</code>, if the geometry is not a collection).
      *
      * @param {number} n The index of the geometry element.
      *
      * @return {Geometry} the n'th geometry contained in this geometry.
      */
    /* CompleteClass */
    override def getGeometryN(n: Double): typings.jsts.jsts.geom.Geometry = js.native
    
    /**
      * Returns the name of this object's <code>com.vivid.jts.geom</code> interface.
      *
      * @return {string} The name of this <code>Geometry</code>s most specific <code>jsts.geom</code> interface.
      */
    /* CompleteClass */
    override def getGeometryType(): String = js.native
    
    /**
      * Computes an interior point of this <code>Geometry</code>. An interior
      * point is guaranteed to lie in the interior of the Geometry, if it possible to
      * calculate such a point exactly. Otherwise, the point may lie on the boundary
      * of the geometry.
      *
      * @return {Point} a {@link Point} which is in the interior of this Geometry.
      */
    /* CompleteClass */
    override def getInteriorPoint(): typings.jsts.jsts.geom.Point = js.native
    
    /**
      * Returns the length of this <code>Geometry</code>. Linear geometries return
      * their length. Areal geometries return their perimeter. They override this
      * function to compute the area. Others return 0.0
      *
      * @return the length of the Geometry.
      */
    /* CompleteClass */
    override def getLength(): Double = js.native
    
    /**
      *Returns the number of {@link Geometry}s in a {@link GeometryCollection}
      * (or 1, if the geometry is not a collection).
      *
      * @return {number} the number of geometries contained in this geometry.
      */
    /* CompleteClass */
    override def getNumGeometries(): Double = js.native
    
    /**
      * Returns the count of this <code>Geometry</code>s vertices. The
      * <code>Geometry</code> s contained by composite <code>Geometry</code>s
      * must be Geometry's; that is, they must implement <code>getNumPoints</code>
      *
      * @return {number} the number of vertices in this <code>Geometry.</code>
      */
    /* CompleteClass */
    override def getNumPoints(): Double = js.native
    
    /**
      * Returns the <code>PrecisionModel</code> used by the <code>Geometry</code>.
      *
      * @return {PrecisionModel} the specification of the grid of allowable points, for this
      * <code>Geometry</code> and all other <code>Geometry</code>s.
      */
    /* CompleteClass */
    override def getPrecisionModel(): typings.jsts.jsts.geom.PrecisionModel = js.native
    
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
    /* CompleteClass */
    override def intersection(other: typings.jsts.jsts.geom.Geometry): typings.jsts.jsts.geom.Geometry = js.native
    
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
    /* CompleteClass */
    override def intersects(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
    /**
      * Returns whether or not the set of points in this <code>Geometry</code> is
      * empty.
      *
      * @return {boolean} <code>true</code> if this <code>Geometry</code> equals
      *         the empty geometry.
      */
    /* CompleteClass */
    override def isEmpty(): Boolean = js.native
    
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
    /* CompleteClass */
    override def isEquivalentClass(other: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
    /**
      *
      * @return {boolean} true if this is a GeometryCollection.
      */
    /* CompleteClass */
    override def isGeometryCollection(): Boolean = js.native
    
    /**
      *
      * @return {boolean} true if this is a GeometryCollection but not subclass.
      */
    /* CompleteClass */
    override def isGeometryCollectionBase(): Boolean = js.native
    
    /* CompleteClass */
    override def isRectangle(): Boolean = js.native
    
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
    /* CompleteClass */
    override def isSimple(): Boolean = js.native
    
    /**
      * Tests the validity of this <code>Geometry</code>. Subclasses provide their
      * own definition of "valid".
      *
      * @return {boolean} <code>true</code> if this <code>Geometry</code> is
      *         valid.
      *
      * @see IsValidOp
      */
    /* CompleteClass */
    override def isValid(): Boolean = js.native
    
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
    /* CompleteClass */
    override def isWithinDistance(geom: typings.jsts.jsts.geom.Geometry, distance: Double): Boolean = js.native
    
    /**
      * Creates a new Geometry which is a normalized copy of this Geometry.
      *
      * @return a normalized copy of this geometry.
      * @see #normalize()
      */
    /* CompleteClass */
    override def norm(): typings.jsts.jsts.geom.Geometry = js.native
    
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
    /* CompleteClass */
    override def normalize(): Unit = js.native
    
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
    /* CompleteClass */
    override def overlaps(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def relate(g: typings.jsts.jsts.geom.Geometry, intersectionPattern: String): Boolean = js.native
    
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
    /* CompleteClass */
    override def relate2(g: typings.jsts.jsts.geom.Geometry): js.Any = js.native
    
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
    /* CompleteClass */
    override def symDifference(other: typings.jsts.jsts.geom.Geometry): typings.jsts.jsts.geom.Geometry = js.native
    
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
    /* CompleteClass */
    override def touches(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def union(other: typings.jsts.jsts.geom.Geometry): typings.jsts.jsts.geom.Geometry = js.native
    
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
    /* CompleteClass */
    override def within(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
  }
  
  @JSGlobal("jsts.geom.GeometryCollection")
  @js.native
  class GeometryCollection ()
    extends StObject
       with typings.jsts.jsts.geom.Geometry {
    def this(geometries: js.Array[typings.jsts.jsts.geom.Geometry]) = this()
    def this(
      geometries: js.Array[typings.jsts.jsts.geom.Geometry],
      factory: typings.jsts.jsts.geom.GeometryFactory
    ) = this()
    def this(geometries: Unit, factory: typings.jsts.jsts.geom.GeometryFactory) = this()
    
    /**
      * Performs an operation with or on this <code>Geometry</code> and its
      * subelement <code>Geometry</code>s (if any). Only GeometryCollections and
      * subclasses have subelement Geometry's.
      *
      * @param filter
      *          the filter to apply to this <code>Geometry</code> (and its
      *          children, if it is a <code>GeometryCollection</code>).
      */
    /* CompleteClass */
    @JSName("apply")
    override def apply(filter: js.Any): Unit = js.native
    
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
    /* CompleteClass */
    override def buffer(distance: Double, quadrantSegments: Double, endCapStyle: Double): typings.jsts.jsts.geom.Geometry = js.native
    
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
    /* CompleteClass */
    override def checkNotGeometryCollection(g: typings.jsts.jsts.geom.Geometry): Unit = js.native
    
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
    /* CompleteClass */
    override def compare(a: js.Array[js.Any], b: js.Array[js.Any]): Double = js.native
    
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
    /* CompleteClass */
    override def compareTo(o: typings.jsts.jsts.geom.Geometry): Double = js.native
    
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
    /* CompleteClass */
    override def compareToSameClass(o: typings.jsts.jsts.geom.Geometry): Double = js.native
    
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
    /* CompleteClass */
    override def computeEnvelopeInternal(): typings.jsts.jsts.geom.Envelope = js.native
    
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
    /* CompleteClass */
    override def contains(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def convexHull(): typings.jsts.jsts.geom.Geometry = js.native
    
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
    /* CompleteClass */
    override def coveredBy(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def covers(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def crosses(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def difference(other: typings.jsts.jsts.geom.Geometry): typings.jsts.jsts.geom.Geometry = js.native
    
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
    /* CompleteClass */
    override def disjoint(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def distance(g: typings.jsts.jsts.geom.Geometry): Double = js.native
    
    /**
      * The bounding box of this <code>Geometry</code>.
      */
    /* CompleteClass */
    var envelope: typings.jsts.jsts.geom.Envelope = js.native
    
    /**
      * @param {jsts.geom.Coordinate}
      *          a first Coordinate to compare.
      * @param {jsts.geom.Coordinate}
      *          b second Coordinate to compare.
      * @param {number}
      *          tolerance tolerance when comparing.
      * @return {boolean} true if equal.
      */
    /* CompleteClass */
    override def equal(a: typings.jsts.jsts.geom.Coordinate, b: typings.jsts.jsts.geom.Coordinate, tolerance: Double): Boolean = js.native
    
    /**
      * Tests whether this geometry is structurally and numerically equal to a given
      * <tt>Object</tt>. If the argument <tt>Object</tt> is not a
      * <tt>Geometry</tt>, the result is <tt>false</tt>. Otherwise, the result
      * is computed using {@link #equalsExact(Geometry)}.
      * <p>
      * This method is provided to fulfill the Java contract for value-based object
      * equality. In conjunction with {@link #hashCode()} it provides semantics which
      * are most useful for using <tt>Geometry</tt>s as keys and values in Java
      * collections.
      * <p>
      * Note that to produce the expected result the input geometries should be in
      * normal form. It is the caller's responsibility to perform this where required
      * (using {@link Geometry#norm() or {@link #normalize()} as appropriate).
      *
      * @param {Object}
      *          o the Object to compare.
      * @return {boolean} true if this geometry is exactly equal to the argument.
      *
      * @see #equalsExact(Geometry)
      * @see #hashCode()
      * @see #norm()
      * @see #normalize()
      */
    /* CompleteClass */
    override def equals(o: js.Object): Boolean = js.native
    
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
    /* CompleteClass */
    override def equalsExact(other: typings.jsts.jsts.geom.Geometry, tolerance: Double): Boolean = js.native
    
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
    /* CompleteClass */
    override def equalsNorm(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def equalsTopo(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
    /**
      * Returns the area of this <code>Geometry</code>. Areal Geometries have a
      * non-zero area. They override this function to compute the area. Others return
      * 0.0
      *
      * @return the area of the Geometry.
      */
    /* CompleteClass */
    override def getArea(): Double = js.native
    
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
    /* CompleteClass */
    override def getBoundary(): typings.jsts.jsts.geom.Geometry = js.native
    
    /**
      * Returns the dimension of this <code>Geometry</code>s inherent boundary.
      *
      * @return {number} the dimension of the boundary of the class implementing this
      *         interface, whether or not this object is the empty geometry. Returns
      *         <code>Dimension.FALSE</code> if the boundary is the empty geometry.
      */
    /* CompleteClass */
    override def getBoundaryDimension(): Double = js.native
    
    /**
      * Computes the centroid of this <code>Geometry</code>. The centroid is equal
      * to the centroid of the set of component Geometries of highest dimension
      * (since the lower-dimension geometries contribute zero "weight" to the
      * centroid)
      *
      * @return a {@link Point} which is the centroid of this Geometry.
      */
    /* CompleteClass */
    override def getCentroid(): typings.jsts.jsts.geom.Point = js.native
    
    /**
      * Returns a vertex of this <code>Geometry</code> (usually, but not
      * necessarily, the first one). The returned coordinate should not be assumed to
      * be an actual Coordinate object used in the internal representation.
      *
      * @return {Coordinate} a {@link Coordinate} which is a vertex of this
      *         <code>Geometry</code>. null if this Geometry is empty.
      */
    /* CompleteClass */
    override def getCoordinate(): typings.jsts.jsts.geom.Coordinate = js.native
    
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
    /* CompleteClass */
    override def getCoordinates(): js.Array[typings.jsts.jsts.geom.Coordinate] = js.native
    
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
    /* CompleteClass */
    override def getDimension(): Double = js.native
    
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
    /* CompleteClass */
    override def getEnvelope(): typings.jsts.jsts.geom.Geometry = js.native
    
    /**
      * Returns the minimum and maximum x and y values in this <code>Geometry</code>,
      * or a null <code>Envelope</code> if this <code>Geometry</code> is empty.
      *
      * @return {Envelope} this <code>Geometry</code>s bounding box; if the
      *         <code>Geometry</code> is empty, <code>Envelope#isNull</code> will
      *         return <code>true.</code>
      */
    /* CompleteClass */
    override def getEnvelopeInternal(): typings.jsts.jsts.geom.Envelope = js.native
    
    /**
      * Gets the factory which contains the context in which this geometry was created.
      *
      * @return {jsts.geom.GeometryFactory} the factory for this geometry.
      */
    /* CompleteClass */
    override def getFactory(): js.Any = js.native
    
    /**
      * Returns an element {@link Geometry} from a {@link GeometryCollection} (or
      * <code>this</code>, if the geometry is not a collection).
      *
      * @param {number} n The index of the geometry element.
      *
      * @return {Geometry} the n'th geometry contained in this geometry.
      */
    /* CompleteClass */
    override def getGeometryN(n: Double): typings.jsts.jsts.geom.Geometry = js.native
    
    /**
      * Returns the name of this object's <code>com.vivid.jts.geom</code> interface.
      *
      * @return {string} The name of this <code>Geometry</code>s most specific <code>jsts.geom</code> interface.
      */
    /* CompleteClass */
    override def getGeometryType(): String = js.native
    
    /**
      * Computes an interior point of this <code>Geometry</code>. An interior
      * point is guaranteed to lie in the interior of the Geometry, if it possible to
      * calculate such a point exactly. Otherwise, the point may lie on the boundary
      * of the geometry.
      *
      * @return {Point} a {@link Point} which is in the interior of this Geometry.
      */
    /* CompleteClass */
    override def getInteriorPoint(): typings.jsts.jsts.geom.Point = js.native
    
    /**
      * Returns the length of this <code>Geometry</code>. Linear geometries return
      * their length. Areal geometries return their perimeter. They override this
      * function to compute the area. Others return 0.0
      *
      * @return the length of the Geometry.
      */
    /* CompleteClass */
    override def getLength(): Double = js.native
    
    /**
      *Returns the number of {@link Geometry}s in a {@link GeometryCollection}
      * (or 1, if the geometry is not a collection).
      *
      * @return {number} the number of geometries contained in this geometry.
      */
    /* CompleteClass */
    override def getNumGeometries(): Double = js.native
    
    /**
      * Returns the count of this <code>Geometry</code>s vertices. The
      * <code>Geometry</code> s contained by composite <code>Geometry</code>s
      * must be Geometry's; that is, they must implement <code>getNumPoints</code>
      *
      * @return {number} the number of vertices in this <code>Geometry.</code>
      */
    /* CompleteClass */
    override def getNumPoints(): Double = js.native
    
    /**
      * Returns the <code>PrecisionModel</code> used by the <code>Geometry</code>.
      *
      * @return {PrecisionModel} the specification of the grid of allowable points, for this
      * <code>Geometry</code> and all other <code>Geometry</code>s.
      */
    /* CompleteClass */
    override def getPrecisionModel(): typings.jsts.jsts.geom.PrecisionModel = js.native
    
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
    /* CompleteClass */
    override def intersection(other: typings.jsts.jsts.geom.Geometry): typings.jsts.jsts.geom.Geometry = js.native
    
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
    /* CompleteClass */
    override def intersects(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
    /**
      * Returns whether or not the set of points in this <code>Geometry</code> is
      * empty.
      *
      * @return {boolean} <code>true</code> if this <code>Geometry</code> equals
      *         the empty geometry.
      */
    /* CompleteClass */
    override def isEmpty(): Boolean = js.native
    
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
    /* CompleteClass */
    override def isEquivalentClass(other: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
    /**
      *
      * @return {boolean} true if this is a GeometryCollection.
      */
    /* CompleteClass */
    override def isGeometryCollection(): Boolean = js.native
    
    /**
      *
      * @return {boolean} true if this is a GeometryCollection but not subclass.
      */
    /* CompleteClass */
    override def isGeometryCollectionBase(): Boolean = js.native
    
    /* CompleteClass */
    override def isRectangle(): Boolean = js.native
    
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
    /* CompleteClass */
    override def isSimple(): Boolean = js.native
    
    /**
      * Tests the validity of this <code>Geometry</code>. Subclasses provide their
      * own definition of "valid".
      *
      * @return {boolean} <code>true</code> if this <code>Geometry</code> is
      *         valid.
      *
      * @see IsValidOp
      */
    /* CompleteClass */
    override def isValid(): Boolean = js.native
    
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
    /* CompleteClass */
    override def isWithinDistance(geom: typings.jsts.jsts.geom.Geometry, distance: Double): Boolean = js.native
    
    /**
      * Creates a new Geometry which is a normalized copy of this Geometry.
      *
      * @return a normalized copy of this geometry.
      * @see #normalize()
      */
    /* CompleteClass */
    override def norm(): typings.jsts.jsts.geom.Geometry = js.native
    
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
    /* CompleteClass */
    override def normalize(): Unit = js.native
    
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
    /* CompleteClass */
    override def overlaps(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def relate(g: typings.jsts.jsts.geom.Geometry, intersectionPattern: String): Boolean = js.native
    
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
    /* CompleteClass */
    override def relate2(g: typings.jsts.jsts.geom.Geometry): js.Any = js.native
    
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
    /* CompleteClass */
    override def symDifference(other: typings.jsts.jsts.geom.Geometry): typings.jsts.jsts.geom.Geometry = js.native
    
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
    /* CompleteClass */
    override def touches(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def union(other: typings.jsts.jsts.geom.Geometry): typings.jsts.jsts.geom.Geometry = js.native
    
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
    /* CompleteClass */
    override def within(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
  }
  
  @JSGlobal("jsts.geom.GeometryFactory")
  @js.native
  /**
    * Constructs a GeometryFactory that generates Geometries having a floating PrecisionModel and a spatial-reference ID of 0.
    */
  class GeometryFactory ()
    extends StObject
       with typings.jsts.jsts.geom.GeometryFactory {
    def this(precisionModel: typings.jsts.jsts.geom.PrecisionModel) = this()
    
    /**
      * Creates a LineString using the given Coordinates; a null or empty array will
      * create an empty LineString. Consecutive points must not be equal.
      *
      * @param {Coordinate[]}
      *          coordinates an array without null elements, or an empty array, or
      *          null.
      * @return {LineString} A new LineString.
      */
    /* CompleteClass */
    override def createLineString(coordinates: js.Array[typings.jsts.jsts.geom.Coordinate]): typings.jsts.jsts.geom.LineString = js.native
    
    /**
      * Creates a LinearRing using the given Coordinates; a null or empty array
      * will create an empty LinearRing. Consecutive points must not be equal.
      *
      * @param {Coordinate[]}
      *          coordinates an array without null elements, or an empty array,
      * or null.
      * @return {LineString} A new LinearRing.
      */
    /* CompleteClass */
    override def createLinearRing(coordinates: js.Array[typings.jsts.jsts.geom.Coordinate]): typings.jsts.jsts.geom.LinearRing = js.native
    
    /**
      * Creates a Point using the given Coordinate; a null Coordinate will create an
      * empty Geometry.
      *
      * @param {Coordinate}
      *          coordinate Coordinate to base this Point on.
      * @return {Point} A new Point.
      */
    /* CompleteClass */
    override def createPoint(coordinates: typings.jsts.jsts.geom.Coordinate): typings.jsts.jsts.geom.Point = js.native
    
    /**
      * Creates a Polygon using the given LinearRing.
      *
      * @param {LinearRing} A LinearRing constructed by coordinates.
      * @return {Polygon} A new Polygon.
      */
    /* CompleteClass */
    override def createPolygon(shell: typings.jsts.jsts.geom.LinearRing, holes: js.Array[typings.jsts.jsts.geom.LinearRing]): typings.jsts.jsts.geom.Polygon = js.native
  }
  
  @JSGlobal("jsts.geom.IntersectionMatrix")
  @js.native
  class IntersectionMatrix ()
    extends StObject
       with typings.jsts.jsts.geom.IntersectionMatrix {
    def this(elements: js.Array[String]) = this()
    def this(other: typings.jsts.jsts.geom.IntersectionMatrix) = this()
  }
  /* static members */
  object IntersectionMatrix {
    
    @JSGlobal("jsts.geom.IntersectionMatrix")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def isTrue(actualDimensionValue: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTrue")(actualDimensionValue.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def matches(actualDimensionSymbols: String, requiredDimensionSymbols: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matches")(actualDimensionSymbols.asInstanceOf[js.Any], requiredDimensionSymbols.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def matches(actualDimensionValue: Double, requiredDimensionSymbol: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matches")(actualDimensionValue.asInstanceOf[js.Any], requiredDimensionSymbol.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  @JSGlobal("jsts.geom.LineSegment")
  @js.native
  class LineSegment protected ()
    extends StObject
       with typings.jsts.jsts.geom.LineSegment {
    def this(p0: typings.jsts.jsts.geom.Coordinate, p1: typings.jsts.jsts.geom.Coordinate) = this()
    
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
    
    /* CompleteClass */
    var p0: typings.jsts.jsts.geom.Coordinate = js.native
    
    /* CompleteClass */
    var p1: typings.jsts.jsts.geom.Coordinate = js.native
    
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
  object LineSegment {
    
    @JSGlobal("jsts.geom.LineSegment")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Computes the midpoint of a segment
      *
      * @param {jsts.geom.Coordinate} p0
      * @param {jsts.geom.Coordinate} p1
      * @return {jsts.geom.Coordinate} the midpoint of the segment
      */
    @scala.inline
    def midPoint(p0: typings.jsts.jsts.geom.Coordinate, p1: typings.jsts.jsts.geom.Coordinate): typings.jsts.jsts.geom.Coordinate = (^.asInstanceOf[js.Dynamic].applyDynamic("midPoint")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any])).asInstanceOf[typings.jsts.jsts.geom.Coordinate]
  }
  
  @JSGlobal("jsts.geom.LineString")
  @js.native
  class LineString protected ()
    extends StObject
       with typings.jsts.jsts.geom.LineString {
    /**
      * @constructor
      */
    def this(points: js.Array[typings.jsts.jsts.geom.Coordinate]) = this()
    def this(points: js.Array[typings.jsts.jsts.geom.Coordinate], factory: js.Any) = this()
    
    /**
      * Performs an operation with or on this <code>Geometry</code> and its
      * subelement <code>Geometry</code>s (if any). Only GeometryCollections and
      * subclasses have subelement Geometry's.
      *
      * @param filter
      *          the filter to apply to this <code>Geometry</code> (and its
      *          children, if it is a <code>GeometryCollection</code>).
      */
    /* CompleteClass */
    @JSName("apply")
    override def apply(filter: js.Any): Unit = js.native
    
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
    /* CompleteClass */
    override def buffer(distance: Double, quadrantSegments: Double, endCapStyle: Double): typings.jsts.jsts.geom.Geometry = js.native
    
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
    /* CompleteClass */
    override def checkNotGeometryCollection(g: typings.jsts.jsts.geom.Geometry): Unit = js.native
    
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
    /* CompleteClass */
    override def compare(a: js.Array[js.Any], b: js.Array[js.Any]): Double = js.native
    
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
    /* CompleteClass */
    override def compareTo(o: typings.jsts.jsts.geom.Geometry): Double = js.native
    
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
    /* CompleteClass */
    override def compareToSameClass(o: typings.jsts.jsts.geom.Geometry): Double = js.native
    
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
    /* CompleteClass */
    override def computeEnvelopeInternal(): typings.jsts.jsts.geom.Envelope = js.native
    
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
    /* CompleteClass */
    override def contains(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def convexHull(): typings.jsts.jsts.geom.Geometry = js.native
    
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
    /* CompleteClass */
    override def coveredBy(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def covers(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def crosses(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def difference(other: typings.jsts.jsts.geom.Geometry): typings.jsts.jsts.geom.Geometry = js.native
    
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
    /* CompleteClass */
    override def disjoint(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def distance(g: typings.jsts.jsts.geom.Geometry): Double = js.native
    
    /**
      * The bounding box of this <code>Geometry</code>.
      */
    /* CompleteClass */
    var envelope: typings.jsts.jsts.geom.Envelope = js.native
    
    /**
      * @param {jsts.geom.Coordinate}
      *          a first Coordinate to compare.
      * @param {jsts.geom.Coordinate}
      *          b second Coordinate to compare.
      * @param {number}
      *          tolerance tolerance when comparing.
      * @return {boolean} true if equal.
      */
    /* CompleteClass */
    override def equal(a: typings.jsts.jsts.geom.Coordinate, b: typings.jsts.jsts.geom.Coordinate, tolerance: Double): Boolean = js.native
    
    /**
      * Tests whether this geometry is structurally and numerically equal to a given
      * <tt>Object</tt>. If the argument <tt>Object</tt> is not a
      * <tt>Geometry</tt>, the result is <tt>false</tt>. Otherwise, the result
      * is computed using {@link #equalsExact(Geometry)}.
      * <p>
      * This method is provided to fulfill the Java contract for value-based object
      * equality. In conjunction with {@link #hashCode()} it provides semantics which
      * are most useful for using <tt>Geometry</tt>s as keys and values in Java
      * collections.
      * <p>
      * Note that to produce the expected result the input geometries should be in
      * normal form. It is the caller's responsibility to perform this where required
      * (using {@link Geometry#norm() or {@link #normalize()} as appropriate).
      *
      * @param {Object}
      *          o the Object to compare.
      * @return {boolean} true if this geometry is exactly equal to the argument.
      *
      * @see #equalsExact(Geometry)
      * @see #hashCode()
      * @see #norm()
      * @see #normalize()
      */
    /* CompleteClass */
    override def equals(o: js.Object): Boolean = js.native
    
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
    /* CompleteClass */
    override def equalsExact(other: typings.jsts.jsts.geom.Geometry, tolerance: Double): Boolean = js.native
    
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
    /* CompleteClass */
    override def equalsNorm(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def equalsTopo(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
    /**
      * Returns the area of this <code>Geometry</code>. Areal Geometries have a
      * non-zero area. They override this function to compute the area. Others return
      * 0.0
      *
      * @return the area of the Geometry.
      */
    /* CompleteClass */
    override def getArea(): Double = js.native
    
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
    /* CompleteClass */
    override def getBoundary(): typings.jsts.jsts.geom.Geometry = js.native
    
    /**
      * Returns the dimension of this <code>Geometry</code>s inherent boundary.
      *
      * @return {number} the dimension of the boundary of the class implementing this
      *         interface, whether or not this object is the empty geometry. Returns
      *         <code>Dimension.FALSE</code> if the boundary is the empty geometry.
      */
    /* CompleteClass */
    override def getBoundaryDimension(): Double = js.native
    
    /**
      * Computes the centroid of this <code>Geometry</code>. The centroid is equal
      * to the centroid of the set of component Geometries of highest dimension
      * (since the lower-dimension geometries contribute zero "weight" to the
      * centroid)
      *
      * @return a {@link Point} which is the centroid of this Geometry.
      */
    /* CompleteClass */
    override def getCentroid(): typings.jsts.jsts.geom.Point = js.native
    
    /**
      * Returns a vertex of this <code>Geometry</code> (usually, but not
      * necessarily, the first one). The returned coordinate should not be assumed to
      * be an actual Coordinate object used in the internal representation.
      *
      * @return {Coordinate} a {@link Coordinate} which is a vertex of this
      *         <code>Geometry</code>. null if this Geometry is empty.
      */
    /* CompleteClass */
    override def getCoordinate(): typings.jsts.jsts.geom.Coordinate = js.native
    
    /**
      * @return {jsts.geom.Coordinate} The n'th coordinate of this
      *         jsts.geom.LineString.
      * @param {int}
      *          n index.
      */
    /* CompleteClass */
    override def getCoordinateN(n: Double): typings.jsts.jsts.geom.Coordinate = js.native
    
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
    /* CompleteClass */
    override def getCoordinates(): js.Array[typings.jsts.jsts.geom.Coordinate] = js.native
    
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
    /* CompleteClass */
    override def getDimension(): Double = js.native
    
    /**
      * @return {jsts.geom.Point} The last point of this
      *         jsts.geom.LineString.
      */
    /* CompleteClass */
    override def getEndPoint(): typings.jsts.jsts.geom.Point = js.native
    
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
    /* CompleteClass */
    override def getEnvelope(): typings.jsts.jsts.geom.Geometry = js.native
    
    /**
      * Returns the minimum and maximum x and y values in this <code>Geometry</code>,
      * or a null <code>Envelope</code> if this <code>Geometry</code> is empty.
      *
      * @return {Envelope} this <code>Geometry</code>s bounding box; if the
      *         <code>Geometry</code> is empty, <code>Envelope#isNull</code> will
      *         return <code>true.</code>
      */
    /* CompleteClass */
    override def getEnvelopeInternal(): typings.jsts.jsts.geom.Envelope = js.native
    
    /**
      * Gets the factory which contains the context in which this geometry was created.
      *
      * @return {jsts.geom.GeometryFactory} the factory for this geometry.
      */
    /* CompleteClass */
    override def getFactory(): js.Any = js.native
    
    /**
      * Returns an element {@link Geometry} from a {@link GeometryCollection} (or
      * <code>this</code>, if the geometry is not a collection).
      *
      * @param {number} n The index of the geometry element.
      *
      * @return {Geometry} the n'th geometry contained in this geometry.
      */
    /* CompleteClass */
    override def getGeometryN(n: Double): typings.jsts.jsts.geom.Geometry = js.native
    
    /**
      * Returns the name of this object's <code>com.vivid.jts.geom</code> interface.
      *
      * @return {string} The name of this <code>Geometry</code>s most specific <code>jsts.geom</code> interface.
      */
    /* CompleteClass */
    override def getGeometryType(): String = js.native
    
    /**
      * Computes an interior point of this <code>Geometry</code>. An interior
      * point is guaranteed to lie in the interior of the Geometry, if it possible to
      * calculate such a point exactly. Otherwise, the point may lie on the boundary
      * of the geometry.
      *
      * @return {Point} a {@link Point} which is in the interior of this Geometry.
      */
    /* CompleteClass */
    override def getInteriorPoint(): typings.jsts.jsts.geom.Point = js.native
    
    /**
      * Returns the length of this <code>Geometry</code>. Linear geometries return
      * their length. Areal geometries return their perimeter. They override this
      * function to compute the area. Others return 0.0
      *
      * @return the length of the Geometry.
      */
    /* CompleteClass */
    override def getLength(): Double = js.native
    
    /**
      *Returns the number of {@link Geometry}s in a {@link GeometryCollection}
      * (or 1, if the geometry is not a collection).
      *
      * @return {number} the number of geometries contained in this geometry.
      */
    /* CompleteClass */
    override def getNumGeometries(): Double = js.native
    
    /**
      * Returns the count of this <code>Geometry</code>s vertices. The
      * <code>Geometry</code> s contained by composite <code>Geometry</code>s
      * must be Geometry's; that is, they must implement <code>getNumPoints</code>
      *
      * @return {number} the number of vertices in this <code>Geometry.</code>
      */
    /* CompleteClass */
    override def getNumPoints(): Double = js.native
    
    /**
      * @return {jsts.geom.Point} The n'th point of this
      *         jsts.geom.LineString.
      * @param {int}
      *          n index.
      */
    /* CompleteClass */
    override def getPointN(n: Double): typings.jsts.jsts.geom.Point = js.native
    
    /**
      * Returns the <code>PrecisionModel</code> used by the <code>Geometry</code>.
      *
      * @return {PrecisionModel} the specification of the grid of allowable points, for this
      * <code>Geometry</code> and all other <code>Geometry</code>s.
      */
    /* CompleteClass */
    override def getPrecisionModel(): typings.jsts.jsts.geom.PrecisionModel = js.native
    
    /**
      * @return {jsts.geom.Point} The first point of this
      *         jsts.geom.LineString.
      */
    /* CompleteClass */
    override def getStartPoint(): typings.jsts.jsts.geom.Point = js.native
    
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
    /* CompleteClass */
    override def intersection(other: typings.jsts.jsts.geom.Geometry): typings.jsts.jsts.geom.Geometry = js.native
    
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
    /* CompleteClass */
    override def intersects(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
    /**
      * @return {Boolean} true if LineString is Closed.
      */
    /* CompleteClass */
    override def isClosed(): Boolean = js.native
    
    /**
      * Returns whether or not the set of points in this <code>Geometry</code> is
      * empty.
      *
      * @return {boolean} <code>true</code> if this <code>Geometry</code> equals
      *         the empty geometry.
      */
    /* CompleteClass */
    override def isEmpty(): Boolean = js.native
    
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
    /* CompleteClass */
    override def isEquivalentClass(other: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
    /**
      *
      * @return {boolean} true if this is a GeometryCollection.
      */
    /* CompleteClass */
    override def isGeometryCollection(): Boolean = js.native
    
    /**
      *
      * @return {boolean} true if this is a GeometryCollection but not subclass.
      */
    /* CompleteClass */
    override def isGeometryCollectionBase(): Boolean = js.native
    
    /* CompleteClass */
    override def isRectangle(): Boolean = js.native
    
    /**
      * @return {Boolean} true if LineString is a Ring.
      */
    /* CompleteClass */
    override def isRing(): Boolean = js.native
    
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
    /* CompleteClass */
    override def isSimple(): Boolean = js.native
    
    /**
      * Tests the validity of this <code>Geometry</code>. Subclasses provide their
      * own definition of "valid".
      *
      * @return {boolean} <code>true</code> if this <code>Geometry</code> is
      *         valid.
      *
      * @see IsValidOp
      */
    /* CompleteClass */
    override def isValid(): Boolean = js.native
    
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
    /* CompleteClass */
    override def isWithinDistance(geom: typings.jsts.jsts.geom.Geometry, distance: Double): Boolean = js.native
    
    /**
      * Creates a new Geometry which is a normalized copy of this Geometry.
      *
      * @return a normalized copy of this geometry.
      * @see #normalize()
      */
    /* CompleteClass */
    override def norm(): typings.jsts.jsts.geom.Geometry = js.native
    
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
    /* CompleteClass */
    override def normalize(): Unit = js.native
    
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
    /* CompleteClass */
    override def overlaps(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def relate(g: typings.jsts.jsts.geom.Geometry, intersectionPattern: String): Boolean = js.native
    
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
    /* CompleteClass */
    override def relate2(g: typings.jsts.jsts.geom.Geometry): js.Any = js.native
    
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
    /* CompleteClass */
    override def symDifference(other: typings.jsts.jsts.geom.Geometry): typings.jsts.jsts.geom.Geometry = js.native
    
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
    /* CompleteClass */
    override def touches(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def union(other: typings.jsts.jsts.geom.Geometry): typings.jsts.jsts.geom.Geometry = js.native
    
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
    /* CompleteClass */
    override def within(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
  }
  
  @JSGlobal("jsts.geom.LinearRing")
  @js.native
  class LinearRing ()
    extends StObject
       with typings.jsts.jsts.geom.LineString {
    
    /**
      * Performs an operation with or on this <code>Geometry</code> and its
      * subelement <code>Geometry</code>s (if any). Only GeometryCollections and
      * subclasses have subelement Geometry's.
      *
      * @param filter
      *          the filter to apply to this <code>Geometry</code> (and its
      *          children, if it is a <code>GeometryCollection</code>).
      */
    /* CompleteClass */
    @JSName("apply")
    override def apply(filter: js.Any): Unit = js.native
    
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
    /* CompleteClass */
    override def buffer(distance: Double, quadrantSegments: Double, endCapStyle: Double): typings.jsts.jsts.geom.Geometry = js.native
    
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
    /* CompleteClass */
    override def checkNotGeometryCollection(g: typings.jsts.jsts.geom.Geometry): Unit = js.native
    
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
    /* CompleteClass */
    override def compare(a: js.Array[js.Any], b: js.Array[js.Any]): Double = js.native
    
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
    /* CompleteClass */
    override def compareTo(o: typings.jsts.jsts.geom.Geometry): Double = js.native
    
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
    /* CompleteClass */
    override def compareToSameClass(o: typings.jsts.jsts.geom.Geometry): Double = js.native
    
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
    /* CompleteClass */
    override def computeEnvelopeInternal(): typings.jsts.jsts.geom.Envelope = js.native
    
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
    /* CompleteClass */
    override def contains(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def convexHull(): typings.jsts.jsts.geom.Geometry = js.native
    
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
    /* CompleteClass */
    override def coveredBy(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def covers(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def crosses(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def difference(other: typings.jsts.jsts.geom.Geometry): typings.jsts.jsts.geom.Geometry = js.native
    
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
    /* CompleteClass */
    override def disjoint(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def distance(g: typings.jsts.jsts.geom.Geometry): Double = js.native
    
    /**
      * The bounding box of this <code>Geometry</code>.
      */
    /* CompleteClass */
    var envelope: typings.jsts.jsts.geom.Envelope = js.native
    
    /**
      * @param {jsts.geom.Coordinate}
      *          a first Coordinate to compare.
      * @param {jsts.geom.Coordinate}
      *          b second Coordinate to compare.
      * @param {number}
      *          tolerance tolerance when comparing.
      * @return {boolean} true if equal.
      */
    /* CompleteClass */
    override def equal(a: typings.jsts.jsts.geom.Coordinate, b: typings.jsts.jsts.geom.Coordinate, tolerance: Double): Boolean = js.native
    
    /**
      * Tests whether this geometry is structurally and numerically equal to a given
      * <tt>Object</tt>. If the argument <tt>Object</tt> is not a
      * <tt>Geometry</tt>, the result is <tt>false</tt>. Otherwise, the result
      * is computed using {@link #equalsExact(Geometry)}.
      * <p>
      * This method is provided to fulfill the Java contract for value-based object
      * equality. In conjunction with {@link #hashCode()} it provides semantics which
      * are most useful for using <tt>Geometry</tt>s as keys and values in Java
      * collections.
      * <p>
      * Note that to produce the expected result the input geometries should be in
      * normal form. It is the caller's responsibility to perform this where required
      * (using {@link Geometry#norm() or {@link #normalize()} as appropriate).
      *
      * @param {Object}
      *          o the Object to compare.
      * @return {boolean} true if this geometry is exactly equal to the argument.
      *
      * @see #equalsExact(Geometry)
      * @see #hashCode()
      * @see #norm()
      * @see #normalize()
      */
    /* CompleteClass */
    override def equals(o: js.Object): Boolean = js.native
    
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
    /* CompleteClass */
    override def equalsExact(other: typings.jsts.jsts.geom.Geometry, tolerance: Double): Boolean = js.native
    
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
    /* CompleteClass */
    override def equalsNorm(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def equalsTopo(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
    /**
      * Returns the area of this <code>Geometry</code>. Areal Geometries have a
      * non-zero area. They override this function to compute the area. Others return
      * 0.0
      *
      * @return the area of the Geometry.
      */
    /* CompleteClass */
    override def getArea(): Double = js.native
    
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
    /* CompleteClass */
    override def getBoundary(): typings.jsts.jsts.geom.Geometry = js.native
    
    /**
      * Returns the dimension of this <code>Geometry</code>s inherent boundary.
      *
      * @return {number} the dimension of the boundary of the class implementing this
      *         interface, whether or not this object is the empty geometry. Returns
      *         <code>Dimension.FALSE</code> if the boundary is the empty geometry.
      */
    /* CompleteClass */
    override def getBoundaryDimension(): Double = js.native
    
    /**
      * Computes the centroid of this <code>Geometry</code>. The centroid is equal
      * to the centroid of the set of component Geometries of highest dimension
      * (since the lower-dimension geometries contribute zero "weight" to the
      * centroid)
      *
      * @return a {@link Point} which is the centroid of this Geometry.
      */
    /* CompleteClass */
    override def getCentroid(): typings.jsts.jsts.geom.Point = js.native
    
    /**
      * Returns a vertex of this <code>Geometry</code> (usually, but not
      * necessarily, the first one). The returned coordinate should not be assumed to
      * be an actual Coordinate object used in the internal representation.
      *
      * @return {Coordinate} a {@link Coordinate} which is a vertex of this
      *         <code>Geometry</code>. null if this Geometry is empty.
      */
    /* CompleteClass */
    override def getCoordinate(): typings.jsts.jsts.geom.Coordinate = js.native
    
    /**
      * @return {jsts.geom.Coordinate} The n'th coordinate of this
      *         jsts.geom.LineString.
      * @param {int}
      *          n index.
      */
    /* CompleteClass */
    override def getCoordinateN(n: Double): typings.jsts.jsts.geom.Coordinate = js.native
    
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
    /* CompleteClass */
    override def getCoordinates(): js.Array[typings.jsts.jsts.geom.Coordinate] = js.native
    
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
    /* CompleteClass */
    override def getDimension(): Double = js.native
    
    /**
      * @return {jsts.geom.Point} The last point of this
      *         jsts.geom.LineString.
      */
    /* CompleteClass */
    override def getEndPoint(): typings.jsts.jsts.geom.Point = js.native
    
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
    /* CompleteClass */
    override def getEnvelope(): typings.jsts.jsts.geom.Geometry = js.native
    
    /**
      * Returns the minimum and maximum x and y values in this <code>Geometry</code>,
      * or a null <code>Envelope</code> if this <code>Geometry</code> is empty.
      *
      * @return {Envelope} this <code>Geometry</code>s bounding box; if the
      *         <code>Geometry</code> is empty, <code>Envelope#isNull</code> will
      *         return <code>true.</code>
      */
    /* CompleteClass */
    override def getEnvelopeInternal(): typings.jsts.jsts.geom.Envelope = js.native
    
    /**
      * Gets the factory which contains the context in which this geometry was created.
      *
      * @return {jsts.geom.GeometryFactory} the factory for this geometry.
      */
    /* CompleteClass */
    override def getFactory(): js.Any = js.native
    
    /**
      * Returns an element {@link Geometry} from a {@link GeometryCollection} (or
      * <code>this</code>, if the geometry is not a collection).
      *
      * @param {number} n The index of the geometry element.
      *
      * @return {Geometry} the n'th geometry contained in this geometry.
      */
    /* CompleteClass */
    override def getGeometryN(n: Double): typings.jsts.jsts.geom.Geometry = js.native
    
    /**
      * Returns the name of this object's <code>com.vivid.jts.geom</code> interface.
      *
      * @return {string} The name of this <code>Geometry</code>s most specific <code>jsts.geom</code> interface.
      */
    /* CompleteClass */
    override def getGeometryType(): String = js.native
    
    /**
      * Computes an interior point of this <code>Geometry</code>. An interior
      * point is guaranteed to lie in the interior of the Geometry, if it possible to
      * calculate such a point exactly. Otherwise, the point may lie on the boundary
      * of the geometry.
      *
      * @return {Point} a {@link Point} which is in the interior of this Geometry.
      */
    /* CompleteClass */
    override def getInteriorPoint(): typings.jsts.jsts.geom.Point = js.native
    
    /**
      * Returns the length of this <code>Geometry</code>. Linear geometries return
      * their length. Areal geometries return their perimeter. They override this
      * function to compute the area. Others return 0.0
      *
      * @return the length of the Geometry.
      */
    /* CompleteClass */
    override def getLength(): Double = js.native
    
    /**
      *Returns the number of {@link Geometry}s in a {@link GeometryCollection}
      * (or 1, if the geometry is not a collection).
      *
      * @return {number} the number of geometries contained in this geometry.
      */
    /* CompleteClass */
    override def getNumGeometries(): Double = js.native
    
    /**
      * Returns the count of this <code>Geometry</code>s vertices. The
      * <code>Geometry</code> s contained by composite <code>Geometry</code>s
      * must be Geometry's; that is, they must implement <code>getNumPoints</code>
      *
      * @return {number} the number of vertices in this <code>Geometry.</code>
      */
    /* CompleteClass */
    override def getNumPoints(): Double = js.native
    
    /**
      * @return {jsts.geom.Point} The n'th point of this
      *         jsts.geom.LineString.
      * @param {int}
      *          n index.
      */
    /* CompleteClass */
    override def getPointN(n: Double): typings.jsts.jsts.geom.Point = js.native
    
    /**
      * Returns the <code>PrecisionModel</code> used by the <code>Geometry</code>.
      *
      * @return {PrecisionModel} the specification of the grid of allowable points, for this
      * <code>Geometry</code> and all other <code>Geometry</code>s.
      */
    /* CompleteClass */
    override def getPrecisionModel(): typings.jsts.jsts.geom.PrecisionModel = js.native
    
    /**
      * @return {jsts.geom.Point} The first point of this
      *         jsts.geom.LineString.
      */
    /* CompleteClass */
    override def getStartPoint(): typings.jsts.jsts.geom.Point = js.native
    
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
    /* CompleteClass */
    override def intersection(other: typings.jsts.jsts.geom.Geometry): typings.jsts.jsts.geom.Geometry = js.native
    
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
    /* CompleteClass */
    override def intersects(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
    /**
      * @return {Boolean} true if LineString is Closed.
      */
    /* CompleteClass */
    override def isClosed(): Boolean = js.native
    
    /**
      * Returns whether or not the set of points in this <code>Geometry</code> is
      * empty.
      *
      * @return {boolean} <code>true</code> if this <code>Geometry</code> equals
      *         the empty geometry.
      */
    /* CompleteClass */
    override def isEmpty(): Boolean = js.native
    
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
    /* CompleteClass */
    override def isEquivalentClass(other: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
    /**
      *
      * @return {boolean} true if this is a GeometryCollection.
      */
    /* CompleteClass */
    override def isGeometryCollection(): Boolean = js.native
    
    /**
      *
      * @return {boolean} true if this is a GeometryCollection but not subclass.
      */
    /* CompleteClass */
    override def isGeometryCollectionBase(): Boolean = js.native
    
    /* CompleteClass */
    override def isRectangle(): Boolean = js.native
    
    /**
      * @return {Boolean} true if LineString is a Ring.
      */
    /* CompleteClass */
    override def isRing(): Boolean = js.native
    
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
    /* CompleteClass */
    override def isSimple(): Boolean = js.native
    
    /**
      * Tests the validity of this <code>Geometry</code>. Subclasses provide their
      * own definition of "valid".
      *
      * @return {boolean} <code>true</code> if this <code>Geometry</code> is
      *         valid.
      *
      * @see IsValidOp
      */
    /* CompleteClass */
    override def isValid(): Boolean = js.native
    
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
    /* CompleteClass */
    override def isWithinDistance(geom: typings.jsts.jsts.geom.Geometry, distance: Double): Boolean = js.native
    
    /**
      * Creates a new Geometry which is a normalized copy of this Geometry.
      *
      * @return a normalized copy of this geometry.
      * @see #normalize()
      */
    /* CompleteClass */
    override def norm(): typings.jsts.jsts.geom.Geometry = js.native
    
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
    /* CompleteClass */
    override def normalize(): Unit = js.native
    
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
    /* CompleteClass */
    override def overlaps(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def relate(g: typings.jsts.jsts.geom.Geometry, intersectionPattern: String): Boolean = js.native
    
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
    /* CompleteClass */
    override def relate2(g: typings.jsts.jsts.geom.Geometry): js.Any = js.native
    
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
    /* CompleteClass */
    override def symDifference(other: typings.jsts.jsts.geom.Geometry): typings.jsts.jsts.geom.Geometry = js.native
    
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
    /* CompleteClass */
    override def touches(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def union(other: typings.jsts.jsts.geom.Geometry): typings.jsts.jsts.geom.Geometry = js.native
    
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
    /* CompleteClass */
    override def within(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
  }
  
  @JSGlobal("jsts.geom.Point")
  @js.native
  class Point protected ()
    extends StObject
       with typings.jsts.jsts.geom.Point {
    /**
      * @constructor
      */
    def this(coordinate: typings.jsts.jsts.geom.Coordinate) = this()
    def this(coordinate: typings.jsts.jsts.geom.Coordinate, factory: js.Any) = this()
    
    /**
      * Performs an operation with or on this <code>Geometry</code> and its
      * subelement <code>Geometry</code>s (if any). Only GeometryCollections and
      * subclasses have subelement Geometry's.
      *
      * @param filter
      *          the filter to apply to this <code>Geometry</code> (and its
      *          children, if it is a <code>GeometryCollection</code>).
      */
    /* CompleteClass */
    @JSName("apply")
    override def apply(filter: js.Any): Unit = js.native
    
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
    /* CompleteClass */
    override def buffer(distance: Double, quadrantSegments: Double, endCapStyle: Double): typings.jsts.jsts.geom.Geometry = js.native
    
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
    /* CompleteClass */
    override def checkNotGeometryCollection(g: typings.jsts.jsts.geom.Geometry): Unit = js.native
    
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
    /* CompleteClass */
    override def compare(a: js.Array[js.Any], b: js.Array[js.Any]): Double = js.native
    
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
    /* CompleteClass */
    override def compareTo(o: typings.jsts.jsts.geom.Geometry): Double = js.native
    
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
    /* CompleteClass */
    override def compareToSameClass(o: typings.jsts.jsts.geom.Geometry): Double = js.native
    
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
    /* CompleteClass */
    override def computeEnvelopeInternal(): typings.jsts.jsts.geom.Envelope = js.native
    
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
    /* CompleteClass */
    override def contains(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def convexHull(): typings.jsts.jsts.geom.Geometry = js.native
    
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
    /* CompleteClass */
    override def coveredBy(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def covers(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def crosses(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def difference(other: typings.jsts.jsts.geom.Geometry): typings.jsts.jsts.geom.Geometry = js.native
    
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
    /* CompleteClass */
    override def disjoint(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def distance(g: typings.jsts.jsts.geom.Geometry): Double = js.native
    
    /**
      * The bounding box of this <code>Geometry</code>.
      */
    /* CompleteClass */
    var envelope: typings.jsts.jsts.geom.Envelope = js.native
    
    /**
      * @param {jsts.geom.Coordinate}
      *          a first Coordinate to compare.
      * @param {jsts.geom.Coordinate}
      *          b second Coordinate to compare.
      * @param {number}
      *          tolerance tolerance when comparing.
      * @return {boolean} true if equal.
      */
    /* CompleteClass */
    override def equal(a: typings.jsts.jsts.geom.Coordinate, b: typings.jsts.jsts.geom.Coordinate, tolerance: Double): Boolean = js.native
    
    /**
      * Tests whether this geometry is structurally and numerically equal to a given
      * <tt>Object</tt>. If the argument <tt>Object</tt> is not a
      * <tt>Geometry</tt>, the result is <tt>false</tt>. Otherwise, the result
      * is computed using {@link #equalsExact(Geometry)}.
      * <p>
      * This method is provided to fulfill the Java contract for value-based object
      * equality. In conjunction with {@link #hashCode()} it provides semantics which
      * are most useful for using <tt>Geometry</tt>s as keys and values in Java
      * collections.
      * <p>
      * Note that to produce the expected result the input geometries should be in
      * normal form. It is the caller's responsibility to perform this where required
      * (using {@link Geometry#norm() or {@link #normalize()} as appropriate).
      *
      * @param {Object}
      *          o the Object to compare.
      * @return {boolean} true if this geometry is exactly equal to the argument.
      *
      * @see #equalsExact(Geometry)
      * @see #hashCode()
      * @see #norm()
      * @see #normalize()
      */
    /* CompleteClass */
    override def equals(o: js.Object): Boolean = js.native
    
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
    /* CompleteClass */
    override def equalsExact(other: typings.jsts.jsts.geom.Geometry, tolerance: Double): Boolean = js.native
    
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
    /* CompleteClass */
    override def equalsNorm(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def equalsTopo(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
    /**
      * Returns the area of this <code>Geometry</code>. Areal Geometries have a
      * non-zero area. They override this function to compute the area. Others return
      * 0.0
      *
      * @return the area of the Geometry.
      */
    /* CompleteClass */
    override def getArea(): Double = js.native
    
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
    /* CompleteClass */
    override def getBoundary(): typings.jsts.jsts.geom.Geometry = js.native
    
    /**
      * Returns the dimension of this <code>Geometry</code>s inherent boundary.
      *
      * @return {number} the dimension of the boundary of the class implementing this
      *         interface, whether or not this object is the empty geometry. Returns
      *         <code>Dimension.FALSE</code> if the boundary is the empty geometry.
      */
    /* CompleteClass */
    override def getBoundaryDimension(): Double = js.native
    
    /**
      * Computes the centroid of this <code>Geometry</code>. The centroid is equal
      * to the centroid of the set of component Geometries of highest dimension
      * (since the lower-dimension geometries contribute zero "weight" to the
      * centroid)
      *
      * @return a {@link Point} which is the centroid of this Geometry.
      */
    /* CompleteClass */
    override def getCentroid(): typings.jsts.jsts.geom.Point = js.native
    
    /**
      * Returns a vertex of this <code>Geometry</code> (usually, but not
      * necessarily, the first one). The returned coordinate should not be assumed to
      * be an actual Coordinate object used in the internal representation.
      *
      * @return {Coordinate} a {@link Coordinate} which is a vertex of this
      *         <code>Geometry</code>. null if this Geometry is empty.
      */
    /* CompleteClass */
    override def getCoordinate(): typings.jsts.jsts.geom.Coordinate = js.native
    
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
    /* CompleteClass */
    override def getCoordinates(): js.Array[typings.jsts.jsts.geom.Coordinate] = js.native
    
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
    /* CompleteClass */
    override def getDimension(): Double = js.native
    
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
    /* CompleteClass */
    override def getEnvelope(): typings.jsts.jsts.geom.Geometry = js.native
    
    /**
      * Returns the minimum and maximum x and y values in this <code>Geometry</code>,
      * or a null <code>Envelope</code> if this <code>Geometry</code> is empty.
      *
      * @return {Envelope} this <code>Geometry</code>s bounding box; if the
      *         <code>Geometry</code> is empty, <code>Envelope#isNull</code> will
      *         return <code>true.</code>
      */
    /* CompleteClass */
    override def getEnvelopeInternal(): typings.jsts.jsts.geom.Envelope = js.native
    
    /**
      * Gets the factory which contains the context in which this geometry was created.
      *
      * @return {jsts.geom.GeometryFactory} the factory for this geometry.
      */
    /* CompleteClass */
    override def getFactory(): js.Any = js.native
    
    /**
      * Returns an element {@link Geometry} from a {@link GeometryCollection} (or
      * <code>this</code>, if the geometry is not a collection).
      *
      * @param {number} n The index of the geometry element.
      *
      * @return {Geometry} the n'th geometry contained in this geometry.
      */
    /* CompleteClass */
    override def getGeometryN(n: Double): typings.jsts.jsts.geom.Geometry = js.native
    
    /**
      * Returns the name of this object's <code>com.vivid.jts.geom</code> interface.
      *
      * @return {string} The name of this <code>Geometry</code>s most specific <code>jsts.geom</code> interface.
      */
    /* CompleteClass */
    override def getGeometryType(): String = js.native
    
    /**
      * Computes an interior point of this <code>Geometry</code>. An interior
      * point is guaranteed to lie in the interior of the Geometry, if it possible to
      * calculate such a point exactly. Otherwise, the point may lie on the boundary
      * of the geometry.
      *
      * @return {Point} a {@link Point} which is in the interior of this Geometry.
      */
    /* CompleteClass */
    override def getInteriorPoint(): typings.jsts.jsts.geom.Point = js.native
    
    /**
      * Returns the length of this <code>Geometry</code>. Linear geometries return
      * their length. Areal geometries return their perimeter. They override this
      * function to compute the area. Others return 0.0
      *
      * @return the length of the Geometry.
      */
    /* CompleteClass */
    override def getLength(): Double = js.native
    
    /**
      *Returns the number of {@link Geometry}s in a {@link GeometryCollection}
      * (or 1, if the geometry is not a collection).
      *
      * @return {number} the number of geometries contained in this geometry.
      */
    /* CompleteClass */
    override def getNumGeometries(): Double = js.native
    
    /**
      * Returns the count of this <code>Geometry</code>s vertices. The
      * <code>Geometry</code> s contained by composite <code>Geometry</code>s
      * must be Geometry's; that is, they must implement <code>getNumPoints</code>
      *
      * @return {number} the number of vertices in this <code>Geometry.</code>
      */
    /* CompleteClass */
    override def getNumPoints(): Double = js.native
    
    /**
      * Returns the <code>PrecisionModel</code> used by the <code>Geometry</code>.
      *
      * @return {PrecisionModel} the specification of the grid of allowable points, for this
      * <code>Geometry</code> and all other <code>Geometry</code>s.
      */
    /* CompleteClass */
    override def getPrecisionModel(): typings.jsts.jsts.geom.PrecisionModel = js.native
    
    /**
      * @return {number} x-axis value of this Point.
      */
    /* CompleteClass */
    override def getX(): Double = js.native
    
    /**
      * @return {number} y-axis value of this Point.
      */
    /* CompleteClass */
    override def getY(): Double = js.native
    
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
    /* CompleteClass */
    override def intersection(other: typings.jsts.jsts.geom.Geometry): typings.jsts.jsts.geom.Geometry = js.native
    
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
    /* CompleteClass */
    override def intersects(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
    /**
      * Returns whether or not the set of points in this <code>Geometry</code> is
      * empty.
      *
      * @return {boolean} <code>true</code> if this <code>Geometry</code> equals
      *         the empty geometry.
      */
    /* CompleteClass */
    override def isEmpty(): Boolean = js.native
    
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
    /* CompleteClass */
    override def isEquivalentClass(other: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
    /**
      *
      * @return {boolean} true if this is a GeometryCollection.
      */
    /* CompleteClass */
    override def isGeometryCollection(): Boolean = js.native
    
    /**
      *
      * @return {boolean} true if this is a GeometryCollection but not subclass.
      */
    /* CompleteClass */
    override def isGeometryCollectionBase(): Boolean = js.native
    
    /* CompleteClass */
    override def isRectangle(): Boolean = js.native
    
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
    /* CompleteClass */
    override def isSimple(): Boolean = js.native
    
    /**
      * Tests the validity of this <code>Geometry</code>. Subclasses provide their
      * own definition of "valid".
      *
      * @return {boolean} <code>true</code> if this <code>Geometry</code> is
      *         valid.
      *
      * @see IsValidOp
      */
    /* CompleteClass */
    override def isValid(): Boolean = js.native
    
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
    /* CompleteClass */
    override def isWithinDistance(geom: typings.jsts.jsts.geom.Geometry, distance: Double): Boolean = js.native
    
    /**
      * Creates a new Geometry which is a normalized copy of this Geometry.
      *
      * @return a normalized copy of this geometry.
      * @see #normalize()
      */
    /* CompleteClass */
    override def norm(): typings.jsts.jsts.geom.Geometry = js.native
    
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
    /* CompleteClass */
    override def normalize(): Unit = js.native
    
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
    /* CompleteClass */
    override def overlaps(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def relate(g: typings.jsts.jsts.geom.Geometry, intersectionPattern: String): Boolean = js.native
    
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
    /* CompleteClass */
    override def relate2(g: typings.jsts.jsts.geom.Geometry): js.Any = js.native
    
    /**
      * @return {Point} Reversed point is a cloned point.
      */
    /* CompleteClass */
    override def reverse(): typings.jsts.jsts.geom.Point = js.native
    
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
    /* CompleteClass */
    override def symDifference(other: typings.jsts.jsts.geom.Geometry): typings.jsts.jsts.geom.Geometry = js.native
    
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
    /* CompleteClass */
    override def touches(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def union(other: typings.jsts.jsts.geom.Geometry): typings.jsts.jsts.geom.Geometry = js.native
    
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
    /* CompleteClass */
    override def within(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
  }
  
  @JSGlobal("jsts.geom.Polygon")
  @js.native
  class Polygon protected ()
    extends StObject
       with typings.jsts.jsts.geom.Polygon {
    /**
      * @constructor
      */
    def this(shell: typings.jsts.jsts.geom.LinearRing) = this()
    def this(shell: typings.jsts.jsts.geom.LinearRing, holes: js.Array[typings.jsts.jsts.geom.LinearRing]) = this()
    def this(
      shell: typings.jsts.jsts.geom.LinearRing,
      holes: js.Array[typings.jsts.jsts.geom.LinearRing],
      factory: js.Any
    ) = this()
    def this(shell: typings.jsts.jsts.geom.LinearRing, holes: Unit, factory: js.Any) = this()
    
    /**
      * Performs an operation with or on this <code>Geometry</code> and its
      * subelement <code>Geometry</code>s (if any). Only GeometryCollections and
      * subclasses have subelement Geometry's.
      *
      * @param filter
      *          the filter to apply to this <code>Geometry</code> (and its
      *          children, if it is a <code>GeometryCollection</code>).
      */
    /* CompleteClass */
    @JSName("apply")
    override def apply(filter: js.Any): Unit = js.native
    
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
    /* CompleteClass */
    override def buffer(distance: Double, quadrantSegments: Double, endCapStyle: Double): typings.jsts.jsts.geom.Geometry = js.native
    
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
    /* CompleteClass */
    override def checkNotGeometryCollection(g: typings.jsts.jsts.geom.Geometry): Unit = js.native
    
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
    /* CompleteClass */
    override def compare(a: js.Array[js.Any], b: js.Array[js.Any]): Double = js.native
    
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
    /* CompleteClass */
    override def compareTo(o: typings.jsts.jsts.geom.Geometry): Double = js.native
    
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
    /* CompleteClass */
    override def compareToSameClass(o: typings.jsts.jsts.geom.Geometry): Double = js.native
    
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
    /* CompleteClass */
    override def computeEnvelopeInternal(): typings.jsts.jsts.geom.Envelope = js.native
    
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
    /* CompleteClass */
    override def contains(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def convexHull(): typings.jsts.jsts.geom.Geometry = js.native
    
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
    /* CompleteClass */
    override def coveredBy(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def covers(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def crosses(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def difference(other: typings.jsts.jsts.geom.Geometry): typings.jsts.jsts.geom.Geometry = js.native
    
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
    /* CompleteClass */
    override def disjoint(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def distance(g: typings.jsts.jsts.geom.Geometry): Double = js.native
    
    /**
      * The bounding box of this <code>Geometry</code>.
      */
    /* CompleteClass */
    var envelope: typings.jsts.jsts.geom.Envelope = js.native
    
    /**
      * @param {jsts.geom.Coordinate}
      *          a first Coordinate to compare.
      * @param {jsts.geom.Coordinate}
      *          b second Coordinate to compare.
      * @param {number}
      *          tolerance tolerance when comparing.
      * @return {boolean} true if equal.
      */
    /* CompleteClass */
    override def equal(a: typings.jsts.jsts.geom.Coordinate, b: typings.jsts.jsts.geom.Coordinate, tolerance: Double): Boolean = js.native
    
    /**
      * Tests whether this geometry is structurally and numerically equal to a given
      * <tt>Object</tt>. If the argument <tt>Object</tt> is not a
      * <tt>Geometry</tt>, the result is <tt>false</tt>. Otherwise, the result
      * is computed using {@link #equalsExact(Geometry)}.
      * <p>
      * This method is provided to fulfill the Java contract for value-based object
      * equality. In conjunction with {@link #hashCode()} it provides semantics which
      * are most useful for using <tt>Geometry</tt>s as keys and values in Java
      * collections.
      * <p>
      * Note that to produce the expected result the input geometries should be in
      * normal form. It is the caller's responsibility to perform this where required
      * (using {@link Geometry#norm() or {@link #normalize()} as appropriate).
      *
      * @param {Object}
      *          o the Object to compare.
      * @return {boolean} true if this geometry is exactly equal to the argument.
      *
      * @see #equalsExact(Geometry)
      * @see #hashCode()
      * @see #norm()
      * @see #normalize()
      */
    /* CompleteClass */
    override def equals(o: js.Object): Boolean = js.native
    
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
    /* CompleteClass */
    override def equalsExact(other: typings.jsts.jsts.geom.Geometry, tolerance: Double): Boolean = js.native
    
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
    /* CompleteClass */
    override def equalsNorm(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def equalsTopo(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
    /**
      * Returns the area of this <code>Geometry</code>. Areal Geometries have a
      * non-zero area. They override this function to compute the area. Others return
      * 0.0
      *
      * @return the area of the Geometry.
      */
    /* CompleteClass */
    override def getArea(): Double = js.native
    
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
    /* CompleteClass */
    override def getBoundary(): typings.jsts.jsts.geom.Geometry = js.native
    
    /**
      * Returns the dimension of this <code>Geometry</code>s inherent boundary.
      *
      * @return {number} the dimension of the boundary of the class implementing this
      *         interface, whether or not this object is the empty geometry. Returns
      *         <code>Dimension.FALSE</code> if the boundary is the empty geometry.
      */
    /* CompleteClass */
    override def getBoundaryDimension(): Double = js.native
    
    /**
      * Computes the centroid of this <code>Geometry</code>. The centroid is equal
      * to the centroid of the set of component Geometries of highest dimension
      * (since the lower-dimension geometries contribute zero "weight" to the
      * centroid)
      *
      * @return a {@link Point} which is the centroid of this Geometry.
      */
    /* CompleteClass */
    override def getCentroid(): typings.jsts.jsts.geom.Point = js.native
    
    /**
      * Returns a vertex of this <code>Geometry</code> (usually, but not
      * necessarily, the first one). The returned coordinate should not be assumed to
      * be an actual Coordinate object used in the internal representation.
      *
      * @return {Coordinate} a {@link Coordinate} which is a vertex of this
      *         <code>Geometry</code>. null if this Geometry is empty.
      */
    /* CompleteClass */
    override def getCoordinate(): typings.jsts.jsts.geom.Coordinate = js.native
    
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
    /* CompleteClass */
    override def getCoordinates(): js.Array[typings.jsts.jsts.geom.Coordinate] = js.native
    
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
    /* CompleteClass */
    override def getDimension(): Double = js.native
    
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
    /* CompleteClass */
    override def getEnvelope(): typings.jsts.jsts.geom.Geometry = js.native
    
    /**
      * Returns the minimum and maximum x and y values in this <code>Geometry</code>,
      * or a null <code>Envelope</code> if this <code>Geometry</code> is empty.
      *
      * @return {Envelope} this <code>Geometry</code>s bounding box; if the
      *         <code>Geometry</code> is empty, <code>Envelope#isNull</code> will
      *         return <code>true.</code>
      */
    /* CompleteClass */
    override def getEnvelopeInternal(): typings.jsts.jsts.geom.Envelope = js.native
    
    /**
      * Gets the exterior ring.
      *
      * @return {LinearRing} The exterior ring.
      */
    /* CompleteClass */
    override def getExteriorRing(): typings.jsts.jsts.geom.LinearRing = js.native
    
    /**
      * Gets the factory which contains the context in which this geometry was created.
      *
      * @return {jsts.geom.GeometryFactory} the factory for this geometry.
      */
    /* CompleteClass */
    override def getFactory(): js.Any = js.native
    
    /**
      * Returns an element {@link Geometry} from a {@link GeometryCollection} (or
      * <code>this</code>, if the geometry is not a collection).
      *
      * @param {number} n The index of the geometry element.
      *
      * @return {Geometry} the n'th geometry contained in this geometry.
      */
    /* CompleteClass */
    override def getGeometryN(n: Double): typings.jsts.jsts.geom.Geometry = js.native
    
    /**
      * Returns the name of this object's <code>com.vivid.jts.geom</code> interface.
      *
      * @return {string} The name of this <code>Geometry</code>s most specific <code>jsts.geom</code> interface.
      */
    /* CompleteClass */
    override def getGeometryType(): String = js.native
    
    /**
      * Computes an interior point of this <code>Geometry</code>. An interior
      * point is guaranteed to lie in the interior of the Geometry, if it possible to
      * calculate such a point exactly. Otherwise, the point may lie on the boundary
      * of the geometry.
      *
      * @return {Point} a {@link Point} which is in the interior of this Geometry.
      */
    /* CompleteClass */
    override def getInteriorPoint(): typings.jsts.jsts.geom.Point = js.native
    
    /**
      * Gets the interior ring at the specified index.
      *
      * @param {number} n The interior ring index.
      *
      * @returns {LinearRing} The interior ring at the specified index.
      */
    /* CompleteClass */
    override def getInteriorRingN(n: Double): typings.jsts.jsts.geom.LinearRing = js.native
    
    /**
      * Returns the length of this <code>Geometry</code>. Linear geometries return
      * their length. Areal geometries return their perimeter. They override this
      * function to compute the area. Others return 0.0
      *
      * @return the length of the Geometry.
      */
    /* CompleteClass */
    override def getLength(): Double = js.native
    
    /**
      *Returns the number of {@link Geometry}s in a {@link GeometryCollection}
      * (or 1, if the geometry is not a collection).
      *
      * @return {number} the number of geometries contained in this geometry.
      */
    /* CompleteClass */
    override def getNumGeometries(): Double = js.native
    
    /**
      * Gets the number of interior rings.
      *
      * @return {number} The number of interior rings.
      */
    /* CompleteClass */
    override def getNumInteriorRing(): Double = js.native
    
    /**
      * Returns the count of this <code>Geometry</code>s vertices. The
      * <code>Geometry</code> s contained by composite <code>Geometry</code>s
      * must be Geometry's; that is, they must implement <code>getNumPoints</code>
      *
      * @return {number} the number of vertices in this <code>Geometry.</code>
      */
    /* CompleteClass */
    override def getNumPoints(): Double = js.native
    
    /**
      * Returns the <code>PrecisionModel</code> used by the <code>Geometry</code>.
      *
      * @return {PrecisionModel} the specification of the grid of allowable points, for this
      * <code>Geometry</code> and all other <code>Geometry</code>s.
      */
    /* CompleteClass */
    override def getPrecisionModel(): typings.jsts.jsts.geom.PrecisionModel = js.native
    
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
    /* CompleteClass */
    override def intersection(other: typings.jsts.jsts.geom.Geometry): typings.jsts.jsts.geom.Geometry = js.native
    
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
    /* CompleteClass */
    override def intersects(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
    /**
      * Returns whether or not the set of points in this <code>Geometry</code> is
      * empty.
      *
      * @return {boolean} <code>true</code> if this <code>Geometry</code> equals
      *         the empty geometry.
      */
    /* CompleteClass */
    override def isEmpty(): Boolean = js.native
    
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
    /* CompleteClass */
    override def isEquivalentClass(other: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
    /**
      *
      * @return {boolean} true if this is a GeometryCollection.
      */
    /* CompleteClass */
    override def isGeometryCollection(): Boolean = js.native
    
    /**
      *
      * @return {boolean} true if this is a GeometryCollection but not subclass.
      */
    /* CompleteClass */
    override def isGeometryCollectionBase(): Boolean = js.native
    
    /* CompleteClass */
    override def isRectangle(): Boolean = js.native
    
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
    /* CompleteClass */
    override def isSimple(): Boolean = js.native
    
    /**
      * Tests the validity of this <code>Geometry</code>. Subclasses provide their
      * own definition of "valid".
      *
      * @return {boolean} <code>true</code> if this <code>Geometry</code> is
      *         valid.
      *
      * @see IsValidOp
      */
    /* CompleteClass */
    override def isValid(): Boolean = js.native
    
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
    /* CompleteClass */
    override def isWithinDistance(geom: typings.jsts.jsts.geom.Geometry, distance: Double): Boolean = js.native
    
    /**
      * Creates a new Geometry which is a normalized copy of this Geometry.
      *
      * @return a normalized copy of this geometry.
      * @see #normalize()
      */
    /* CompleteClass */
    override def norm(): typings.jsts.jsts.geom.Geometry = js.native
    
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
    /* CompleteClass */
    override def normalize(): Unit = js.native
    
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
    /* CompleteClass */
    override def overlaps(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def relate(g: typings.jsts.jsts.geom.Geometry, intersectionPattern: String): Boolean = js.native
    
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
    /* CompleteClass */
    override def relate2(g: typings.jsts.jsts.geom.Geometry): js.Any = js.native
    
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
    /* CompleteClass */
    override def symDifference(other: typings.jsts.jsts.geom.Geometry): typings.jsts.jsts.geom.Geometry = js.native
    
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
    /* CompleteClass */
    override def touches(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
    
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
    /* CompleteClass */
    override def union(other: typings.jsts.jsts.geom.Geometry): typings.jsts.jsts.geom.Geometry = js.native
    
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
    /* CompleteClass */
    override def within(g: typings.jsts.jsts.geom.Geometry): Boolean = js.native
  }
  
  @JSGlobal("jsts.geom.PrecisionModel")
  @js.native
  /**
    * 
    * @param modelType
    */
  class PrecisionModel ()
    extends StObject
       with typings.jsts.jsts.geom.PrecisionModel {
    def this(modelType: String) = this()
    def this(modelType: Double) = this()
  }
  /* static members */
  object PrecisionModel {
    
    @JSGlobal("jsts.geom.PrecisionModel")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("jsts.geom.PrecisionModel.FIXED")
    @js.native
    def FIXED: String = js.native
    @scala.inline
    def FIXED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FIXED")(x.asInstanceOf[js.Any])
    
    @JSGlobal("jsts.geom.PrecisionModel.FLOATING")
    @js.native
    def FLOATING: String = js.native
    @scala.inline
    def FLOATING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLOATING")(x.asInstanceOf[js.Any])
    
    @JSGlobal("jsts.geom.PrecisionModel.FLOATING_SINGLE")
    @js.native
    def FLOATING_SINGLE: String = js.native
    @scala.inline
    def FLOATING_SINGLE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLOATING_SINGLE")(x.asInstanceOf[js.Any])
  }
  
  object util {
    
    @JSGlobal("jsts.geom.util.AffineTransformation")
    @js.native
    class AffineTransformation ()
      extends StObject
         with typings.jsts.jsts.geom.util.AffineTransformation {
      def this(trans: typings.jsts.jsts.geom.util.AffineTransformation) = this()
      def this(m00: Double, m01: Double, m02: Double, m10: Double, m11: Double, m12: Double) = this()
      def this(
        src0: typings.jsts.jsts.geom.Coordinate,
        src1: typings.jsts.jsts.geom.Coordinate,
        src2: typings.jsts.jsts.geom.Coordinate,
        dest0: typings.jsts.jsts.geom.Coordinate,
        dest1: typings.jsts.jsts.geom.Coordinate,
        dest2: typings.jsts.jsts.geom.Coordinate
      ) = this()
    }
    /* static members */
    object AffineTransformation {
      
      @JSGlobal("jsts.geom.util.AffineTransformation")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def reflectionInstance(x0: Double, y0: Double): typings.jsts.jsts.geom.util.AffineTransformation = (^.asInstanceOf[js.Dynamic].applyDynamic("reflectionInstance")(x0.asInstanceOf[js.Any], y0.asInstanceOf[js.Any])).asInstanceOf[typings.jsts.jsts.geom.util.AffineTransformation]
      @scala.inline
      def reflectionInstance(x0: Double, y0: Double, x1: Double): typings.jsts.jsts.geom.util.AffineTransformation = (^.asInstanceOf[js.Dynamic].applyDynamic("reflectionInstance")(x0.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], x1.asInstanceOf[js.Any])).asInstanceOf[typings.jsts.jsts.geom.util.AffineTransformation]
      @scala.inline
      def reflectionInstance(x0: Double, y0: Double, x1: Double, y1: Double): typings.jsts.jsts.geom.util.AffineTransformation = (^.asInstanceOf[js.Dynamic].applyDynamic("reflectionInstance")(x0.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[typings.jsts.jsts.geom.util.AffineTransformation]
      @scala.inline
      def reflectionInstance(x0: Double, y0: Double, x1: Unit, y1: Double): typings.jsts.jsts.geom.util.AffineTransformation = (^.asInstanceOf[js.Dynamic].applyDynamic("reflectionInstance")(x0.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[typings.jsts.jsts.geom.util.AffineTransformation]
      
      @scala.inline
      def rotationInstance(sinTheta: Double, cosTheta: Double): typings.jsts.jsts.geom.util.AffineTransformation = (^.asInstanceOf[js.Dynamic].applyDynamic("rotationInstance")(sinTheta.asInstanceOf[js.Any], cosTheta.asInstanceOf[js.Any])).asInstanceOf[typings.jsts.jsts.geom.util.AffineTransformation]
      @scala.inline
      def rotationInstance(sinTheta: Double, cosTheta: Double, x: Double, y: Double): typings.jsts.jsts.geom.util.AffineTransformation = (^.asInstanceOf[js.Dynamic].applyDynamic("rotationInstance")(sinTheta.asInstanceOf[js.Any], cosTheta.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.jsts.jsts.geom.util.AffineTransformation]
      @scala.inline
      def rotationInstance(theta: Double): typings.jsts.jsts.geom.util.AffineTransformation = ^.asInstanceOf[js.Dynamic].applyDynamic("rotationInstance")(theta.asInstanceOf[js.Any]).asInstanceOf[typings.jsts.jsts.geom.util.AffineTransformation]
      @scala.inline
      def rotationInstance(theta: Double, x: Double, y: Double): typings.jsts.jsts.geom.util.AffineTransformation = (^.asInstanceOf[js.Dynamic].applyDynamic("rotationInstance")(theta.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.jsts.jsts.geom.util.AffineTransformation]
      
      @scala.inline
      def scaleInstance(xScale: Double, yScale: Double): typings.jsts.jsts.geom.util.AffineTransformation = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleInstance")(xScale.asInstanceOf[js.Any], yScale.asInstanceOf[js.Any])).asInstanceOf[typings.jsts.jsts.geom.util.AffineTransformation]
      @scala.inline
      def scaleInstance(xScale: Double, yScale: Double, x: Double): typings.jsts.jsts.geom.util.AffineTransformation = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleInstance")(xScale.asInstanceOf[js.Any], yScale.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[typings.jsts.jsts.geom.util.AffineTransformation]
      @scala.inline
      def scaleInstance(xScale: Double, yScale: Double, x: Double, y: Double): typings.jsts.jsts.geom.util.AffineTransformation = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleInstance")(xScale.asInstanceOf[js.Any], yScale.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.jsts.jsts.geom.util.AffineTransformation]
      @scala.inline
      def scaleInstance(xScale: Double, yScale: Double, x: Unit, y: Double): typings.jsts.jsts.geom.util.AffineTransformation = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleInstance")(xScale.asInstanceOf[js.Any], yScale.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.jsts.jsts.geom.util.AffineTransformation]
      
      @scala.inline
      def shearInstance(xShear: Double, yShear: Double): typings.jsts.jsts.geom.util.AffineTransformation = (^.asInstanceOf[js.Dynamic].applyDynamic("shearInstance")(xShear.asInstanceOf[js.Any], yShear.asInstanceOf[js.Any])).asInstanceOf[typings.jsts.jsts.geom.util.AffineTransformation]
      
      @scala.inline
      def translationInstance(x: Double, y: Double): typings.jsts.jsts.geom.util.AffineTransformation = (^.asInstanceOf[js.Dynamic].applyDynamic("translationInstance")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.jsts.jsts.geom.util.AffineTransformation]
    }
  }
}
