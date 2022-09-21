package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpreadsheetSheetSort extends StObject {
  
  var columns: js.UndefOr[js.Array[SpreadsheetSheetSortColumn]] = js.undefined
  
  var ref: js.UndefOr[String] = js.undefined
}
object SpreadsheetSheetSort {
  
  inline def apply(): SpreadsheetSheetSort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpreadsheetSheetSort]
  }
  
  extension [Self <: SpreadsheetSheetSort](x: Self) {
    
    inline def setColumns(value: js.Array[SpreadsheetSheetSortColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: SpreadsheetSheetSortColumn*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
