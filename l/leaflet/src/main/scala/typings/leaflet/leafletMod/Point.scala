package typings.leaflet.leafletMod

import typings.leaflet.Anon_X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Point")
@js.native
class Point protected () extends js.Object {
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, round: Boolean) = this()
  var x: Double = js.native
  var y: Double = js.native
  def add(otherPoint: PointExpression): Point = js.native
  def ceil(): Point = js.native
  def contains(otherPoint: PointExpression): Boolean = js.native
  def distanceTo(otherPoint: PointExpression): Double = js.native
  def divideBy(num: Double): Point = js.native
  def equals(otherPoint: PointExpression): Boolean = js.native
  def floor(): Point = js.native
  def multiplyBy(num: Double): Point = js.native
  def round(): Point = js.native
  def scaleBy(scale: PointExpression): Point = js.native
   // non-destructive, returns a new point
  def subtract(otherPoint: PointExpression): Point = js.native
  def unscaleBy(scale: PointExpression): Point = js.native
}

@JSImport("leaflet", "point")
@js.native
object point extends js.Object {
  def apply(coords: Anon_X): Point = js.native
  def apply(coords: PointTuple): Point = js.native
  def apply(x: Double, y: Double): Point = js.native
  def apply(x: Double, y: Double, round: Boolean): Point = js.native
}

