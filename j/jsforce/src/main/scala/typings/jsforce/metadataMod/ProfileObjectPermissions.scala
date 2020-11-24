package typings.jsforce.metadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProfileObjectPermissions extends js.Object {
  
  var allowCreate: js.UndefOr[Boolean] = js.native
  
  var allowDelete: js.UndefOr[Boolean] = js.native
  
  var allowEdit: js.UndefOr[Boolean] = js.native
  
  var allowRead: js.UndefOr[Boolean] = js.native
  
  var modifyAllRecords: js.UndefOr[Boolean] = js.native
  
  var `object`: String = js.native
  
  var viewAllRecords: js.UndefOr[Boolean] = js.native
}
object ProfileObjectPermissions {
  
  @scala.inline
  def apply(`object`: String): ProfileObjectPermissions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileObjectPermissions]
  }
  
  @scala.inline
  implicit class ProfileObjectPermissionsOps[Self <: ProfileObjectPermissions] (val x: Self) extends AnyVal {
    
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
    def setObject(value: String): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowCreate(value: Boolean): Self = this.set("allowCreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowCreate: Self = this.set("allowCreate", js.undefined)
    
    @scala.inline
    def setAllowDelete(value: Boolean): Self = this.set("allowDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDelete: Self = this.set("allowDelete", js.undefined)
    
    @scala.inline
    def setAllowEdit(value: Boolean): Self = this.set("allowEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEdit: Self = this.set("allowEdit", js.undefined)
    
    @scala.inline
    def setAllowRead(value: Boolean): Self = this.set("allowRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowRead: Self = this.set("allowRead", js.undefined)
    
    @scala.inline
    def setModifyAllRecords(value: Boolean): Self = this.set("modifyAllRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifyAllRecords: Self = this.set("modifyAllRecords", js.undefined)
    
    @scala.inline
    def setViewAllRecords(value: Boolean): Self = this.set("viewAllRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewAllRecords: Self = this.set("viewAllRecords", js.undefined)
  }
}
