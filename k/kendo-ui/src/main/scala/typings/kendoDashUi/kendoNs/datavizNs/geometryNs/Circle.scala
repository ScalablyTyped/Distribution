package typings.kendoDashUi.kendoNs.datavizNs.geometryNs

import typings.kendoDashUi.kendoNs.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.geometry.Circle")
@js.native
class Circle protected () extends Observable {
  def this(center: js.Any, radius: Double) = this()
  def this(center: typings.kendoDashUi.kendoNs.geometryNs.Point, radius: Double) = this()
  var center: typings.kendoDashUi.kendoNs.geometryNs.Point = js.native
  var options: CircleOptions = js.native
  var radius: Double = js.native
  def bbox(matrix: typings.kendoDashUi.kendoNs.geometryNs.Matrix): typings.kendoDashUi.kendoNs.geometryNs.Rect = js.native
  def equals(other: typings.kendoDashUi.kendoNs.geometryNs.Circle): Boolean = js.native
  def getCenter(): typings.kendoDashUi.kendoNs.geometryNs.Point = js.native
  def getRadius(): Double = js.native
  def pointAt(angle: Double): typings.kendoDashUi.kendoNs.geometryNs.Point = js.native
  def setCenter(value: js.Any): typings.kendoDashUi.kendoNs.geometryNs.Point = js.native
  def setCenter(value: typings.kendoDashUi.kendoNs.geometryNs.Point): typings.kendoDashUi.kendoNs.geometryNs.Point = js.native
  def setRadius(value: Double): typings.kendoDashUi.kendoNs.geometryNs.Circle = js.native
}

