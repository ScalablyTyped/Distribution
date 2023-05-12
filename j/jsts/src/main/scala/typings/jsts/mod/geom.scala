package typings.jsts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geom {
  
  @JSImport("jsts", "geom.Coordinate")
  @js.native
  /**
    */
  open class Coordinate ()
    extends StObject
       with typings.jsts.jsts.geom.Coordinate {
    /**
      */
    def this(c: typings.jsts.jsts.geom.Coordinate) = this()
    /**
      */
    def this(x: Double, y: Double) = this()
    /**
      */
    def this(x: Double, y: Double, z: Double) = this()
    
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
  
  @JSImport("jsts", "geom.CoordinateSequence")
  @js.native
  open class CoordinateSequence ()
    extends StObject
       with typings.jsts.jsts.geom.CoordinateSequence
  /* static members */
  object CoordinateSequence {
    
    @JSImport("jsts", "geom.CoordinateSequence")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("jsts", "geom.CoordinateSequence.M")
    @js.native
    def M: Double = js.native
    inline def M_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("M")(x.asInstanceOf[js.Any])
    
    @JSImport("jsts", "geom.CoordinateSequence.X")
    @js.native
    def X: Double = js.native
    inline def X_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("X")(x.asInstanceOf[js.Any])
    
    @JSImport("jsts", "geom.CoordinateSequence.Y")
    @js.native
    def Y: Double = js.native
    inline def Y_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Y")(x.asInstanceOf[js.Any])
    
    @JSImport("jsts", "geom.CoordinateSequence.Z")
    @js.native
    def Z: Double = js.native
    inline def Z_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Z")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("jsts", "geom.Envelope")
  @js.native
  open class Envelope protected ()
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
    
    @JSImport("jsts", "geom.Envelope")
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
    inline def intersects(
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
    inline def intersectsEnvelope(
      p1: typings.jsts.jsts.geom.Coordinate,
      p2: typings.jsts.jsts.geom.Coordinate,
      q1: typings.jsts.jsts.geom.Coordinate,
      q2: typings.jsts.jsts.geom.Coordinate
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectsEnvelope")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], q1.asInstanceOf[js.Any], q2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  @JSImport("jsts", "geom.Geometry")
  @js.native
  /**
    * Creates a new <tt>Geometry</tt> via the specified GeometryFactory.
    */
  open class Geometry ()
    extends StObject
       with typings.jsts.jsts.geom.Geometry {
    def this(factory: Any) = this()
  }
  
  @JSImport("jsts", "geom.GeometryCollection")
  @js.native
  open class GeometryCollection ()
    extends StObject
       with typings.jsts.jsts.geom.Geometry {
    def this(geometries: js.Array[typings.jsts.jsts.geom.Geometry]) = this()
    def this(
      geometries: js.Array[typings.jsts.jsts.geom.Geometry],
      factory: typings.jsts.jsts.geom.GeometryFactory
    ) = this()
    def this(geometries: Unit, factory: typings.jsts.jsts.geom.GeometryFactory) = this()
  }
  
  @JSImport("jsts", "geom.GeometryFactory")
  @js.native
  /**
    * Constructs a GeometryFactory that generates Geometries having a floating PrecisionModel and a spatial-reference ID of 0.
    */
  open class GeometryFactory ()
    extends StObject
       with typings.jsts.jsts.geom.GeometryFactory {
    def this(precisionModel: typings.jsts.jsts.geom.PrecisionModel) = this()
  }
  
  @JSImport("jsts", "geom.IntersectionMatrix")
  @js.native
  open class IntersectionMatrix ()
    extends StObject
       with typings.jsts.jsts.geom.IntersectionMatrix {
    def this(elements: js.Array[String]) = this()
    def this(other: typings.jsts.jsts.geom.IntersectionMatrix) = this()
  }
  /* static members */
  object IntersectionMatrix {
    
    @JSImport("jsts", "geom.IntersectionMatrix")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isTrue(actualDimensionValue: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTrue")(actualDimensionValue.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def matches(actualDimensionSymbols: String, requiredDimensionSymbols: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matches")(actualDimensionSymbols.asInstanceOf[js.Any], requiredDimensionSymbols.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def matches(actualDimensionValue: Double, requiredDimensionSymbol: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matches")(actualDimensionValue.asInstanceOf[js.Any], requiredDimensionSymbol.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  @JSImport("jsts", "geom.LineSegment")
  @js.native
  open class LineSegment protected ()
    extends StObject
       with typings.jsts.jsts.geom.LineSegment {
    def this(p0: typings.jsts.jsts.geom.Coordinate, p1: typings.jsts.jsts.geom.Coordinate) = this()
  }
  /* static members */
  object LineSegment {
    
    @JSImport("jsts", "geom.LineSegment")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Computes the midpoint of a segment
      *
      * @param {jsts.geom.Coordinate} p0
      * @param {jsts.geom.Coordinate} p1
      * @return {jsts.geom.Coordinate} the midpoint of the segment
      */
    inline def midPoint(p0: typings.jsts.jsts.geom.Coordinate, p1: typings.jsts.jsts.geom.Coordinate): typings.jsts.jsts.geom.Coordinate = (^.asInstanceOf[js.Dynamic].applyDynamic("midPoint")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any])).asInstanceOf[typings.jsts.jsts.geom.Coordinate]
  }
  
  @JSImport("jsts", "geom.LineString")
  @js.native
  open class LineString protected ()
    extends StObject
       with typings.jsts.jsts.geom.LineString {
    /**
      */
    def this(points: js.Array[typings.jsts.jsts.geom.Coordinate]) = this()
    def this(points: js.Array[typings.jsts.jsts.geom.Coordinate], factory: Any) = this()
  }
  
  @JSImport("jsts", "geom.LinearRing")
  @js.native
  open class LinearRing ()
    extends StObject
       with typings.jsts.jsts.geom.LineString
  
  @JSImport("jsts", "geom.MultiLineString")
  @js.native
  open class MultiLineString protected ()
    extends StObject
       with typings.jsts.jsts.geom.MultiLineString {
    /**
      * @construtor
      */
    def this(
      lineStrings: js.Array[typings.jsts.jsts.geom.LineString],
      factory: typings.jsts.jsts.geom.GeometryFactory
    ) = this()
    /**
      * @deprecated Use GeometryFactory instead
      */
    def this(
      lineStrings: js.Array[typings.jsts.jsts.geom.LineString],
      precisionModel: typings.jsts.jsts.geom.PrecisionModel,
      SRID: Double
    ) = this()
  }
  
  @JSImport("jsts", "geom.MultiPoint")
  @js.native
  open class MultiPoint protected ()
    extends StObject
       with typings.jsts.jsts.geom.MultiPoint {
    /**
      */
    def this(points: js.Array[typings.jsts.jsts.geom.Point], factory: typings.jsts.jsts.geom.GeometryFactory) = this()
    /**
      * @deprecated Use GeometryFactory instead
      */
    def this(
      points: js.Array[typings.jsts.jsts.geom.Point],
      precisionModel: typings.jsts.jsts.geom.PrecisionModel,
      SRID: Double
    ) = this()
  }
  
  @JSImport("jsts", "geom.MultiPolygon")
  @js.native
  open class MultiPolygon protected ()
    extends StObject
       with typings.jsts.jsts.geom.Geometry {
    def this(
      polygons: js.Array[typings.jsts.jsts.geom.Polygon],
      factory: typings.jsts.jsts.geom.GeometryFactory
    ) = this()
    /**
      * polygons - the Polygons for this MultiPolygon, or null or an empty
      * array to create the empty geometry. Elements may be empty Polygons,
      * but not nulls. The polygons must conform to the assertions specified
      * in the OpenGIS Simple Features Specification for SQL.
      */
    def this(polygons: Null, factory: typings.jsts.jsts.geom.GeometryFactory) = this()
  }
  
  @JSImport("jsts", "geom.Point")
  @js.native
  open class Point protected ()
    extends StObject
       with typings.jsts.jsts.geom.Point {
    /**
      */
    def this(coordinate: typings.jsts.jsts.geom.Coordinate) = this()
    def this(coordinate: typings.jsts.jsts.geom.Coordinate, factory: Any) = this()
  }
  
  @JSImport("jsts", "geom.Polygon")
  @js.native
  open class Polygon protected ()
    extends StObject
       with typings.jsts.jsts.geom.Polygon {
    /**
      */
    def this(shell: typings.jsts.jsts.geom.LinearRing) = this()
    def this(shell: typings.jsts.jsts.geom.LinearRing, holes: js.Array[typings.jsts.jsts.geom.LinearRing]) = this()
    def this(
      shell: typings.jsts.jsts.geom.LinearRing,
      holes: js.Array[typings.jsts.jsts.geom.LinearRing],
      factory: Any
    ) = this()
    def this(shell: typings.jsts.jsts.geom.LinearRing, holes: Unit, factory: Any) = this()
  }
  
  @JSImport("jsts", "geom.PrecisionModel")
  @js.native
  /**
    *
    * @param modelType
    */
  open class PrecisionModel ()
    extends StObject
       with typings.jsts.jsts.geom.PrecisionModel {
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
    inline def FIXED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FIXED")(x.asInstanceOf[js.Any])
    
    @JSImport("jsts", "geom.PrecisionModel.FLOATING")
    @js.native
    def FLOATING: String = js.native
    inline def FLOATING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLOATING")(x.asInstanceOf[js.Any])
    
    @JSImport("jsts", "geom.PrecisionModel.FLOATING_SINGLE")
    @js.native
    def FLOATING_SINGLE: String = js.native
    inline def FLOATING_SINGLE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLOATING_SINGLE")(x.asInstanceOf[js.Any])
  }
  
  object util {
    
    @JSImport("jsts", "geom.util.AffineTransformation")
    @js.native
    open class AffineTransformation ()
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
      
      @JSImport("jsts", "geom.util.AffineTransformation")
      @js.native
      val ^ : js.Any = js.native
      
      inline def reflectionInstance(x0: Double, y0: Double): typings.jsts.jsts.geom.util.AffineTransformation = (^.asInstanceOf[js.Dynamic].applyDynamic("reflectionInstance")(x0.asInstanceOf[js.Any], y0.asInstanceOf[js.Any])).asInstanceOf[typings.jsts.jsts.geom.util.AffineTransformation]
      inline def reflectionInstance(x0: Double, y0: Double, x1: Double): typings.jsts.jsts.geom.util.AffineTransformation = (^.asInstanceOf[js.Dynamic].applyDynamic("reflectionInstance")(x0.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], x1.asInstanceOf[js.Any])).asInstanceOf[typings.jsts.jsts.geom.util.AffineTransformation]
      inline def reflectionInstance(x0: Double, y0: Double, x1: Double, y1: Double): typings.jsts.jsts.geom.util.AffineTransformation = (^.asInstanceOf[js.Dynamic].applyDynamic("reflectionInstance")(x0.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[typings.jsts.jsts.geom.util.AffineTransformation]
      inline def reflectionInstance(x0: Double, y0: Double, x1: Unit, y1: Double): typings.jsts.jsts.geom.util.AffineTransformation = (^.asInstanceOf[js.Dynamic].applyDynamic("reflectionInstance")(x0.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[typings.jsts.jsts.geom.util.AffineTransformation]
      
      inline def rotationInstance(sinTheta: Double, cosTheta: Double): typings.jsts.jsts.geom.util.AffineTransformation = (^.asInstanceOf[js.Dynamic].applyDynamic("rotationInstance")(sinTheta.asInstanceOf[js.Any], cosTheta.asInstanceOf[js.Any])).asInstanceOf[typings.jsts.jsts.geom.util.AffineTransformation]
      inline def rotationInstance(sinTheta: Double, cosTheta: Double, x: Double, y: Double): typings.jsts.jsts.geom.util.AffineTransformation = (^.asInstanceOf[js.Dynamic].applyDynamic("rotationInstance")(sinTheta.asInstanceOf[js.Any], cosTheta.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.jsts.jsts.geom.util.AffineTransformation]
      inline def rotationInstance(theta: Double): typings.jsts.jsts.geom.util.AffineTransformation = ^.asInstanceOf[js.Dynamic].applyDynamic("rotationInstance")(theta.asInstanceOf[js.Any]).asInstanceOf[typings.jsts.jsts.geom.util.AffineTransformation]
      inline def rotationInstance(theta: Double, x: Double, y: Double): typings.jsts.jsts.geom.util.AffineTransformation = (^.asInstanceOf[js.Dynamic].applyDynamic("rotationInstance")(theta.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.jsts.jsts.geom.util.AffineTransformation]
      
      inline def scaleInstance(xScale: Double, yScale: Double): typings.jsts.jsts.geom.util.AffineTransformation = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleInstance")(xScale.asInstanceOf[js.Any], yScale.asInstanceOf[js.Any])).asInstanceOf[typings.jsts.jsts.geom.util.AffineTransformation]
      inline def scaleInstance(xScale: Double, yScale: Double, x: Double): typings.jsts.jsts.geom.util.AffineTransformation = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleInstance")(xScale.asInstanceOf[js.Any], yScale.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[typings.jsts.jsts.geom.util.AffineTransformation]
      inline def scaleInstance(xScale: Double, yScale: Double, x: Double, y: Double): typings.jsts.jsts.geom.util.AffineTransformation = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleInstance")(xScale.asInstanceOf[js.Any], yScale.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.jsts.jsts.geom.util.AffineTransformation]
      inline def scaleInstance(xScale: Double, yScale: Double, x: Unit, y: Double): typings.jsts.jsts.geom.util.AffineTransformation = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleInstance")(xScale.asInstanceOf[js.Any], yScale.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.jsts.jsts.geom.util.AffineTransformation]
      
      inline def shearInstance(xShear: Double, yShear: Double): typings.jsts.jsts.geom.util.AffineTransformation = (^.asInstanceOf[js.Dynamic].applyDynamic("shearInstance")(xShear.asInstanceOf[js.Any], yShear.asInstanceOf[js.Any])).asInstanceOf[typings.jsts.jsts.geom.util.AffineTransformation]
      
      inline def translationInstance(x: Double, y: Double): typings.jsts.jsts.geom.util.AffineTransformation = (^.asInstanceOf[js.Dynamic].applyDynamic("translationInstance")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.jsts.jsts.geom.util.AffineTransformation]
    }
  }
}
