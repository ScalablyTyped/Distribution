package typings
package kendoDashUiLib.kendoNs.datavizNs.geometryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.geometry.Arc")
@js.native
class Arc protected ()
  extends kendoDashUiLib.kendoNs.Observable {
  def this(center: js.Any) = this()
  def this(center: kendoDashUiLib.kendoNs.geometryNs.Point) = this()
  def this(center: js.Any, options: ArcOptions) = this()
  def this(center: kendoDashUiLib.kendoNs.geometryNs.Point, options: ArcOptions) = this()
  var anticlockwise: scala.Boolean = js.native
  var center: kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  var endAngle: scala.Double = js.native
  var options: ArcOptions = js.native
  var radiusX: scala.Double = js.native
  var radiusY: scala.Double = js.native
  var startAngle: scala.Double = js.native
  def bbox(matrix: kendoDashUiLib.kendoNs.geometryNs.Matrix): kendoDashUiLib.kendoNs.geometryNs.Rect = js.native
  def getAnticlockwise(): scala.Boolean = js.native
  def getCenter(): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  def getEndAngle(): scala.Double = js.native
  def getRadiusX(): scala.Double = js.native
  def getRadiusY(): scala.Double = js.native
  def getStartAngle(): scala.Double = js.native
  def pointAt(angle: scala.Double): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  def setAnticlockwise(value: scala.Boolean): kendoDashUiLib.kendoNs.geometryNs.Arc = js.native
  def setCenter(value: kendoDashUiLib.kendoNs.geometryNs.Point): kendoDashUiLib.kendoNs.geometryNs.Arc = js.native
  def setEndAngle(value: scala.Double): kendoDashUiLib.kendoNs.geometryNs.Arc = js.native
  def setRadiusX(value: scala.Double): kendoDashUiLib.kendoNs.geometryNs.Arc = js.native
  def setRadiusY(value: scala.Double): kendoDashUiLib.kendoNs.geometryNs.Arc = js.native
  def setStartAngle(value: scala.Double): kendoDashUiLib.kendoNs.geometryNs.Arc = js.native
}

