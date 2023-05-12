package typings.jsts.jsts

import typings.jsts.java_.utils.ArrayList
import typings.jsts.java_.utils.Collection
import typings.jsts.java_.utils.HashSet
import typings.jsts.jsts.geom.Coordinate
import typings.jsts.jsts.geom.Geometry
import typings.jsts.jsts.geom.IntersectionMatrix
import typings.jsts.jsts.geom.LineString
import typings.jsts.jsts.geom.Polygon
import typings.jsts.jsts.geom.PrecisionModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operation {
  
  trait GeometryGraphOperation extends StObject {
    
    def getArgGeometry(i: Double): Geometry
    
    def setComputationPrecision(pm: PrecisionModel): Unit
  }
  object GeometryGraphOperation {
    
    inline def apply(getArgGeometry: Double => Geometry, setComputationPrecision: PrecisionModel => Unit): GeometryGraphOperation = {
      val __obj = js.Dynamic.literal(getArgGeometry = js.Any.fromFunction1(getArgGeometry), setComputationPrecision = js.Any.fromFunction1(setComputationPrecision))
      __obj.asInstanceOf[GeometryGraphOperation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GeometryGraphOperation] (val x: Self) extends AnyVal {
      
      inline def setGetArgGeometry(value: Double => Geometry): Self = StObject.set(x, "getArgGeometry", js.Any.fromFunction1(value))
      
      inline def setSetComputationPrecision(value: PrecisionModel => Unit): Self = StObject.set(x, "setComputationPrecision", js.Any.fromFunction1(value))
    }
  }
  
  object buffer {
    
    trait BufferOp extends StObject {
      
      /**
        * @param {PrecisionModel}
        *          fixedPM
        */
      def bufferFixedPrecision(fixedPM: PrecisionModel): Unit
      
      /**
        * @param {int}
        *          precisionDigits
        */
      def bufferReducedPrecision2(precisionDigits: Double): Unit
      
      /**
        * Returns the buffer computed for a geometry for a given buffer distance.
        *
        * @param {double}
        *          dist the buffer distance.
        * @return {Geometry} the buffer of the input geometry.
        */
      def getResultGeometry(dist: Double): Geometry
      
      /**
        * Specifies the end cap style of the generated buffer. The styles supported are
        * {@link #CAP_ROUND}, {@link #CAP_BUTT}, and {@link #CAP_SQUARE}. The
        * default is CAP_ROUND.
        *
        * @param {int}
        *          endCapStyle the end cap style to specify.
        */
      def setEndCapStyle(endCapStyle: Double): Unit
      
      /**
        * Sets the number of segments used to approximate a angle fillet
        *
        * @param {int}
        *          quadrantSegments the number of segments in a fillet for a quadrant.
        */
      def setQuadrantSegments(quadrantSegments: Double): Unit
    }
    object BufferOp {
      
      inline def apply(
        bufferFixedPrecision: PrecisionModel => Unit,
        bufferReducedPrecision2: Double => Unit,
        getResultGeometry: Double => Geometry,
        setEndCapStyle: Double => Unit,
        setQuadrantSegments: Double => Unit
      ): BufferOp = {
        val __obj = js.Dynamic.literal(bufferFixedPrecision = js.Any.fromFunction1(bufferFixedPrecision), bufferReducedPrecision2 = js.Any.fromFunction1(bufferReducedPrecision2), getResultGeometry = js.Any.fromFunction1(getResultGeometry), setEndCapStyle = js.Any.fromFunction1(setEndCapStyle), setQuadrantSegments = js.Any.fromFunction1(setQuadrantSegments))
        __obj.asInstanceOf[BufferOp]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: BufferOp] (val x: Self) extends AnyVal {
        
        inline def setBufferFixedPrecision(value: PrecisionModel => Unit): Self = StObject.set(x, "bufferFixedPrecision", js.Any.fromFunction1(value))
        
        inline def setBufferReducedPrecision2(value: Double => Unit): Self = StObject.set(x, "bufferReducedPrecision2", js.Any.fromFunction1(value))
        
        inline def setGetResultGeometry(value: Double => Geometry): Self = StObject.set(x, "getResultGeometry", js.Any.fromFunction1(value))
        
        inline def setSetEndCapStyle(value: Double => Unit): Self = StObject.set(x, "setEndCapStyle", js.Any.fromFunction1(value))
        
        inline def setSetQuadrantSegments(value: Double => Unit): Self = StObject.set(x, "setQuadrantSegments", js.Any.fromFunction1(value))
      }
    }
    
    trait BufferParameters extends StObject {
      
      /**
        * Computes the maximum distance error due to a given level of approximation to
        * a true arc.
        *
        * @param quadSegs
        *          the number of segments used to approximate a quarter-circle.
        * @return the error of approximation.
        */
      def bufferDistanceError(quadSegs: Double): Double
      
      /**
        * Gets the end cap style.
        *
        * @return the end cap style.
        */
      def getEndCapStyle(): Double
      
      /**
        * Gets the join style
        *
        * @return the join style code.
        */
      def getJoinStyle(): Double
      
      /**
        * Gets the mitre ratio limit.
        *
        * @return the limit value.
        */
      def getMitreLimit(): Double
      
      /**
        * Gets the number of quadrant segments which will be used
        *
        * @return the number of quadrant segments.
        */
      def getQuadrantSegments(): Double
      
      /**
        * Tests whether the buffer is to be generated on a single side only.
        *
        * @return true if the generated buffer is to be single-sided.
        */
      def isSingleSided(): Boolean
      
      /**
        * Specifies the end cap style of the generated buffer. The styles supported are
        * {@link #CAP_ROUND}, {@link #CAP_BUTT}, and {@link #CAP_SQUARE}. The
        * default is CAP_ROUND.
        *
        * @param {int}
        *          endCapStyle the end cap style to specify.
        */
      def setEndCapStyle(endCapStyle: Double): Unit
      
      /**
        * Sets the join style for outside (reflex) corners between line segments.
        * Allowable values are {@link JOIN_ROUND} (which is the default),
        * {@link JOIN_MITRE} and {link JOIN_BEVEL}.
        *
        * @param joinStyle
        *          the code for the join style.
        */
      def setJoinStyle(joinStyle: Double): Unit
      
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
      def setMitreLimit(mitreLimit: Double): Unit
      
      /**
        * Sets the number of segments used to approximate a angle fillet
        *
        * @param {int}
        *          quadrantSegments the number of segments in a fillet for a quadrant.
        */
      def setQuadrantSegments(quadrantSegments: Double): Unit
      
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
      def setSingleSided(isSingleSided: Boolean): Unit
    }
    object BufferParameters {
      
      inline def apply(
        bufferDistanceError: Double => Double,
        getEndCapStyle: () => Double,
        getJoinStyle: () => Double,
        getMitreLimit: () => Double,
        getQuadrantSegments: () => Double,
        isSingleSided: () => Boolean,
        setEndCapStyle: Double => Unit,
        setJoinStyle: Double => Unit,
        setMitreLimit: Double => Unit,
        setQuadrantSegments: Double => Unit,
        setSingleSided: Boolean => Unit
      ): BufferParameters = {
        val __obj = js.Dynamic.literal(bufferDistanceError = js.Any.fromFunction1(bufferDistanceError), getEndCapStyle = js.Any.fromFunction0(getEndCapStyle), getJoinStyle = js.Any.fromFunction0(getJoinStyle), getMitreLimit = js.Any.fromFunction0(getMitreLimit), getQuadrantSegments = js.Any.fromFunction0(getQuadrantSegments), isSingleSided = js.Any.fromFunction0(isSingleSided), setEndCapStyle = js.Any.fromFunction1(setEndCapStyle), setJoinStyle = js.Any.fromFunction1(setJoinStyle), setMitreLimit = js.Any.fromFunction1(setMitreLimit), setQuadrantSegments = js.Any.fromFunction1(setQuadrantSegments), setSingleSided = js.Any.fromFunction1(setSingleSided))
        __obj.asInstanceOf[BufferParameters]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: BufferParameters] (val x: Self) extends AnyVal {
        
        inline def setBufferDistanceError(value: Double => Double): Self = StObject.set(x, "bufferDistanceError", js.Any.fromFunction1(value))
        
        inline def setGetEndCapStyle(value: () => Double): Self = StObject.set(x, "getEndCapStyle", js.Any.fromFunction0(value))
        
        inline def setGetJoinStyle(value: () => Double): Self = StObject.set(x, "getJoinStyle", js.Any.fromFunction0(value))
        
        inline def setGetMitreLimit(value: () => Double): Self = StObject.set(x, "getMitreLimit", js.Any.fromFunction0(value))
        
        inline def setGetQuadrantSegments(value: () => Double): Self = StObject.set(x, "getQuadrantSegments", js.Any.fromFunction0(value))
        
        inline def setIsSingleSided(value: () => Boolean): Self = StObject.set(x, "isSingleSided", js.Any.fromFunction0(value))
        
        inline def setSetEndCapStyle(value: Double => Unit): Self = StObject.set(x, "setEndCapStyle", js.Any.fromFunction1(value))
        
        inline def setSetJoinStyle(value: Double => Unit): Self = StObject.set(x, "setJoinStyle", js.Any.fromFunction1(value))
        
        inline def setSetMitreLimit(value: Double => Unit): Self = StObject.set(x, "setMitreLimit", js.Any.fromFunction1(value))
        
        inline def setSetQuadrantSegments(value: Double => Unit): Self = StObject.set(x, "setQuadrantSegments", js.Any.fromFunction1(value))
        
        inline def setSetSingleSided(value: Boolean => Unit): Self = StObject.set(x, "setSingleSided", js.Any.fromFunction1(value))
      }
    }
  }
  
  object distance {
    
    trait DistanceOp extends StObject {
      
      /**
        * Report the distance between the nearest points on the input geometries.
        *
        * @returns {double} the distance between the geometries or 0 if either input geometry is empty
        *
        * @throws {IllegalArgumentException} if either input geometry is null
        */
      def distance(): Double
      
      /**
        * Report the locations of the nearest points in the input geometries.
        * The locations are presented in the same order as the input Geometries.
        *
        * @returns a pair of GeometryLocations for the nearest points
        */
      def nearestLocations(): js.Tuple2[GeometryLocation, GeometryLocation]
      
      /**
        * Report the coordinates of the nearest points in the input geometries.
        * The points are presented in the same order as the input Geometries.
        *
        * @returns a pair of Coordinates of the nearest points
        */
      def nearestPoints(): js.Tuple2[Coordinate, Coordinate]
    }
    object DistanceOp {
      
      inline def apply(
        distance: () => Double,
        nearestLocations: () => js.Tuple2[GeometryLocation, GeometryLocation],
        nearestPoints: () => js.Tuple2[Coordinate, Coordinate]
      ): DistanceOp = {
        val __obj = js.Dynamic.literal(distance = js.Any.fromFunction0(distance), nearestLocations = js.Any.fromFunction0(nearestLocations), nearestPoints = js.Any.fromFunction0(nearestPoints))
        __obj.asInstanceOf[DistanceOp]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: DistanceOp] (val x: Self) extends AnyVal {
        
        inline def setDistance(value: () => Double): Self = StObject.set(x, "distance", js.Any.fromFunction0(value))
        
        inline def setNearestLocations(value: () => js.Tuple2[GeometryLocation, GeometryLocation]): Self = StObject.set(x, "nearestLocations", js.Any.fromFunction0(value))
        
        inline def setNearestPoints(value: () => js.Tuple2[Coordinate, Coordinate]): Self = StObject.set(x, "nearestPoints", js.Any.fromFunction0(value))
      }
    }
    
    trait GeometryLocation extends StObject {
      
      /**
        * Returns the Coordinate of this location.
        */
      def getCoordinate(): Coordinate
      
      /**
        * Returns the geometry component on (or in) which this location occurs.
        */
      def getGeometryComponent(): Geometry
      
      /**
        * Returns the segment index for this location.
        * If the location is inside an area, the index will have the value INSIDE_AREA;
        *
        * @returns {int} the segment index for the location, or INSIDE_AREA
        */
      def getSegmentIndex(): Double
      
      /**
        * Tests whether this location represents a point inside an area geometry.
        */
      def isInsideArea(): Boolean
    }
    object GeometryLocation {
      
      inline def apply(
        getCoordinate: () => Coordinate,
        getGeometryComponent: () => Geometry,
        getSegmentIndex: () => Double,
        isInsideArea: () => Boolean
      ): GeometryLocation = {
        val __obj = js.Dynamic.literal(getCoordinate = js.Any.fromFunction0(getCoordinate), getGeometryComponent = js.Any.fromFunction0(getGeometryComponent), getSegmentIndex = js.Any.fromFunction0(getSegmentIndex), isInsideArea = js.Any.fromFunction0(isInsideArea))
        __obj.asInstanceOf[GeometryLocation]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: GeometryLocation] (val x: Self) extends AnyVal {
        
        inline def setGetCoordinate(value: () => Coordinate): Self = StObject.set(x, "getCoordinate", js.Any.fromFunction0(value))
        
        inline def setGetGeometryComponent(value: () => Geometry): Self = StObject.set(x, "getGeometryComponent", js.Any.fromFunction0(value))
        
        inline def setGetSegmentIndex(value: () => Double): Self = StObject.set(x, "getSegmentIndex", js.Any.fromFunction0(value))
        
        inline def setIsInsideArea(value: () => Boolean): Self = StObject.set(x, "isInsideArea", js.Any.fromFunction0(value))
      }
    }
  }
  
  object linemerge {
    
    @js.native
    trait LineMerger extends StObject {
      
      /**
        *
        * Adds a collection of Geometries to be processed. May be called multiple times.
        * Any dimension of Geometry may be added; the constituent linework will be extracted.
        *
        * @param geometries the geometries to be line-merged
        */
      def add(geometries: Collection[Geometry]): Unit = js.native
      /**
        * Adds a Geometry to be processed. May be called multiple times.
        * Any dimension of Geometry may be added; the constituent linework will be extracted.
        *
        * @param geometry geometry to be line-merged
        */
      def add(geometry: Geometry): Unit = js.native
      
      /**
        * Gets the LineStrings created by the merging process.
        *
        * @returns the collection of merged LineStrings
        */
      def getMergedLineStrings(): Collection[LineString] = js.native
    }
  }
  
  object polygonize {
    
    @js.native
    trait Polygonizer extends StObject {
      
      /**
        * Adds a collection of geometries to the edges to be polygonized.
        * May be called multiple times.
        * Any dimension of Geometry may be added; the constituent linework will be extracted and used.
        *
        * @param geomList {Array} a list of Geometrys with linework to be polygonized
        */
      def add(geomList: js.Array[Geometry]): Unit = js.native
      /**
        * Add a Geometry to the edges to be polygonized.
        * May be called multiple times.
        * Any dimension of Geometry may be added; the constituent linework will be extracted and used
        *
        * @param g {Geometry} a Geometry with linework to be polygonized
        */
      def add(g: Geometry): Unit = js.native
      
      /**
        * Gets the list of cut edges found during polygonization.
        *
        * @returns a collection of the input LineStrings which are cut edges
        */
      def getCutEdges(): ArrayList[LineString] = js.native
      
      /**
        * Gets the list of dangling lines found during polygonization.
        *
        * @returns a collection of the input LineStrings which are dangles
        */
      def getDangles(): HashSet[LineString] = js.native
      
      /**
        * Gets a geometry representing the polygons formed by the polygonization.
        * If a valid polygonal geometry was extracted the result is a Polygonal geometry.
        *
        * @returns a geometry containing the polygons
        */
      def getGeometry(): Geometry = js.native
      
      /**
        * Gets the list of lines forming invalid rings found during polygonization.
        *
        * @returns a collection of the input LineStrings which form invalid rings
        */
      def getInvalidRingLines(): ArrayList[LineString] = js.native
      
      /**
        * Gets the list of polygons formed by the polygonization.
        */
      def getPolygons(): ArrayList[Polygon] = js.native
      
      /**
        * Allows disabling the valid ring checking, to optimize situations where invalid rings are not expected.
        * The default is true.
        *
        * @param isCheckingRingsValid {boolean} true if generated rings should be checked for validity
        */
      def setCheckRingsValid(isCheckingRingsValid: Boolean): Unit = js.native
    }
  }
  
  object relate {
    
    trait RelateOp
      extends StObject
         with GeometryGraphOperation {
      
      def getIntersectionMatrix(): IntersectionMatrix
    }
    object RelateOp {
      
      inline def apply(
        getArgGeometry: Double => Geometry,
        getIntersectionMatrix: () => IntersectionMatrix,
        setComputationPrecision: PrecisionModel => Unit
      ): RelateOp = {
        val __obj = js.Dynamic.literal(getArgGeometry = js.Any.fromFunction1(getArgGeometry), getIntersectionMatrix = js.Any.fromFunction0(getIntersectionMatrix), setComputationPrecision = js.Any.fromFunction1(setComputationPrecision))
        __obj.asInstanceOf[RelateOp]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: RelateOp] (val x: Self) extends AnyVal {
        
        inline def setGetIntersectionMatrix(value: () => IntersectionMatrix): Self = StObject.set(x, "getIntersectionMatrix", js.Any.fromFunction0(value))
      }
    }
  }
}
