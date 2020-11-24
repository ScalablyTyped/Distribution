package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkEditAssignedUserRolesResponse extends js.Object {
  
  /** The list of assigned user roles that have been successfully created. This list will be absent if empty. */
  var createdAssignedUserRoles: js.UndefOr[js.Array[AssignedUserRole]] = js.native
}
object BulkEditAssignedUserRolesResponse {
  
  @scala.inline
  def apply(): BulkEditAssignedUserRolesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkEditAssignedUserRolesResponse]
  }
  
  @scala.inline
  implicit class BulkEditAssignedUserRolesResponseOps[Self <: BulkEditAssignedUserRolesResponse] (val x: Self) extends AnyVal {
    
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
    def setCreatedAssignedUserRolesVarargs(value: AssignedUserRole*): Self = this.set("createdAssignedUserRoles", js.Array(value :_*))
    
    @scala.inline
    def setCreatedAssignedUserRoles(value: js.Array[AssignedUserRole]): Self = this.set("createdAssignedUserRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAssignedUserRoles: Self = this.set("createdAssignedUserRoles", js.undefined)
  }
}
