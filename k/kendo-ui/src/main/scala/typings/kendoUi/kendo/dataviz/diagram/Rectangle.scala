package typings.kendoUi.kendo.dataviz.diagram

import typings.kendoUi.kendo.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.diagram.Rectangle")
@js.native
class Rectangle () extends Observable_ {
  def this(options: RectangleOptions) = this()
  var drawingElement: typings.kendoUi.kendo.drawing.Path = js.native
  var options: RectangleOptions = js.native
  def visible(): Boolean = js.native
  def visible(visible: Boolean): Unit = js.native
}

