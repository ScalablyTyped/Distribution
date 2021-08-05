package typings.jsts.mod

import typings.jsts.jsts.geom.Coordinate
import typings.jsts.jsts.geom.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object algorithm {
  
  @JSImport("jsts", "algorithm.BoundaryNodeRule")
  @js.native
  class BoundaryNodeRule ()
    extends StObject
       with typings.jsts.jsts.algorithm.BoundaryNodeRule
  
  @JSImport("jsts", "algorithm.Orientation")
  @js.native
  class Orientation ()
    extends StObject
       with typings.jsts.jsts.algorithm.Orientation
  /* static members */
  object Orientation {
    
    @JSImport("jsts", "algorithm.Orientation")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("jsts", "algorithm.Orientation.CLOCKWISE")
    @js.native
    def CLOCKWISE: Double = js.native
    inline def CLOCKWISE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOCKWISE")(x.asInstanceOf[js.Any])
    
    @JSImport("jsts", "algorithm.Orientation.COLLINEAR")
    @js.native
    def COLLINEAR: Double = js.native
    inline def COLLINEAR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLLINEAR")(x.asInstanceOf[js.Any])
    
    @JSImport("jsts", "algorithm.Orientation.COUNTERCLOCKWISE")
    @js.native
    def COUNTERCLOCKWISE: Double = js.native
    inline def COUNTERCLOCKWISE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COUNTERCLOCKWISE")(x.asInstanceOf[js.Any])
    
    @JSImport("jsts", "algorithm.Orientation.LEFT")
    @js.native
    def LEFT: Double = js.native
    inline def LEFT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEFT")(x.asInstanceOf[js.Any])
    
    @JSImport("jsts", "algorithm.Orientation.RIGHT")
    @js.native
    def RIGHT: Double = js.native
    inline def RIGHT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RIGHT")(x.asInstanceOf[js.Any])
    
    @JSImport("jsts", "algorithm.Orientation.STRAIGHT")
    @js.native
    def STRAIGHT: Double = js.native
    inline def STRAIGHT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STRAIGHT")(x.asInstanceOf[js.Any])
    
    inline def index(p1: Point, p2: Point, q: Point): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("index")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def isCCW(ring: js.Array[Coordinate]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCCW")(ring.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
