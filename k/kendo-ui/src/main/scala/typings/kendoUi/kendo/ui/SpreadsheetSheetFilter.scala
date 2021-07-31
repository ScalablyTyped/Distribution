package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpreadsheetSheetFilter extends StObject {
  
  var columns: js.UndefOr[js.Array[SpreadsheetSheetFilterColumn]] = js.undefined
  
  var ref: js.UndefOr[String] = js.undefined
}
object SpreadsheetSheetFilter {
  
  @scala.inline
  def apply(): SpreadsheetSheetFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpreadsheetSheetFilter]
  }
  
  @scala.inline
  implicit class SpreadsheetSheetFilterMutableBuilder[Self <: SpreadsheetSheetFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: js.Array[SpreadsheetSheetFilterColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: SpreadsheetSheetFilterColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
