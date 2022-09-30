package typings.jsts.jsts

import typings.jsts.jstsInts.`-1`
import typings.jsts.jstsInts.`0`
import typings.jsts.jstsInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geom {
  
  trait Coordinate extends StObject {
    
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
  }
  object Coordinate {
    
    inline def apply(
      compareTo: Coordinate => Double,
      distance: Coordinate => Double,
      equals2D: Coordinate => Boolean,
      equals_ : Coordinate => Boolean,
      setCoordinate: Coordinate => Unit,
      x: Double,
      y: Double,
      z: Double
    ): Coordinate = {
      val __obj = js.Dynamic.literal(compareTo = js.Any.fromFunction1(compareTo), distance = js.Any.fromFunction1(distance), equals2D = js.Any.fromFunction1(equals2D), setCoordinate = js.Any.fromFunction1(setCoordinate), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[Coordinate]
    }
    
    extension [Self <: Coordinate](x: Self) {
      
      inline def setCompareTo(value: Coordinate => Double): Self = StObject.set(x, "compareTo", js.Any.fromFunction1(value))
      
      inline def setDistance(value: Coordinate => Double): Self = StObject.set(x, "distance", js.Any.fromFunction1(value))
      
      inline def setEquals2D(value: Coordinate => Boolean): Self = StObject.set(x, "equals2D", js.Any.fromFunction1(value))
      
      inline def setEquals_(value: Coordinate => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      inline def setSetCoordinate(value: Coordinate => Unit): Self = StObject.set(x, "setCoordinate", js.Any.fromFunction1(value))
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * An interface for classes which use the values of the coordinates in a Geometry.
    * Coordinate filters can be used to implement centroid and envelope computation,
    * and many other functions.
    * CoordinateFilter is an example of the Gang-of-Four Visitor pattern.
    *
    * Note: it is not recommended to use these filters to mutate the coordinates.
    * There is no guarantee that the coordinate is the actual object stored in the
    * source geometry. In particular, modified values may not be preserved if the
    * source Geometry uses a non-default CoordinateSequence.
    * If in-place mutation is required, use CoordinateSequenceFilter.
    */
  trait CoordinateFilter extends StObject {
    
    /**
      * Performs an operation with the provided coord. Note that there is no guarantee
      * that the input coordinate is the actual object stored in the source geometry,
      * so changes to the coordinate object may not be persistent.
      * @param coord a Coordinate to which the filter is applied.
      */
    def filter(coord: Coordinate): Unit
  }
  object CoordinateFilter {
    
    inline def apply(filter: Coordinate => Unit): CoordinateFilter = {
      val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter))
      __obj.asInstanceOf[CoordinateFilter]
    }
    
    extension [Self <: CoordinateFilter](x: Self) {
      
      inline def setFilter(value: Coordinate => Unit): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
    }
  }
  
  trait CoordinateSequence extends StObject
  
  @js.native
  trait CoordinateSequenceFactory extends StObject {
    
    /**
      * Creates a CoordinateSequence which is a copy of the given CoordinateSequence.
      * This method must handle null arguments by creating an empty sequence.
      *
      * @param coordSeq the coordinate sequence to copy
      */
    def create(coordSeq: CoordinateSequence): CoordinateSequence = js.native
    /**
      * Returns a CoordinateSequence based on the given array.
      * Whether the array is copied or simply referenced is implementation-dependent.
      * This method must handle null arguments by creating an empty sequence.
      *
      * @param coordinates the coordinates
      */
    def create(coordinates: js.Array[Coordinate]): CoordinateSequence = js.native
    /**
      * Creates a CoordinateSequence of the specified size and dimension.
      * For this to be useful, the CoordinateSequence implementation must be mutable.
      * If the requested dimension is larger than the CoordinateSequence implementation can provide,
      * then a sequence of maximum possible dimension should be created. An error should not be thrown.
      *
      * @param {int} size the number of coordinates in the sequence
      * @param {int} dimension the dimension of the coordinates in the sequence (if user-specifiable, otherwise ignored)
      */
    def create(size: Double, dimension: Double): CoordinateSequence = js.native
    /**
      * Creates a CoordinateSequence of the specified size and dimension with measure support.
      * For this to be useful, the CoordinateSequence implementation must be mutable.
      * If the requested dimension or measures are larger than the CoordinateSequence implementation can provide,
      * then a sequence of maximum possible dimension should be created. An error should not be thrown.
      *
      * @param {int} size the number of coordinates in the sequence
      * @param {int} dimension the dimension of the coordinates in the sequence (if user-specifiable, otherwise ignored)
      * @param {int} measures the number of measures of the coordinates in the sequence (if user-specifiable, otherwise ignored)
      */
    def create(size: Double, dimension: Double, measures: Double): CoordinateSequence = js.native
  }
  
  /**
    * An interface for classes which process the coordinates in a CoordinateSequence.
    * A filter can either record information about each coordinate, or change the value of the coordinate.
    * Filters can be used to implement operations such as coordinate transformations,
    * centroid and envelope computation, and many other functions.
    * Geometry classes support the concept of applying a CoordinateSequenceFilter to each
    * CoordinateSequences they contain.
    * For maximum efficiency, the execution of filters can be short-circuited by using the isDone() method.
    * CoordinateSequenceFilter is an example of the Gang-of-Four Visitor pattern.
    */
  trait CoordinateSequenceFilter extends StObject {
    
    /**
      * Performs an operation on a coordinate in a CoordinateSequence.
      * @param seq the CoordinateSequence to which the filter is applied
      * @param i the index of the coordinate to apply the filter to
      */
    def filter(seq: CoordinateSequence, i: Double): Unit
    
    /**
      * Reports whether the application of this filter can be terminated.
      * Once this method returns true, it must continue to return true on
      * every subsequent call.
      *
      * @returns true if the application of this filter can be terminated.
      */
    def isDone(): Boolean
    
    /**
      * Reports whether the execution of this filter has modified the coordinates
      * of the geometry. If so, Geometry.geometryChanged() will be executed after
      * this filter has finished being executed.
      * Most filters can simply return a constant value reflecting whether
      * they are able to change the coordinates.
      *
      * @returns true if this filter has changed the coordinates of the geometry
      */
    def isGeometryChanged(): Boolean
  }
  object CoordinateSequenceFilter {
    
    inline def apply(
      filter: (CoordinateSequence, Double) => Unit,
      isDone: () => Boolean,
      isGeometryChanged: () => Boolean
    ): CoordinateSequenceFilter = {
      val __obj = js.Dynamic.literal(filter = js.Any.fromFunction2(filter), isDone = js.Any.fromFunction0(isDone), isGeometryChanged = js.Any.fromFunction0(isGeometryChanged))
      __obj.asInstanceOf[CoordinateSequenceFilter]
    }
    
    extension [Self <: CoordinateSequenceFilter](x: Self) {
      
      inline def setFilter(value: (CoordinateSequence, Double) => Unit): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setIsDone(value: () => Boolean): Self = StObject.set(x, "isDone", js.Any.fromFunction0(value))
      
      inline def setIsGeometryChanged(value: () => Boolean): Self = StObject.set(x, "isGeometryChanged", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Envelope extends StObject {
    
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
  
  @js.native
  trait Geometry extends StObject {
    
    /**
      * Performs an operation with or on this Geometry's coordinates. If this method
      * modifies any coordinate values, geometryChanged() must be called to update the
      * geometry state. Note that you cannot use this method to modify this Geometry
      * if its underlying CoordinateSequence's #get method returns a copy of the Coordinate,
      * rather than the actual Coordinate stored (if it even stores Coordinate objects at all).
      * @param filter the filter to apply to this Geometry's coordinates
      */
    @JSName("apply")
    def apply(filter: CoordinateFilter): Unit = js.native
    /**
      * Performs an operation on the coordinates in this Geometry's CoordinateSequences.
      * If the filter reports that a coordinate value has been changed, geometryChanged()
      * will be called automatically.
      * @param filter the filter to apply
      */
    @JSName("apply")
    def apply(filter: CoordinateSequenceFilter): Unit = js.native
    /**
      * Performs an operation with or on this Geometry and its component Geometry's.
      * Only GeometryCollections and Polygons have component Geometry's;
      * for Polygons they are the LinearRings of the shell and holes.
      * @param filter the filter to apply to this Geometry.
      */
    @JSName("apply")
    def apply(filter: GeometryComponentFilter): Unit = js.native
    /**
      * Performs an operation with or on this Geometry and its subelement Geometrys (if any).
      * Only GeometryCollections and subclasses have subelement Geometry's.
      * @param filter the filter to apply to this Geometry (and its children, if it is a GeometryCollection).
      */
    @JSName("apply")
    def apply(filter: GeometryFilter): Unit = js.native
    
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
    def buffer(distance: Double, quadrantSegments: Double, endCapStyle: Double): Polygon | MultiPolygon = js.native
    
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
    def checkNotGeometryCollection(g: Geometry): Unit = js.native
    
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
    def compare(a: js.Array[Any], b: js.Array[Any]): Double = js.native
    
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
    def compareTo(o: Geometry): Double = js.native
    
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
    def compareToSameClass(o: Geometry): Double = js.native
    
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
    def contains(g: Geometry): Boolean = js.native
    
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
    def coveredBy(g: Geometry): Boolean = js.native
    
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
    def covers(g: Geometry): Boolean = js.native
    
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
    def crosses(g: Geometry): Boolean = js.native
    
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
    def disjoint(g: Geometry): Boolean = js.native
    
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
    def distance(g: Geometry): Double = js.native
    
    /**
      * The bounding box of this <code>Geometry</code>.
      */
    var envelope: Envelope = js.native
    
    /**
      * @param {jsts.geom.Coordinate}
      *          a first Coordinate to compare.
      * @param {jsts.geom.Coordinate}
      *          b second Coordinate to compare.
      * @param {number}
      *          tolerance tolerance when comparing.
      * @return {boolean} true if equal.
      */
    def equal(a: Coordinate, b: Coordinate, tolerance: Double): Boolean = js.native
    
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
    def equals(o: js.Object): Boolean = js.native
    
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
    def equalsExact(other: Geometry, tolerance: Double): Boolean = js.native
    
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
    def equalsNorm(g: Geometry): Boolean = js.native
    
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
    def equalsTopo(g: Geometry): Boolean = js.native
    
    /**
      * Returns the area of this <code>Geometry</code>. Areal Geometries have a
      * non-zero area. They override this function to compute the area. Others return
      * 0.0
      *
      * @return the area of the Geometry.
      */
    def getArea(): Double = js.native
    
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
    def getBoundaryDimension(): Double = js.native
    
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
    def getDimension(): Double = js.native
    
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
    def getFactory(): Any = js.native
    
    /**
      * Returns an element {@link Geometry} from a {@link GeometryCollection} (or
      * <code>this</code>, if the geometry is not a collection).
      *
      * @param {number} n The index of the geometry element.
      *
      * @return {Geometry} the n'th geometry contained in this geometry.
      */
    def getGeometryN(n: Double): Geometry = js.native
    
    /**
      * Returns the name of this object's <code>com.vivid.jts.geom</code> interface.
      *
      * @return {string} The name of this <code>Geometry</code>s most specific <code>jsts.geom</code> interface.
      */
    def getGeometryType(): String = js.native
    
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
    def getLength(): Double = js.native
    
    /**
      *Returns the number of {@link Geometry}s in a {@link GeometryCollection}
      * (or 1, if the geometry is not a collection).
      *
      * @return {number} the number of geometries contained in this geometry.
      */
    def getNumGeometries(): Double = js.native
    
    /**
      * Returns the count of this <code>Geometry</code>s vertices. The
      * <code>Geometry</code> s contained by composite <code>Geometry</code>s
      * must be Geometry's; that is, they must implement <code>getNumPoints</code>
      *
      * @return {number} the number of vertices in this <code>Geometry.</code>
      */
    def getNumPoints(): Double = js.native
    
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
    def intersects(g: Geometry): Boolean = js.native
    
    /**
      * Returns whether or not the set of points in this <code>Geometry</code> is
      * empty.
      *
      * @return {boolean} <code>true</code> if this <code>Geometry</code> equals
      *         the empty geometry.
      */
    def isEmpty(): Boolean = js.native
    
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
    def isEquivalentClass(other: Geometry): Boolean = js.native
    
    /**
      *
      * @return {boolean} true if this is a GeometryCollection.
      */
    def isGeometryCollection(): Boolean = js.native
    
    /**
      *
      * @return {boolean} true if this is a GeometryCollection but not subclass.
      */
    def isGeometryCollectionBase(): Boolean = js.native
    
    def isRectangle(): Boolean = js.native
    
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
    def isSimple(): Boolean = js.native
    
    /**
      * Tests the validity of this <code>Geometry</code>. Subclasses provide their
      * own definition of "valid".
      *
      * @return {boolean} <code>true</code> if this <code>Geometry</code> is
      *         valid.
      *
      * @see IsValidOp
      */
    def isValid(): Boolean = js.native
    
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
    def isWithinDistance(geom: Geometry, distance: Double): Boolean = js.native
    
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
    def normalize(): Unit = js.native
    
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
    def overlaps(g: Geometry): Boolean = js.native
    
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
    def relate(g: Geometry, intersectionPattern: String): Boolean = js.native
    
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
    def relate2(g: Geometry): Any = js.native
    
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
    def touches(g: Geometry): Boolean = js.native
    
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
    def within(g: Geometry): Boolean = js.native
  }
  
  type GeometryCollection = Geometry
  
  /**
    * Geometry classes support the concept of applying a GeometryComponentFilter
    * filter to the Geometry. The filter is applied to every component of the Geometry
    * which is itself a Geometry and which does not itself contain any components.
    * (For instance, all the LinearRings in Polygons are visited, but in a MultiPolygon
    * the Polygons themselves are not visited.) Thus the only classes of Geometry which
    * must be handled as arguments to filter(org.locationtech.jts.geom.Geometry) are
    * LineStrings, LinearRings and Points.
    * A GeometryComponentFilter filter can either record information about the Geometry
    * or change the Geometry in some way. GeometryComponentFilter is an example of the
    * Gang-of-Four Visitor pattern.
    */
  trait GeometryComponentFilter extends StObject {
    
    /**
      * Performs an operation with or on geom.
      * @param geom  a Geometry to which the filter is applied.
      */
    def filter(geom: Geometry): Unit
  }
  object GeometryComponentFilter {
    
    inline def apply(filter: Geometry => Unit): GeometryComponentFilter = {
      val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter))
      __obj.asInstanceOf[GeometryComponentFilter]
    }
    
    extension [Self <: GeometryComponentFilter](x: Self) {
      
      inline def setFilter(value: Geometry => Unit): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait GeometryFactory extends StObject {
    
    /**
      * Creates an empty atomic geometry of the given dimension.
      * If passed a dimension of -1 will create an empty GeometryCollection.
      *
      * @param {int} dimension the required dimension (-1, 0, 1 or 2)
      *
      * @returns an empty atomic geometry of given dimension
      */
    def createEmpty(dimension: Double): Geometry = js.native
    
    /**
      * Creates a deep copy of the input Geometry.
      * The CoordinateSequenceFactory defined for this factory is used
      * to copy the CoordinateSequences of the input geometry.
      * This is a convenient way to change the CoordinateSequence used to represent a geometry,
      * or to change the factory used for a geometry.
      * Geometry.copy() can also be used to make a deep copy,
      * but it does not allow changing the CoordinateSequence type.
      *
      * @returns a deep copy of the input geometry, using the CoordinateSequence type of this factory
      *
      * @see Geometry.copy()
      */
    def createGeometry(g: Geometry): Geometry = js.native
    
    /**
      * Constructs an empty GeometryCollection geometry.
      *
      * @returns {GeometryCollection} an empty GeometryCollection
      */
    def createGeometryCollection(): GeometryCollection = js.native
    /**
      * Creates a GeometryCollection using the given Geometries; a null or empty array will create an empty GeometryCollection.
      *
      * @param geometries an array of Geometries, each of which may be empty but not null, or null
      *
      * @returns the created GeometryCollection
      */
    def createGeometryCollection(geometries: js.Array[Geometry]): GeometryCollection = js.native
    
    /**
      * Constructs an empty LineString geometry.
      *
      * @returns an empty LineString
      */
    def createLineString(): LineString = js.native
    /**
      * Creates a LineString using the given Coordinates; a null or empty array will
      * create an empty LineString. Consecutive points must not be equal.
      *
      * @param {Coordinate[]}
      *          coordinates an array without null elements, or an empty array, or
      *          null.
      * @return {LineString} A new LineString.
      */
    def createLineString(coordinates: js.Array[Coordinate]): LineString = js.native
    /**
      * Creates a LineString using the given CoordinateSequence.
      * A null or empty CoordinateSequence creates an empty LineString.
      *
      * @param coordinates a CoordinateSequence (possibly empty), or null
      */
    def createLineString(coordinates: CoordinateSequence): LineString = js.native
    
    /**
      * Constructs an empty LinearRing geometry.
      *
      * @returns an empty LinearRing
      */
    def createLinearRing(): LinearRing = js.native
    /**
      * Creates a LinearRing using the given Coordinates; a null or empty array
      * will create an empty LinearRing. Consecutive points must not be equal.
      *
      * @param {Coordinate[]}
      *          coordinates an array without null elements, or an empty array,
      * or null.
      * @return {LineString} A new LinearRing.
      */
    def createLinearRing(coordinates: js.Array[Coordinate]): LinearRing = js.native
    /**
      * Creates a LinearRing using the given CoordinateSequence.
      * A null or empty array creates an empty LinearRing.
      * The points must form a closed and simple linestring.
      *
      * @param coordinates a CoordinateSequence (possibly empty), or null
      *
      * @returns the created LinearRing
      *
      * @throws {IllegalArgumentException} if the ring is not closed, or has too few points
      */
    def createLinearRing(coordinates: CoordinateSequence): LinearRing = js.native
    
    /**
      * Constructs an empty MultiLineString geometry.
      *
      * @returns {MultiLineString} an empty MultiLineString
      */
    def createMultiLineString(): MultiLineString = js.native
    /**
      * Creates a MultiLineString using the given LineStrings; a null or empty array will create an empty MultiLineString.
      *
      * @param lineStrings LineStrings, each of which may be empty but not null
      *
      * @returns the created MultiLineString
      */
    def createMultiLineString(lineStrings: js.Array[LineString]): MultiLineString = js.native
    
    /**
      * Constructs an empty MultiPoint geometry.
      *
      * @returns an empty MultiPoint
      */
    def createMultiPoint(): MultiPoint = js.native
    /**
      * Creates a MultiPoint using the points in the given CoordinateSequence.
      * A null or empty CoordinateSequence creates an empty MultiPoint.
      *
      * @param coordinates a CoordinateSequence (possibly empty), or null
      * @returns a MultiPoint geometry
      */
    def createMultiPoint(coordinates: CoordinateSequence): MultiPoint = js.native
    /**
      * Creates a MultiPoint using the given Points. A null or empty array will create an empty MultiPoint.
      *
      * @param point an array of Points (without null elements), or an empty array, or null
      *
      * @returns a MultiPoint object
      */
    /**
      * @deprecated Deprecated. Use createMultiPointFromCoords(org.locationtech.jts.geom.Coordinate[]) instead
      *
      * Creates a MultiPoint using the given Coordinates. A null or empty array will create an empty MultiPoint.
      *
      * @param coordinates an array (without null elements), or an empty array, or null
      *
      * @returns a MultiPoint object
      */
    def createMultiPoint(point: js.Array[Coordinate | Point]): MultiPoint = js.native
    
    /**
      * Creates a MultiPoint using the given Coordinates. A null or empty array will create an empty MultiPoint.
      *
      * @param coordinates an array (without null elements), or an empty array, or null
      *
      * @returns a MultiPoint object
      */
    def createMultiPointFromCoords(coordinates: js.Array[Coordinate]): MultiPoint = js.native
    
    /**
      * Constructs an empty MultiPolygon geometry.
      *
      * @returns an empty MultiPolygon
      */
    def createMultiPolygon(): MultiPolygon = js.native
    /**
      * Creates a MultiPolygon using the given Polygons; a null or empty array will create an empty Polygon. The polygons must conform to the assertions specified in the OpenGIS Simple Features Specification for SQL.
      *
      * @param polygons Polygons, each of which may be empty but not null
      *
      * @returns the created MultiPolygon
      */
    def createMultiPolygon(polygons: js.Array[Polygon]): MultiPolygon = js.native
    
    /**
      * Constructs an empty Point geometry.
      *
      * @returns {Point} an empty Point
      */
    def createPoint(): Point = js.native
    /**
      * Creates a Point using the given Coordinate; a null Coordinate will create an
      * empty Geometry.
      *
      * @param {Coordinate}
      *          coordinate Coordinate to base this Point on.
      * @return {Point} A new Point.
      */
    def createPoint(coordinates: Coordinate): Point = js.native
    /**
      * Creates a Point using the given CoordinateSequence; a null or empty CoordinateSequence will create an empty Point.
      *
      * @param {CoordinateSequence} coordinates a CoordinateSequence (possibly empty), or null
      *
      * @returns {Point} the created Point
      */
    def createPoint(coordinates: CoordinateSequence): Point = js.native
    
    def createPointFromInternalCoord(coord: Coordinate, exemplar: Geometry): Point = js.native
    
    /**
      * Constructs an empty Polygon geometry.
      *
      * @returns an empty polygon
      */
    def createPolygon(): Polygon = js.native
    /**
      * Constructs a Polygon with the given exterior boundary.
      *
      * @param shell the outer boundary of the new Polygon, or null or an empty LinearRing if the empty geometry is to be created.
      *
      * @throws {IllegalArgumentException} if the boundary ring is invalid
      */
    def createPolygon(shell: js.Array[Coordinate]): Polygon = js.native
    /**
      * Constructs a Polygon with the given exterior boundary.
      *
      * @param shell the outer boundary of the new Polygon, or null or an empty LinearRing if the empty geometry is to be created.
      *
      * @throws {IllegalArgumentException} if the boundary ring is invalid
      */
    def createPolygon(shell: CoordinateSequence): Polygon = js.native
    /**
      * Constructs a Polygon with the given exterior boundary.
      *
      * @param shell the outer boundary of the new Polygon, or null or an empty LinearRing if the empty geometry is to be created.
      *
      * @throws {IllegalArgumentException} if the boundary ring is invalid
      */
    def createPolygon(shell: LinearRing): Polygon = js.native
    /**
      * Creates a Polygon using the given LinearRing.
      *
      * @param {LinearRing} shell A LinearRing constructed by coordinates.
      * @return {Polygon} A new Polygon.
      */
    def createPolygon(shell: LinearRing, holes: js.Array[LinearRing]): Polygon = js.native
    
    def getCoordinateSequenceFactory(): CoordinateSequenceFactory = js.native
    
    /**
      * Returns the PrecisionModel that Geometries created by this factory will be associated with.
      *
      * @returns {PrecisionModel} the PrecisionModel for this factory
      */
    def getPrecisionModel(): PrecisionModel = js.native
    
    /**
      * Gets the SRID value defined for this factory.
      *
      * @returns {int} the factory SRID value
      */
    def getSRID(): Double = js.native
    
    /**
      * Creates a Geometry with the same extent as the given envelope. The Geometry returned is guaranteed to be valid. To provide this behaviour, the following cases occur:
      *
      * If the Envelope is:
      * - null : returns an empty Point
      * - a point : returns a non-empty Point
      * - a line : returns a two-point LineString
      * - a rectangle : returns a Polygon whose points are (minx, miny), (minx, maxy), (maxx, maxy), (maxx, miny), (minx, miny).
      *
      * @param {Envelope} envelope the Envelope to convert
      *
      * @returns {Geometry} an empty Point (for null Envelopes), a Point (when min x = max x and min y = max y) or a Polygon (in all other cases)
      */
    def toGeometry(envelope: Envelope): Geometry = js.native
  }
  
  /**
    * GeometryCollection classes support the concept of applying a GeometryFilter
    * to the Geometry. The filter is applied to every element Geometry.
    * A GeometryFilter can either record information about the Geometry or
    * change the Geometry in some way. GeometryFilter is an example of the
    * Gang-of-Four Visitor pattern.
    */
  trait GeometryFilter extends StObject {
    
    /**
      * Performs an operation with or on geom.
      * @param geom  a Geometry to which the filter is applied.
      */
    def filter(geom: Geometry): Unit
  }
  object GeometryFilter {
    
    inline def apply(filter: Geometry => Unit): GeometryFilter = {
      val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter))
      __obj.asInstanceOf[GeometryFilter]
    }
    
    extension [Self <: GeometryFilter](x: Self) {
      
      inline def setFilter(value: Geometry => Unit): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IntersectionMatrix extends StObject {
    
    def add(im: IntersectionMatrix): Unit = js.native
    
    def get(row: Double, column: Double): Double = js.native
    
    def isContains(): Boolean = js.native
    
    def isCoveredBy(): Boolean = js.native
    
    def isCovers(): Boolean = js.native
    
    def isCrosses(dimensionOfGeometryA: Double, dimensionOfGeometryB: Double): Boolean = js.native
    
    def isDisjoint(): Boolean = js.native
    
    def isEquals(dimensionOfGeometryA: Double, dimensionOfGeometryB: Double): Boolean = js.native
    
    def isIntersects(): Boolean = js.native
    
    def isOverlaps(dimensionOfGeometryA: Double, dimensionOfGeometryB: Double): Boolean = js.native
    
    def isTouches(dimensionOfGeometryA: Double, dimensionOfGeometryB: Double): Boolean = js.native
    
    def isWithin(): Boolean = js.native
    
    def matches(
      requiredDimensionSymbols: js.Tuple9[String, String, String, String, String, String, String, String, String]
    ): Boolean = js.native
    
    def set(dimensionSymbols: js.Tuple3[String, String, String]): Unit = js.native
    def set(row: Double, col: Double, dimensionValue: Double): Unit = js.native
    
    def setAll(dimensionValue: Double): Unit = js.native
    
    def setAtLeast(dimensionSymbols: js.Tuple3[String, String, String]): Unit = js.native
    def setAtLeast(row: Double, col: Double, dimensionValue: Double): Unit = js.native
    
    def setAtLeastIfValid(row: Double, col: Double, minimumDimensionValue: Double): Unit = js.native
    
    def transpose(): IntersectionMatrix = js.native
  }
  
  @js.native
  trait LineSegment extends StObject {
    
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
    
    def distance(geom: Coordinate): Double = js.native
    /**
      * Computes the distance between this line segment and another segment.
      *
      * @param {jsts.geom.LineSegment | jsts.geom.Coordinate}
      * @return {number} the distance to the other segment
      */
    def distance(geom: LineSegment): Double = js.native
    
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
  
  @js.native
  trait LineString
    extends StObject
       with Geometry {
    
    /**
      * @return {jsts.geom.Coordinate} The n'th coordinate of this
      *         jsts.geom.LineString.
      * @param {int}
      *          n index.
      */
    def getCoordinateN(n: Double): Coordinate = js.native
    
    /**
      * @return {jsts.geom.Point} The last point of this
      *         jsts.geom.LineString.
      */
    def getEndPoint(): Point = js.native
    
    /**
      * @return {jsts.geom.Point} The n'th point of this
      *         jsts.geom.LineString.
      * @param {int}
      *          n index.
      */
    def getPointN(n: Double): Point = js.native
    
    /**
      * @return {jsts.geom.Point} The first point of this
      *         jsts.geom.LineString.
      */
    def getStartPoint(): Point = js.native
    
    /**
      * @return {Boolean} true if LineString is Closed.
      */
    def isClosed(): Boolean = js.native
    
    /**
      * @return {Boolean} true if LineString is a Ring.
      */
    def isRing(): Boolean = js.native
  }
  
  type LinearRing = LineString
  
  @js.native
  trait MultiLineString
    extends StObject
       with Geometry {
    
    def isClosed(): Boolean = js.native
    
    /**
      * @deprecated
      */
    def reverse(): Geometry = js.native
  }
  
  @js.native
  trait MultiPoint
    extends StObject
       with Geometry
  
  type MultiPolygon = GeometryCollection
  
  @js.native
  trait Point
    extends StObject
       with Geometry {
    
    /**
      * @return {number} x-axis value of this Point.
      */
    def getX(): Double = js.native
    
    /**
      * @return {number} y-axis value of this Point.
      */
    def getY(): Double = js.native
    
    /**
      * @return {Point} Reversed point is a cloned point.
      */
    def reverse(): Point = js.native
  }
  
  @js.native
  trait Polygon
    extends StObject
       with Geometry {
    
    /**
      * Gets the exterior ring.
      *
      * @return {LinearRing} The exterior ring.
      */
    def getExteriorRing(): LinearRing = js.native
    
    /**
      * Gets the interior ring at the specified index.
      *
      * @param {number} n The interior ring index.
      *
      * @returns {LinearRing} The interior ring at the specified index.
      */
    def getInteriorRingN(n: Double): LinearRing = js.native
    
    /**
      * Gets the number of interior rings.
      *
      * @return {number} The number of interior rings.
      */
    def getNumInteriorRing(): Double = js.native
  }
  
  trait PrecisionModel extends StObject
  
  object util {
    
    @js.native
    trait AffineTransformation extends StObject {
      
      def compose(trans: AffineTransformation): AffineTransformation = js.native
      
      def composeBefore(trans: AffineTransformation): AffineTransformation = js.native
      
      def equals(obj: AffineTransformation): Boolean = js.native
      
      def filter(seq: CoordinateSequence, i: Double): Unit = js.native
      
      def getDeterminant(): Double = js.native
      
      def getInverse(): AffineTransformation = js.native
      
      def getMatrixEntries(): js.Tuple6[Double, Double, Double, Double, Double, Double] = js.native
      
      def isDone(): Boolean = js.native
      
      def isGeometryChanged(): Boolean = js.native
      
      def isIdentity(): Boolean = js.native
      
      def reflect(x0: Double, y0: Double): AffineTransformation = js.native
      def reflect(x0: Double, y0: Double, x1: Double): AffineTransformation = js.native
      def reflect(x0: Double, y0: Double, x1: Double, y1: Double): AffineTransformation = js.native
      def reflect(x0: Double, y0: Double, x1: Unit, y1: Double): AffineTransformation = js.native
      
      def rotate(sinTheta: Double, cosTheta: Double): AffineTransformation = js.native
      def rotate(sinTheta: Double, cosTheta: Double, x: Double, y: Double): AffineTransformation = js.native
      def rotate(theta: Double): AffineTransformation = js.native
      def rotate(theta: Double, x: Double, y: Double): AffineTransformation = js.native
      
      def scale(xScale: Double, yScale: Double): AffineTransformation = js.native
      
      def setToIdentity(): AffineTransformation = js.native
      
      def setToReflection(x0: Double, y0: Double, x1: Double, y1: Double): AffineTransformation = js.native
      def setToReflection(x: Double, y: Double): AffineTransformation = js.native
      
      def setToReflectionBasic(x0: Double, y0: Double, x1: Double, y1: Double): AffineTransformation = js.native
      
      def setToRotation(sinTheta: Double, cosTheta: Double): AffineTransformation = js.native
      def setToRotation(sinTheta: Double, cosTheta: Double, x: Double, y: Double): AffineTransformation = js.native
      def setToRotation(theta: Double): AffineTransformation = js.native
      def setToRotation(theta: Double, x: Double, y: Double): AffineTransformation = js.native
      
      def setToScale(xScale: Double, yScale: Double): AffineTransformation = js.native
      
      def setToShear(xShear: Double, yShear: Double): AffineTransformation = js.native
      
      def setToTranslation(dx: Double, dy: Double): AffineTransformation = js.native
      
      def setTransformation(m00: Double, m01: Double, m02: Double, m10: Double, m11: Double, m12: Double): AffineTransformation = js.native
      def setTransformation(trans: AffineTransformation): AffineTransformation = js.native
      
      def shear(xShear: Double, yShear: Double): AffineTransformation = js.native
      
      def transform(seq: CoordinateSequence, i: Double): Unit = js.native
      def transform(src: Coordinate, dest: Coordinate): Coordinate = js.native
      def transform[T /* <: Geometry */](g: T): T = js.native
      
      def translate(x: Double, y: Double): AffineTransformation = js.native
    }
  }
}
