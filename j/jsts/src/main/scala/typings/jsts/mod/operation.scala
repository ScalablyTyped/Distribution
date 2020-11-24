package typings.jsts.mod

import typings.jsts.jsts.algorithm.BoundaryNodeRule
import typings.jsts.jsts.geom.Geometry
import typings.jsts.jsts.geom.IntersectionMatrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsts", "operation")
@js.native
object operation extends js.Object {
  
  @js.native
  class GeometryGraphOperation protected ()
    extends typings.jsts.jsts.operation.GeometryGraphOperation {
    def this(g0: Geometry) = this()
    def this(g0: Geometry, g1: Geometry) = this()
    def this(g0: Geometry, g1: Geometry, boundaryNodeRule: BoundaryNodeRule) = this()
  }
  
  @js.native
  object buffer extends js.Object {
    
    @js.native
    class BufferOp protected ()
      extends typings.jsts.jsts.operation.buffer.BufferOp {
      /**
        * Initializes a buffer computation for the given geometry with the given set of
        * parameters.
        *
        * @param {Geometry}
        *          g the geometry to buffer.
        * @param {BufferParameters}
        *          bufParams the buffer parameters to use.
        * @constructor
        */
      def this(g: Geometry, bufParams: typings.jsts.jsts.operation.buffer.BufferParameters) = this()
    }
    /* static members */
    @js.native
    object BufferOp extends js.Object {
      
      /**
        * A number of digits of precision which leaves some computational "headroom"
        * for floating point operations.
        *
        * This value should be less than the decimal precision of double-precision
        * values (16).
        *
        * @type {int}
        */
      var MAX_PRECISION_DIGITS: Double = js.native
      
      /**
        * Computes the buffer of a geometry for a given buffer distance.
        *
        * @param {Geometry}
        *          g the geometry to buffer.
        * @param {double}
        *          distance the buffer distance.
        * @return {Geometry} the buffer of the input geometry.
        */
      def bufferOp(g: Geometry, distance: Double): Geometry = js.native
      
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
      def bufferOp2(g: Geometry, distance: Double, params: typings.jsts.jsts.operation.buffer.BufferParameters): Geometry = js.native
      
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
      def bufferOp3(g: Geometry, distance: Double, quadrantSegments: Double): Geometry = js.native
      
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
      def bufferOp4(g: Geometry, distance: Double, quadrantSegments: Double, endCapStyle: Double): Geometry = js.native
      
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
      def precisionScaleFactor(g: Geometry, distance: Double, maxPrecisionDigits: Double): Double = js.native
    }
    
    @js.native
    /**
      * Contains the parameters which describe how a buffer should be constructed.
      *
      * @constructor
      */
    class BufferParameters ()
      extends typings.jsts.jsts.operation.buffer.BufferParameters {
      def this(quadrantSegments: Double) = this()
      def this(quadrantSegments: js.UndefOr[scala.Nothing], endCapStyle: Double) = this()
      def this(quadrantSegments: Double, endCapStyle: Double) = this()
      def this(
        quadrantSegments: js.UndefOr[scala.Nothing],
        endCapStyle: js.UndefOr[scala.Nothing],
        joinStyle: Double
      ) = this()
      def this(quadrantSegments: js.UndefOr[scala.Nothing], endCapStyle: Double, joinStyle: Double) = this()
      def this(quadrantSegments: Double, endCapStyle: js.UndefOr[scala.Nothing], joinStyle: Double) = this()
      def this(quadrantSegments: Double, endCapStyle: Double, joinStyle: Double) = this()
      def this(
        quadrantSegments: js.UndefOr[scala.Nothing],
        endCapStyle: js.UndefOr[scala.Nothing],
        joinStyle: js.UndefOr[scala.Nothing],
        mitreLimit: Double
      ) = this()
      def this(
        quadrantSegments: js.UndefOr[scala.Nothing],
        endCapStyle: js.UndefOr[scala.Nothing],
        joinStyle: Double,
        mitreLimit: Double
      ) = this()
      def this(
        quadrantSegments: js.UndefOr[scala.Nothing],
        endCapStyle: Double,
        joinStyle: js.UndefOr[scala.Nothing],
        mitreLimit: Double
      ) = this()
      def this(
        quadrantSegments: js.UndefOr[scala.Nothing],
        endCapStyle: Double,
        joinStyle: Double,
        mitreLimit: Double
      ) = this()
      def this(
        quadrantSegments: Double,
        endCapStyle: js.UndefOr[scala.Nothing],
        joinStyle: js.UndefOr[scala.Nothing],
        mitreLimit: Double
      ) = this()
      def this(
        quadrantSegments: Double,
        endCapStyle: js.UndefOr[scala.Nothing],
        joinStyle: Double,
        mitreLimit: Double
      ) = this()
      def this(
        quadrantSegments: Double,
        endCapStyle: Double,
        joinStyle: js.UndefOr[scala.Nothing],
        mitreLimit: Double
      ) = this()
      def this(quadrantSegments: Double, endCapStyle: Double, joinStyle: Double, mitreLimit: Double) = this()
    }
    /* static members */
    @js.native
    object BufferParameters extends js.Object {
      
      /**
        * Specifies a flat line buffer end cap style.
        *
        * @type {int}
        */
      var CAP_FLAT: Double = js.native
      
      /**
        * Specifies a round line buffer end cap style.
        *
        * @type {int}
        */
      var CAP_ROUND: Double = js.native
      
      /**
        * Specifies a square line buffer end cap style.
        *
        * @type {int}
        */
      var CAP_SQUARE: Double = js.native
      
      /**
        * The default mitre limit Allows fairly pointy mitres.
        *
        * @type {double}
        */
      var DEFAULT_MITRE_LIMIT: Double = js.native
      
      /**
        * The default number of facets into which to divide a fillet of 90 degrees. A
        * value of 8 gives less than 2% max error in the buffer distance. For a max
        * error of < 1%, use QS = 12. For a max error of < 0.1%, use QS = 18.
        *
        * @type {int}
        */
      var DEFAULT_QUADRANT_SEGMENTS: Double = js.native
      
      /**
        * Specifies a bevel join style.
        *
        * @type {int}
        */
      var JOIN_BEVEL: Double = js.native
      
      /**
        * Specifies a mitre join style.
        */
      var JOIN_MITRE: Double = js.native
      
      /**
        * Specifies a round join style.
        *
        * @type {int}
        */
      var JOIN_ROUND: Double = js.native
    }
  }
  
  @js.native
  object relate extends js.Object {
    
    @js.native
    class RelateOp protected ()
      extends typings.jsts.jsts.operation.relate.RelateOp {
      def this(g1: Geometry, g2: Geometry) = this()
      def this(g1: Geometry, g2: Geometry, boundaryNodeRule: BoundaryNodeRule) = this()
    }
    /* static members */
    @js.native
    object RelateOp extends js.Object {
      
      def contains(g1: Geometry, g2: Geometry): Boolean = js.native
      
      def covers(g1: Geometry, g2: Geometry): Boolean = js.native
      
      def crosses(g1: Geometry, g2: Geometry): Boolean = js.native
      
      def equalsTopo(g1: Geometry, g2: Geometry): Boolean = js.native
      
      def intersects(g1: Geometry, g2: Geometry): Boolean = js.native
      
      def overlaps(g1: Geometry, g2: Geometry): Boolean = js.native
      
      def relate(g1: Geometry, g2: Geometry): IntersectionMatrix = js.native
      def relate(g1: Geometry, g2: Geometry, boundaryNodeRule: BoundaryNodeRule): IntersectionMatrix = js.native
      
      def touches(g1: Geometry, g2: Geometry): Boolean = js.native
    }
  }
}
