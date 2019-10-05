package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Draggable")
@js.native
class Draggable protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: DraggableOptions) = this()
  var currentTarget: JQuery = js.native
  @JSName("options")
  var options_Draggable: DraggableOptions = js.native
  def cancelHold(): Unit = js.native
}

