package typings.kendoDashUi.kendoNs.datavizNs.geometryNs

import typings.kendoDashUi.kendoNs.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.geometry.Arc")
@js.native
class Arc protected () extends Observable {
  def this(center: js.Any) = this()
  def this(center: typings.kendoDashUi.kendoNs.geometryNs.Point) = this()
  def this(center: js.Any, options: ArcOptions) = this()
  def this(center: typings.kendoDashUi.kendoNs.geometryNs.Point, options: ArcOptions) = this()
  var anticlockwise: Boolean = js.native
  var center: typings.kendoDashUi.kendoNs.geometryNs.Point = js.native
  var endAngle: Double = js.native
  var options: ArcOptions = js.native
  var radiusX: Double = js.native
  var radiusY: Double = js.native
  var startAngle: Double = js.native
  def bbox(matrix: typings.kendoDashUi.kendoNs.geometryNs.Matrix): typings.kendoDashUi.kendoNs.geometryNs.Rect = js.native
  def getAnticlockwise(): Boolean = js.native
  def getCenter(): typings.kendoDashUi.kendoNs.geometryNs.Point = js.native
  def getEndAngle(): Double = js.native
  def getRadiusX(): Double = js.native
  def getRadiusY(): Double = js.native
  def getStartAngle(): Double = js.native
  def pointAt(angle: Double): typings.kendoDashUi.kendoNs.geometryNs.Point = js.native
  def setAnticlockwise(value: Boolean): typings.kendoDashUi.kendoNs.geometryNs.Arc = js.native
  def setCenter(value: typings.kendoDashUi.kendoNs.geometryNs.Point): typings.kendoDashUi.kendoNs.geometryNs.Arc = js.native
  def setEndAngle(value: Double): typings.kendoDashUi.kendoNs.geometryNs.Arc = js.native
  def setRadiusX(value: Double): typings.kendoDashUi.kendoNs.geometryNs.Arc = js.native
  def setRadiusY(value: Double): typings.kendoDashUi.kendoNs.geometryNs.Arc = js.native
  def setStartAngle(value: Double): typings.kendoDashUi.kendoNs.geometryNs.Arc = js.native
}

