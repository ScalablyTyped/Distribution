package typings.luminoDatagrid.celleditorMod

import typings.luminoDatagrid.celleditorMod.CellEditor.CellConfig
import typings.luminoDatagrid.selectionmodelMod.SelectionModel.CursorMoveDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICellEditResponse extends js.Object {
  
  /**
    * An object which holds the configuration data for a cell.
    */
  var cell: CellConfig = js.native
  
  /**
    * Cursor move direction based on keys pressed to end the edit.
    */
  var cursorMovement: CursorMoveDirection = js.native
  
  /**
    * Value input.
    */
  var value: js.Any = js.native
}
object ICellEditResponse {
  
  @scala.inline
  def apply(cell: CellConfig, cursorMovement: CursorMoveDirection, value: js.Any): ICellEditResponse = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], cursorMovement = cursorMovement.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICellEditResponse]
  }
  
  @scala.inline
  implicit class ICellEditResponseOps[Self <: ICellEditResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCell(value: CellConfig): Self = this.set("cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorMovement(value: CursorMoveDirection): Self = this.set("cursorMovement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
