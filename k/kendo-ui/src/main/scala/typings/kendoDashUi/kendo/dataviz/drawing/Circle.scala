package typings.kendoDashUi.kendo.dataviz.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.Circle")
@js.native
class Circle protected ()
  extends typings.kendoDashUi.kendo.drawing.Element {
  def this(geometry: typings.kendoDashUi.kendo.geometry.Circle) = this()
  def this(geometry: typings.kendoDashUi.kendo.geometry.Circle, options: CircleOptions) = this()
  @JSName("options")
  var options_Circle: CircleOptions = js.native
  def fill(color: String): typings.kendoDashUi.kendo.drawing.Circle = js.native
  def fill(color: String, opacity: Double): typings.kendoDashUi.kendo.drawing.Circle = js.native
  def geometry(): typings.kendoDashUi.kendo.geometry.Circle = js.native
  def geometry(value: typings.kendoDashUi.kendo.geometry.Circle): Unit = js.native
  def stroke(color: String): typings.kendoDashUi.kendo.drawing.Circle = js.native
  def stroke(color: String, width: Double): typings.kendoDashUi.kendo.drawing.Circle = js.native
  def stroke(color: String, width: Double, opacity: Double): typings.kendoDashUi.kendo.drawing.Circle = js.native
}

