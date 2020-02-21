package typings.jsts.jsts

import typings.jsts.jsts.algorithm.BoundaryNodeRule
import typings.jsts.jsts.geom.Geometry
import typings.jsts.jsts.geom.IntersectionMatrix
import typings.jsts.jsts.geom.PrecisionModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsts.operation")
@js.native
object operation extends js.Object {
  @js.native
  class GeometryGraphOperation protected () extends js.Object {
    def this(g0: Geometry) = this()
    def this(g0: Geometry, g1: Geometry) = this()
    def this(g0: Geometry, g1: Geometry, boundaryNodeRule: BoundaryNodeRule) = this()
    def getArgGeometry(i: Double): Geometry = js.native
    def setComputationPrecision(pm: PrecisionModel): Unit = js.native
  }
  
  @js.native
  object relate extends js.Object {
    @js.native
    class RelateOp protected () extends GeometryGraphOperation {
      def this(g1: Geometry, g2: Geometry) = this()
      def this(g1: Geometry, g2: Geometry, boundaryNodeRule: BoundaryNodeRule) = this()
      def getIntersectionMatrix(): IntersectionMatrix = js.native
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

