package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyMembershipRolesRequest extends js.Object {
  
  /** The `MembershipRole`s to be added. Adding or removing roles in the same request as updating roles is not supported. Must not be set if `update_roles_params` is set. */
  var addRoles: js.UndefOr[js.Array[MembershipRole]] = js.native
  
  /**
    * The `name`s of the `MembershipRole`s to be removed. Adding or removing roles in the same request as updating roles is not supported. It is not possible to remove the `MEMBER`
    * `MembershipRole`. If you wish to delete a `Membership`, call MembershipsService.DeleteMembership instead. Must not contain `MEMBER`. Must not be set if `update_roles_params` is set.
    */
  var removeRoles: js.UndefOr[js.Array[String]] = js.native
}
object ModifyMembershipRolesRequest {
  
  @scala.inline
  def apply(): ModifyMembershipRolesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyMembershipRolesRequest]
  }
  
  @scala.inline
  implicit class ModifyMembershipRolesRequestOps[Self <: ModifyMembershipRolesRequest] (val x: Self) extends AnyVal {
    
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
    def setAddRolesVarargs(value: MembershipRole*): Self = this.set("addRoles", js.Array(value :_*))
    
    @scala.inline
    def setAddRoles(value: js.Array[MembershipRole]): Self = this.set("addRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddRoles: Self = this.set("addRoles", js.undefined)
    
    @scala.inline
    def setRemoveRolesVarargs(value: String*): Self = this.set("removeRoles", js.Array(value :_*))
    
    @scala.inline
    def setRemoveRoles(value: js.Array[String]): Self = this.set("removeRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveRoles: Self = this.set("removeRoles", js.undefined)
  }
}
