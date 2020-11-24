package typings.kendoUi.kendo.geometry

import typings.kendoUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Point extends Observable {
  
  def distanceTo(point: Point): Double = js.native
  
  def equals(other: Point): Boolean = js.native
  
  def getX(): Double = js.native
  
  def getY(): Double = js.native
  
  def move(x: Double, y: Double): Point = js.native
  
  var options: PointOptions = js.native
  
  def rotate(angle: Double, center: js.Any): Point = js.native
  def rotate(angle: Double, center: Point): Point = js.native
  
  def round(digits: Double): Point = js.native
  
  def scale(scaleX: Double, scaleY: Double): Point = js.native
  
  def scaleCopy(scaleX: Double, scaleY: Double): Point = js.native
  
  def setX(value: Double): Point = js.native
  
  def setY(value: Double): Point = js.native
  
  def toArray(digits: Double): js.Any = js.native
  
  def toString(digits: Double, separator: String): String = js.native
  
  def transform(tansformation: Transformation): Point = js.native
  
  def transformCopy(tansformation: Transformation): Point = js.native
  
  def translate(dx: Double, dy: Double): Point = js.native
  
  def translateWith(vector: js.Any): Point = js.native
  def translateWith(vector: Point): Point = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
