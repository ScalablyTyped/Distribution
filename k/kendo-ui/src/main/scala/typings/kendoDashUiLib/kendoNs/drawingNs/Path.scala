package typings
package kendoDashUiLib.kendoNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.drawing.Path")
@js.native
class Path () extends Element {
  def this(options: PathOptions) = this()
  @JSName("options")
  var options_Path: PathOptions = js.native
  var segments: js.Any = js.native
  def close(): Path = js.native
  def curveTo(controlOut: js.Any, controlIn: js.Any, endPoint: js.Any): Path = js.native
  def curveTo(controlOut: js.Any, controlIn: js.Any, endPoint: kendoDashUiLib.kendoNs.geometryNs.Point): Path = js.native
  def curveTo(controlOut: js.Any, controlIn: kendoDashUiLib.kendoNs.geometryNs.Point, endPoint: js.Any): Path = js.native
  def curveTo(
    controlOut: js.Any,
    controlIn: kendoDashUiLib.kendoNs.geometryNs.Point,
    endPoint: kendoDashUiLib.kendoNs.geometryNs.Point
  ): Path = js.native
  def curveTo(controlOut: kendoDashUiLib.kendoNs.geometryNs.Point, controlIn: js.Any, endPoint: js.Any): Path = js.native
  def curveTo(
    controlOut: kendoDashUiLib.kendoNs.geometryNs.Point,
    controlIn: js.Any,
    endPoint: kendoDashUiLib.kendoNs.geometryNs.Point
  ): Path = js.native
  def curveTo(
    controlOut: kendoDashUiLib.kendoNs.geometryNs.Point,
    controlIn: kendoDashUiLib.kendoNs.geometryNs.Point,
    endPoint: js.Any
  ): Path = js.native
  def curveTo(
    controlOut: kendoDashUiLib.kendoNs.geometryNs.Point,
    controlIn: kendoDashUiLib.kendoNs.geometryNs.Point,
    endPoint: kendoDashUiLib.kendoNs.geometryNs.Point
  ): Path = js.native
  def fill(color: java.lang.String): Path = js.native
  def fill(color: java.lang.String, opacity: scala.Double): Path = js.native
  def lineTo(x: js.Any): Path = js.native
  def lineTo(x: js.Any, y: scala.Double): Path = js.native
  def lineTo(x: kendoDashUiLib.kendoNs.geometryNs.Point): Path = js.native
  def lineTo(x: kendoDashUiLib.kendoNs.geometryNs.Point, y: scala.Double): Path = js.native
  def lineTo(x: scala.Double): Path = js.native
  def lineTo(x: scala.Double, y: scala.Double): Path = js.native
  def moveTo(x: js.Any): Path = js.native
  def moveTo(x: js.Any, y: scala.Double): Path = js.native
  def moveTo(x: kendoDashUiLib.kendoNs.geometryNs.Point): Path = js.native
  def moveTo(x: kendoDashUiLib.kendoNs.geometryNs.Point, y: scala.Double): Path = js.native
  def moveTo(x: scala.Double): Path = js.native
  def moveTo(x: scala.Double, y: scala.Double): Path = js.native
  def stroke(color: java.lang.String): Path = js.native
  def stroke(color: java.lang.String, width: scala.Double): Path = js.native
  def stroke(color: java.lang.String, width: scala.Double, opacity: scala.Double): Path = js.native
}

/* static members */
@JSGlobal("kendo.drawing.Path")
@js.native
object Path extends js.Object {
  def fromArc(arc: kendoDashUiLib.kendoNs.geometryNs.Arc): kendoDashUiLib.kendoNs.drawingNs.Path = js.native
  def fromArc(arc: kendoDashUiLib.kendoNs.geometryNs.Arc, options: js.Any): kendoDashUiLib.kendoNs.drawingNs.Path = js.native
  def fromPoints(points: js.Any): kendoDashUiLib.kendoNs.drawingNs.Path = js.native
  def fromPoints(points: js.Any, options: js.Any): kendoDashUiLib.kendoNs.drawingNs.Path = js.native
  def fromRect(rect: kendoDashUiLib.kendoNs.geometryNs.Rect): kendoDashUiLib.kendoNs.drawingNs.Path = js.native
  def fromRect(rect: kendoDashUiLib.kendoNs.geometryNs.Rect, options: js.Any): kendoDashUiLib.kendoNs.drawingNs.Path = js.native
  def parse(svgPath: java.lang.String): kendoDashUiLib.kendoNs.drawingNs.MultiPath = js.native
  def parse(svgPath: java.lang.String, options: js.Any): kendoDashUiLib.kendoNs.drawingNs.MultiPath = js.native
}

