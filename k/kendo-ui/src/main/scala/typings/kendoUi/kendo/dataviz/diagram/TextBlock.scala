package typings.kendoUi.kendo.dataviz.diagram

import typings.kendoUi.kendo.Observable_
import typings.kendoUi.kendo.drawing.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.diagram.TextBlock")
@js.native
class TextBlock () extends Observable_ {
  def this(options: TextBlockOptions) = this()
  var drawingElement: Text = js.native
  var options: TextBlockOptions = js.native
  def content(): String = js.native
  def content(content: String): Unit = js.native
  def position(): Unit = js.native
  def position(offset: Point): Unit = js.native
  def rotate(angle: Double, center: Point): Unit = js.native
  def visible(): Boolean = js.native
  def visible(visible: Boolean): Unit = js.native
}

