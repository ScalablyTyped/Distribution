package typings.lineSegmentsIntersect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(seg1: Segment, seg2: Segment): Boolean = (^.asInstanceOf[js.Dynamic].apply(seg1.asInstanceOf[js.Any], seg2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(seg1: Segment, seg2: Segment, precision: Double): Boolean = (^.asInstanceOf[js.Dynamic].apply(seg1.asInstanceOf[js.Any], seg2.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("line-segments-intersect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Point = js.Tuple2[Double, Double]
  
  type Segment = js.Tuple2[Point, Point]
}
