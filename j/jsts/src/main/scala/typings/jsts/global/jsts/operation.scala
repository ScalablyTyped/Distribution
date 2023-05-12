package typings.jsts.global.jsts

import typings.jsts.jsts.algorithm.BoundaryNodeRule
import typings.jsts.jsts.geom.Coordinate
import typings.jsts.jsts.geom.Geometry
import typings.jsts.jsts.geom.IntersectionMatrix
import typings.jsts.jsts.geom.PrecisionModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operation {
  
  @JSGlobal("jsts.operation.GeometryGraphOperation")
  @js.native
  open class GeometryGraphOperation protected ()
    extends StObject
       with typings.jsts.jsts.operation.GeometryGraphOperation {
    def this(g0: Geometry) = this()
    def this(g0: Geometry, g1: Geometry) = this()
    def this(g0: Geometry, g1: Geometry, boundaryNodeRule: BoundaryNodeRule) = this()
    
    /* CompleteClass */
    override def getArgGeometry(i: Double): Geometry = js.native
    
    /* CompleteClass */
    override def setComputationPrecision(pm: PrecisionModel): Unit = js.native
  }
  
  object buffer {
    
    @JSGlobal("jsts.operation.buffer.BufferOp")
    @js.native
    open class BufferOp protected ()
      extends StObject
         with typings.jsts.jsts.operation.buffer.BufferOp {
      /**
        * Initializes a buffer computation for the given geometry with the given set of
        * parameters.
        *
        * @param {Geometry}
        *          g the geometry to buffer.
        * @param {BufferParameters}
        *          bufParams the buffer parameters to use.
        */
      def this(g: Geometry, bufParams: typings.jsts.jsts.operation.buffer.BufferParameters) = this()
      
      /**
        * @param {PrecisionModel}
        *          fixedPM
        */
      /* CompleteClass */
      override def bufferFixedPrecision(fixedPM: PrecisionModel): Unit = js.native
      
      /**
        * @param {int}
        *          precisionDigits
        */
      /* CompleteClass */
      override def bufferReducedPrecision2(precisionDigits: Double): Unit = js.native
      
      /**
        * Returns the buffer computed for a geometry for a given buffer distance.
        *
        * @param {double}
        *          dist the buffer distance.
        * @return {Geometry} the buffer of the input geometry.
        */
      /* CompleteClass */
      override def getResultGeometry(dist: Double): Geometry = js.native
      
      /**
        * Specifies the end cap style of the generated buffer. The styles supported are
        * {@link #CAP_ROUND}, {@link #CAP_BUTT}, and {@link #CAP_SQUARE}. The
        * default is CAP_ROUND.
        *
        * @param {int}
        *          endCapStyle the end cap style to specify.
        */
      /* CompleteClass */
      override def setEndCapStyle(endCapStyle: Double): Unit = js.native
      
      /**
        * Sets the number of segments used to approximate a angle fillet
        *
        * @param {int}
        *          quadrantSegments the number of segments in a fillet for a quadrant.
        */
      /* CompleteClass */
      override def setQuadrantSegments(quadrantSegments: Double): Unit = js.native
    }
    /* static members */
    object BufferOp {
      
      @JSGlobal("jsts.operation.buffer.BufferOp")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * A number of digits of precision which leaves some computational "headroom"
        * for floating point operations.
        *
        * This value should be less than the decimal precision of double-precision
        * values (16).
        *
        */
      @JSGlobal("jsts.operation.buffer.BufferOp.MAX_PRECISION_DIGITS")
      @js.native
      def MAX_PRECISION_DIGITS: Double = js.native
      inline def MAX_PRECISION_DIGITS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_PRECISION_DIGITS")(x.asInstanceOf[js.Any])
      
      /**
        * Computes the buffer of a geometry for a given buffer distance.
        *
        * @param {Geometry}
        *          g the geometry to buffer.
        * @param {double}
        *          distance the buffer distance.
        * @return {Geometry} the buffer of the input geometry.
        */
      inline def bufferOp(g: Geometry, distance: Double): Geometry = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferOp")(g.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[Geometry]
      
      /**
        * Computes the buffer for a geometry for a given buffer distance and accuracy
        * of approximation.
        *
        * @param {Geometry}
        *          g the geometry to buffer.
        * @param {double}
        *          distance the buffer distance.
        * @param {BufferParameters}
        *          params the buffer parameters to use.
        * @return {Geometry} the buffer of the input geometry.
        *
        */
      inline def bufferOp2(g: Geometry, distance: Double, params: typings.jsts.jsts.operation.buffer.BufferParameters): Geometry = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferOp2")(g.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Geometry]
      
      /**
        * Computes the buffer for a geometry for a given buffer distance and accuracy
        * of approximation.
        *
        * @param {Geometry}
        *          g the geometry to buffer.
        * @param {double}
        *          distance the buffer distance.
        * @param {int}
        *          quadrantSegments the number of segments used to approximate a
        *          quarter circle.
        * @return {Geometry} the buffer of the input geometry.
        *
        */
      inline def bufferOp3(g: Geometry, distance: Double, quadrantSegments: Double): Geometry = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferOp3")(g.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], quadrantSegments.asInstanceOf[js.Any])).asInstanceOf[Geometry]
      
      /**
        * Computes the buffer for a geometry for a given buffer distance and accuracy
        * of approximation.
        *
        * @param {Geometry}
        *          g the geometry to buffer.
        * @param {double}
        *          distance the buffer distance.
        * @param {int}
        *          quadrantSegments the number of segments used to approximate a
        *          quarter circle.
        * @param {int}
        *          endCapStyle the end cap style to use.
        * @return {Geometry} the buffer of the input geometry.
        *
        */
      inline def bufferOp4(g: Geometry, distance: Double, quadrantSegments: Double, endCapStyle: Double): Geometry = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferOp4")(g.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], quadrantSegments.asInstanceOf[js.Any], endCapStyle.asInstanceOf[js.Any])).asInstanceOf[Geometry]
      
      /**
        * Compute a scale factor to limit the precision of a given combination of
        * Geometry and buffer distance. The scale factor is determined by a combination
        * of the number of digits of precision in the (geometry + buffer distance),
        * limited by the supplied <code>maxPrecisionDigits</code> value.
        *
        * @param {Geometry}
        *          g the Geometry being buffered.
        * @param {double}
        *          distance the buffer distance.
        * @param {int}
        *          maxPrecisionDigits the max # of digits that should be allowed by the
        *          precision determined by the computed scale factor.
        *
        * @return {double} a scale factor for the buffer computation.
        */
      inline def precisionScaleFactor(g: Geometry, distance: Double, maxPrecisionDigits: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("precisionScaleFactor")(g.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], maxPrecisionDigits.asInstanceOf[js.Any])).asInstanceOf[Double]
    }
    
    @JSGlobal("jsts.operation.buffer.BufferParameters")
    @js.native
    /**
      * Contains the parameters which describe how a buffer should be constructed.
      *
      */
    open class BufferParameters ()
      extends StObject
         with typings.jsts.jsts.operation.buffer.BufferParameters {
      def this(quadrantSegments: Double) = this()
      def this(quadrantSegments: Double, endCapStyle: Double) = this()
      def this(quadrantSegments: Unit, endCapStyle: Double) = this()
      def this(quadrantSegments: Double, endCapStyle: Double, joinStyle: Double) = this()
      def this(quadrantSegments: Double, endCapStyle: Unit, joinStyle: Double) = this()
      def this(quadrantSegments: Unit, endCapStyle: Double, joinStyle: Double) = this()
      def this(quadrantSegments: Unit, endCapStyle: Unit, joinStyle: Double) = this()
      def this(quadrantSegments: Double, endCapStyle: Double, joinStyle: Double, mitreLimit: Double) = this()
      def this(quadrantSegments: Double, endCapStyle: Double, joinStyle: Unit, mitreLimit: Double) = this()
      def this(quadrantSegments: Double, endCapStyle: Unit, joinStyle: Double, mitreLimit: Double) = this()
      def this(quadrantSegments: Double, endCapStyle: Unit, joinStyle: Unit, mitreLimit: Double) = this()
      def this(quadrantSegments: Unit, endCapStyle: Double, joinStyle: Double, mitreLimit: Double) = this()
      def this(quadrantSegments: Unit, endCapStyle: Double, joinStyle: Unit, mitreLimit: Double) = this()
      def this(quadrantSegments: Unit, endCapStyle: Unit, joinStyle: Double, mitreLimit: Double) = this()
      def this(quadrantSegments: Unit, endCapStyle: Unit, joinStyle: Unit, mitreLimit: Double) = this()
      
      /**
        * Computes the maximum distance error due to a given level of approximation to
        * a true arc.
        *
        * @param quadSegs
        *          the number of segments used to approximate a quarter-circle.
        * @return the error of approximation.
        */
      /* CompleteClass */
      override def bufferDistanceError(quadSegs: Double): Double = js.native
      
      /**
        * Gets the end cap style.
        *
        * @return the end cap style.
        */
      /* CompleteClass */
      override def getEndCapStyle(): Double = js.native
      
      /**
        * Gets the join style
        *
        * @return the join style code.
        */
      /* CompleteClass */
      override def getJoinStyle(): Double = js.native
      
      /**
        * Gets the mitre ratio limit.
        *
        * @return the limit value.
        */
      /* CompleteClass */
      override def getMitreLimit(): Double = js.native
      
      /**
        * Gets the number of quadrant segments which will be used
        *
        * @return the number of quadrant segments.
        */
      /* CompleteClass */
      override def getQuadrantSegments(): Double = js.native
      
      /**
        * Tests whether the buffer is to be generated on a single side only.
        *
        * @return true if the generated buffer is to be single-sided.
        */
      /* CompleteClass */
      override def isSingleSided(): Boolean = js.native
      
      /**
        * Specifies the end cap style of the generated buffer. The styles supported are
        * {@link #CAP_ROUND}, {@link #CAP_BUTT}, and {@link #CAP_SQUARE}. The
        * default is CAP_ROUND.
        *
        * @param {int}
        *          endCapStyle the end cap style to specify.
        */
      /* CompleteClass */
      override def setEndCapStyle(endCapStyle: Double): Unit = js.native
      
      /**
        * Sets the join style for outside (reflex) corners between line segments.
        * Allowable values are {@link JOIN_ROUND} (which is the default),
        * {@link JOIN_MITRE} and {link JOIN_BEVEL}.
        *
        * @param joinStyle
        *          the code for the join style.
        */
      /* CompleteClass */
      override def setJoinStyle(joinStyle: Double): Unit = js.native
      
      /**
        * Sets the limit on the mitre ratio used for very sharp corners. The mitre
        * ratio is the ratio of the distance from the corner to the end of the mitred
        * offset corner. When two line segments meet at a sharp angle, a miter join
        * will extend far beyond the original geometry. (and in the extreme case will
        * be infinitely far.) To prevent unreasonable geometry, the mitre limit allows
        * controlling the maximum length of the join corner. Corners with a ratio which
        * exceed the limit will be beveled.
        *
        * @param mitreLimit
        *          the mitre ratio limit.
        */
      /* CompleteClass */
      override def setMitreLimit(mitreLimit: Double): Unit = js.native
      
      /**
        * Sets the number of segments used to approximate a angle fillet
        *
        * @param {int}
        *          quadrantSegments the number of segments in a fillet for a quadrant.
        */
      /* CompleteClass */
      override def setQuadrantSegments(quadrantSegments: Double): Unit = js.native
      
      /**
        * Sets whether the computed buffer should be single-sided. A single-sided
        * buffer is constructed on only one side of each input line.
        * <p>
        * The side used is determined by the sign of the buffer distance:
        * <ul>
        * <li>a positive distance indicates the left-hand side
        * <li>a negative distance indicates the right-hand side
        * </ul>
        * The single-sided buffer of point geometries is the same as the regular
        * buffer.
        * <p>
        * The End Cap Style for single-sided buffers is always ignored, and forced to
        * the equivalent of <tt>CAP_FLAT</tt>.
        *
        * @param isSingleSided
        *          true if a single-sided buffer should be constructed.
        */
      /* CompleteClass */
      override def setSingleSided(isSingleSided: Boolean): Unit = js.native
    }
    /* static members */
    object BufferParameters {
      
      @JSGlobal("jsts.operation.buffer.BufferParameters")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Specifies a flat line buffer end cap style.
        *
        */
      @JSGlobal("jsts.operation.buffer.BufferParameters.CAP_FLAT")
      @js.native
      def CAP_FLAT: Double = js.native
      inline def CAP_FLAT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CAP_FLAT")(x.asInstanceOf[js.Any])
      
      /**
        * Specifies a round line buffer end cap style.
        *
        */
      @JSGlobal("jsts.operation.buffer.BufferParameters.CAP_ROUND")
      @js.native
      def CAP_ROUND: Double = js.native
      inline def CAP_ROUND_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CAP_ROUND")(x.asInstanceOf[js.Any])
      
      /**
        * Specifies a square line buffer end cap style.
        *
        */
      @JSGlobal("jsts.operation.buffer.BufferParameters.CAP_SQUARE")
      @js.native
      def CAP_SQUARE: Double = js.native
      inline def CAP_SQUARE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CAP_SQUARE")(x.asInstanceOf[js.Any])
      
      /**
        * The default mitre limit Allows fairly pointy mitres.
        *
        */
      @JSGlobal("jsts.operation.buffer.BufferParameters.DEFAULT_MITRE_LIMIT")
      @js.native
      def DEFAULT_MITRE_LIMIT: Double = js.native
      inline def DEFAULT_MITRE_LIMIT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MITRE_LIMIT")(x.asInstanceOf[js.Any])
      
      /**
        * The default number of facets into which to divide a fillet of 90 degrees. A
        * value of 8 gives less than 2% max error in the buffer distance. For a max
        * error of < 1%, use QS = 12. For a max error of < 0.1%, use QS = 18.
        *
        */
      @JSGlobal("jsts.operation.buffer.BufferParameters.DEFAULT_QUADRANT_SEGMENTS")
      @js.native
      def DEFAULT_QUADRANT_SEGMENTS: Double = js.native
      inline def DEFAULT_QUADRANT_SEGMENTS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_QUADRANT_SEGMENTS")(x.asInstanceOf[js.Any])
      
      /**
        * Specifies a bevel join style.
        *
        */
      @JSGlobal("jsts.operation.buffer.BufferParameters.JOIN_BEVEL")
      @js.native
      def JOIN_BEVEL: Double = js.native
      inline def JOIN_BEVEL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JOIN_BEVEL")(x.asInstanceOf[js.Any])
      
      /**
        * Specifies a mitre join style.
        */
      @JSGlobal("jsts.operation.buffer.BufferParameters.JOIN_MITRE")
      @js.native
      def JOIN_MITRE: Double = js.native
      inline def JOIN_MITRE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JOIN_MITRE")(x.asInstanceOf[js.Any])
      
      /**
        * Specifies a round join style.
        *
        */
      @JSGlobal("jsts.operation.buffer.BufferParameters.JOIN_ROUND")
      @js.native
      def JOIN_ROUND: Double = js.native
      inline def JOIN_ROUND_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JOIN_ROUND")(x.asInstanceOf[js.Any])
    }
  }
  
  object distance {
    
    @JSGlobal("jsts.operation.distance.DistanceOp")
    @js.native
    open class DistanceOp protected ()
      extends StObject
         with typings.jsts.jsts.operation.distance.DistanceOp {
      /**
        * Constructs a DistanceOp that computes the distance and nearest points
        * between the two specified geometries.
        */
      def this(g0: Geometry, g1: Geometry) = this()
      /**
        * Constructs a DistanceOp that computes the distance and nearest points
        * between the two specified geometries.
        *
        * @param {double} terminateDistance the distance on which to terminate the search
        */
      def this(g0: Geometry, g1: Geometry, terminateDistance: Double) = this()
      
      /**
        * Report the distance between the nearest points on the input geometries.
        *
        * @returns {double} the distance between the geometries or 0 if either input geometry is empty
        *
        * @throws {IllegalArgumentException} if either input geometry is null
        */
      /* CompleteClass */
      override def distance(): Double = js.native
      
      /**
        * Report the locations of the nearest points in the input geometries.
        * The locations are presented in the same order as the input Geometries.
        *
        * @returns a pair of GeometryLocations for the nearest points
        */
      /* CompleteClass */
      override def nearestLocations(): js.Tuple2[
            typings.jsts.jsts.operation.distance.GeometryLocation, 
            typings.jsts.jsts.operation.distance.GeometryLocation
          ] = js.native
      
      /**
        * Report the coordinates of the nearest points in the input geometries.
        * The points are presented in the same order as the input Geometries.
        *
        * @returns a pair of Coordinates of the nearest points
        */
      /* CompleteClass */
      override def nearestPoints(): js.Tuple2[Coordinate, Coordinate] = js.native
    }
    /* static members */
    object DistanceOp {
      
      @JSGlobal("jsts.operation.distance.DistanceOp")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Compute the distance between the nearest points of two geometries.
        *
        * @returns {double} the distance between the geometries
        */
      inline def distance(g0: Geometry, g1: Geometry): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(g0.asInstanceOf[js.Any], g1.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      /**
        * Test whether two geometries lie within a given distance of each other.
        *
        * @param {double} distance
        *
        * @returns true if g0.distance(g1) <= distance
        */
      inline def isWithinDistance(g0: Geometry, g1: Geometry, distance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isWithinDistance")(g0.asInstanceOf[js.Any], g1.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      /**
        * Compute the the nearest points of two geometries.
        * The points are presented in the same order as the input Geometries.
        *
        * @returns the nearest points in the geometries
        */
      inline def nearestPoints(g0: Geometry, g1: Geometry): js.Tuple2[Coordinate, Coordinate] = (^.asInstanceOf[js.Dynamic].applyDynamic("nearestPoints")(g0.asInstanceOf[js.Any], g1.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Coordinate, Coordinate]]
    }
    
    @JSGlobal("jsts.operation.distance.GeometryLocation")
    @js.native
    open class GeometryLocation protected ()
      extends StObject
         with typings.jsts.jsts.operation.distance.GeometryLocation {
      /**
        * Constructs a GeometryLocation specifying a point inside an area geometry.
        *
        * @param component the component of the geometry containing the point
        * @param pt the coordinate of the location
        */
      def this(component: Geometry, pt: Coordinate) = this()
      /**
        * Constructs a GeometryLocation specifying a point on a geometry,
        * as well as the segment that the point is on
        * (or INSIDE_AREA if the point is not on a segment).
        *
        * @param component the component of the geometry containing the point
        * @param {int} segIndex the segment index of the location, or INSIDE_AREA
        * @param pt the coordinate of the location
        */
      def this(component: Geometry, segIndex: Double, pt: Coordinate) = this()
      
      /**
        * Returns the Coordinate of this location.
        */
      /* CompleteClass */
      override def getCoordinate(): Coordinate = js.native
      
      /**
        * Returns the geometry component on (or in) which this location occurs.
        */
      /* CompleteClass */
      override def getGeometryComponent(): Geometry = js.native
      
      /**
        * Returns the segment index for this location.
        * If the location is inside an area, the index will have the value INSIDE_AREA;
        *
        * @returns {int} the segment index for the location, or INSIDE_AREA
        */
      /* CompleteClass */
      override def getSegmentIndex(): Double = js.native
      
      /**
        * Tests whether this location represents a point inside an area geometry.
        */
      /* CompleteClass */
      override def isInsideArea(): Boolean = js.native
    }
    /* static members */
    object GeometryLocation {
      
      @JSGlobal("jsts.operation.distance.GeometryLocation")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * A special value of segmentIndex used for locations inside area geometries.
        *
        */
      @JSGlobal("jsts.operation.distance.GeometryLocation.INSIDE_AREA")
      @js.native
      def INSIDE_AREA: Double = js.native
      inline def INSIDE_AREA_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INSIDE_AREA")(x.asInstanceOf[js.Any])
    }
  }
  
  object linemerge {
    
    @JSGlobal("jsts.operation.linemerge.LineMerger")
    @js.native
    /**
      * Creates a new line merger.
      */
    open class LineMerger ()
      extends StObject
         with typings.jsts.jsts.operation.linemerge.LineMerger
  }
  
  object polygonize {
    
    @JSGlobal("jsts.operation.polygonize.Polygonizer")
    @js.native
    /**
      * Creates a polygonizer that extracts all polygons.
      */
    open class Polygonizer ()
      extends StObject
         with typings.jsts.jsts.operation.polygonize.Polygonizer {
      /**
        * Creates a polygonizer, specifying whether a valid polygonal geometry must be created.
        * If the argument is true then areas may be discarded in order to ensure
        * that the extracted geometry is a valid polygonal geometry.
        *
        * @param {boolean} extractOnlyPolygonal true if a valid polygonal geometry should be extracted
        */
      def this(extractOnlyPolygonal: Boolean) = this()
    }
  }
  
  object relate {
    
    @JSGlobal("jsts.operation.relate.RelateOp")
    @js.native
    open class RelateOp protected ()
      extends StObject
         with typings.jsts.jsts.operation.relate.RelateOp {
      def this(g1: Geometry, g2: Geometry) = this()
      def this(g1: Geometry, g2: Geometry, boundaryNodeRule: BoundaryNodeRule) = this()
      
      /* CompleteClass */
      override def getArgGeometry(i: Double): Geometry = js.native
      
      /* CompleteClass */
      override def getIntersectionMatrix(): IntersectionMatrix = js.native
      
      /* CompleteClass */
      override def setComputationPrecision(pm: PrecisionModel): Unit = js.native
    }
    /* static members */
    object RelateOp {
      
      @JSGlobal("jsts.operation.relate.RelateOp")
      @js.native
      val ^ : js.Any = js.native
      
      inline def contains(g1: Geometry, g2: Geometry): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(g1.asInstanceOf[js.Any], g2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      inline def covers(g1: Geometry, g2: Geometry): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("covers")(g1.asInstanceOf[js.Any], g2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      inline def crosses(g1: Geometry, g2: Geometry): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("crosses")(g1.asInstanceOf[js.Any], g2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      inline def equalsTopo(g1: Geometry, g2: Geometry): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsTopo")(g1.asInstanceOf[js.Any], g2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      inline def intersects(g1: Geometry, g2: Geometry): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersects")(g1.asInstanceOf[js.Any], g2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      inline def overlaps(g1: Geometry, g2: Geometry): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("overlaps")(g1.asInstanceOf[js.Any], g2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      inline def relate(g1: Geometry, g2: Geometry): IntersectionMatrix = (^.asInstanceOf[js.Dynamic].applyDynamic("relate")(g1.asInstanceOf[js.Any], g2.asInstanceOf[js.Any])).asInstanceOf[IntersectionMatrix]
      inline def relate(g1: Geometry, g2: Geometry, boundaryNodeRule: BoundaryNodeRule): IntersectionMatrix = (^.asInstanceOf[js.Dynamic].applyDynamic("relate")(g1.asInstanceOf[js.Any], g2.asInstanceOf[js.Any], boundaryNodeRule.asInstanceOf[js.Any])).asInstanceOf[IntersectionMatrix]
      
      inline def touches(g1: Geometry, g2: Geometry): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("touches")(g1.asInstanceOf[js.Any], g2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    }
  }
}
