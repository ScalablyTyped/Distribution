package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountPermissionsListResponse extends StObject {
  
  /** Account permission collection. */
  var accountPermissions: js.UndefOr[js.Array[AccountPermission]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#accountPermissionsListResponse". */
  var kind: js.UndefOr[String] = js.undefined
}
object AccountPermissionsListResponse {
  
  inline def apply(): AccountPermissionsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountPermissionsListResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountPermissionsListResponse] (val x: Self) extends AnyVal {
    
    inline def setAccountPermissions(value: js.Array[AccountPermission]): Self = StObject.set(x, "accountPermissions", value.asInstanceOf[js.Any])
    
    inline def setAccountPermissionsUndefined: Self = StObject.set(x, "accountPermissions", js.undefined)
    
    inline def setAccountPermissionsVarargs(value: AccountPermission*): Self = StObject.set(x, "accountPermissions", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
