package typings.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "Point")
@js.native
class Point_ protected () extends js.Object {
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, round: Boolean) = this()
  
  def add(otherPoint: PointExpression): Point_ = js.native
  
  def ceil(): Point_ = js.native
  
  def contains(otherPoint: PointExpression): Boolean = js.native
  
  def distanceTo(otherPoint: PointExpression): Double = js.native
  
  def divideBy(num: Double): Point_ = js.native
  
  def equals(otherPoint: PointExpression): Boolean = js.native
  
  def floor(): Point_ = js.native
  
  def multiplyBy(num: Double): Point_ = js.native
  
  def round(): Point_ = js.native
  
  def scaleBy(scale: PointExpression): Point_ = js.native
  
   // non-destructive, returns a new point
  def subtract(otherPoint: PointExpression): Point_ = js.native
  
  def unscaleBy(scale: PointExpression): Point_ = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
