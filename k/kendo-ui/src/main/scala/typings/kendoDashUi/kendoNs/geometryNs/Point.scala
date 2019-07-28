package typings.kendoDashUi.kendoNs.geometryNs

import typings.kendoDashUi.kendoNs.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.geometry.Point")
@js.native
class Point protected () extends Observable {
  def this(x: Double, y: Double) = this()
  var options: PointOptions = js.native
  var x: Double = js.native
  var y: Double = js.native
  def distanceTo(point: Point): Double = js.native
  def equals(other: Point): Boolean = js.native
  def getX(): Double = js.native
  def getY(): Double = js.native
  def move(x: Double, y: Double): Point = js.native
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
}

/* static members */
@JSGlobal("kendo.geometry.Point")
@js.native
object Point extends js.Object {
  def create(x: js.Any, y: Double): Point = js.native
  def create(x: Double, y: Double): Point = js.native
  def create(x: Point, y: Double): Point = js.native
  def max(): Point = js.native
  def maxPoint(): Point = js.native
  def min(): Point = js.native
  def minPoint(): Point = js.native
}

