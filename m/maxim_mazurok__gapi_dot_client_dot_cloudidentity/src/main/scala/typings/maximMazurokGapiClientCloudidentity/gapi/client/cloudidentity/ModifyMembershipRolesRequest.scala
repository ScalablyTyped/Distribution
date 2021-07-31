package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyMembershipRolesRequest extends StObject {
  
  /** The `MembershipRole`s to be added. Adding or removing roles in the same request as updating roles is not supported. Must not be set if `update_roles_params` is set. */
  var addRoles: js.UndefOr[js.Array[MembershipRole]] = js.undefined
  
  /**
    * The `name`s of the `MembershipRole`s to be removed. Adding or removing roles in the same request as updating roles is not supported. It is not possible to remove the `MEMBER`
    * `MembershipRole`. If you wish to delete a `Membership`, call MembershipsService.DeleteMembership instead. Must not contain `MEMBER`. Must not be set if `update_roles_params` is set.
    */
  var removeRoles: js.UndefOr[js.Array[String]] = js.undefined
}
object ModifyMembershipRolesRequest {
  
  @scala.inline
  def apply(): ModifyMembershipRolesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyMembershipRolesRequest]
  }
  
  @scala.inline
  implicit class ModifyMembershipRolesRequestMutableBuilder[Self <: ModifyMembershipRolesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddRoles(value: js.Array[MembershipRole]): Self = StObject.set(x, "addRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddRolesUndefined: Self = StObject.set(x, "addRoles", js.undefined)
    
    @scala.inline
    def setAddRolesVarargs(value: MembershipRole*): Self = StObject.set(x, "addRoles", js.Array(value :_*))
    
    @scala.inline
    def setRemoveRoles(value: js.Array[String]): Self = StObject.set(x, "removeRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveRolesUndefined: Self = StObject.set(x, "removeRoles", js.undefined)
    
    @scala.inline
    def setRemoveRolesVarargs(value: String*): Self = StObject.set(x, "removeRoles", js.Array(value :_*))
  }
}
