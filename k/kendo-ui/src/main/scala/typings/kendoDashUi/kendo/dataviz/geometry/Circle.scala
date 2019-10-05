package typings.kendoDashUi.kendo.dataviz.geometry

import typings.kendoDashUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.geometry.Circle")
@js.native
class Circle protected () extends Observable {
  def this(center: js.Any, radius: Double) = this()
  def this(center: typings.kendoDashUi.kendo.geometry.Point, radius: Double) = this()
  var center: typings.kendoDashUi.kendo.geometry.Point = js.native
  var options: CircleOptions = js.native
  var radius: Double = js.native
  def bbox(matrix: typings.kendoDashUi.kendo.geometry.Matrix): typings.kendoDashUi.kendo.geometry.Rect = js.native
  def equals(other: typings.kendoDashUi.kendo.geometry.Circle): Boolean = js.native
  def getCenter(): typings.kendoDashUi.kendo.geometry.Point = js.native
  def getRadius(): Double = js.native
  def pointAt(angle: Double): typings.kendoDashUi.kendo.geometry.Point = js.native
  def setCenter(value: js.Any): typings.kendoDashUi.kendo.geometry.Point = js.native
  def setCenter(value: typings.kendoDashUi.kendo.geometry.Point): typings.kendoDashUi.kendo.geometry.Point = js.native
  def setRadius(value: Double): typings.kendoDashUi.kendo.geometry.Circle = js.native
}

