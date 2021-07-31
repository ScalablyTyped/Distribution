package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpreadsheetSheetSortColumn extends StObject {
  
  var ascending: js.UndefOr[Boolean] = js.undefined
  
  var index: js.UndefOr[Double] = js.undefined
}
object SpreadsheetSheetSortColumn {
  
  @scala.inline
  def apply(): SpreadsheetSheetSortColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpreadsheetSheetSortColumn]
  }
  
  @scala.inline
  implicit class SpreadsheetSheetSortColumnMutableBuilder[Self <: SpreadsheetSheetSortColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAscending(value: Boolean): Self = StObject.set(x, "ascending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAscendingUndefined: Self = StObject.set(x, "ascending", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
  }
}
