package typings
package kendoDashUiLib.kendoNs.datavizNs.geometryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.geometry.Transformation")
@js.native
class Transformation ()
  extends kendoDashUiLib.kendoNs.Observable {
  var options: TransformationOptions = js.native
  def equals(other: kendoDashUiLib.kendoNs.geometryNs.Transformation): scala.Boolean = js.native
  def matrix(): kendoDashUiLib.kendoNs.geometryNs.Matrix = js.native
  def multiply(transformation: kendoDashUiLib.kendoNs.geometryNs.Transformation): kendoDashUiLib.kendoNs.geometryNs.Transformation = js.native
  def rotate(angle: scala.Double, center: js.Any): kendoDashUiLib.kendoNs.geometryNs.Transformation = js.native
  def rotate(angle: scala.Double, center: kendoDashUiLib.kendoNs.geometryNs.Point): kendoDashUiLib.kendoNs.geometryNs.Transformation = js.native
  def scale(scaleX: scala.Double, scaleY: scala.Double): kendoDashUiLib.kendoNs.geometryNs.Transformation = js.native
  def translate(x: scala.Double, y: scala.Double): kendoDashUiLib.kendoNs.geometryNs.Transformation = js.native
}

