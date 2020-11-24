package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditModeExitingEventUIParam extends js.Object {
  
  /**
    * Get or set a boolean indicating whether the changes will be made to the cell's value when edit mode ends.
    */
  var acceptChanges: js.UndefOr[Boolean] = js.native
  
  /**
    * Get a boolean indicating if the edit mode is being forced to exit edit mode in which case it cannot be cancelled.
    */
  var canCancel: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets the cell for which the control is exiting edit mode.
    */
  var cell: js.UndefOr[String] = js.native
  
  /**
    * Gets the edit text that will be used to update the cell(s).
    */
  var editText: js.UndefOr[String] = js.native
  
  /**
    * Gets a reference to the spreadsheet widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object EditModeExitingEventUIParam {
  
  @scala.inline
  def apply(): EditModeExitingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditModeExitingEventUIParam]
  }
  
  @scala.inline
  implicit class EditModeExitingEventUIParamOps[Self <: EditModeExitingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAcceptChanges(value: Boolean): Self = this.set("acceptChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptChanges: Self = this.set("acceptChanges", js.undefined)
    
    @scala.inline
    def setCanCancel(value: Boolean): Self = this.set("canCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanCancel: Self = this.set("canCancel", js.undefined)
    
    @scala.inline
    def setCell(value: String): Self = this.set("cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCell: Self = this.set("cell", js.undefined)
    
    @scala.inline
    def setEditText(value: String): Self = this.set("editText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditText: Self = this.set("editText", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
}
