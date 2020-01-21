package typings.kendoUi.kendo.dataviz.geometry

import typings.kendoUi.kendo.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.geometry.Circle")
@js.native
class Circle protected () extends Observable_ {
  def this(center: js.Any, radius: Double) = this()
  def this(center: typings.kendoUi.kendo.geometry.Point, radius: Double) = this()
  var center: typings.kendoUi.kendo.geometry.Point = js.native
  var options: CircleOptions = js.native
  var radius: Double = js.native
  def bbox(matrix: typings.kendoUi.kendo.geometry.Matrix): typings.kendoUi.kendo.geometry.Rect = js.native
  def equals(other: typings.kendoUi.kendo.geometry.Circle): Boolean = js.native
  def getCenter(): typings.kendoUi.kendo.geometry.Point = js.native
  def getRadius(): Double = js.native
  def pointAt(angle: Double): typings.kendoUi.kendo.geometry.Point = js.native
  def setCenter(value: js.Any): typings.kendoUi.kendo.geometry.Point = js.native
  def setCenter(value: typings.kendoUi.kendo.geometry.Point): typings.kendoUi.kendo.geometry.Point = js.native
  def setRadius(value: Double): typings.kendoUi.kendo.geometry.Circle = js.native
}

