package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserRolePermissionsListResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#userRolePermissionsListResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** User role permission collection. */
  var userRolePermissions: js.UndefOr[js.Array[UserRolePermission]] = js.native
}
object UserRolePermissionsListResponse {
  
  @scala.inline
  def apply(): UserRolePermissionsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserRolePermissionsListResponse]
  }
  
  @scala.inline
  implicit class UserRolePermissionsListResponseMutableBuilder[Self <: UserRolePermissionsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setUserRolePermissions(value: js.Array[UserRolePermission]): Self = StObject.set(x, "userRolePermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserRolePermissionsUndefined: Self = StObject.set(x, "userRolePermissions", js.undefined)
    
    @scala.inline
    def setUserRolePermissionsVarargs(value: UserRolePermission*): Self = StObject.set(x, "userRolePermissions", js.Array(value :_*))
  }
}
