package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditModeValidationErrorEventUIParam extends StObject {
  
  /**
    * Get or set the [action](ig.spreadsheet.SpreadsheetEditModeValidationErrorAction)  to take in response to the failed validation.
    */
  var action: js.UndefOr[String] = js.undefined
  
  /**
    * Get a boolean indicating whether the cell is allowed to stay in edit mode.
    */
  var canStayInEditMode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the cell for which the control is in edit mode.
    */
  var cell: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a reference to the spreadsheet widget.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Get the [rule](ig.excel.DataValidationRule) which failed validation.
    */
  var validationRule: js.UndefOr[String] = js.undefined
}
object EditModeValidationErrorEventUIParam {
  
  inline def apply(): EditModeValidationErrorEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditModeValidationErrorEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditModeValidationErrorEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setCanStayInEditMode(value: Boolean): Self = StObject.set(x, "canStayInEditMode", value.asInstanceOf[js.Any])
    
    inline def setCanStayInEditModeUndefined: Self = StObject.set(x, "canStayInEditMode", js.undefined)
    
    inline def setCell(value: String): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setValidationRule(value: String): Self = StObject.set(x, "validationRule", value.asInstanceOf[js.Any])
    
    inline def setValidationRuleUndefined: Self = StObject.set(x, "validationRule", js.undefined)
  }
}
