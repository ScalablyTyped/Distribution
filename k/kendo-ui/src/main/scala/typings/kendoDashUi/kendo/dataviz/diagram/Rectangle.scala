package typings.kendoDashUi.kendo.dataviz.diagram

import typings.kendoDashUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.diagram.Rectangle")
@js.native
class Rectangle () extends Observable {
  def this(options: RectangleOptions) = this()
  var drawingElement: typings.kendoDashUi.kendo.drawing.Path = js.native
  var options: RectangleOptions = js.native
  def visible(): Boolean = js.native
  def visible(visible: Boolean): Unit = js.native
}

