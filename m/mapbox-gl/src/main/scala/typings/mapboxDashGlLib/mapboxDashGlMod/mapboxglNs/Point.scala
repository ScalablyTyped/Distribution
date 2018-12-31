package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  var x: scala.Double
  var y: scala.Double
  def add(p: Point): Point
  def angle(): scala.Double
  def angleTo(p: Point): scala.Double
  def angleWidth(p: Point): scala.Double
  def angleWithSep(x: scala.Double, y: scala.Double): scala.Double
  def dist(p: Point): scala.Double
  def distSqr(p: Point): scala.Double
  def div(k: scala.Double): Point
  def equals(p: Point): scala.Boolean
  def mag(): scala.Double
  def matMult(m: scala.Double): Point
  def mult(k: scala.Double): Point
  def perp(): Point
  def rotate(a: scala.Double): Point
  def round(): Point
  def sub(p: Point): Point
  def unit(): Point
}

