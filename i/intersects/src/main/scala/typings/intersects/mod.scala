package typings.intersects

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("intersects", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def boxBox(x1: Double, y1: Double, w1: Double, h1: Double, x2: Double, y2: Double, w2: Double, h2: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("boxBox")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], w1.asInstanceOf[js.Any], h1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], w2.asInstanceOf[js.Any], h2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def boxCircle(xb: Double, yb: Double, wb: Double, hb: Double, xc: Double, yc: Double, rc: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("boxCircle")(xb.asInstanceOf[js.Any], yb.asInstanceOf[js.Any], wb.asInstanceOf[js.Any], hb.asInstanceOf[js.Any], xc.asInstanceOf[js.Any], yc.asInstanceOf[js.Any], rc.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def boxEllipse(xb: Double, yb: Double, wb: Double, hb: Double, xe: Double, ye: Double, rex: Double, rey: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("boxEllipse")(xb.asInstanceOf[js.Any], yb.asInstanceOf[js.Any], wb.asInstanceOf[js.Any], hb.asInstanceOf[js.Any], xe.asInstanceOf[js.Any], ye.asInstanceOf[js.Any], rex.asInstanceOf[js.Any], rey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def boxLine(xb: Double, yb: Double, wb: Double, hb: Double, x1: Double, y1: Double, x2: Double, y2: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("boxLine")(xb.asInstanceOf[js.Any], yb.asInstanceOf[js.Any], wb.asInstanceOf[js.Any], hb.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def boxPoint(x1: Double, y1: Double, w1: Double, h1: Double, x2: Double, y2: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("boxPoint")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], w1.asInstanceOf[js.Any], h1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def boxPolygon(xb: Double, yb: Double, wb: Double, hb: Double, points: js.Array[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("boxPolygon")(xb.asInstanceOf[js.Any], yb.asInstanceOf[js.Any], wb.asInstanceOf[js.Any], hb.asInstanceOf[js.Any], points.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def circleBox(xc: Double, yc: Double, rc: Double, xb: Double, yb: Double, wb: Double, hb: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("circleBox")(xc.asInstanceOf[js.Any], yc.asInstanceOf[js.Any], rc.asInstanceOf[js.Any], xb.asInstanceOf[js.Any], yb.asInstanceOf[js.Any], wb.asInstanceOf[js.Any], hb.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def circleCircle(x1: Double, y1: Double, r1: Double, x2: Double, y2: Double, r2: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("circleCircle")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], r1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], r2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def circleEllipse(xc: Double, yc: Double, rc: Double, xe: Double, ye: Double, rex: Double, rey: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("circleEllipse")(xc.asInstanceOf[js.Any], yc.asInstanceOf[js.Any], rc.asInstanceOf[js.Any], xe.asInstanceOf[js.Any], ye.asInstanceOf[js.Any], rex.asInstanceOf[js.Any], rey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def circleLine(xc: Double, yc: Double, rc: Double, x1: Double, y1: Double, x2: Double, y2: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("circleLine")(xc.asInstanceOf[js.Any], yc.asInstanceOf[js.Any], rc.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def circlePoint(x1: Double, y1: Double, r1: Double, x2: Double, y2: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("circlePoint")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], r1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def circlePolygon(xc: Double, yc: Double, rc: Double, points: js.Array[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("circlePolygon")(xc.asInstanceOf[js.Any], yc.asInstanceOf[js.Any], rc.asInstanceOf[js.Any], points.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def ellipseBox(xe: Double, ye: Double, rex: Double, rey: Double, xb: Double, yb: Double, wb: Double, hb: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipseBox")(xe.asInstanceOf[js.Any], ye.asInstanceOf[js.Any], rex.asInstanceOf[js.Any], rey.asInstanceOf[js.Any], xb.asInstanceOf[js.Any], yb.asInstanceOf[js.Any], wb.asInstanceOf[js.Any], hb.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def ellipseCircle(xe: Double, ye: Double, rex: Double, rey: Double, xc: Double, yc: Double, rc: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipseCircle")(xe.asInstanceOf[js.Any], ye.asInstanceOf[js.Any], rex.asInstanceOf[js.Any], rey.asInstanceOf[js.Any], xc.asInstanceOf[js.Any], yc.asInstanceOf[js.Any], rc.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def ellipseEllipse(x1: Double, y1: Double, r1x: Double, r1y: Double, x2: Double, y2: Double, r2x: Double, r2y: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipseEllipse")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], r1x.asInstanceOf[js.Any], r1y.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], r2x.asInstanceOf[js.Any], r2y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def ellipseLine(xe: Double, ye: Double, rex: Double, rey: Double, x1: Double, y1: Double, x2: Double, y2: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipseLine")(xe.asInstanceOf[js.Any], ye.asInstanceOf[js.Any], rex.asInstanceOf[js.Any], rey.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def ellipsePoint(xe: Double, ye: Double, rex: Double, rey: Double, x1: Double, y1: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipsePoint")(xe.asInstanceOf[js.Any], ye.asInstanceOf[js.Any], rex.asInstanceOf[js.Any], rey.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def ellipsePolygon(xe: Double, ye: Double, rex: Double, rey: Double, points: js.Array[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipsePolygon")(xe.asInstanceOf[js.Any], ye.asInstanceOf[js.Any], rex.asInstanceOf[js.Any], rey.asInstanceOf[js.Any], points.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def lineBox(x1: Double, y1: Double, x2: Double, y2: Double, xb: Double, yb: Double, wb: Double, hb: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lineBox")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], xb.asInstanceOf[js.Any], yb.asInstanceOf[js.Any], wb.asInstanceOf[js.Any], hb.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def lineCircle(x1: Double, y1: Double, x2: Double, y2: Double, xc: Double, yc: Double, rc: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lineCircle")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], xc.asInstanceOf[js.Any], yc.asInstanceOf[js.Any], rc.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def lineEllipse(x1: Double, y1: Double, x2: Double, y2: Double, xe: Double, ye: Double, rex: Double, rey: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lineEllipse")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], xe.asInstanceOf[js.Any], ye.asInstanceOf[js.Any], rex.asInstanceOf[js.Any], rey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def lineLine(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double, y4: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lineLine")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], x4.asInstanceOf[js.Any], y4.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def linePoint(x1: Double, y1: Double, x2: Double, y2: Double, xp: Double, yp: Double, tolerance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("linePoint")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], xp.asInstanceOf[js.Any], yp.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def linePolygon(x1: Double, y1: Double, x2: Double, y2: Double, points: js.Array[Double], tolerance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("linePolygon")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], points.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def pointBox(x1: Double, y1: Double, xb: Double, yb: Double, wb: Double, hb: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("pointBox")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], xb.asInstanceOf[js.Any], yb.asInstanceOf[js.Any], wb.asInstanceOf[js.Any], hb.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def pointCircle(x1: Double, y1: Double, xc: Double, yc: Double, rc: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("pointCircle")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], xc.asInstanceOf[js.Any], yc.asInstanceOf[js.Any], rc.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def pointEllipse(x1: Double, y1: Double, xe: Double, ye: Double, rex: Double, rey: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("pointEllipse")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], xe.asInstanceOf[js.Any], ye.asInstanceOf[js.Any], rex.asInstanceOf[js.Any], rey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def pointLine(xp: Double, yp: Double, x1: Double, y1: Double, x2: Double, y2: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("pointLine")(xp.asInstanceOf[js.Any], yp.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def pointPolygon(x1: Double, y1: Double, points: js.Array[Double], tolerance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("pointPolygon")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], points.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def polygonBox(points: js.Array[Double], x: Double, y: Double, w: Double, h: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("polygonBox")(points.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def polygonCircle(points: js.Array[Double], xc: Double, yc: Double, rc: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("polygonCircle")(points.asInstanceOf[js.Any], xc.asInstanceOf[js.Any], yc.asInstanceOf[js.Any], rc.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def polygonEllipse(points: js.Array[Double], xe: Double, ye: Double, rex: Double, rey: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("polygonEllipse")(points.asInstanceOf[js.Any], xe.asInstanceOf[js.Any], ye.asInstanceOf[js.Any], rex.asInstanceOf[js.Any], rey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def polygonLine(points: js.Array[Double], x1: Double, y1: Double, x2: Double, y2: Double, tolerance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("polygonLine")(points.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def polygonPoint(points: js.Array[Double], x: Double, y: Double, tolerance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("polygonPoint")(points.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def polygonPolygon(points1: js.Array[Double], points2: js.Array[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("polygonPolygon")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
