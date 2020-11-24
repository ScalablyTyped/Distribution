package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditRowEndedEventUIParam extends js.Object {
  
  /**
    * Gets the old value for the column with the specified key.
    */
  var oldValues: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to GridUpdating.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Check if the edit mode is for adding a new row.
    */
  var rowAdding: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets the row's PK value.
    */
  var rowID: js.UndefOr[js.Any] = js.native
  
  /**
    * Check if any of the values is changed which will cause update in the data source.
    */
  var update: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets the new value for the column with the specified key.
    */
  var values: js.UndefOr[js.Any] = js.native
}
object EditRowEndedEventUIParam {
  
  @scala.inline
  def apply(): EditRowEndedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditRowEndedEventUIParam]
  }
  
  @scala.inline
  implicit class EditRowEndedEventUIParamOps[Self <: EditRowEndedEventUIParam] (val x: Self) extends AnyVal {
    
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
    def setOldValues(value: js.Any): Self = this.set("oldValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldValues: Self = this.set("oldValues", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setRowAdding(value: Boolean): Self = this.set("rowAdding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowAdding: Self = this.set("rowAdding", js.undefined)
    
    @scala.inline
    def setRowID(value: js.Any): Self = this.set("rowID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowID: Self = this.set("rowID", js.undefined)
    
    @scala.inline
    def setUpdate(value: Boolean): Self = this.set("update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
    
    @scala.inline
    def setValues(value: js.Any): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
