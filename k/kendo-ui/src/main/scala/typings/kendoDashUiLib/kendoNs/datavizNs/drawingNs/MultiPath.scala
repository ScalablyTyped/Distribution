package typings
package kendoDashUiLib.kendoNs.datavizNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.MultiPath")
@js.native
class MultiPath ()
  extends kendoDashUiLib.kendoNs.drawingNs.Element {
  def this(options: MultiPathOptions) = this()
  @JSName("options")
  var options_MultiPath: MultiPathOptions = js.native
  var paths: js.Any = js.native
  def close(): kendoDashUiLib.kendoNs.drawingNs.MultiPath = js.native
  def curveTo(controlOut: js.Any, controlIn: js.Any, endPoint: js.Any): kendoDashUiLib.kendoNs.drawingNs.MultiPath = js.native
  def curveTo(controlOut: js.Any, controlIn: js.Any, endPoint: kendoDashUiLib.kendoNs.geometryNs.Point): kendoDashUiLib.kendoNs.drawingNs.MultiPath = js.native
  def curveTo(controlOut: js.Any, controlIn: kendoDashUiLib.kendoNs.geometryNs.Point, endPoint: js.Any): kendoDashUiLib.kendoNs.drawingNs.MultiPath = js.native
  def curveTo(
    controlOut: js.Any,
    controlIn: kendoDashUiLib.kendoNs.geometryNs.Point,
    endPoint: kendoDashUiLib.kendoNs.geometryNs.Point
  ): kendoDashUiLib.kendoNs.drawingNs.MultiPath = js.native
  def curveTo(controlOut: kendoDashUiLib.kendoNs.geometryNs.Point, controlIn: js.Any, endPoint: js.Any): kendoDashUiLib.kendoNs.drawingNs.MultiPath = js.native
  def curveTo(
    controlOut: kendoDashUiLib.kendoNs.geometryNs.Point,
    controlIn: js.Any,
    endPoint: kendoDashUiLib.kendoNs.geometryNs.Point
  ): kendoDashUiLib.kendoNs.drawingNs.MultiPath = js.native
  def curveTo(
    controlOut: kendoDashUiLib.kendoNs.geometryNs.Point,
    controlIn: kendoDashUiLib.kendoNs.geometryNs.Point,
    endPoint: js.Any
  ): kendoDashUiLib.kendoNs.drawingNs.MultiPath = js.native
  def curveTo(
    controlOut: kendoDashUiLib.kendoNs.geometryNs.Point,
    controlIn: kendoDashUiLib.kendoNs.geometryNs.Point,
    endPoint: kendoDashUiLib.kendoNs.geometryNs.Point
  ): kendoDashUiLib.kendoNs.drawingNs.MultiPath = js.native
  def fill(color: java.lang.String): kendoDashUiLib.kendoNs.drawingNs.MultiPath = js.native
  def fill(color: java.lang.String, opacity: scala.Double): kendoDashUiLib.kendoNs.drawingNs.MultiPath = js.native
  def lineTo(x: js.Any): kendoDashUiLib.kendoNs.drawingNs.MultiPath = js.native
  def lineTo(x: js.Any, y: scala.Double): kendoDashUiLib.kendoNs.drawingNs.MultiPath = js.native
  def lineTo(x: kendoDashUiLib.kendoNs.geometryNs.Point): kendoDashUiLib.kendoNs.drawingNs.MultiPath = js.native
  def lineTo(x: kendoDashUiLib.kendoNs.geometryNs.Point, y: scala.Double): kendoDashUiLib.kendoNs.drawingNs.MultiPath = js.native
  def lineTo(x: scala.Double): kendoDashUiLib.kendoNs.drawingNs.MultiPath = js.native
  def lineTo(x: scala.Double, y: scala.Double): kendoDashUiLib.kendoNs.drawingNs.MultiPath = js.native
  def moveTo(x: js.Any): kendoDashUiLib.kendoNs.drawingNs.MultiPath = js.native
  def moveTo(x: js.Any, y: scala.Double): kendoDashUiLib.kendoNs.drawingNs.MultiPath = js.native
  def moveTo(x: kendoDashUiLib.kendoNs.geometryNs.Point): kendoDashUiLib.kendoNs.drawingNs.MultiPath = js.native
  def moveTo(x: kendoDashUiLib.kendoNs.geometryNs.Point, y: scala.Double): kendoDashUiLib.kendoNs.drawingNs.MultiPath = js.native
  def moveTo(x: scala.Double): kendoDashUiLib.kendoNs.drawingNs.MultiPath = js.native
  def moveTo(x: scala.Double, y: scala.Double): kendoDashUiLib.kendoNs.drawingNs.MultiPath = js.native
  def stroke(color: java.lang.String): kendoDashUiLib.kendoNs.drawingNs.MultiPath = js.native
  def stroke(color: java.lang.String, width: scala.Double): kendoDashUiLib.kendoNs.drawingNs.MultiPath = js.native
  def stroke(color: java.lang.String, width: scala.Double, opacity: scala.Double): kendoDashUiLib.kendoNs.drawingNs.MultiPath = js.native
}

