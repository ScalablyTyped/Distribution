package typings.mapboxDashGl.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "Point")
@js.native
class Point protected () extends js.Object {
  def this(x: Double, y: Double) = this()
  var x: Double = js.native
  var y: Double = js.native
  def add(p: Point): Point = js.native
  def angle(): Double = js.native
  def angleTo(p: Point): Double = js.native
  def angleWidth(p: Point): Double = js.native
  def angleWithSep(x: Double, y: Double): Double = js.native
  def dist(p: Point): Double = js.native
  def distSqr(p: Point): Double = js.native
  def div(k: Double): Point = js.native
  def equals(p: Point): Boolean = js.native
  def mag(): Double = js.native
  def matMult(m: Double): Point = js.native
  def mult(k: Double): Point = js.native
  def perp(): Point = js.native
  def rotate(a: Double): Point = js.native
  def round(): Point = js.native
  def sub(p: Point): Point = js.native
  def unit(): Point = js.native
}

/* static members */
@JSImport("mapbox-gl", "Point")
@js.native
object Point extends js.Object {
  def convert(a: PointLike): Point = js.native
}

