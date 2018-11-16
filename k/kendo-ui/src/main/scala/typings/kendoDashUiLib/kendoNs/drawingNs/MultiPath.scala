package typings
package kendoDashUiLib.kendoNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.drawing.MultiPath")
@js.native
class MultiPath () extends Element {
  def this(options: MultiPathOptions) = this()
  @JSName("options")
  var options_MultiPath: MultiPathOptions = js.native
  var paths: js.Any = js.native
  def close(): MultiPath = js.native
  def curveTo(controlOut: js.Any, controlIn: js.Any, endPoint: js.Any): MultiPath = js.native
  def curveTo(controlOut: js.Any, controlIn: js.Any, endPoint: kendoDashUiLib.kendoNs.geometryNs.Point): MultiPath = js.native
  def curveTo(controlOut: js.Any, controlIn: kendoDashUiLib.kendoNs.geometryNs.Point, endPoint: js.Any): MultiPath = js.native
  def curveTo(
    controlOut: js.Any,
    controlIn: kendoDashUiLib.kendoNs.geometryNs.Point,
    endPoint: kendoDashUiLib.kendoNs.geometryNs.Point
  ): MultiPath = js.native
  def curveTo(controlOut: kendoDashUiLib.kendoNs.geometryNs.Point, controlIn: js.Any, endPoint: js.Any): MultiPath = js.native
  def curveTo(
    controlOut: kendoDashUiLib.kendoNs.geometryNs.Point,
    controlIn: js.Any,
    endPoint: kendoDashUiLib.kendoNs.geometryNs.Point
  ): MultiPath = js.native
  def curveTo(
    controlOut: kendoDashUiLib.kendoNs.geometryNs.Point,
    controlIn: kendoDashUiLib.kendoNs.geometryNs.Point,
    endPoint: js.Any
  ): MultiPath = js.native
  def curveTo(
    controlOut: kendoDashUiLib.kendoNs.geometryNs.Point,
    controlIn: kendoDashUiLib.kendoNs.geometryNs.Point,
    endPoint: kendoDashUiLib.kendoNs.geometryNs.Point
  ): MultiPath = js.native
  def fill(color: java.lang.String): MultiPath = js.native
  def fill(color: java.lang.String, opacity: scala.Double): MultiPath = js.native
  def lineTo(x: js.Any): MultiPath = js.native
  def lineTo(x: js.Any, y: scala.Double): MultiPath = js.native
  def lineTo(x: kendoDashUiLib.kendoNs.geometryNs.Point): MultiPath = js.native
  def lineTo(x: kendoDashUiLib.kendoNs.geometryNs.Point, y: scala.Double): MultiPath = js.native
  def lineTo(x: scala.Double): MultiPath = js.native
  def lineTo(x: scala.Double, y: scala.Double): MultiPath = js.native
  def moveTo(x: js.Any): MultiPath = js.native
  def moveTo(x: js.Any, y: scala.Double): MultiPath = js.native
  def moveTo(x: kendoDashUiLib.kendoNs.geometryNs.Point): MultiPath = js.native
  def moveTo(x: kendoDashUiLib.kendoNs.geometryNs.Point, y: scala.Double): MultiPath = js.native
  def moveTo(x: scala.Double): MultiPath = js.native
  def moveTo(x: scala.Double, y: scala.Double): MultiPath = js.native
  def stroke(color: java.lang.String): MultiPath = js.native
  def stroke(color: java.lang.String, width: scala.Double): MultiPath = js.native
  def stroke(color: java.lang.String, width: scala.Double, opacity: scala.Double): MultiPath = js.native
}

