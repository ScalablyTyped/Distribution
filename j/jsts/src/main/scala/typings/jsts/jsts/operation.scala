package typings.jsts.jsts

import typings.jsts.jsts.geom.Geometry
import typings.jsts.jsts.geom.IntersectionMatrix
import typings.jsts.jsts.geom.PrecisionModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operation {
  
  @js.native
  trait GeometryGraphOperation extends StObject {
    
    def getArgGeometry(i: Double): Geometry = js.native
    
    def setComputationPrecision(pm: PrecisionModel): Unit = js.native
  }
  object GeometryGraphOperation {
    
    @scala.inline
    def apply(getArgGeometry: Double => Geometry, setComputationPrecision: PrecisionModel => Unit): GeometryGraphOperation = {
      val __obj = js.Dynamic.literal(getArgGeometry = js.Any.fromFunction1(getArgGeometry), setComputationPrecision = js.Any.fromFunction1(setComputationPrecision))
      __obj.asInstanceOf[GeometryGraphOperation]
    }
    
    @scala.inline
    implicit class GeometryGraphOperationMutableBuilder[Self <: GeometryGraphOperation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetArgGeometry(value: Double => Geometry): Self = StObject.set(x, "getArgGeometry", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetComputationPrecision(value: PrecisionModel => Unit): Self = StObject.set(x, "setComputationPrecision", js.Any.fromFunction1(value))
    }
  }
  
  object buffer {
    
    @js.native
    trait BufferOp extends StObject {
      
      /**
        * @param {PrecisionModel}
        *          fixedPM
        */
      def bufferFixedPrecision(fixedPM: PrecisionModel): Unit = js.native
      
      /**
        * @param {int}
        *          precisionDigits
        */
      def bufferReducedPrecision2(precisionDigits: Double): Unit = js.native
      
      /**
        * Returns the buffer computed for a geometry for a given buffer distance.
        *
        * @param {double}
        *          dist the buffer distance.
        * @return {Geometry} the buffer of the input geometry.
        */
      def getResultGeometry(dist: Double): Geometry = js.native
      
      /**
        * Specifies the end cap style of the generated buffer. The styles supported are
        * {@link #CAP_ROUND}, {@link #CAP_BUTT}, and {@link #CAP_SQUARE}. The
        * default is CAP_ROUND.
        *
        * @param {int}
        *          endCapStyle the end cap style to specify.
        */
      def setEndCapStyle(endCapStyle: Double): Unit = js.native
      
      /**
        * Sets the number of segments used to approximate a angle fillet
        *
        * @param {int}
        *          quadrantSegments the number of segments in a fillet for a quadrant.
        */
      def setQuadrantSegments(quadrantSegments: Double): Unit = js.native
    }
    object BufferOp {
      
      @scala.inline
      def apply(
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
      implicit class BufferOpMutableBuilder[Self <: BufferOp] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBufferFixedPrecision(value: PrecisionModel => Unit): Self = StObject.set(x, "bufferFixedPrecision", js.Any.fromFunction1(value))
        
        @scala.inline
        def setBufferReducedPrecision2(value: Double => Unit): Self = StObject.set(x, "bufferReducedPrecision2", js.Any.fromFunction1(value))
        
        @scala.inline
        def setGetResultGeometry(value: Double => Geometry): Self = StObject.set(x, "getResultGeometry", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetEndCapStyle(value: Double => Unit): Self = StObject.set(x, "setEndCapStyle", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetQuadrantSegments(value: Double => Unit): Self = StObject.set(x, "setQuadrantSegments", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait BufferParameters extends StObject {
      
      /**
        * Computes the maximum distance error due to a given level of approximation to
        * a true arc.
        *
        * @param quadSegs
        *          the number of segments used to approximate a quarter-circle.
        * @return the error of approximation.
        */
      def bufferDistanceError(quadSegs: Double): Double = js.native
      
      /**
        * Gets the end cap style.
        *
        * @return the end cap style.
        */
      def getEndCapStyle(): Double = js.native
      
      /**
        * Gets the join style
        *
        * @return the join style code.
        */
      def getJoinStyle(): Double = js.native
      
      /**
        * Gets the mitre ratio limit.
        *
        * @return the limit value.
        */
      def getMitreLimit(): Double = js.native
      
      /**
        * Gets the number of quadrant segments which will be used
        *
        * @return the number of quadrant segments.
        */
      def getQuadrantSegments(): Double = js.native
      
      /**
        * Tests whether the buffer is to be generated on a single side only.
        *
        * @return true if the generated buffer is to be single-sided.
        */
      def isSingleSided(): Boolean = js.native
      
      /**
        * Specifies the end cap style of the generated buffer. The styles supported are
        * {@link #CAP_ROUND}, {@link #CAP_BUTT}, and {@link #CAP_SQUARE}. The
        * default is CAP_ROUND.
        *
        * @param {int}
        *          endCapStyle the end cap style to specify.
        */
      def setEndCapStyle(endCapStyle: Double): Unit = js.native
      
      /**
        * Sets the join style for outside (reflex) corners between line segments.
        * Allowable values are {@link JOIN_ROUND} (which is the default),
        * {@link JOIN_MITRE} and {link JOIN_BEVEL}.
        *
        * @param joinStyle
        *          the code for the join style.
        */
      def setJoinStyle(joinStyle: Double): Unit = js.native
      
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
      def setMitreLimit(mitreLimit: Double): Unit = js.native
      
      /**
        * Sets the number of segments used to approximate a angle fillet
        *
        * @param {int}
        *          quadrantSegments the number of segments in a fillet for a quadrant.
        */
      def setQuadrantSegments(quadrantSegments: Double): Unit = js.native
      
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
      def setSingleSided(isSingleSided: Boolean): Unit = js.native
    }
    object BufferParameters {
      
      @scala.inline
      def apply(
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
      implicit class BufferParametersMutableBuilder[Self <: BufferParameters] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBufferDistanceError(value: Double => Double): Self = StObject.set(x, "bufferDistanceError", js.Any.fromFunction1(value))
        
        @scala.inline
        def setGetEndCapStyle(value: () => Double): Self = StObject.set(x, "getEndCapStyle", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetJoinStyle(value: () => Double): Self = StObject.set(x, "getJoinStyle", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetMitreLimit(value: () => Double): Self = StObject.set(x, "getMitreLimit", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetQuadrantSegments(value: () => Double): Self = StObject.set(x, "getQuadrantSegments", js.Any.fromFunction0(value))
        
        @scala.inline
        def setIsSingleSided(value: () => Boolean): Self = StObject.set(x, "isSingleSided", js.Any.fromFunction0(value))
        
        @scala.inline
        def setSetEndCapStyle(value: Double => Unit): Self = StObject.set(x, "setEndCapStyle", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetJoinStyle(value: Double => Unit): Self = StObject.set(x, "setJoinStyle", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetMitreLimit(value: Double => Unit): Self = StObject.set(x, "setMitreLimit", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetQuadrantSegments(value: Double => Unit): Self = StObject.set(x, "setQuadrantSegments", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetSingleSided(value: Boolean => Unit): Self = StObject.set(x, "setSingleSided", js.Any.fromFunction1(value))
      }
    }
  }
  
  object relate {
    
    @js.native
    trait RelateOp extends GeometryGraphOperation {
      
      def getIntersectionMatrix(): IntersectionMatrix = js.native
    }
    object RelateOp {
      
      @scala.inline
      def apply(
        getArgGeometry: Double => Geometry,
        getIntersectionMatrix: () => IntersectionMatrix,
        setComputationPrecision: PrecisionModel => Unit
      ): RelateOp = {
        val __obj = js.Dynamic.literal(getArgGeometry = js.Any.fromFunction1(getArgGeometry), getIntersectionMatrix = js.Any.fromFunction0(getIntersectionMatrix), setComputationPrecision = js.Any.fromFunction1(setComputationPrecision))
        __obj.asInstanceOf[RelateOp]
      }
      
      @scala.inline
      implicit class RelateOpMutableBuilder[Self <: RelateOp] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetIntersectionMatrix(value: () => IntersectionMatrix): Self = StObject.set(x, "getIntersectionMatrix", js.Any.fromFunction0(value))
      }
    }
  }
}
