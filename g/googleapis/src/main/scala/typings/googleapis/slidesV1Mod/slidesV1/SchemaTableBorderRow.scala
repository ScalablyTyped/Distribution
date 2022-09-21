package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTableBorderRow extends StObject {
  
  /**
    * Properties of each border cell. When a border's adjacent table cells are merged, it is not included in the response.
    */
  var tableBorderCells: js.UndefOr[js.Array[SchemaTableBorderCell]] = js.undefined
}
object SchemaTableBorderRow {
  
  inline def apply(): SchemaTableBorderRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableBorderRow]
  }
  
  extension [Self <: SchemaTableBorderRow](x: Self) {
    
    inline def setTableBorderCells(value: js.Array[SchemaTableBorderCell]): Self = StObject.set(x, "tableBorderCells", value.asInstanceOf[js.Any])
    
    inline def setTableBorderCellsUndefined: Self = StObject.set(x, "tableBorderCells", js.undefined)
    
    inline def setTableBorderCellsVarargs(value: SchemaTableBorderCell*): Self = StObject.set(x, "tableBorderCells", js.Array(value*))
  }
}
