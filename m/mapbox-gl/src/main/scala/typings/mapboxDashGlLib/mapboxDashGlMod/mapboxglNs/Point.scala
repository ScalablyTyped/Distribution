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

object Point {
  @scala.inline
  def apply(
    add: Point => Point,
    angle: () => scala.Double,
    angleTo: Point => scala.Double,
    angleWidth: Point => scala.Double,
    angleWithSep: (scala.Double, scala.Double) => scala.Double,
    clone: () => Point,
    dist: Point => scala.Double,
    distSqr: Point => scala.Double,
    div: scala.Double => Point,
    equals: Point => scala.Boolean,
    mag: () => scala.Double,
    matMult: scala.Double => Point,
    mult: scala.Double => Point,
    perp: () => Point,
    rotate: scala.Double => Point,
    round: () => Point,
    sub: Point => Point,
    unit: () => Point,
    x: scala.Double,
    y: scala.Double
  ): Point = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), angle = js.Any.fromFunction0(angle), angleTo = js.Any.fromFunction1(angleTo), angleWidth = js.Any.fromFunction1(angleWidth), angleWithSep = js.Any.fromFunction2(angleWithSep), clone = js.Any.fromFunction0(clone), dist = js.Any.fromFunction1(dist), distSqr = js.Any.fromFunction1(distSqr), div = js.Any.fromFunction1(div), equals = js.Any.fromFunction1(equals), mag = js.Any.fromFunction0(mag), matMult = js.Any.fromFunction1(matMult), mult = js.Any.fromFunction1(mult), perp = js.Any.fromFunction0(perp), rotate = js.Any.fromFunction1(rotate), round = js.Any.fromFunction0(round), sub = js.Any.fromFunction1(sub), unit = js.Any.fromFunction0(unit), x = x, y = y)
  
    __obj.asInstanceOf[Point]
  }
}

