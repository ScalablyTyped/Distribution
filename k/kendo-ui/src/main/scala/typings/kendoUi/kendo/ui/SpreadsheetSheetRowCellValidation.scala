package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpreadsheetSheetRowCellValidation extends StObject {
  
  var allowNulls: js.UndefOr[Boolean] = js.native
  
  var comparerType: js.UndefOr[String] = js.native
  
  var dataType: js.UndefOr[String] = js.native
  
  var from: js.UndefOr[String] = js.native
  
  var messageTemplate: js.UndefOr[String] = js.native
  
  var showButton: js.UndefOr[Boolean] = js.native
  
  var titleTemplate: js.UndefOr[String] = js.native
  
  var to: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object SpreadsheetSheetRowCellValidation {
  
  @scala.inline
  def apply(): SpreadsheetSheetRowCellValidation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpreadsheetSheetRowCellValidation]
  }
  
  @scala.inline
  implicit class SpreadsheetSheetRowCellValidationMutableBuilder[Self <: SpreadsheetSheetRowCellValidation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowNulls(value: Boolean): Self = StObject.set(x, "allowNulls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowNullsUndefined: Self = StObject.set(x, "allowNulls", js.undefined)
    
    @scala.inline
    def setComparerType(value: String): Self = StObject.set(x, "comparerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComparerTypeUndefined: Self = StObject.set(x, "comparerType", js.undefined)
    
    @scala.inline
    def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    @scala.inline
    def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setMessageTemplate(value: String): Self = StObject.set(x, "messageTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageTemplateUndefined: Self = StObject.set(x, "messageTemplate", js.undefined)
    
    @scala.inline
    def setShowButton(value: Boolean): Self = StObject.set(x, "showButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowButtonUndefined: Self = StObject.set(x, "showButton", js.undefined)
    
    @scala.inline
    def setTitleTemplate(value: String): Self = StObject.set(x, "titleTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleTemplateUndefined: Self = StObject.set(x, "titleTemplate", js.undefined)
    
    @scala.inline
    def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
