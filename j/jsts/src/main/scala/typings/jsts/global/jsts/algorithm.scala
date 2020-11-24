package typings.jsts.global.jsts

import typings.jsts.jsts.geom.Coordinate
import typings.jsts.jsts.geom.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("jsts.algorithm")
@js.native
object algorithm extends js.Object {
  
  @js.native
  class BoundaryNodeRule ()
    extends typings.jsts.jsts.algorithm.BoundaryNodeRule
  
  @js.native
  class Orientation ()
    extends typings.jsts.jsts.algorithm.Orientation
  /* static members */
  @js.native
  object Orientation extends js.Object {
    
    var CLOCKWISE: Double = js.native
    
    var COLLINEAR: Double = js.native
    
    var COUNTERCLOCKWISE: Double = js.native
    
    var LEFT: Double = js.native
    
    var RIGHT: Double = js.native
    
    var STRAIGHT: Double = js.native
    
    def index(p1: Point, p2: Point, q: Point): Double = js.native
    
    def isCCW(ring: js.Array[Coordinate]): Boolean = js.native
  }
}
