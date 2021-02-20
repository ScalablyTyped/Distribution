package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountPermissionsListResponse extends StObject {
  
  /** Account permission collection. */
  var accountPermissions: js.UndefOr[js.Array[AccountPermission]] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#accountPermissionsListResponse". */
  var kind: js.UndefOr[String] = js.native
}
object AccountPermissionsListResponse {
  
  @scala.inline
  def apply(): AccountPermissionsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountPermissionsListResponse]
  }
  
  @scala.inline
  implicit class AccountPermissionsListResponseMutableBuilder[Self <: AccountPermissionsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountPermissions(value: js.Array[AccountPermission]): Self = StObject.set(x, "accountPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountPermissionsUndefined: Self = StObject.set(x, "accountPermissions", js.undefined)
    
    @scala.inline
    def setAccountPermissionsVarargs(value: AccountPermission*): Self = StObject.set(x, "accountPermissions", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
