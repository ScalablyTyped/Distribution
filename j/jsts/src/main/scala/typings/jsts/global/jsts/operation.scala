package typings.jsts.global.jsts

import typings.jsts.jsts.algorithm.BoundaryNodeRule
import typings.jsts.jsts.geom.Geometry
import typings.jsts.jsts.geom.IntersectionMatrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operation {
  
  @JSGlobal("jsts.operation.GeometryGraphOperation")
  @js.native
  class GeometryGraphOperation protected ()
    extends typings.jsts.jsts.operation.GeometryGraphOperation {
    def this(g0: Geometry) = this()
    def this(g0: Geometry, g1: Geometry) = this()
    def this(g0: Geometry, g1: Geometry, boundaryNodeRule: BoundaryNodeRule) = this()
  }
  
  object buffer {
    
    @JSGlobal("jsts.operation.buffer.BufferOp")
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
        * @type {int}
        */
      @JSGlobal("jsts.operation.buffer.BufferOp.MAX_PRECISION_DIGITS")
      @js.native
      def MAX_PRECISION_DIGITS: Double = js.native
      @scala.inline
      def MAX_PRECISION_DIGITS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_PRECISION_DIGITS")(x.asInstanceOf[js.Any])
      
      /**
        * Computes the buffer of a geometry for a given buffer distance.
        *
        * @param {Geometry}
        *          g the geometry to buffer.
        * @param {double}
        *          distance the buffer distance.
        * @return {Geometry} the buffer of the input geometry.
        */
      @JSGlobal("jsts.operation.buffer.BufferOp.bufferOp")
      @js.native
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
      @JSGlobal("jsts.operation.buffer.BufferOp.bufferOp2")
      @js.native
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
      @JSGlobal("jsts.operation.buffer.BufferOp.bufferOp3")
      @js.native
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
      @JSGlobal("jsts.operation.buffer.BufferOp.bufferOp4")
      @js.native
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
      @JSGlobal("jsts.operation.buffer.BufferOp.precisionScaleFactor")
      @js.native
      def precisionScaleFactor(g: Geometry, distance: Double, maxPrecisionDigits: Double): Double = js.native
    }
    
    @JSGlobal("jsts.operation.buffer.BufferParameters")
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
    object BufferParameters {
      
      @JSGlobal("jsts.operation.buffer.BufferParameters")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Specifies a flat line buffer end cap style.
        *
        * @type {int}
        */
      @JSGlobal("jsts.operation.buffer.BufferParameters.CAP_FLAT")
      @js.native
      def CAP_FLAT: Double = js.native
      @scala.inline
      def CAP_FLAT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CAP_FLAT")(x.asInstanceOf[js.Any])
      
      /**
        * Specifies a round line buffer end cap style.
        *
        * @type {int}
        */
      @JSGlobal("jsts.operation.buffer.BufferParameters.CAP_ROUND")
      @js.native
      def CAP_ROUND: Double = js.native
      @scala.inline
      def CAP_ROUND_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CAP_ROUND")(x.asInstanceOf[js.Any])
      
      /**
        * Specifies a square line buffer end cap style.
        *
        * @type {int}
        */
      @JSGlobal("jsts.operation.buffer.BufferParameters.CAP_SQUARE")
      @js.native
      def CAP_SQUARE: Double = js.native
      @scala.inline
      def CAP_SQUARE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CAP_SQUARE")(x.asInstanceOf[js.Any])
      
      /**
        * The default mitre limit Allows fairly pointy mitres.
        *
        * @type {double}
        */
      @JSGlobal("jsts.operation.buffer.BufferParameters.DEFAULT_MITRE_LIMIT")
      @js.native
      def DEFAULT_MITRE_LIMIT: Double = js.native
      @scala.inline
      def DEFAULT_MITRE_LIMIT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MITRE_LIMIT")(x.asInstanceOf[js.Any])
      
      /**
        * The default number of facets into which to divide a fillet of 90 degrees. A
        * value of 8 gives less than 2% max error in the buffer distance. For a max
        * error of < 1%, use QS = 12. For a max error of < 0.1%, use QS = 18.
        *
        * @type {int}
        */
      @JSGlobal("jsts.operation.buffer.BufferParameters.DEFAULT_QUADRANT_SEGMENTS")
      @js.native
      def DEFAULT_QUADRANT_SEGMENTS: Double = js.native
      @scala.inline
      def DEFAULT_QUADRANT_SEGMENTS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_QUADRANT_SEGMENTS")(x.asInstanceOf[js.Any])
      
      /**
        * Specifies a bevel join style.
        *
        * @type {int}
        */
      @JSGlobal("jsts.operation.buffer.BufferParameters.JOIN_BEVEL")
      @js.native
      def JOIN_BEVEL: Double = js.native
      @scala.inline
      def JOIN_BEVEL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JOIN_BEVEL")(x.asInstanceOf[js.Any])
      
      /**
        * Specifies a mitre join style.
        */
      @JSGlobal("jsts.operation.buffer.BufferParameters.JOIN_MITRE")
      @js.native
      def JOIN_MITRE: Double = js.native
      @scala.inline
      def JOIN_MITRE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JOIN_MITRE")(x.asInstanceOf[js.Any])
      
      /**
        * Specifies a round join style.
        *
        * @type {int}
        */
      @JSGlobal("jsts.operation.buffer.BufferParameters.JOIN_ROUND")
      @js.native
      def JOIN_ROUND: Double = js.native
      @scala.inline
      def JOIN_ROUND_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JOIN_ROUND")(x.asInstanceOf[js.Any])
    }
  }
  
  object relate {
    
    @JSGlobal("jsts.operation.relate.RelateOp")
    @js.native
    class RelateOp protected ()
      extends typings.jsts.jsts.operation.relate.RelateOp {
      def this(g1: Geometry, g2: Geometry) = this()
      def this(g1: Geometry, g2: Geometry, boundaryNodeRule: BoundaryNodeRule) = this()
    }
    /* static members */
    object RelateOp {
      
      @JSGlobal("jsts.operation.relate.RelateOp.contains")
      @js.native
      def contains(g1: Geometry, g2: Geometry): Boolean = js.native
      
      @JSGlobal("jsts.operation.relate.RelateOp.covers")
      @js.native
      def covers(g1: Geometry, g2: Geometry): Boolean = js.native
      
      @JSGlobal("jsts.operation.relate.RelateOp.crosses")
      @js.native
      def crosses(g1: Geometry, g2: Geometry): Boolean = js.native
      
      @JSGlobal("jsts.operation.relate.RelateOp.equalsTopo")
      @js.native
      def equalsTopo(g1: Geometry, g2: Geometry): Boolean = js.native
      
      @JSGlobal("jsts.operation.relate.RelateOp.intersects")
      @js.native
      def intersects(g1: Geometry, g2: Geometry): Boolean = js.native
      
      @JSGlobal("jsts.operation.relate.RelateOp.overlaps")
      @js.native
      def overlaps(g1: Geometry, g2: Geometry): Boolean = js.native
      
      @JSGlobal("jsts.operation.relate.RelateOp.relate")
      @js.native
      def relate(g1: Geometry, g2: Geometry): IntersectionMatrix = js.native
      @JSGlobal("jsts.operation.relate.RelateOp.relate")
      @js.native
      def relate(g1: Geometry, g2: Geometry, boundaryNodeRule: BoundaryNodeRule): IntersectionMatrix = js.native
      
      @JSGlobal("jsts.operation.relate.RelateOp.touches")
      @js.native
      def touches(g1: Geometry, g2: Geometry): Boolean = js.native
    }
  }
}
