package typings.konva

import typings.konva.anon.X
import typings.konva.anon.XY
import typings.konva.shapeMod.Shape
import typings.konva.shapeMod.ShapeConfig
import typings.konva.typesMod.GetSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathMod {
  
  @JSImport("konva/types/shapes/Path", "Path")
  @js.native
  class Path () extends Shape[PathConfig] {
    def this(config: PathConfig) = this()
    
    def _sceneFunc(context: js.Any): Unit = js.native
    
    def data(): String = js.native
    def data(v: String): this.type = js.native
    
    var dataArray: js.Array[_] = js.native
    
    @JSName("data")
    var data_Original: GetSet[String, this.type] = js.native
    
    def getLength(): Double = js.native
    
    def getPointAtLength(length: js.Any): js.Any = js.native
    
    var pathLength: Double = js.native
  }
  /* static members */
  object Path {
    
    @JSImport("konva/types/shapes/Path", "Path.calcLength")
    @js.native
    def calcLength(x: js.Any, y: js.Any, cmd: js.Any, points: js.Any): js.Any = js.native
    
    @JSImport("konva/types/shapes/Path", "Path.convertEndpointToCenterParameterization")
    @js.native
    def convertEndpointToCenterParameterization(
      x1: js.Any,
      y1: js.Any,
      x2: js.Any,
      y2: js.Any,
      fa: js.Any,
      fs: js.Any,
      rx: js.Any,
      ry: js.Any,
      psiDeg: js.Any
    ): js.Array[_] = js.native
    
    @JSImport("konva/types/shapes/Path", "Path.getLineLength")
    @js.native
    def getLineLength(x1: js.Any, y1: js.Any, x2: js.Any, y2: js.Any): Double = js.native
    
    @JSImport("konva/types/shapes/Path", "Path.getPointOnCubicBezier")
    @js.native
    def getPointOnCubicBezier(
      pct: js.Any,
      P1x: js.Any,
      P1y: js.Any,
      P2x: js.Any,
      P2y: js.Any,
      P3x: js.Any,
      P3y: js.Any,
      P4x: js.Any,
      P4y: js.Any
    ): X = js.native
    
    @JSImport("konva/types/shapes/Path", "Path.getPointOnEllipticalArc")
    @js.native
    def getPointOnEllipticalArc(cx: js.Any, cy: js.Any, rx: js.Any, ry: js.Any, theta: js.Any, psi: js.Any): XY = js.native
    
    @JSImport("konva/types/shapes/Path", "Path.getPointOnLine")
    @js.native
    def getPointOnLine(dist: js.Any, P1x: js.Any, P1y: js.Any, P2x: js.Any, P2y: js.Any): js.Any = js.native
    @JSImport("konva/types/shapes/Path", "Path.getPointOnLine")
    @js.native
    def getPointOnLine(
      dist: js.Any,
      P1x: js.Any,
      P1y: js.Any,
      P2x: js.Any,
      P2y: js.Any,
      fromX: js.UndefOr[scala.Nothing],
      fromY: js.Any
    ): js.Any = js.native
    @JSImport("konva/types/shapes/Path", "Path.getPointOnLine")
    @js.native
    def getPointOnLine(dist: js.Any, P1x: js.Any, P1y: js.Any, P2x: js.Any, P2y: js.Any, fromX: js.Any): js.Any = js.native
    @JSImport("konva/types/shapes/Path", "Path.getPointOnLine")
    @js.native
    def getPointOnLine(dist: js.Any, P1x: js.Any, P1y: js.Any, P2x: js.Any, P2y: js.Any, fromX: js.Any, fromY: js.Any): js.Any = js.native
    
    @JSImport("konva/types/shapes/Path", "Path.getPointOnQuadraticBezier")
    @js.native
    def getPointOnQuadraticBezier(pct: js.Any, P1x: js.Any, P1y: js.Any, P2x: js.Any, P2y: js.Any, P3x: js.Any, P3y: js.Any): X = js.native
    
    @JSImport("konva/types/shapes/Path", "Path.parsePathData")
    @js.native
    def parsePathData(data: js.Any): js.Array[_] = js.native
  }
  
  @js.native
  trait PathConfig extends ShapeConfig {
    
    var data: String = js.native
  }
  object PathConfig {
    
    @scala.inline
    def apply(data: String): PathConfig = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[PathConfig]
    }
    
    @scala.inline
    implicit class PathConfigMutableBuilder[Self <: PathConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
}
