package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpreadsheetSheetFilterColumnCriteriaItem extends StObject {
  
  var operator: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object SpreadsheetSheetFilterColumnCriteriaItem {
  
  @scala.inline
  def apply(): SpreadsheetSheetFilterColumnCriteriaItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpreadsheetSheetFilterColumnCriteriaItem]
  }
  
  @scala.inline
  implicit class SpreadsheetSheetFilterColumnCriteriaItemMutableBuilder[Self <: SpreadsheetSheetFilterColumnCriteriaItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
