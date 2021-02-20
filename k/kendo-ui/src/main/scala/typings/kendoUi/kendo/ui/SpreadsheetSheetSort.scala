package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpreadsheetSheetSort extends StObject {
  
  var columns: js.UndefOr[js.Array[SpreadsheetSheetSortColumn]] = js.native
  
  var ref: js.UndefOr[String] = js.native
}
object SpreadsheetSheetSort {
  
  @scala.inline
  def apply(): SpreadsheetSheetSort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpreadsheetSheetSort]
  }
  
  @scala.inline
  implicit class SpreadsheetSheetSortMutableBuilder[Self <: SpreadsheetSheetSort] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: js.Array[SpreadsheetSheetSortColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: SpreadsheetSheetSortColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
