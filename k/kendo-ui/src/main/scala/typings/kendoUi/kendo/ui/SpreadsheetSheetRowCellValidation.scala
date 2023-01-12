package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpreadsheetSheetRowCellValidation extends StObject {
  
  var allowNulls: js.UndefOr[Boolean] = js.undefined
  
  var comparerType: js.UndefOr[String] = js.undefined
  
  var dataType: js.UndefOr[String] = js.undefined
  
  var from: js.UndefOr[String] = js.undefined
  
  var messageTemplate: js.UndefOr[String] = js.undefined
  
  var showButton: js.UndefOr[Boolean] = js.undefined
  
  var titleTemplate: js.UndefOr[String] = js.undefined
  
  var to: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object SpreadsheetSheetRowCellValidation {
  
  inline def apply(): SpreadsheetSheetRowCellValidation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpreadsheetSheetRowCellValidation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpreadsheetSheetRowCellValidation] (val x: Self) extends AnyVal {
    
    inline def setAllowNulls(value: Boolean): Self = StObject.set(x, "allowNulls", value.asInstanceOf[js.Any])
    
    inline def setAllowNullsUndefined: Self = StObject.set(x, "allowNulls", js.undefined)
    
    inline def setComparerType(value: String): Self = StObject.set(x, "comparerType", value.asInstanceOf[js.Any])
    
    inline def setComparerTypeUndefined: Self = StObject.set(x, "comparerType", js.undefined)
    
    inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setMessageTemplate(value: String): Self = StObject.set(x, "messageTemplate", value.asInstanceOf[js.Any])
    
    inline def setMessageTemplateUndefined: Self = StObject.set(x, "messageTemplate", js.undefined)
    
    inline def setShowButton(value: Boolean): Self = StObject.set(x, "showButton", value.asInstanceOf[js.Any])
    
    inline def setShowButtonUndefined: Self = StObject.set(x, "showButton", js.undefined)
    
    inline def setTitleTemplate(value: String): Self = StObject.set(x, "titleTemplate", value.asInstanceOf[js.Any])
    
    inline def setTitleTemplateUndefined: Self = StObject.set(x, "titleTemplate", js.undefined)
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
