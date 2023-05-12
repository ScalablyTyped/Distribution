package typings.luminoDatagrid.typesCelleditorMod

import typings.luminoDatagrid.typesCelleditorMod.CellEditor.CellConfig
import typings.luminoDatagrid.typesSelectionmodelMod.SelectionModel.CursorMoveDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICellEditResponse extends StObject {
  
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
  var value: Any
}
object ICellEditResponse {
  
  inline def apply(cell: CellConfig, cursorMovement: CursorMoveDirection, value: Any): ICellEditResponse = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], cursorMovement = cursorMovement.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICellEditResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICellEditResponse] (val x: Self) extends AnyVal {
    
    inline def setCell(value: CellConfig): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    inline def setCursorMovement(value: CursorMoveDirection): Self = StObject.set(x, "cursorMovement", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
