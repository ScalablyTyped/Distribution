package typings.kendoUi.kendo.dataviz.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.Circle")
@js.native
class Circle protected ()
  extends typings.kendoUi.kendo.drawing.Element {
  def this(geometry: typings.kendoUi.kendo.geometry.Circle) = this()
  def this(geometry: typings.kendoUi.kendo.geometry.Circle, options: CircleOptions) = this()
  @JSName("options")
  var options_Circle: CircleOptions = js.native
  def fill(color: String): typings.kendoUi.kendo.drawing.Circle = js.native
  def fill(color: String, opacity: Double): typings.kendoUi.kendo.drawing.Circle = js.native
  def geometry(): typings.kendoUi.kendo.geometry.Circle = js.native
  def geometry(value: typings.kendoUi.kendo.geometry.Circle): Unit = js.native
  def stroke(color: String): typings.kendoUi.kendo.drawing.Circle = js.native
  def stroke(color: String, width: Double): typings.kendoUi.kendo.drawing.Circle = js.native
  def stroke(color: String, width: Double, opacity: Double): typings.kendoUi.kendo.drawing.Circle = js.native
}

