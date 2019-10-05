package typings.kendoDashUi.kendo.dataviz.geometry

import typings.kendoDashUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.geometry.Transformation")
@js.native
class Transformation () extends Observable {
  var options: TransformationOptions = js.native
  def equals(other: typings.kendoDashUi.kendo.geometry.Transformation): Boolean = js.native
  def matrix(): typings.kendoDashUi.kendo.geometry.Matrix = js.native
  def multiply(transformation: typings.kendoDashUi.kendo.geometry.Transformation): typings.kendoDashUi.kendo.geometry.Transformation = js.native
  def rotate(angle: Double, center: js.Any): typings.kendoDashUi.kendo.geometry.Transformation = js.native
  def rotate(angle: Double, center: typings.kendoDashUi.kendo.geometry.Point): typings.kendoDashUi.kendo.geometry.Transformation = js.native
  def scale(scaleX: Double, scaleY: Double): typings.kendoDashUi.kendo.geometry.Transformation = js.native
  def translate(x: Double, y: Double): typings.kendoDashUi.kendo.geometry.Transformation = js.native
}

