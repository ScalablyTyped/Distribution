package typings.jsts.mod

import typings.jsts.jsts.algorithm.BoundaryNodeRule
import typings.jsts.jsts.geom.Geometry
import typings.jsts.jsts.geom.IntersectionMatrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

