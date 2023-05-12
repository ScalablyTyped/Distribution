package typings.konva.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.konva.libShapesPathMod.Path
import typings.konva.libShapesPathMod.PathConfig
import typings.konva.libTypesMod.PathSegment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofPath
  extends StObject
     with Instantiable0[Path]
     with Instantiable1[/* config */ PathConfig, Path] {
  
  def calcLength(x: Any, y: Any, cmd: Any, points: Any): Any = js.native
  
  def convertEndpointToCenterParameterization(x1: Any, y1: Any, x2: Any, y2: Any, fa: Any, fs: Any, rx: Any, ry: Any, psiDeg: Any): js.Array[Any] = js.native
  
  def getLineLength(x1: Any, y1: Any, x2: Any, y2: Any): Double = js.native
  
  def getPathLength(dataArray: js.Array[PathSegment]): Double = js.native
  
  def getPointAtLengthOfDataArray(length: Double, dataArray: Any): Any = js.native
  
  def getPointOnCubicBezier(pct: Any, P1x: Any, P1y: Any, P2x: Any, P2y: Any, P3x: Any, P3y: Any, P4x: Any, P4y: Any): X = js.native
  
  def getPointOnEllipticalArc(cx: Any, cy: Any, rx: Any, ry: Any, theta: Any, psi: Any): XY = js.native
  
  def getPointOnLine(dist: Any, P1x: Any, P1y: Any, P2x: Any, P2y: Any): Any = js.native
  def getPointOnLine(dist: Any, P1x: Any, P1y: Any, P2x: Any, P2y: Any, fromX: Any): Any = js.native
  def getPointOnLine(dist: Any, P1x: Any, P1y: Any, P2x: Any, P2y: Any, fromX: Any, fromY: Any): Any = js.native
  def getPointOnLine(dist: Any, P1x: Any, P1y: Any, P2x: Any, P2y: Any, fromX: Unit, fromY: Any): Any = js.native
  
  def getPointOnQuadraticBezier(pct: Any, P1x: Any, P1y: Any, P2x: Any, P2y: Any, P3x: Any, P3y: Any): X = js.native
  
  def parsePathData(data: Any): js.Array[PathSegment] = js.native
}
