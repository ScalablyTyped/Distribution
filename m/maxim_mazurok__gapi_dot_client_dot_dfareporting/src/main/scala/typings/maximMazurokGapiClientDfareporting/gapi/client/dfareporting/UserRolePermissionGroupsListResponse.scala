package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserRolePermissionGroupsListResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#userRolePermissionGroupsListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** User role permission group collection. */
  var userRolePermissionGroups: js.UndefOr[js.Array[UserRolePermissionGroup]] = js.undefined
}
object UserRolePermissionGroupsListResponse {
  
  @scala.inline
  def apply(): UserRolePermissionGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserRolePermissionGroupsListResponse]
  }
  
  @scala.inline
  implicit class UserRolePermissionGroupsListResponseMutableBuilder[Self <: UserRolePermissionGroupsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setUserRolePermissionGroups(value: js.Array[UserRolePermissionGroup]): Self = StObject.set(x, "userRolePermissionGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserRolePermissionGroupsUndefined: Self = StObject.set(x, "userRolePermissionGroups", js.undefined)
    
    @scala.inline
    def setUserRolePermissionGroupsVarargs(value: UserRolePermissionGroup*): Self = StObject.set(x, "userRolePermissionGroups", js.Array(value :_*))
  }
}
