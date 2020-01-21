package typings.kendoUi.kendo.dataviz.geometry

import typings.kendoUi.kendo.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.geometry.Point")
@js.native
class Point protected () extends Observable_ {
  def this(x: Double, y: Double) = this()
  var options: PointOptions = js.native
  var x: Double = js.native
  var y: Double = js.native
  def distanceTo(point: typings.kendoUi.kendo.geometry.Point): Double = js.native
  def equals(other: typings.kendoUi.kendo.geometry.Point): Boolean = js.native
  def getX(): Double = js.native
  def getY(): Double = js.native
  def move(x: Double, y: Double): typings.kendoUi.kendo.geometry.Point = js.native
  def rotate(angle: Double, center: js.Any): typings.kendoUi.kendo.geometry.Point = js.native
  def rotate(angle: Double, center: typings.kendoUi.kendo.geometry.Point): typings.kendoUi.kendo.geometry.Point = js.native
  def round(digits: Double): typings.kendoUi.kendo.geometry.Point = js.native
  def scale(scaleX: Double, scaleY: Double): typings.kendoUi.kendo.geometry.Point = js.native
  def scaleCopy(scaleX: Double, scaleY: Double): typings.kendoUi.kendo.geometry.Point = js.native
  def setX(value: Double): typings.kendoUi.kendo.geometry.Point = js.native
  def setY(value: Double): typings.kendoUi.kendo.geometry.Point = js.native
  def toArray(digits: Double): js.Any = js.native
  def toString(digits: Double, separator: String): String = js.native
  def transform(tansformation: typings.kendoUi.kendo.geometry.Transformation): typings.kendoUi.kendo.geometry.Point = js.native
  def transformCopy(tansformation: typings.kendoUi.kendo.geometry.Transformation): typings.kendoUi.kendo.geometry.Point = js.native
  def translate(dx: Double, dy: Double): typings.kendoUi.kendo.geometry.Point = js.native
  def translateWith(vector: js.Any): typings.kendoUi.kendo.geometry.Point = js.native
  def translateWith(vector: typings.kendoUi.kendo.geometry.Point): typings.kendoUi.kendo.geometry.Point = js.native
}

/* static members */
@JSGlobal("kendo.dataviz.geometry.Point")
@js.native
object Point extends js.Object {
  def create(x: js.Any, y: Double): typings.kendoUi.kendo.geometry.Point = js.native
  def create(x: Double, y: Double): typings.kendoUi.kendo.geometry.Point = js.native
  def create(x: typings.kendoUi.kendo.geometry.Point, y: Double): typings.kendoUi.kendo.geometry.Point = js.native
  def max(): typings.kendoUi.kendo.geometry.Point = js.native
  def maxPoint(): typings.kendoUi.kendo.geometry.Point = js.native
  def min(): typings.kendoUi.kendo.geometry.Point = js.native
  def minPoint(): typings.kendoUi.kendo.geometry.Point = js.native
}

