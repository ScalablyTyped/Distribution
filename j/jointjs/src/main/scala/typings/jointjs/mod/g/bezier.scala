package typings.jointjs.mod.g

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bezier {
  
  @JSImport("jointjs", "g.bezier")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def curveThroughPoints(points: js.Array[PlainPoint | Point]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("curveThroughPoints")(points.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def getCurveControlPoints(points: js.Array[PlainPoint | Point]): js.Tuple2[js.Array[Point], js.Array[Point]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurveControlPoints")(points.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Array[Point], js.Array[Point]]]
  
  @scala.inline
  def getCurveDivider(p0: String, p1: String, p2: String, p3: String): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurveDivider")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]]]
  @scala.inline
  def getCurveDivider(p0: String, p1: String, p2: String, p3: PlainPoint): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurveDivider")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]]]
  @scala.inline
  def getCurveDivider(p0: String, p1: String, p2: PlainPoint, p3: String): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurveDivider")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]]]
  @scala.inline
  def getCurveDivider(p0: String, p1: String, p2: PlainPoint, p3: PlainPoint): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurveDivider")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]]]
  @scala.inline
  def getCurveDivider(p0: String, p1: PlainPoint, p2: String, p3: String): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurveDivider")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]]]
  @scala.inline
  def getCurveDivider(p0: String, p1: PlainPoint, p2: String, p3: PlainPoint): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurveDivider")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]]]
  @scala.inline
  def getCurveDivider(p0: String, p1: PlainPoint, p2: PlainPoint, p3: String): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurveDivider")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]]]
  @scala.inline
  def getCurveDivider(p0: String, p1: PlainPoint, p2: PlainPoint, p3: PlainPoint): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurveDivider")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]]]
  @scala.inline
  def getCurveDivider(p0: PlainPoint, p1: String, p2: String, p3: String): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurveDivider")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]]]
  @scala.inline
  def getCurveDivider(p0: PlainPoint, p1: String, p2: String, p3: PlainPoint): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurveDivider")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]]]
  @scala.inline
  def getCurveDivider(p0: PlainPoint, p1: String, p2: PlainPoint, p3: String): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurveDivider")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]]]
  @scala.inline
  def getCurveDivider(p0: PlainPoint, p1: String, p2: PlainPoint, p3: PlainPoint): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurveDivider")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]]]
  @scala.inline
  def getCurveDivider(p0: PlainPoint, p1: PlainPoint, p2: String, p3: String): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurveDivider")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]]]
  @scala.inline
  def getCurveDivider(p0: PlainPoint, p1: PlainPoint, p2: String, p3: PlainPoint): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurveDivider")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]]]
  @scala.inline
  def getCurveDivider(p0: PlainPoint, p1: PlainPoint, p2: PlainPoint, p3: String): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurveDivider")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]]]
  @scala.inline
  def getCurveDivider(p0: PlainPoint, p1: PlainPoint, p2: PlainPoint, p3: PlainPoint): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurveDivider")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]]]
  
  @scala.inline
  def getFirstControlPoints(rhs: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstControlPoints")(rhs.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def getInversionSolver(p0: PlainPoint, p1: PlainPoint, p2: PlainPoint, p3: PlainPoint): js.Function1[/* p */ PlainPoint, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getInversionSolver")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* p */ PlainPoint, Double]]
  
  trait IBezierCurve extends StObject {
    
    var p0: Point
    
    var p1: Point
    
    var p2: Point
    
    var p3: Point
  }
  object IBezierCurve {
    
    @scala.inline
    def apply(p0: Point, p1: Point, p2: Point, p3: Point): IBezierCurve = {
      val __obj = js.Dynamic.literal(p0 = p0.asInstanceOf[js.Any], p1 = p1.asInstanceOf[js.Any], p2 = p2.asInstanceOf[js.Any], p3 = p3.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBezierCurve]
    }
    
    @scala.inline
    implicit class IBezierCurveMutableBuilder[Self <: IBezierCurve] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setP0(value: Point): Self = StObject.set(x, "p0", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP1(value: Point): Self = StObject.set(x, "p1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP2(value: Point): Self = StObject.set(x, "p2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP3(value: Point): Self = StObject.set(x, "p3", value.asInstanceOf[js.Any])
    }
  }
}
