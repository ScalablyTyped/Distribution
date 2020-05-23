package typings.kendoUi.kendo.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Circle extends Element {
  @JSName("options")
  var options_Circle: CircleOptions = js.native
  def fill(color: String): Circle = js.native
  def fill(color: String, opacity: Double): Circle = js.native
  def geometry(): typings.kendoUi.kendo.geometry.Circle = js.native
  def geometry(value: typings.kendoUi.kendo.geometry.Circle): Unit = js.native
  def stroke(color: String): Circle = js.native
  def stroke(color: String, width: Double): Circle = js.native
  def stroke(color: String, width: Double, opacity: Double): Circle = js.native
}

