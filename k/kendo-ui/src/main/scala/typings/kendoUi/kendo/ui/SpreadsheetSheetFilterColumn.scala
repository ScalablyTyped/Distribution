package typings.kendoUi.kendo.ui

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpreadsheetSheetFilterColumn extends StObject {
  
  var criteria: js.UndefOr[js.Array[SpreadsheetSheetFilterColumnCriteriaItem]] = js.native
  
  var filter: js.UndefOr[String] = js.native
  
  var index: js.UndefOr[Double] = js.native
  
  var logic: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[Double | String | Date] = js.native
  
  var values: js.UndefOr[js.Any] = js.native
}
object SpreadsheetSheetFilterColumn {
  
  @scala.inline
  def apply(): SpreadsheetSheetFilterColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpreadsheetSheetFilterColumn]
  }
  
  @scala.inline
  implicit class SpreadsheetSheetFilterColumnMutableBuilder[Self <: SpreadsheetSheetFilterColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCriteria(value: js.Array[SpreadsheetSheetFilterColumnCriteriaItem]): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
    
    @scala.inline
    def setCriteriaVarargs(value: SpreadsheetSheetFilterColumnCriteriaItem*): Self = StObject.set(x, "criteria", js.Array(value :_*))
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setLogic(value: String): Self = StObject.set(x, "logic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogicUndefined: Self = StObject.set(x, "logic", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: Double | String | Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setValues(value: js.Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
