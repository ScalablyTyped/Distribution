package typings
package mapboxDashGlLib.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "Point")
@js.native
class Point protected () extends js.Object {
  def this(x: scala.Double, y: scala.Double) = this()
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  def add(p: Point): Point = js.native
  def angle(): scala.Double = js.native
  def angleTo(p: Point): scala.Double = js.native
  def angleWidth(p: Point): scala.Double = js.native
  def angleWithSep(x: scala.Double, y: scala.Double): scala.Double = js.native
  def dist(p: Point): scala.Double = js.native
  def distSqr(p: Point): scala.Double = js.native
  def div(k: scala.Double): Point = js.native
  def equals(p: Point): scala.Boolean = js.native
  def mag(): scala.Double = js.native
  def matMult(m: scala.Double): Point = js.native
  def mult(k: scala.Double): Point = js.native
  def perp(): Point = js.native
  def rotate(a: scala.Double): Point = js.native
  def round(): Point = js.native
  def sub(p: Point): Point = js.native
  def unit(): Point = js.native
}

/* static members */
@JSImport("mapbox-gl", "Point")
@js.native
object Point extends js.Object {
  def convert(a: mapboxDashGlLib.mapboxDashGlMod.PointLike): mapboxDashGlLib.mapboxDashGlMod.Point = js.native
}

