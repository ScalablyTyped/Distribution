package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Point")
@js.native
class Point protected () extends js.Object {
  def this(x: scala.Double, y: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, round: scala.Boolean) = this()
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  def add(otherPoint: PointExpression): Point = js.native
  def ceil(): Point = js.native
  def contains(otherPoint: PointExpression): scala.Boolean = js.native
  def distanceTo(otherPoint: PointExpression): scala.Double = js.native
  def divideBy(num: scala.Double): Point = js.native
  def equals(otherPoint: PointExpression): scala.Boolean = js.native
  def floor(): Point = js.native
  def multiplyBy(num: scala.Double): Point = js.native
  def round(): Point = js.native
  def scaleBy(scale: PointExpression): Point = js.native
   // non-destructive, returns a new point
  def subtract(otherPoint: PointExpression): Point = js.native
  def unscaleBy(scale: PointExpression): Point = js.native
}

