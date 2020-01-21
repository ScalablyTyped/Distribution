package typings.kendoUi.kendo.dataviz.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.Rect")
@js.native
class Rect protected ()
  extends typings.kendoUi.kendo.drawing.Element {
  def this(geometry: typings.kendoUi.kendo.geometry.Rect) = this()
  def this(geometry: typings.kendoUi.kendo.geometry.Rect, options: RectOptions) = this()
  @JSName("options")
  var options_Rect: RectOptions = js.native
  def fill(color: String): typings.kendoUi.kendo.drawing.Rect = js.native
  def fill(color: String, opacity: Double): typings.kendoUi.kendo.drawing.Rect = js.native
  def geometry(): typings.kendoUi.kendo.geometry.Rect = js.native
  def geometry(value: typings.kendoUi.kendo.geometry.Rect): Unit = js.native
  def stroke(color: String): typings.kendoUi.kendo.drawing.Rect = js.native
  def stroke(color: String, width: Double): typings.kendoUi.kendo.drawing.Rect = js.native
  def stroke(color: String, width: Double, opacity: Double): typings.kendoUi.kendo.drawing.Rect = js.native
}

