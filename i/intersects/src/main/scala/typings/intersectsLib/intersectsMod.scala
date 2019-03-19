package typings
package intersectsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intersects", JSImport.Namespace)
@js.native
object intersectsMod extends js.Object {
  def boxBox(
    x1: scala.Double,
    y1: scala.Double,
    w1: scala.Double,
    h1: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    w2: scala.Double,
    h2: scala.Double
  ): scala.Boolean = js.native
  def boxCircle(
    xb: scala.Double,
    yb: scala.Double,
    wb: scala.Double,
    hb: scala.Double,
    xc: scala.Double,
    yc: scala.Double,
    rc: scala.Double
  ): scala.Boolean = js.native
  def boxEllipse(
    xb: scala.Double,
    yb: scala.Double,
    wb: scala.Double,
    hb: scala.Double,
    xe: scala.Double,
    ye: scala.Double,
    rex: scala.Double,
    rey: scala.Double
  ): scala.Boolean = js.native
  def boxLine(
    xb: scala.Double,
    yb: scala.Double,
    wb: scala.Double,
    hb: scala.Double,
    x1: scala.Double,
    y1: scala.Double,
    x2: scala.Double,
    y2: scala.Double
  ): scala.Boolean = js.native
  def boxPoint(
    x1: scala.Double,
    y1: scala.Double,
    w1: scala.Double,
    h1: scala.Double,
    x2: scala.Double,
    y2: scala.Double
  ): scala.Boolean = js.native
  def boxPolygon(
    xb: scala.Double,
    yb: scala.Double,
    wb: scala.Double,
    hb: scala.Double,
    points: js.Array[scala.Double]
  ): scala.Boolean = js.native
  def circleBox(
    xc: scala.Double,
    yc: scala.Double,
    rc: scala.Double,
    xb: scala.Double,
    yb: scala.Double,
    wb: scala.Double,
    hb: scala.Double
  ): scala.Boolean = js.native
  def circleCircle(
    x1: scala.Double,
    y1: scala.Double,
    r1: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    r2: scala.Double
  ): scala.Boolean = js.native
  def circleEllipse(
    xc: scala.Double,
    yc: scala.Double,
    rc: scala.Double,
    xe: scala.Double,
    ye: scala.Double,
    rex: scala.Double,
    rey: scala.Double
  ): scala.Boolean = js.native
  def circleLine(
    xc: scala.Double,
    yc: scala.Double,
    rc: scala.Double,
    x1: scala.Double,
    y1: scala.Double,
    x2: scala.Double,
    y2: scala.Double
  ): scala.Boolean = js.native
  def circlePoint(x1: scala.Double, y1: scala.Double, r1: scala.Double, x2: scala.Double, y2: scala.Double): scala.Boolean = js.native
  def circlePolygon(xc: scala.Double, yc: scala.Double, rc: scala.Double, points: js.Array[scala.Double]): scala.Boolean = js.native
  def ellipseBox(
    xe: scala.Double,
    ye: scala.Double,
    rex: scala.Double,
    rey: scala.Double,
    xb: scala.Double,
    yb: scala.Double,
    wb: scala.Double,
    hb: scala.Double
  ): scala.Boolean = js.native
  def ellipseCircle(
    xe: scala.Double,
    ye: scala.Double,
    rex: scala.Double,
    rey: scala.Double,
    xc: scala.Double,
    yc: scala.Double,
    rc: scala.Double
  ): scala.Boolean = js.native
  def ellipseEllipse(
    x1: scala.Double,
    y1: scala.Double,
    r1x: scala.Double,
    r1y: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    r2x: scala.Double,
    r2y: scala.Double
  ): scala.Boolean = js.native
  def ellipseLine(
    xe: scala.Double,
    ye: scala.Double,
    rex: scala.Double,
    rey: scala.Double,
    x1: scala.Double,
    y1: scala.Double,
    x2: scala.Double,
    y2: scala.Double
  ): scala.Boolean = js.native
  def ellipsePoint(
    xe: scala.Double,
    ye: scala.Double,
    rex: scala.Double,
    rey: scala.Double,
    x1: scala.Double,
    y1: scala.Double
  ): scala.Boolean = js.native
  def ellipsePolygon(
    xe: scala.Double,
    ye: scala.Double,
    rex: scala.Double,
    rey: scala.Double,
    points: js.Array[scala.Double]
  ): scala.Boolean = js.native
  def lineBox(
    x1: scala.Double,
    y1: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    xb: scala.Double,
    yb: scala.Double,
    wb: scala.Double,
    hb: scala.Double
  ): scala.Boolean = js.native
  def lineCircle(
    x1: scala.Double,
    y1: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    xc: scala.Double,
    yc: scala.Double,
    rc: scala.Double
  ): scala.Boolean = js.native
  def lineEllipse(
    x1: scala.Double,
    y1: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    xe: scala.Double,
    ye: scala.Double,
    rex: scala.Double,
    rey: scala.Double
  ): scala.Boolean = js.native
  def lineLine(
    x1: scala.Double,
    y1: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    x3: scala.Double,
    y3: scala.Double,
    x4: scala.Double,
    y4: scala.Double
  ): scala.Boolean = js.native
  def linePoint(
    x1: scala.Double,
    y1: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    xp: scala.Double,
    yp: scala.Double,
    tolerance: scala.Double
  ): scala.Boolean = js.native
  def linePolygon(
    x1: scala.Double,
    y1: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    points: js.Array[scala.Double],
    tolerance: scala.Double
  ): scala.Boolean = js.native
  def pointBox(
    x1: scala.Double,
    y1: scala.Double,
    xb: scala.Double,
    yb: scala.Double,
    wb: scala.Double,
    hb: scala.Double
  ): scala.Boolean = js.native
  def pointCircle(x1: scala.Double, y1: scala.Double, xc: scala.Double, yc: scala.Double, rc: scala.Double): scala.Boolean = js.native
  def pointEllipse(
    x1: scala.Double,
    y1: scala.Double,
    xe: scala.Double,
    ye: scala.Double,
    rex: scala.Double,
    rey: scala.Double
  ): scala.Boolean = js.native
  def pointLine(
    xp: scala.Double,
    yp: scala.Double,
    x1: scala.Double,
    y1: scala.Double,
    x2: scala.Double,
    y2: scala.Double
  ): scala.Boolean = js.native
  def pointPolygon(x1: scala.Double, y1: scala.Double, points: js.Array[scala.Double], tolerance: scala.Double): scala.Boolean = js.native
  def polygonBox(points: js.Array[scala.Double], x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): scala.Boolean = js.native
  def polygonCircle(points: js.Array[scala.Double], xc: scala.Double, yc: scala.Double, rc: scala.Double): scala.Boolean = js.native
  def polygonEllipse(
    points: js.Array[scala.Double],
    xe: scala.Double,
    ye: scala.Double,
    rex: scala.Double,
    rey: scala.Double
  ): scala.Boolean = js.native
  def polygonLine(
    points: js.Array[scala.Double],
    x1: scala.Double,
    y1: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    tolerance: scala.Double
  ): scala.Boolean = js.native
  def polygonPoint(points: js.Array[scala.Double], x: scala.Double, y: scala.Double, tolerance: scala.Double): scala.Boolean = js.native
  def polygonPolygon(points1: js.Array[scala.Double], points2: js.Array[scala.Double]): scala.Boolean = js.native
}

