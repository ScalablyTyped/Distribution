package typings.konva.mod.default

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.konva.anon.X
import typings.konva.anon.XY
import typings.konva.pathMod.PathConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("konva", "Path")
@js.native
object Path
  extends Instantiable0[typings.konva.pathMod.Path]
     with Instantiable1[/* config */ PathConfig, typings.konva.pathMod.Path] {
  
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
