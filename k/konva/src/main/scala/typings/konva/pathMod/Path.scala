package typings.konva.pathMod

import typings.konva.anon.X
import typings.konva.anon.XY
import typings.konva.shapeMod.Shape
import typings.konva.typesMod.GetSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@JSImport("konva/types/shapes/Path", "Path")
@js.native
object Path extends js.Object {
  
  def calcLength(x: js.Any, y: js.Any, cmd: js.Any, points: js.Any): js.Any = js.native
  
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
  
  def getLineLength(x1: js.Any, y1: js.Any, x2: js.Any, y2: js.Any): Double = js.native
  
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
  
  def getPointOnEllipticalArc(cx: js.Any, cy: js.Any, rx: js.Any, ry: js.Any, theta: js.Any, psi: js.Any): XY = js.native
  
  def getPointOnLine(dist: js.Any, P1x: js.Any, P1y: js.Any, P2x: js.Any, P2y: js.Any): js.Any = js.native
  def getPointOnLine(
    dist: js.Any,
    P1x: js.Any,
    P1y: js.Any,
    P2x: js.Any,
    P2y: js.Any,
    fromX: js.UndefOr[scala.Nothing],
    fromY: js.Any
  ): js.Any = js.native
  def getPointOnLine(dist: js.Any, P1x: js.Any, P1y: js.Any, P2x: js.Any, P2y: js.Any, fromX: js.Any): js.Any = js.native
  def getPointOnLine(dist: js.Any, P1x: js.Any, P1y: js.Any, P2x: js.Any, P2y: js.Any, fromX: js.Any, fromY: js.Any): js.Any = js.native
  
  def getPointOnQuadraticBezier(pct: js.Any, P1x: js.Any, P1y: js.Any, P2x: js.Any, P2y: js.Any, P3x: js.Any, P3y: js.Any): X = js.native
  
  def parsePathData(data: js.Any): js.Array[_] = js.native
}
