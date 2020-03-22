package typings.luminoDatagrid.celleditorMod

import typings.luminoDatagrid.celleditorMod.CellEditor.CellConfig
import typings.luminoDatagrid.selectionmodelMod.SelectionModel.CursorMoveDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICellEditResponse extends js.Object {
  /**
    * An object which holds the configuration data for a cell.
    */
  var cell: CellConfig
  /**
    * Cursor move direction based on keys pressed to end the edit.
    */
  var cursorMovement: CursorMoveDirection
  /**
    * Value input.
    */
  var value: js.Any
}

object ICellEditResponse {
  @scala.inline
  def apply(cell: CellConfig, cursorMovement: CursorMoveDirection, value: js.Any): ICellEditResponse = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], cursorMovement = cursorMovement.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICellEditResponse]
  }
}

