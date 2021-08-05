package typings.konva

import typings.konva.anon.X
import typings.konva.anon.XY
import typings.konva.shapeMod.Shape
import typings.konva.shapeMod.ShapeConfig
import typings.konva.typesMod.GetSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathMod {
  
  @JSImport("konva/types/shapes/Path", "Path")
  @js.native
  class Path () extends Shape[PathConfig] {
    def this(config: PathConfig) = this()
    
    def _sceneFunc(context: js.Any): Unit = js.native
    
    def data(): String = js.native
    def data(v: String): this.type = js.native
    
    var dataArray: js.Array[js.Any] = js.native
    
    @JSName("data")
    var data_Original: GetSet[String, this.type] = js.native
    
    def getLength(): Double = js.native
    
    def getPointAtLength(length: js.Any): js.Any = js.native
    
    var pathLength: Double = js.native
  }
  /* static members */
  object Path {
    
    @JSImport("konva/types/shapes/Path", "Path")
    @js.native
    val ^ : js.Any = js.native
    
    inline def calcLength(x: js.Any, y: js.Any, cmd: js.Any, points: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("calcLength")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], cmd.asInstanceOf[js.Any], points.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    inline def convertEndpointToCenterParameterization(
      x1: js.Any,
      y1: js.Any,
      x2: js.Any,
      y2: js.Any,
      fa: js.Any,
      fs: js.Any,
      rx: js.Any,
      ry: js.Any,
      psiDeg: js.Any
    ): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertEndpointToCenterParameterization")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], fa.asInstanceOf[js.Any], fs.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], psiDeg.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
    
    inline def getLineLength(x1: js.Any, y1: js.Any, x2: js.Any, y2: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getLineLength")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def getPointOnCubicBezier(
      pct: js.Any,
      P1x: js.Any,
      P1y: js.Any,
      P2x: js.Any,
      P2y: js.Any,
      P3x: js.Any,
      P3y: js.Any,
      P4x: js.Any,
      P4y: js.Any
    ): X = (^.asInstanceOf[js.Dynamic].applyDynamic("getPointOnCubicBezier")(pct.asInstanceOf[js.Any], P1x.asInstanceOf[js.Any], P1y.asInstanceOf[js.Any], P2x.asInstanceOf[js.Any], P2y.asInstanceOf[js.Any], P3x.asInstanceOf[js.Any], P3y.asInstanceOf[js.Any], P4x.asInstanceOf[js.Any], P4y.asInstanceOf[js.Any])).asInstanceOf[X]
    
    inline def getPointOnEllipticalArc(cx: js.Any, cy: js.Any, rx: js.Any, ry: js.Any, theta: js.Any, psi: js.Any): XY = (^.asInstanceOf[js.Dynamic].applyDynamic("getPointOnEllipticalArc")(cx.asInstanceOf[js.Any], cy.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], theta.asInstanceOf[js.Any], psi.asInstanceOf[js.Any])).asInstanceOf[XY]
    
    inline def getPointOnLine(dist: js.Any, P1x: js.Any, P1y: js.Any, P2x: js.Any, P2y: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPointOnLine")(dist.asInstanceOf[js.Any], P1x.asInstanceOf[js.Any], P1y.asInstanceOf[js.Any], P2x.asInstanceOf[js.Any], P2y.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def getPointOnLine(dist: js.Any, P1x: js.Any, P1y: js.Any, P2x: js.Any, P2y: js.Any, fromX: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPointOnLine")(dist.asInstanceOf[js.Any], P1x.asInstanceOf[js.Any], P1y.asInstanceOf[js.Any], P2x.asInstanceOf[js.Any], P2y.asInstanceOf[js.Any], fromX.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def getPointOnLine(dist: js.Any, P1x: js.Any, P1y: js.Any, P2x: js.Any, P2y: js.Any, fromX: js.Any, fromY: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPointOnLine")(dist.asInstanceOf[js.Any], P1x.asInstanceOf[js.Any], P1y.asInstanceOf[js.Any], P2x.asInstanceOf[js.Any], P2y.asInstanceOf[js.Any], fromX.asInstanceOf[js.Any], fromY.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def getPointOnLine(dist: js.Any, P1x: js.Any, P1y: js.Any, P2x: js.Any, P2y: js.Any, fromX: Unit, fromY: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPointOnLine")(dist.asInstanceOf[js.Any], P1x.asInstanceOf[js.Any], P1y.asInstanceOf[js.Any], P2x.asInstanceOf[js.Any], P2y.asInstanceOf[js.Any], fromX.asInstanceOf[js.Any], fromY.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    inline def getPointOnQuadraticBezier(pct: js.Any, P1x: js.Any, P1y: js.Any, P2x: js.Any, P2y: js.Any, P3x: js.Any, P3y: js.Any): X = (^.asInstanceOf[js.Dynamic].applyDynamic("getPointOnQuadraticBezier")(pct.asInstanceOf[js.Any], P1x.asInstanceOf[js.Any], P1y.asInstanceOf[js.Any], P2x.asInstanceOf[js.Any], P2y.asInstanceOf[js.Any], P3x.asInstanceOf[js.Any], P3y.asInstanceOf[js.Any])).asInstanceOf[X]
    
    inline def parsePathData(data: js.Any): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePathData")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  }
  
  trait PathConfig
    extends StObject
       with ShapeConfig {
    
    var data: String
  }
  object PathConfig {
    
    inline def apply(data: String): PathConfig = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[PathConfig]
    }
    
    extension [Self <: PathConfig](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
}
