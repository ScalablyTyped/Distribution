package typings.kendoUi.kendo.dataviz.geometry

import typings.kendoUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transformation extends Observable {
  var options: TransformationOptions = js.native
  def equals(other: typings.kendoUi.kendo.geometry.Transformation): Boolean = js.native
  def matrix(): typings.kendoUi.kendo.geometry.Matrix = js.native
  def multiply(transformation: typings.kendoUi.kendo.geometry.Transformation): typings.kendoUi.kendo.geometry.Transformation = js.native
  def rotate(angle: Double, center: js.Any): typings.kendoUi.kendo.geometry.Transformation = js.native
  def rotate(angle: Double, center: typings.kendoUi.kendo.geometry.Point): typings.kendoUi.kendo.geometry.Transformation = js.native
  def scale(scaleX: Double, scaleY: Double): typings.kendoUi.kendo.geometry.Transformation = js.native
  def translate(x: Double, y: Double): typings.kendoUi.kendo.geometry.Transformation = js.native
}

