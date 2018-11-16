package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Draggable")
@js.native
class Draggable protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: DraggableOptions) = this()
  var currentTarget: kendoDashUiLib.JQuery = js.native
  @JSName("options")
  var options_Draggable: DraggableOptions = js.native
  def cancelHold(): scala.Unit = js.native
}

