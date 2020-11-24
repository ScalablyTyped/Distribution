package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveWorksheetChangedEventUIParam extends js.Object {
  
  /**
    * Gets the current active [worksheet](ig.excel.Worksheet).
    */
  var newActiveWorksheet: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets the name of the new active worksheet or null if newActiveWorksheet is null.
    */
  var newActiveWorksheetName: js.UndefOr[String] = js.native
  
  /**
    * Gets the previous active [worksheet](ig.excel.Worksheet).
    */
  var oldActiveWorksheet: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets the name of the previous active worksheet or null if oldActiveWorksheet is null.
    */
  var oldActiveWorksheetName: js.UndefOr[String] = js.native
  
  /**
    * Gets a reference to the spreadsheet widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object ActiveWorksheetChangedEventUIParam {
  
  @scala.inline
  def apply(): ActiveWorksheetChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveWorksheetChangedEventUIParam]
  }
  
  @scala.inline
  implicit class ActiveWorksheetChangedEventUIParamOps[Self <: ActiveWorksheetChangedEventUIParam] (val x: Self) extends AnyVal {
    
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
    def setNewActiveWorksheet(value: js.Any): Self = this.set("newActiveWorksheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewActiveWorksheet: Self = this.set("newActiveWorksheet", js.undefined)
    
    @scala.inline
    def setNewActiveWorksheetName(value: String): Self = this.set("newActiveWorksheetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewActiveWorksheetName: Self = this.set("newActiveWorksheetName", js.undefined)
    
    @scala.inline
    def setOldActiveWorksheet(value: js.Any): Self = this.set("oldActiveWorksheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldActiveWorksheet: Self = this.set("oldActiveWorksheet", js.undefined)
    
    @scala.inline
    def setOldActiveWorksheetName(value: String): Self = this.set("oldActiveWorksheetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldActiveWorksheetName: Self = this.set("oldActiveWorksheetName", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
}
