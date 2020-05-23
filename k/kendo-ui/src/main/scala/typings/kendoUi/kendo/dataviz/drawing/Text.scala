package typings.kendoUi.kendo.dataviz.drawing

import typings.kendoUi.kendo.geometry.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Text
  extends typings.kendoUi.kendo.drawing.Element {
  @JSName("options")
  var options_Text: TextOptions = js.native
  def content(): String = js.native
  def content(value: String): Unit = js.native
  def fill(color: String): typings.kendoUi.kendo.drawing.Text = js.native
  def fill(color: String, opacity: Double): typings.kendoUi.kendo.drawing.Text = js.native
  def position(): Point = js.native
  def position(value: Point): Unit = js.native
  def stroke(color: String): typings.kendoUi.kendo.drawing.Text = js.native
  def stroke(color: String, width: Double): typings.kendoUi.kendo.drawing.Text = js.native
  def stroke(color: String, width: Double, opacity: Double): typings.kendoUi.kendo.drawing.Text = js.native
}

