package typings.handsontable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectionMod {
  
  trait SelectionController extends StObject {
    
    var cell: Boolean
    
    var column: Boolean
    
    var row: Boolean
  }
  object SelectionController {
    
    inline def apply(cell: Boolean, column: Boolean, row: Boolean): SelectionController = {
      val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionController]
    }
    
    extension [Self <: SelectionController](x: Self) {
      
      inline def setCell(value: Boolean): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setColumn(value: Boolean): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setRow(value: Boolean): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    }
  }
}
