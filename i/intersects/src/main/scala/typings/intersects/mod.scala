package typings.intersects

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("intersects", "boxBox")
  @js.native
  def boxBox(x1: Double, y1: Double, w1: Double, h1: Double, x2: Double, y2: Double, w2: Double, h2: Double): Boolean = js.native
  
  @JSImport("intersects", "boxCircle")
  @js.native
  def boxCircle(xb: Double, yb: Double, wb: Double, hb: Double, xc: Double, yc: Double, rc: Double): Boolean = js.native
  
  @JSImport("intersects", "boxEllipse")
  @js.native
  def boxEllipse(xb: Double, yb: Double, wb: Double, hb: Double, xe: Double, ye: Double, rex: Double, rey: Double): Boolean = js.native
  
  @JSImport("intersects", "boxLine")
  @js.native
  def boxLine(xb: Double, yb: Double, wb: Double, hb: Double, x1: Double, y1: Double, x2: Double, y2: Double): Boolean = js.native
  
  @JSImport("intersects", "boxPoint")
  @js.native
  def boxPoint(x1: Double, y1: Double, w1: Double, h1: Double, x2: Double, y2: Double): Boolean = js.native
  
  @JSImport("intersects", "boxPolygon")
  @js.native
  def boxPolygon(xb: Double, yb: Double, wb: Double, hb: Double, points: js.Array[Double]): Boolean = js.native
  
  @JSImport("intersects", "circleBox")
  @js.native
  def circleBox(xc: Double, yc: Double, rc: Double, xb: Double, yb: Double, wb: Double, hb: Double): Boolean = js.native
  
  @JSImport("intersects", "circleCircle")
  @js.native
  def circleCircle(x1: Double, y1: Double, r1: Double, x2: Double, y2: Double, r2: Double): Boolean = js.native
  
  @JSImport("intersects", "circleEllipse")
  @js.native
  def circleEllipse(xc: Double, yc: Double, rc: Double, xe: Double, ye: Double, rex: Double, rey: Double): Boolean = js.native
  
  @JSImport("intersects", "circleLine")
  @js.native
  def circleLine(xc: Double, yc: Double, rc: Double, x1: Double, y1: Double, x2: Double, y2: Double): Boolean = js.native
  
  @JSImport("intersects", "circlePoint")
  @js.native
  def circlePoint(x1: Double, y1: Double, r1: Double, x2: Double, y2: Double): Boolean = js.native
  
  @JSImport("intersects", "circlePolygon")
  @js.native
  def circlePolygon(xc: Double, yc: Double, rc: Double, points: js.Array[Double]): Boolean = js.native
  
  @JSImport("intersects", "ellipseBox")
  @js.native
  def ellipseBox(xe: Double, ye: Double, rex: Double, rey: Double, xb: Double, yb: Double, wb: Double, hb: Double): Boolean = js.native
  
  @JSImport("intersects", "ellipseCircle")
  @js.native
  def ellipseCircle(xe: Double, ye: Double, rex: Double, rey: Double, xc: Double, yc: Double, rc: Double): Boolean = js.native
  
  @JSImport("intersects", "ellipseEllipse")
  @js.native
  def ellipseEllipse(x1: Double, y1: Double, r1x: Double, r1y: Double, x2: Double, y2: Double, r2x: Double, r2y: Double): Boolean = js.native
  
  @JSImport("intersects", "ellipseLine")
  @js.native
  def ellipseLine(xe: Double, ye: Double, rex: Double, rey: Double, x1: Double, y1: Double, x2: Double, y2: Double): Boolean = js.native
  
  @JSImport("intersects", "ellipsePoint")
  @js.native
  def ellipsePoint(xe: Double, ye: Double, rex: Double, rey: Double, x1: Double, y1: Double): Boolean = js.native
  
  @JSImport("intersects", "ellipsePolygon")
  @js.native
  def ellipsePolygon(xe: Double, ye: Double, rex: Double, rey: Double, points: js.Array[Double]): Boolean = js.native
  
  @JSImport("intersects", "lineBox")
  @js.native
  def lineBox(x1: Double, y1: Double, x2: Double, y2: Double, xb: Double, yb: Double, wb: Double, hb: Double): Boolean = js.native
  
  @JSImport("intersects", "lineCircle")
  @js.native
  def lineCircle(x1: Double, y1: Double, x2: Double, y2: Double, xc: Double, yc: Double, rc: Double): Boolean = js.native
  
  @JSImport("intersects", "lineEllipse")
  @js.native
  def lineEllipse(x1: Double, y1: Double, x2: Double, y2: Double, xe: Double, ye: Double, rex: Double, rey: Double): Boolean = js.native
  
  @JSImport("intersects", "lineLine")
  @js.native
  def lineLine(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double, y4: Double): Boolean = js.native
  
  @JSImport("intersects", "linePoint")
  @js.native
  def linePoint(x1: Double, y1: Double, x2: Double, y2: Double, xp: Double, yp: Double, tolerance: Double): Boolean = js.native
  
  @JSImport("intersects", "linePolygon")
  @js.native
  def linePolygon(x1: Double, y1: Double, x2: Double, y2: Double, points: js.Array[Double], tolerance: Double): Boolean = js.native
  
  @JSImport("intersects", "pointBox")
  @js.native
  def pointBox(x1: Double, y1: Double, xb: Double, yb: Double, wb: Double, hb: Double): Boolean = js.native
  
  @JSImport("intersects", "pointCircle")
  @js.native
  def pointCircle(x1: Double, y1: Double, xc: Double, yc: Double, rc: Double): Boolean = js.native
  
  @JSImport("intersects", "pointEllipse")
  @js.native
  def pointEllipse(x1: Double, y1: Double, xe: Double, ye: Double, rex: Double, rey: Double): Boolean = js.native
  
  @JSImport("intersects", "pointLine")
  @js.native
  def pointLine(xp: Double, yp: Double, x1: Double, y1: Double, x2: Double, y2: Double): Boolean = js.native
  
  @JSImport("intersects", "pointPolygon")
  @js.native
  def pointPolygon(x1: Double, y1: Double, points: js.Array[Double], tolerance: Double): Boolean = js.native
  
  @JSImport("intersects", "polygonBox")
  @js.native
  def polygonBox(points: js.Array[Double], x: Double, y: Double, w: Double, h: Double): Boolean = js.native
  
  @JSImport("intersects", "polygonCircle")
  @js.native
  def polygonCircle(points: js.Array[Double], xc: Double, yc: Double, rc: Double): Boolean = js.native
  
  @JSImport("intersects", "polygonEllipse")
  @js.native
  def polygonEllipse(points: js.Array[Double], xe: Double, ye: Double, rex: Double, rey: Double): Boolean = js.native
  
  @JSImport("intersects", "polygonLine")
  @js.native
  def polygonLine(points: js.Array[Double], x1: Double, y1: Double, x2: Double, y2: Double, tolerance: Double): Boolean = js.native
  
  @JSImport("intersects", "polygonPoint")
  @js.native
  def polygonPoint(points: js.Array[Double], x: Double, y: Double, tolerance: Double): Boolean = js.native
  
  @JSImport("intersects", "polygonPolygon")
  @js.native
  def polygonPolygon(points1: js.Array[Double], points2: js.Array[Double]): Boolean = js.native
}
