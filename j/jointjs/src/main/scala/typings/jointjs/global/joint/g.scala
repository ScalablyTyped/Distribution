package typings.jointjs.global.joint

import typings.jointjs.mod.g.PathObjectUnit
import typings.jointjs.mod.g.PathSegmentUnit
import typings.jointjs.mod.g.PlainPoint
import typings.jointjs.mod.g.PlainRect
import typings.jointjs.mod.g.SegmentType
import typings.jointjs.mod.g.SegmentTypes
import typings.jointjs.mod.g.bezier.IBezierCurve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object g {
  
  @JSGlobal("joint.g")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("joint.g.Curve")
  @js.native
  class Curve protected ()
    extends typings.jointjs.mod.g.Curve {
    def this(curve: typings.jointjs.mod.g.Curve) = this()
    def this(p1: String, p2: String, p3: String, p4: String) = this()
    def this(p1: String, p2: String, p3: String, p4: PlainPoint) = this()
    def this(p1: String, p2: String, p3: PlainPoint, p4: String) = this()
    def this(p1: String, p2: String, p3: PlainPoint, p4: PlainPoint) = this()
    def this(p1: String, p2: PlainPoint, p3: String, p4: String) = this()
    def this(p1: String, p2: PlainPoint, p3: String, p4: PlainPoint) = this()
    def this(p1: String, p2: PlainPoint, p3: PlainPoint, p4: String) = this()
    def this(p1: String, p2: PlainPoint, p3: PlainPoint, p4: PlainPoint) = this()
    def this(p1: PlainPoint, p2: String, p3: String, p4: String) = this()
    def this(p1: PlainPoint, p2: String, p3: String, p4: PlainPoint) = this()
    def this(p1: PlainPoint, p2: String, p3: PlainPoint, p4: String) = this()
    def this(p1: PlainPoint, p2: String, p3: PlainPoint, p4: PlainPoint) = this()
    def this(p1: PlainPoint, p2: PlainPoint, p3: String, p4: String) = this()
    def this(p1: PlainPoint, p2: PlainPoint, p3: String, p4: PlainPoint) = this()
    def this(p1: PlainPoint, p2: PlainPoint, p3: PlainPoint, p4: String) = this()
    def this(p1: PlainPoint, p2: PlainPoint, p3: PlainPoint, p4: PlainPoint) = this()
  }
  object Curve {
    
    @JSGlobal("joint.g.Curve")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def throughPoints(points: js.Array[PlainPoint]): js.Array[typings.jointjs.mod.g.Curve] = ^.asInstanceOf[js.Dynamic].applyDynamic("throughPoints")(points.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.jointjs.mod.g.Curve]]
  }
  
  @JSGlobal("joint.g.Ellipse")
  @js.native
  class Ellipse protected ()
    extends typings.jointjs.mod.g.Ellipse {
    def this(ellipse: typings.jointjs.mod.g.Ellipse) = this()
    def this(center: String, a: Double, b: Double) = this()
    def this(center: PlainPoint, a: Double, b: Double) = this()
  }
  object Ellipse {
    
    @JSGlobal("joint.g.Ellipse")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromRect(rect: PlainRect): typings.jointjs.mod.g.Ellipse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRect")(rect.asInstanceOf[js.Any]).asInstanceOf[typings.jointjs.mod.g.Ellipse]
  }
  
  @JSGlobal("joint.g.Line")
  @js.native
  class Line ()
    extends typings.jointjs.mod.g.Line {
    def this(line: typings.jointjs.mod.g.Line) = this()
    def this(p1: String, p2: String) = this()
    def this(p1: String, p2: PlainPoint) = this()
    def this(p1: PlainPoint, p2: String) = this()
    def this(p1: PlainPoint, p2: PlainPoint) = this()
  }
  
  @JSGlobal("joint.g.Path")
  @js.native
  // getter
  class Path ()
    extends typings.jointjs.mod.g.Path {
    def this(pathData: String) = this()
    def this(polyline: typings.jointjs.mod.g.Polyline) = this()
    def this(segments: PathObjectUnit | PathSegmentUnit) = this()
    def this(segments: js.Array[PathObjectUnit | PathSegmentUnit]) = this()
  }
  object Path {
    
    @JSGlobal("joint.g.Path")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def createSegment(`type`: SegmentType, args: js.Any*): PathSegmentUnit = (^.asInstanceOf[js.Dynamic].applyDynamic("createSegment")(`type`.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[PathSegmentUnit]
    
    /* static member */
    inline def isDataSupported(pathData: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDataSupported")(pathData.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def parse(pathData: String): typings.jointjs.mod.g.Path = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(pathData.asInstanceOf[js.Any]).asInstanceOf[typings.jointjs.mod.g.Path]
    
    /* static member */
    @JSGlobal("joint.g.Path.segmentTypes")
    @js.native
    def segmentTypes: SegmentTypes = js.native
    inline def segmentTypes_=(x: SegmentTypes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("segmentTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("joint.g.Point")
  @js.native
  class Point ()
    extends typings.jointjs.mod.g.Point {
    def this(p: String) = this()
    def this(p: PlainPoint) = this()
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
  }
  object Point {
    
    @JSGlobal("joint.g.Point")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromPolar(distance: Double, angle: Double): typings.jointjs.mod.g.Point = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPolar")(distance.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[typings.jointjs.mod.g.Point]
    inline def fromPolar(distance: Double, angle: Double, origin: String): typings.jointjs.mod.g.Point = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPolar")(distance.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[typings.jointjs.mod.g.Point]
    inline def fromPolar(distance: Double, angle: Double, origin: PlainPoint): typings.jointjs.mod.g.Point = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPolar")(distance.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[typings.jointjs.mod.g.Point]
    
    /* static member */
    inline def random(x1: Double, x2: Double, y1: Double, y2: Double): typings.jointjs.mod.g.Point = (^.asInstanceOf[js.Dynamic].applyDynamic("random")(x1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[typings.jointjs.mod.g.Point]
  }
  
  @JSGlobal("joint.g.Polyline")
  @js.native
  // getter
  class Polyline ()
    extends typings.jointjs.mod.g.Polyline {
    def this(points: js.Array[typings.jointjs.mod.g.Point]) = this()
    def this(svgString: String) = this()
  }
  object Polyline {
    
    @JSGlobal("joint.g.Polyline")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def parse(svgString: String): typings.jointjs.mod.g.Polyline = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(svgString.asInstanceOf[js.Any]).asInstanceOf[typings.jointjs.mod.g.Polyline]
  }
  
  @JSGlobal("joint.g.Rect")
  @js.native
  class Rect ()
    extends typings.jointjs.mod.g.Rect {
    def this(r: PlainRect) = this()
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
    def this(x: Double, y: Double, width: Double) = this()
    def this(x: Double, y: Unit, width: Double) = this()
    def this(x: Unit, y: Double, width: Double) = this()
    def this(x: Unit, y: Unit, width: Double) = this()
    def this(x: Double, y: Double, width: Double, height: Double) = this()
    def this(x: Double, y: Double, width: Unit, height: Double) = this()
    def this(x: Double, y: Unit, width: Double, height: Double) = this()
    def this(x: Double, y: Unit, width: Unit, height: Double) = this()
    def this(x: Unit, y: Double, width: Double, height: Double) = this()
    def this(x: Unit, y: Double, width: Unit, height: Double) = this()
    def this(x: Unit, y: Unit, width: Double, height: Double) = this()
    def this(x: Unit, y: Unit, width: Unit, height: Double) = this()
  }
  object Rect {
    
    @JSGlobal("joint.g.Rect")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromEllipse(e: typings.jointjs.mod.g.Ellipse): typings.jointjs.mod.g.Rect = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEllipse")(e.asInstanceOf[js.Any]).asInstanceOf[typings.jointjs.mod.g.Rect]
  }
  
  object bezier {
    
    @JSGlobal("joint.g.bezier")
    @js.native
    val ^ : js.Any = js.native
    
    inline def curveThroughPoints(points: js.Array[PlainPoint | typings.jointjs.mod.g.Point]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("curveThroughPoints")(points.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    inline def getCurveControlPoints(points: js.Array[PlainPoint | typings.jointjs.mod.g.Point]): js.Tuple2[js.Array[typings.jointjs.mod.g.Point], js.Array[typings.jointjs.mod.g.Point]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurveControlPoints")(points.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Array[typings.jointjs.mod.g.Point], js.Array[typings.jointjs.mod.g.Point]]]
    
    inline def getCurveDivider(p0: String, p1: String, p2: String, p3: String): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurveDivider")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]]]
    inline def getCurveDivider(p0: String, p1: String, p2: String, p3: PlainPoint): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurveDivider")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]]]
    inline def getCurveDivider(p0: String, p1: String, p2: PlainPoint, p3: String): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurveDivider")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]]]
    inline def getCurveDivider(p0: String, p1: String, p2: PlainPoint, p3: PlainPoint): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurveDivider")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]]]
    inline def getCurveDivider(p0: String, p1: PlainPoint, p2: String, p3: String): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurveDivider")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]]]
    inline def getCurveDivider(p0: String, p1: PlainPoint, p2: String, p3: PlainPoint): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurveDivider")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]]]
    inline def getCurveDivider(p0: String, p1: PlainPoint, p2: PlainPoint, p3: String): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurveDivider")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]]]
    inline def getCurveDivider(p0: String, p1: PlainPoint, p2: PlainPoint, p3: PlainPoint): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurveDivider")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]]]
    inline def getCurveDivider(p0: PlainPoint, p1: String, p2: String, p3: String): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurveDivider")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]]]
    inline def getCurveDivider(p0: PlainPoint, p1: String, p2: String, p3: PlainPoint): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurveDivider")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]]]
    inline def getCurveDivider(p0: PlainPoint, p1: String, p2: PlainPoint, p3: String): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurveDivider")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]]]
    inline def getCurveDivider(p0: PlainPoint, p1: String, p2: PlainPoint, p3: PlainPoint): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurveDivider")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]]]
    inline def getCurveDivider(p0: PlainPoint, p1: PlainPoint, p2: String, p3: String): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurveDivider")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]]]
    inline def getCurveDivider(p0: PlainPoint, p1: PlainPoint, p2: String, p3: PlainPoint): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurveDivider")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]]]
    inline def getCurveDivider(p0: PlainPoint, p1: PlainPoint, p2: PlainPoint, p3: String): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurveDivider")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]]]
    inline def getCurveDivider(p0: PlainPoint, p1: PlainPoint, p2: PlainPoint, p3: PlainPoint): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurveDivider")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]]]
    
    inline def getFirstControlPoints(rhs: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstControlPoints")(rhs.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
    
    inline def getInversionSolver(p0: PlainPoint, p1: PlainPoint, p2: PlainPoint, p3: PlainPoint): js.Function1[/* p */ PlainPoint, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getInversionSolver")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* p */ PlainPoint, Double]]
  }
  
  inline def normalizeAngle(angle: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeAngle")(angle.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def random(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[Double]
  inline def random(min: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(min.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def random(min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("random")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def random(min: Unit, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("random")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  object scale {
    
    @JSGlobal("joint.g.scale")
    @js.native
    val ^ : js.Any = js.native
    
    inline def linear(domain: js.Tuple2[Double, Double], range: js.Tuple2[Double, Double], value: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("linear")(domain.asInstanceOf[js.Any], range.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  inline def snapToGrid(`val`: Double, gridSize: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("snapToGrid")(`val`.asInstanceOf[js.Any], gridSize.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def toDeg(rad: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toDeg")(rad.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def toRad(deg: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toRad")(deg.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def toRad(deg: Double, over360: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toRad")(deg.asInstanceOf[js.Any], over360.asInstanceOf[js.Any])).asInstanceOf[Double]
}
