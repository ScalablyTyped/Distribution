package typings.jsts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geom {
  
  @JSImport("jsts", "geom.Coordinate")
  @js.native
  class Coordinate protected ()
    extends typings.jsts.jsts.geom.Coordinate {
    /**
      * @constructor
      */
    def this(c: typings.jsts.jsts.geom.Coordinate) = this()
    /**
      * @constructor
      */
    def this(x: Double, y: Double) = this()
  }
  
  @JSImport("jsts", "geom.CoordinateSequence")
  @js.native
  class CoordinateSequence ()
    extends typings.jsts.jsts.geom.CoordinateSequence
  /* static members */
  object CoordinateSequence {
    
    @JSImport("jsts", "geom.CoordinateSequence")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("jsts", "geom.CoordinateSequence.M")
    @js.native
    def M: Double = js.native
    @scala.inline
    def M_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("M")(x.asInstanceOf[js.Any])
    
    @JSImport("jsts", "geom.CoordinateSequence.X")
    @js.native
    def X: Double = js.native
    @scala.inline
    def X_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("X")(x.asInstanceOf[js.Any])
    
    @JSImport("jsts", "geom.CoordinateSequence.Y")
    @js.native
    def Y: Double = js.native
    @scala.inline
    def Y_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Y")(x.asInstanceOf[js.Any])
    
    @JSImport("jsts", "geom.CoordinateSequence.Z")
    @js.native
    def Z: Double = js.native
    @scala.inline
    def Z_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Z")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("jsts", "geom.Envelope")
  @js.native
  class Envelope protected ()
    extends typings.jsts.jsts.geom.Envelope {
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
    @JSImport("jsts", "geom.Envelope.intersects")
    @js.native
    def intersects(
      p1: typings.jsts.jsts.geom.Coordinate,
      p2: typings.jsts.jsts.geom.Coordinate,
      q: typings.jsts.jsts.geom.Coordinate
    ): Boolean = js.native
    
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
    @JSImport("jsts", "geom.Envelope.intersectsEnvelope")
    @js.native
    def intersectsEnvelope(
      p1: typings.jsts.jsts.geom.Coordinate,
      p2: typings.jsts.jsts.geom.Coordinate,
      q1: typings.jsts.jsts.geom.Coordinate,
      q2: typings.jsts.jsts.geom.Coordinate
    ): Boolean = js.native
  }
  
  @JSImport("jsts", "geom.Geometry")
  @js.native
  /**
    * Creates a new <tt>Geometry</tt> via the specified GeometryFactory.
    */
  class Geometry ()
    extends typings.jsts.jsts.geom.Geometry {
    def this(factory: js.Any) = this()
  }
  
  @JSImport("jsts", "geom.GeometryCollection")
  @js.native
  class GeometryCollection ()
    extends typings.jsts.jsts.geom.Geometry {
    def this(geometries: js.Array[typings.jsts.jsts.geom.Geometry]) = this()
    def this(geometries: js.UndefOr[scala.Nothing], factory: typings.jsts.jsts.geom.GeometryFactory) = this()
    def this(
      geometries: js.Array[typings.jsts.jsts.geom.Geometry],
      factory: typings.jsts.jsts.geom.GeometryFactory
    ) = this()
  }
  
  @JSImport("jsts", "geom.GeometryFactory")
  @js.native
  /**
    * Constructs a GeometryFactory that generates Geometries having a floating PrecisionModel and a spatial-reference ID of 0.
    */
  class GeometryFactory ()
    extends typings.jsts.jsts.geom.GeometryFactory {
    def this(precisionModel: typings.jsts.jsts.geom.PrecisionModel) = this()
  }
  
  @JSImport("jsts", "geom.IntersectionMatrix")
  @js.native
  class IntersectionMatrix ()
    extends typings.jsts.jsts.geom.IntersectionMatrix {
    def this(elements: js.Array[String]) = this()
    def this(other: typings.jsts.jsts.geom.IntersectionMatrix) = this()
  }
  /* static members */
  object IntersectionMatrix {
    
    @JSImport("jsts", "geom.IntersectionMatrix.isTrue")
    @js.native
    def isTrue(actualDimensionValue: Double): Boolean = js.native
    
    @JSImport("jsts", "geom.IntersectionMatrix.matches")
    @js.native
    def matches(actualDimensionSymbols: String, requiredDimensionSymbols: String): Boolean = js.native
    @JSImport("jsts", "geom.IntersectionMatrix.matches")
    @js.native
    def matches(actualDimensionValue: Double, requiredDimensionSymbol: String): Boolean = js.native
  }
  
  @JSImport("jsts", "geom.LineSegment")
  @js.native
  class LineSegment protected ()
    extends typings.jsts.jsts.geom.LineSegment {
    def this(p0: typings.jsts.jsts.geom.Coordinate, p1: typings.jsts.jsts.geom.Coordinate) = this()
  }
  /* static members */
  object LineSegment {
    
    /**
      * Computes the midpoint of a segment
      *
      * @param {jsts.geom.Coordinate} p0
      * @param {jsts.geom.Coordinate} p1
      * @return {jsts.geom.Coordinate} the midpoint of the segment
      */
    @JSImport("jsts", "geom.LineSegment.midPoint")
    @js.native
    def midPoint(p0: typings.jsts.jsts.geom.Coordinate, p1: typings.jsts.jsts.geom.Coordinate): typings.jsts.jsts.geom.Coordinate = js.native
  }
  
  @JSImport("jsts", "geom.LineString")
  @js.native
  class LineString protected ()
    extends typings.jsts.jsts.geom.LineString {
    /**
      * @constructor
      */
    def this(points: js.Array[typings.jsts.jsts.geom.Coordinate]) = this()
    def this(points: js.Array[typings.jsts.jsts.geom.Coordinate], factory: js.Any) = this()
  }
  
  @JSImport("jsts", "geom.LinearRing")
  @js.native
  class LinearRing ()
    extends typings.jsts.jsts.geom.LineString
  
  @JSImport("jsts", "geom.Point")
  @js.native
  class Point protected ()
    extends typings.jsts.jsts.geom.Point {
    /**
      * @constructor
      */
    def this(coordinate: typings.jsts.jsts.geom.Coordinate) = this()
    def this(coordinate: typings.jsts.jsts.geom.Coordinate, factory: js.Any) = this()
  }
  
  @JSImport("jsts", "geom.Polygon")
  @js.native
  class Polygon protected ()
    extends typings.jsts.jsts.geom.Polygon {
    /**
      * @constructor
      */
    def this(shell: typings.jsts.jsts.geom.LinearRing) = this()
    def this(shell: typings.jsts.jsts.geom.LinearRing, holes: js.Array[typings.jsts.jsts.geom.LinearRing]) = this()
    def this(shell: typings.jsts.jsts.geom.LinearRing, holes: js.UndefOr[scala.Nothing], factory: js.Any) = this()
    def this(
      shell: typings.jsts.jsts.geom.LinearRing,
      holes: js.Array[typings.jsts.jsts.geom.LinearRing],
      factory: js.Any
    ) = this()
  }
  
  @JSImport("jsts", "geom.PrecisionModel")
  @js.native
  /**
    * 
    * @param modelType
    */
  class PrecisionModel ()
    extends typings.jsts.jsts.geom.PrecisionModel {
    def this(modelType: String) = this()
    def this(modelType: Double) = this()
  }
  /* static members */
  object PrecisionModel {
    
    @JSImport("jsts", "geom.PrecisionModel")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("jsts", "geom.PrecisionModel.FIXED")
    @js.native
    def FIXED: String = js.native
    @scala.inline
    def FIXED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FIXED")(x.asInstanceOf[js.Any])
    
    @JSImport("jsts", "geom.PrecisionModel.FLOATING")
    @js.native
    def FLOATING: String = js.native
    @scala.inline
    def FLOATING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLOATING")(x.asInstanceOf[js.Any])
    
    @JSImport("jsts", "geom.PrecisionModel.FLOATING_SINGLE")
    @js.native
    def FLOATING_SINGLE: String = js.native
    @scala.inline
    def FLOATING_SINGLE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLOATING_SINGLE")(x.asInstanceOf[js.Any])
  }
  
  object util {
    
    @JSImport("jsts", "geom.util.AffineTransformation")
    @js.native
    class AffineTransformation ()
      extends typings.jsts.jsts.geom.util.AffineTransformation {
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
      
      @JSImport("jsts", "geom.util.AffineTransformation.reflectionInstance")
      @js.native
      def reflectionInstance(x0: Double, y0: Double): typings.jsts.jsts.geom.util.AffineTransformation = js.native
      @JSImport("jsts", "geom.util.AffineTransformation.reflectionInstance")
      @js.native
      def reflectionInstance(x0: Double, y0: Double, x1: js.UndefOr[scala.Nothing], y1: Double): typings.jsts.jsts.geom.util.AffineTransformation = js.native
      @JSImport("jsts", "geom.util.AffineTransformation.reflectionInstance")
      @js.native
      def reflectionInstance(x0: Double, y0: Double, x1: Double): typings.jsts.jsts.geom.util.AffineTransformation = js.native
      @JSImport("jsts", "geom.util.AffineTransformation.reflectionInstance")
      @js.native
      def reflectionInstance(x0: Double, y0: Double, x1: Double, y1: Double): typings.jsts.jsts.geom.util.AffineTransformation = js.native
      
      @JSImport("jsts", "geom.util.AffineTransformation.rotationInstance")
      @js.native
      def rotationInstance(sinTheta: Double, cosTheta: Double): typings.jsts.jsts.geom.util.AffineTransformation = js.native
      @JSImport("jsts", "geom.util.AffineTransformation.rotationInstance")
      @js.native
      def rotationInstance(sinTheta: Double, cosTheta: Double, x: Double, y: Double): typings.jsts.jsts.geom.util.AffineTransformation = js.native
      @JSImport("jsts", "geom.util.AffineTransformation.rotationInstance")
      @js.native
      def rotationInstance(theta: Double): typings.jsts.jsts.geom.util.AffineTransformation = js.native
      @JSImport("jsts", "geom.util.AffineTransformation.rotationInstance")
      @js.native
      def rotationInstance(theta: Double, x: Double, y: Double): typings.jsts.jsts.geom.util.AffineTransformation = js.native
      
      @JSImport("jsts", "geom.util.AffineTransformation.scaleInstance")
      @js.native
      def scaleInstance(xScale: Double, yScale: Double): typings.jsts.jsts.geom.util.AffineTransformation = js.native
      @JSImport("jsts", "geom.util.AffineTransformation.scaleInstance")
      @js.native
      def scaleInstance(xScale: Double, yScale: Double, x: js.UndefOr[scala.Nothing], y: Double): typings.jsts.jsts.geom.util.AffineTransformation = js.native
      @JSImport("jsts", "geom.util.AffineTransformation.scaleInstance")
      @js.native
      def scaleInstance(xScale: Double, yScale: Double, x: Double): typings.jsts.jsts.geom.util.AffineTransformation = js.native
      @JSImport("jsts", "geom.util.AffineTransformation.scaleInstance")
      @js.native
      def scaleInstance(xScale: Double, yScale: Double, x: Double, y: Double): typings.jsts.jsts.geom.util.AffineTransformation = js.native
      
      @JSImport("jsts", "geom.util.AffineTransformation.shearInstance")
      @js.native
      def shearInstance(xShear: Double, yShear: Double): typings.jsts.jsts.geom.util.AffineTransformation = js.native
      
      @JSImport("jsts", "geom.util.AffineTransformation.translationInstance")
      @js.native
      def translationInstance(x: Double, y: Double): typings.jsts.jsts.geom.util.AffineTransformation = js.native
    }
  }
}
