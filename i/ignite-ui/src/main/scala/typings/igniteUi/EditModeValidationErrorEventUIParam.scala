package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditModeValidationErrorEventUIParam extends StObject {
  
  /**
    * Get or set the [action](ig.spreadsheet.SpreadsheetEditModeValidationErrorAction)  to take in response to the failed validation.
    */
  var action: js.UndefOr[String] = js.native
  
  /**
    * Get a boolean indicating whether the cell is allowed to stay in edit mode.
    */
  var canStayInEditMode: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets the cell for which the control is in edit mode.
    */
  var cell: js.UndefOr[String] = js.native
  
  /**
    * Gets a reference to the spreadsheet widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Get the [rule](ig.excel.DataValidationRule) which failed validation.
    */
  var validationRule: js.UndefOr[String] = js.native
}
object EditModeValidationErrorEventUIParam {
  
  @scala.inline
  def apply(): EditModeValidationErrorEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditModeValidationErrorEventUIParam]
  }
  
  @scala.inline
  implicit class EditModeValidationErrorEventUIParamMutableBuilder[Self <: EditModeValidationErrorEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setCanStayInEditMode(value: Boolean): Self = StObject.set(x, "canStayInEditMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanStayInEditModeUndefined: Self = StObject.set(x, "canStayInEditMode", js.undefined)
    
    @scala.inline
    def setCell(value: String): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setValidationRule(value: String): Self = StObject.set(x, "validationRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationRuleUndefined: Self = StObject.set(x, "validationRule", js.undefined)
  }
}
