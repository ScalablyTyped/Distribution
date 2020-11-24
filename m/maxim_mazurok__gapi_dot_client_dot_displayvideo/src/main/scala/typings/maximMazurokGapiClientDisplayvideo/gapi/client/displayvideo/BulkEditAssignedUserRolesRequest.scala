package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkEditAssignedUserRolesRequest extends js.Object {
  
  /** The assigned user roles to create in batch, specified as a list of AssignedUserRoles. */
  var createdAssignedUserRoles: js.UndefOr[js.Array[AssignedUserRole]] = js.native
  
  /** The assigned user roles to delete in batch, specified as a list of assigned_user_role_ids. The format of assigned_user_role_id is `entityType-entityid`, for example `partner-123`. */
  var deletedAssignedUserRoles: js.UndefOr[js.Array[String]] = js.native
}
object BulkEditAssignedUserRolesRequest {
  
  @scala.inline
  def apply(): BulkEditAssignedUserRolesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkEditAssignedUserRolesRequest]
  }
  
  @scala.inline
  implicit class BulkEditAssignedUserRolesRequestOps[Self <: BulkEditAssignedUserRolesRequest] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setDeletedAssignedUserRolesVarargs(value: String*): Self = this.set("deletedAssignedUserRoles", js.Array(value :_*))
    
    @scala.inline
    def setDeletedAssignedUserRoles(value: js.Array[String]): Self = this.set("deletedAssignedUserRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletedAssignedUserRoles: Self = this.set("deletedAssignedUserRoles", js.undefined)
  }
}
