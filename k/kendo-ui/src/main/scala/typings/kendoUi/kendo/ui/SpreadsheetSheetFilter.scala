package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpreadsheetSheetFilter extends StObject {
  
  var columns: js.UndefOr[js.Array[SpreadsheetSheetFilterColumn]] = js.undefined
  
  var ref: js.UndefOr[String] = js.undefined
}
object SpreadsheetSheetFilter {
  
  inline def apply(): SpreadsheetSheetFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpreadsheetSheetFilter]
  }
  
  extension [Self <: SpreadsheetSheetFilter](x: Self) {
    
    inline def setColumns(value: js.Array[SpreadsheetSheetFilterColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: SpreadsheetSheetFilterColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
