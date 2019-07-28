package typings.kendoDashUi.kendoNs.datavizNs.geometryNs

import typings.kendoDashUi.kendoNs.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.geometry.Transformation")
@js.native
class Transformation () extends Observable {
  var options: TransformationOptions = js.native
  def equals(other: typings.kendoDashUi.kendoNs.geometryNs.Transformation): Boolean = js.native
  def matrix(): typings.kendoDashUi.kendoNs.geometryNs.Matrix = js.native
  def multiply(transformation: typings.kendoDashUi.kendoNs.geometryNs.Transformation): typings.kendoDashUi.kendoNs.geometryNs.Transformation = js.native
  def rotate(angle: Double, center: js.Any): typings.kendoDashUi.kendoNs.geometryNs.Transformation = js.native
  def rotate(angle: Double, center: typings.kendoDashUi.kendoNs.geometryNs.Point): typings.kendoDashUi.kendoNs.geometryNs.Transformation = js.native
  def scale(scaleX: Double, scaleY: Double): typings.kendoDashUi.kendoNs.geometryNs.Transformation = js.native
  def translate(x: Double, y: Double): typings.kendoDashUi.kendoNs.geometryNs.Transformation = js.native
}

