package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditModeExitingEventUIParam extends StObject {
  
  /**
    * Get or set a boolean indicating whether the changes will be made to the cell's value when edit mode ends.
    */
  var acceptChanges: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Get a boolean indicating if the edit mode is being forced to exit edit mode in which case it cannot be cancelled.
    */
  var canCancel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the cell for which the control is exiting edit mode.
    */
  var cell: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the edit text that will be used to update the cell(s).
    */
  var editText: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a reference to the spreadsheet widget.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object EditModeExitingEventUIParam {
  
  @scala.inline
  def apply(): EditModeExitingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditModeExitingEventUIParam]
  }
  
  @scala.inline
  implicit class EditModeExitingEventUIParamMutableBuilder[Self <: EditModeExitingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptChanges(value: Boolean): Self = StObject.set(x, "acceptChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptChangesUndefined: Self = StObject.set(x, "acceptChanges", js.undefined)
    
    @scala.inline
    def setCanCancel(value: Boolean): Self = StObject.set(x, "canCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanCancelUndefined: Self = StObject.set(x, "canCancel", js.undefined)
    
    @scala.inline
    def setCell(value: String): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
    
    @scala.inline
    def setEditText(value: String): Self = StObject.set(x, "editText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditTextUndefined: Self = StObject.set(x, "editText", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
