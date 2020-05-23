package typings.luminoDatagrid.celleditorMod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/datagrid/lib/celleditor", "BooleanCellEditor")
@js.native
class BooleanCellEditor () extends CellEditor {
  var _bindEvents: js.Any = js.native
  var _createWidget: js.Any = js.native
  var _deserialize: js.Any = js.native
  var _input: js.Any = js.native
  var _onBlur: js.Any = js.native
  var _onKeyDown: js.Any = js.native
  var _unbindEvents: js.Any = js.native
  /**
    * Handle the DOM events for the editor.
    *
    * @param event - The DOM event sent to the editor.
    */
  def handleEvent(event: Event): Unit = js.native
}

