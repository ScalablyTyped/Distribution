package typings.kendoDashUi.kendo.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.drawing.Circle")
@js.native
class Circle protected () extends Element {
  def this(geometry: typings.kendoDashUi.kendo.geometry.Circle) = this()
  def this(geometry: typings.kendoDashUi.kendo.geometry.Circle, options: CircleOptions) = this()
  @JSName("options")
  var options_Circle: CircleOptions = js.native
  def fill(color: String): Circle = js.native
  def fill(color: String, opacity: Double): Circle = js.native
  def geometry(): typings.kendoDashUi.kendo.geometry.Circle = js.native
  def geometry(value: typings.kendoDashUi.kendo.geometry.Circle): Unit = js.native
  def stroke(color: String): Circle = js.native
  def stroke(color: String, width: Double): Circle = js.native
  def stroke(color: String, width: Double, opacity: Double): Circle = js.native
}

