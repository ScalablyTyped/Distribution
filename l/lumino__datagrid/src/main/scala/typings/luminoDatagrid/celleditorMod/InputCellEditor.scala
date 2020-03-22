package typings.luminoDatagrid.celleditorMod

import typings.std.Event_
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/datagrid/lib/celleditor", "InputCellEditor")
@js.native
abstract class InputCellEditor () extends CellEditor {
  var _onBlur: js.Any = js.native
  var _onInput: js.Any = js.native
  var _onKeyDown: js.Any = js.native
  var _unbindEvents: js.Any = js.native
  var input: HTMLInputElement = js.native
  var inputType: String = js.native
  /* protected */ def bindEvents(): Unit = js.native
  /* protected */ def createWidget(): Unit = js.native
  /* protected */ def deserialize(value: js.Any): js.Any = js.native
  /**
    * Handle the DOM events for the editor.
    *
    * @param event - The DOM event sent to the editor.
    */
  def handleEvent(event: Event_): Unit = js.native
}

