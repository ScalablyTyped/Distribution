package typings.konva

import typings.konva.anon.X
import typings.konva.anon.XY
import typings.konva.libShapeMod.Shape
import typings.konva.libShapeMod.ShapeConfig
import typings.konva.libTypesMod.GetSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShapesPathMod {
  
  @JSImport("konva/lib/shapes/Path", "Path")
  @js.native
  open class Path () extends Shape[PathConfig] {
    def this(config: PathConfig) = this()
    
    def _sceneFunc(context: Any): Unit = js.native
    
    def data(): String = js.native
    def data(v: String): this.type = js.native
    
    var dataArray: js.Array[Any] = js.native
    
    @JSName("data")
    var data_Original: GetSet[String, this.type] = js.native
    
    def getLength(): Double = js.native
    
    def getPointAtLength(length: Any): Any = js.native
    
    var pathLength: Double = js.native
  }
  /* static members */
  object Path {
    
    @JSImport("konva/lib/shapes/Path", "Path")
    @js.native
    val ^ : js.Any = js.native
    
    inline def calcLength(x: Any, y: Any, cmd: Any, points: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("calcLength")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], cmd.asInstanceOf[js.Any], points.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def convertEndpointToCenterParameterization(x1: Any, y1: Any, x2: Any, y2: Any, fa: Any, fs: Any, rx: Any, ry: Any, psiDeg: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertEndpointToCenterParameterization")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], fa.asInstanceOf[js.Any], fs.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], psiDeg.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    inline def getLineLength(x1: Any, y1: Any, x2: Any, y2: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getLineLength")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def getPointOnCubicBezier(pct: Any, P1x: Any, P1y: Any, P2x: Any, P2y: Any, P3x: Any, P3y: Any, P4x: Any, P4y: Any): X = (^.asInstanceOf[js.Dynamic].applyDynamic("getPointOnCubicBezier")(pct.asInstanceOf[js.Any], P1x.asInstanceOf[js.Any], P1y.asInstanceOf[js.Any], P2x.asInstanceOf[js.Any], P2y.asInstanceOf[js.Any], P3x.asInstanceOf[js.Any], P3y.asInstanceOf[js.Any], P4x.asInstanceOf[js.Any], P4y.asInstanceOf[js.Any])).asInstanceOf[X]
    
    inline def getPointOnEllipticalArc(cx: Any, cy: Any, rx: Any, ry: Any, theta: Any, psi: Any): XY = (^.asInstanceOf[js.Dynamic].applyDynamic("getPointOnEllipticalArc")(cx.asInstanceOf[js.Any], cy.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], theta.asInstanceOf[js.Any], psi.asInstanceOf[js.Any])).asInstanceOf[XY]
    
    inline def getPointOnLine(dist: Any, P1x: Any, P1y: Any, P2x: Any, P2y: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPointOnLine")(dist.asInstanceOf[js.Any], P1x.asInstanceOf[js.Any], P1y.asInstanceOf[js.Any], P2x.asInstanceOf[js.Any], P2y.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def getPointOnLine(dist: Any, P1x: Any, P1y: Any, P2x: Any, P2y: Any, fromX: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPointOnLine")(dist.asInstanceOf[js.Any], P1x.asInstanceOf[js.Any], P1y.asInstanceOf[js.Any], P2x.asInstanceOf[js.Any], P2y.asInstanceOf[js.Any], fromX.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def getPointOnLine(dist: Any, P1x: Any, P1y: Any, P2x: Any, P2y: Any, fromX: Any, fromY: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPointOnLine")(dist.asInstanceOf[js.Any], P1x.asInstanceOf[js.Any], P1y.asInstanceOf[js.Any], P2x.asInstanceOf[js.Any], P2y.asInstanceOf[js.Any], fromX.asInstanceOf[js.Any], fromY.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def getPointOnLine(dist: Any, P1x: Any, P1y: Any, P2x: Any, P2y: Any, fromX: Unit, fromY: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPointOnLine")(dist.asInstanceOf[js.Any], P1x.asInstanceOf[js.Any], P1y.asInstanceOf[js.Any], P2x.asInstanceOf[js.Any], P2y.asInstanceOf[js.Any], fromX.asInstanceOf[js.Any], fromY.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getPointOnQuadraticBezier(pct: Any, P1x: Any, P1y: Any, P2x: Any, P2y: Any, P3x: Any, P3y: Any): X = (^.asInstanceOf[js.Dynamic].applyDynamic("getPointOnQuadraticBezier")(pct.asInstanceOf[js.Any], P1x.asInstanceOf[js.Any], P1y.asInstanceOf[js.Any], P2x.asInstanceOf[js.Any], P2y.asInstanceOf[js.Any], P3x.asInstanceOf[js.Any], P3y.asInstanceOf[js.Any])).asInstanceOf[X]
    
    inline def parsePathData(data: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePathData")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  }
  
  trait PathConfig
    extends StObject
       with ShapeConfig {
    
    var data: js.UndefOr[String] = js.undefined
  }
  object PathConfig {
    
    inline def apply(): PathConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PathConfig]
    }
    
    extension [Self <: PathConfig](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    }
  }
}
