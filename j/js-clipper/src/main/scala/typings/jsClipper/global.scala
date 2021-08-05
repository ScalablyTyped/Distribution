package typings.jsClipper

import typings.jsClipper.ClipperLib.EdgeSide
import typings.jsClipper.ClipperLib.JoinType
import typings.jsClipper.ClipperLib.PolyType
import typings.jsClipper.anon.Value
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ClipperLib {
    
    @JSGlobal("ClipperLib")
    @js.native
    val ^ : js.Any = js.native
    
    inline def CastInt32(a: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Cast_Int32")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def CastInt64(a: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Cast_Int64")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def Clean(
      polygon: ArrayLike[
          ArrayLike[typings.jsClipper.ClipperLib.IntPoint] | typings.jsClipper.ClipperLib.IntPoint
        ],
      delta: Double
    ): ArrayLike[
        ArrayLike[typings.jsClipper.ClipperLib.IntPoint] | typings.jsClipper.ClipperLib.IntPoint
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("Clean")(polygon.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[ArrayLike[
        ArrayLike[typings.jsClipper.ClipperLib.IntPoint] | typings.jsClipper.ClipperLib.IntPoint
      ]]
    
    inline def Clear(a: ArrayLike[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Clear")(a.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSGlobal("ClipperLib.ClipType")
    @js.native
    object ClipType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.jsClipper.ClipperLib.ClipType & Double] = js.native
      
      /* 2 */ val ctDifference: typings.jsClipper.ClipperLib.ClipType.ctDifference & Double = js.native
      
      /* 0 */ val ctIntersection: typings.jsClipper.ClipperLib.ClipType.ctIntersection & Double = js.native
      
      /* 1 */ val ctUnion: typings.jsClipper.ClipperLib.ClipType.ctUnion & Double = js.native
      
      /* 3 */ val ctXor: typings.jsClipper.ClipperLib.ClipType.ctXor & Double = js.native
    }
    
    @JSGlobal("ClipperLib.Clipper")
    @js.native
    class Clipper ()
      extends StObject
         with typings.jsClipper.ClipperLib.Clipper
    
    @JSGlobal("ClipperLib.ClipperBase")
    @js.native
    class ClipperBase ()
      extends StObject
         with typings.jsClipper.ClipperLib.ClipperBase
    
    inline def Clone(
      polygon: ArrayLike[
          ArrayLike[typings.jsClipper.ClipperLib.IntPoint] | typings.jsClipper.ClipperLib.IntPoint
        ]
    ): ArrayLike[
        ArrayLike[typings.jsClipper.ClipperLib.IntPoint] | typings.jsClipper.ClipperLib.IntPoint
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("Clone")(polygon.asInstanceOf[js.Any]).asInstanceOf[ArrayLike[
        ArrayLike[typings.jsClipper.ClipperLib.IntPoint] | typings.jsClipper.ClipperLib.IntPoint
      ]]
    
    @JSGlobal("ClipperLib.Direction")
    @js.native
    object Direction extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.jsClipper.ClipperLib.Direction & Double] = js.native
      
      /* 1 */ val dLeftToRight: typings.jsClipper.ClipperLib.Direction.dLeftToRight & Double = js.native
      
      /* 0 */ val dRightToLeft: typings.jsClipper.ClipperLib.Direction.dRightToLeft & Double = js.native
    }
    
    @JSGlobal("ClipperLib.DoublePoint")
    @js.native
    class DoublePoint protected ()
      extends StObject
         with typings.jsClipper.ClipperLib.DoublePoint {
      def this(x: Double, y: Double) = this()
      
      /* CompleteClass */
      var X: Double = js.native
      
      /* CompleteClass */
      var Y: Double = js.native
    }
    
    @JSGlobal("ClipperLib.EdgeSide")
    @js.native
    object EdgeSide extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.jsClipper.ClipperLib.EdgeSide & Double] = js.native
      
      /* 0 */ val esLeft: typings.jsClipper.ClipperLib.EdgeSide.esLeft & Double = js.native
      
      /* 1 */ val esRight: typings.jsClipper.ClipperLib.EdgeSide.esRight & Double = js.native
    }
    
    inline def Error(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Error")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSGlobal("ClipperLib.ExPolygon")
    @js.native
    class ExPolygon ()
      extends StObject
         with typings.jsClipper.ClipperLib.ExPolygon {
      
      /* CompleteClass */
      var holes: ArrayLike[ArrayLike[typings.jsClipper.ClipperLib.IntPoint]] = js.native
      
      /* CompleteClass */
      var outer: ArrayLike[typings.jsClipper.ClipperLib.IntPoint] = js.native
    }
    
    @JSGlobal("ClipperLib.HorzJoinRec")
    @js.native
    class HorzJoinRec ()
      extends StObject
         with typings.jsClipper.ClipperLib.HorzJoinRec {
      
      /* CompleteClass */
      var edge: typings.jsClipper.ClipperLib.TEdge = js.native
      
      /* CompleteClass */
      var savedIdx: Double = js.native
    }
    
    @JSGlobal("ClipperLib.IntPoint")
    @js.native
    class IntPoint ()
      extends StObject
         with typings.jsClipper.ClipperLib.IntPoint {
      def this(PointXY: typings.jsClipper.ClipperLib.IntPoint) = this()
      def this(x: Double, y: Double) = this()
      
      /* CompleteClass */
      var X: Double = js.native
      
      /* CompleteClass */
      var Y: Double = js.native
    }
    
    @JSGlobal("ClipperLib.IntRect")
    @js.native
    class IntRect ()
      extends StObject
         with typings.jsClipper.ClipperLib.IntRect {
      def this(left: Double, top: Double, right: Double, bottom: Double) = this()
      
      /* CompleteClass */
      var bottom: Double = js.native
      
      /* CompleteClass */
      var left: Double = js.native
      
      /* CompleteClass */
      var right: Double = js.native
      
      /* CompleteClass */
      var top: Double = js.native
    }
    
    @JSGlobal("ClipperLib.IntersectNode")
    @js.native
    class IntersectNode ()
      extends StObject
         with typings.jsClipper.ClipperLib.IntersectNode {
      
      /* CompleteClass */
      var edge1: typings.jsClipper.ClipperLib.TEdge = js.native
      
      /* CompleteClass */
      var edge2: typings.jsClipper.ClipperLib.TEdge = js.native
      
      /* CompleteClass */
      var next: typings.jsClipper.ClipperLib.TEdge = js.native
      
      /* CompleteClass */
      var pt: typings.jsClipper.ClipperLib.TEdge = js.native
    }
    
    @JSGlobal("ClipperLib.JoinRec")
    @js.native
    class JoinRec ()
      extends StObject
         with typings.jsClipper.ClipperLib.JoinRec {
      
      /* CompleteClass */
      var poly1Idx: Double = js.native
      
      /* CompleteClass */
      var poly2Idx: Double = js.native
      
      /* CompleteClass */
      var pt1a: typings.jsClipper.ClipperLib.IntPoint = js.native
      
      /* CompleteClass */
      var pt1b: typings.jsClipper.ClipperLib.IntPoint = js.native
      
      /* CompleteClass */
      var pt2a: typings.jsClipper.ClipperLib.IntPoint = js.native
      
      /* CompleteClass */
      var pt2b: typings.jsClipper.ClipperLib.IntPoint = js.native
    }
    
    @JSGlobal("ClipperLib.JoinType")
    @js.native
    object JoinType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.jsClipper.ClipperLib.JoinType & Double] = js.native
      
      /* 2 */ val jtMiter: typings.jsClipper.ClipperLib.JoinType.jtMiter & Double = js.native
      
      /* 1 */ val jtRound: typings.jsClipper.ClipperLib.JoinType.jtRound & Double = js.native
      
      /* 0 */ val jtSquare: typings.jsClipper.ClipperLib.JoinType.jtSquare & Double = js.native
    }
    
    inline def Lighten(
      polygon: ArrayLike[
          ArrayLike[typings.jsClipper.ClipperLib.IntPoint] | typings.jsClipper.ClipperLib.IntPoint
        ],
      tolerance: Double
    ): ArrayLike[
        ArrayLike[typings.jsClipper.ClipperLib.IntPoint] | typings.jsClipper.ClipperLib.IntPoint
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("Lighten")(polygon.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[ArrayLike[
        ArrayLike[typings.jsClipper.ClipperLib.IntPoint] | typings.jsClipper.ClipperLib.IntPoint
      ]]
    
    @JSGlobal("ClipperLib.LocalMinima")
    @js.native
    class LocalMinima ()
      extends StObject
         with typings.jsClipper.ClipperLib.LocalMinima {
      
      /* CompleteClass */
      var Y: Double = js.native
      
      /* CompleteClass */
      var leftBound: typings.jsClipper.ClipperLib.TEdge = js.native
      
      /* CompleteClass */
      var next: typings.jsClipper.ClipperLib.TEdge = js.native
      
      /* CompleteClass */
      var rightBound: typings.jsClipper.ClipperLib.TEdge = js.native
    }
    
    inline def MathAbsDouble(a: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Math_Abs_Double")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def MathAbsInt32(a: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Math_Abs_Int32")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def MathAbsInt64(a: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Math_Abs_Int64")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def MathMaxInt32Int32(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Math_Max_Int32_Int32")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @JSGlobal("ClipperLib.MaxSteps")
    @js.native
    def MaxSteps: Double = js.native
    inline def MaxSteps_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MaxSteps")(x.asInstanceOf[js.Any])
    
    @JSGlobal("ClipperLib.OutPt")
    @js.native
    class OutPt ()
      extends StObject
         with typings.jsClipper.ClipperLib.OutPt {
      
      /* CompleteClass */
      var idx: Double = js.native
      
      /* CompleteClass */
      var next: typings.jsClipper.ClipperLib.OutPt = js.native
      
      /* CompleteClass */
      var prev: typings.jsClipper.ClipperLib.OutPt = js.native
      
      /* CompleteClass */
      var pt: typings.jsClipper.ClipperLib.OutPt = js.native
    }
    
    @JSGlobal("ClipperLib.OutRec")
    @js.native
    class OutRec ()
      extends StObject
         with typings.jsClipper.ClipperLib.OutRec {
      
      /* CompleteClass */
      var AppendLink: typings.jsClipper.ClipperLib.OutRec = js.native
      
      /* CompleteClass */
      var FirstLeft: typings.jsClipper.ClipperLib.TEdge = js.native
      
      /* CompleteClass */
      var bottomPt: typings.jsClipper.ClipperLib.OutPt = js.native
      
      /* CompleteClass */
      var idx: Double = js.native
      
      /* CompleteClass */
      var isHole: Boolean = js.native
      
      /* CompleteClass */
      var pts: typings.jsClipper.ClipperLib.OutPt = js.native
    }
    
    @JSGlobal("ClipperLib.PI")
    @js.native
    def PI: Double = js.native
    
    @JSGlobal("ClipperLib.PI2")
    @js.native
    def PI2: Double = js.native
    inline def PI2_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PI2")(x.asInstanceOf[js.Any])
    
    inline def PI_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PI")(x.asInstanceOf[js.Any])
    
    @JSGlobal("ClipperLib.PolyFillType")
    @js.native
    object PolyFillType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.jsClipper.ClipperLib.PolyFillType & Double] = js.native
      
      /* 0 */ val pftEvenOdd: typings.jsClipper.ClipperLib.PolyFillType.pftEvenOdd & Double = js.native
      
      /* 3 */ val pftNegative: typings.jsClipper.ClipperLib.PolyFillType.pftNegative & Double = js.native
      
      /* 1 */ val pftNonZero: typings.jsClipper.ClipperLib.PolyFillType.pftNonZero & Double = js.native
      
      /* 2 */ val pftPositive: typings.jsClipper.ClipperLib.PolyFillType.pftPositive & Double = js.native
    }
    
    @JSGlobal("ClipperLib.PolyOffsetBuilder")
    @js.native
    class PolyOffsetBuilder protected ()
      extends StObject
         with typings.jsClipper.ClipperLib.PolyOffsetBuilder {
      def this(
        pts: typings.jsClipper.ClipperLib.Polygons,
        solution: Value,
        delta: Double,
        jointype: JoinType,
        MiterLimit: Double,
        AutoFix: Boolean
      ) = this()
      
      /* CompleteClass */
      override def AddPoint(pt: typings.jsClipper.ClipperLib.IntPoint): Unit = js.native
      
      /* CompleteClass */
      override def DoMiter(): Unit = js.native
      
      /* CompleteClass */
      override def DoRound(): Unit = js.native
      
      /* CompleteClass */
      override def DoSquare(mul: Double): Unit = js.native
      
      /* CompleteClass */
      override def UpdateBotPt(pt: typings.jsClipper.ClipperLib.IntPoint): Boolean = js.native
      
      /* CompleteClass */
      var botPt: typings.jsClipper.ClipperLib.PolyOffsetBuilder = js.native
      
      /* CompleteClass */
      var currentPoly: typings.jsClipper.ClipperLib.Polygon = js.native
      
      /* CompleteClass */
      var delta: Double = js.native
      
      /* CompleteClass */
      var m_R: Double = js.native
      
      /* CompleteClass */
      var m_i: Double = js.native
      
      /* CompleteClass */
      var m_j: Double = js.native
      
      /* CompleteClass */
      var m_k: Double = js.native
      
      /* CompleteClass */
      var normals: ArrayLike[typings.jsClipper.ClipperLib.IntPoint] = js.native
      
      /* CompleteClass */
      var pts: typings.jsClipper.ClipperLib.Polygons = js.native
    }
    
    @JSGlobal("ClipperLib.PolyType")
    @js.native
    object PolyType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.jsClipper.ClipperLib.PolyType & Double] = js.native
      
      /* 1 */ val ptClip: typings.jsClipper.ClipperLib.PolyType.ptClip & Double = js.native
      
      /* 0 */ val ptSubject: typings.jsClipper.ClipperLib.PolyType.ptSubject & Double = js.native
    }
    
    @JSGlobal("ClipperLib.Polygon")
    @js.native
    class Polygon ()
      extends StObject
         with typings.jsClipper.ClipperLib.Polygon {
      def this(poly: ArrayLike[typings.jsClipper.ClipperLib.IntPoint]) = this()
    }
    
    @JSGlobal("ClipperLib.Polygons")
    @js.native
    class Polygons ()
      extends StObject
         with typings.jsClipper.ClipperLib.Polygons {
      def this(polys: ArrayLike[ArrayLike[typings.jsClipper.ClipperLib.IntPoint]]) = this()
    }
    
    @JSGlobal("ClipperLib.Protects")
    @js.native
    object Protects extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.jsClipper.ClipperLib.Protects & Double] = js.native
      
      /* 3 */ val ipBoth: typings.jsClipper.ClipperLib.Protects.ipBoth & Double = js.native
      
      /* 1 */ val ipLeft: typings.jsClipper.ClipperLib.Protects.ipLeft & Double = js.native
      
      /* 0 */ val ipNone: typings.jsClipper.ClipperLib.Protects.ipNone & Double = js.native
      
      /* 2 */ val ipRight: typings.jsClipper.ClipperLib.Protects.ipRight & Double = js.native
    }
    
    @JSGlobal("ClipperLib.Scanbeam")
    @js.native
    class Scanbeam ()
      extends StObject
         with typings.jsClipper.ClipperLib.Scanbeam {
      
      /* CompleteClass */
      var Y: Double = js.native
      
      /* CompleteClass */
      var next: typings.jsClipper.ClipperLib.TEdge = js.native
    }
    
    @JSGlobal("ClipperLib.TEdge")
    @js.native
    class TEdge ()
      extends StObject
         with typings.jsClipper.ClipperLib.TEdge {
      
      /* CompleteClass */
      var deltaX: Double = js.native
      
      /* CompleteClass */
      var deltaY: Double = js.native
      
      /* CompleteClass */
      var dx: Double = js.native
      
      /* CompleteClass */
      var next: typings.jsClipper.ClipperLib.TEdge = js.native
      
      /* CompleteClass */
      var nextInAEL: typings.jsClipper.ClipperLib.TEdge = js.native
      
      /* CompleteClass */
      var nextInLML: typings.jsClipper.ClipperLib.TEdge = js.native
      
      /* CompleteClass */
      var nextInSEL: typings.jsClipper.ClipperLib.TEdge = js.native
      
      /* CompleteClass */
      var outIdx: Double = js.native
      
      /* CompleteClass */
      var polyType: PolyType = js.native
      
      /* CompleteClass */
      var prev: typings.jsClipper.ClipperLib.TEdge = js.native
      
      /* CompleteClass */
      var prevInAEL: typings.jsClipper.ClipperLib.TEdge = js.native
      
      /* CompleteClass */
      var prevInSEL: typings.jsClipper.ClipperLib.TEdge = js.native
      
      /* CompleteClass */
      var side: EdgeSide = js.native
      
      /* CompleteClass */
      var tmpX: Double = js.native
      
      /* CompleteClass */
      var windCnt: Double = js.native
      
      /* CompleteClass */
      var windCnt2: Double = js.native
      
      /* CompleteClass */
      var windDelta: Double = js.native
      
      /* CompleteClass */
      var xbot: Double = js.native
      
      /* CompleteClass */
      var xcurr: Double = js.native
      
      /* CompleteClass */
      var xtop: Double = js.native
      
      /* CompleteClass */
      var ybot: Double = js.native
      
      /* CompleteClass */
      var ycurr: Double = js.native
      
      /* CompleteClass */
      var ytop: Double = js.native
    }
    
    @JSGlobal("ClipperLib.biginteger_used")
    @js.native
    def bigintegerUsed: Boolean = js.native
    
    inline def bigintegerUsed_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("biginteger_used")(x.asInstanceOf[js.Any])
  }
}
