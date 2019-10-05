package typings.kendoDashUi.kendo.dataviz.geometry

import typings.kendoDashUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.geometry.Point")
@js.native
class Point protected () extends Observable {
  def this(x: Double, y: Double) = this()
  var options: PointOptions = js.native
  var x: Double = js.native
  var y: Double = js.native
  def distanceTo(point: typings.kendoDashUi.kendo.geometry.Point): Double = js.native
  def equals(other: typings.kendoDashUi.kendo.geometry.Point): Boolean = js.native
  def getX(): Double = js.native
  def getY(): Double = js.native
  def move(x: Double, y: Double): typings.kendoDashUi.kendo.geometry.Point = js.native
  def rotate(angle: Double, center: js.Any): typings.kendoDashUi.kendo.geometry.Point = js.native
  def rotate(angle: Double, center: typings.kendoDashUi.kendo.geometry.Point): typings.kendoDashUi.kendo.geometry.Point = js.native
  def round(digits: Double): typings.kendoDashUi.kendo.geometry.Point = js.native
  def scale(scaleX: Double, scaleY: Double): typings.kendoDashUi.kendo.geometry.Point = js.native
  def scaleCopy(scaleX: Double, scaleY: Double): typings.kendoDashUi.kendo.geometry.Point = js.native
  def setX(value: Double): typings.kendoDashUi.kendo.geometry.Point = js.native
  def setY(value: Double): typings.kendoDashUi.kendo.geometry.Point = js.native
  def toArray(digits: Double): js.Any = js.native
  def toString(digits: Double, separator: String): String = js.native
  def transform(tansformation: typings.kendoDashUi.kendo.geometry.Transformation): typings.kendoDashUi.kendo.geometry.Point = js.native
  def transformCopy(tansformation: typings.kendoDashUi.kendo.geometry.Transformation): typings.kendoDashUi.kendo.geometry.Point = js.native
  def translate(dx: Double, dy: Double): typings.kendoDashUi.kendo.geometry.Point = js.native
  def translateWith(vector: js.Any): typings.kendoDashUi.kendo.geometry.Point = js.native
  def translateWith(vector: typings.kendoDashUi.kendo.geometry.Point): typings.kendoDashUi.kendo.geometry.Point = js.native
}

/* static members */
@JSGlobal("kendo.dataviz.geometry.Point")
@js.native
object Point extends js.Object {
  def create(x: js.Any, y: Double): typings.kendoDashUi.kendo.geometry.Point = js.native
  def create(x: Double, y: Double): typings.kendoDashUi.kendo.geometry.Point = js.native
  def create(x: typings.kendoDashUi.kendo.geometry.Point, y: Double): typings.kendoDashUi.kendo.geometry.Point = js.native
  def max(): typings.kendoDashUi.kendo.geometry.Point = js.native
  def maxPoint(): typings.kendoDashUi.kendo.geometry.Point = js.native
  def min(): typings.kendoDashUi.kendo.geometry.Point = js.native
  def minPoint(): typings.kendoDashUi.kendo.geometry.Point = js.native
}

