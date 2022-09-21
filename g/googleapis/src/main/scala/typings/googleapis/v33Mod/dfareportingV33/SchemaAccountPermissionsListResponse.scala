package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountPermissionsListResponse extends StObject {
  
  /**
    * Account permission collection.
    */
  var accountPermissions: js.UndefOr[js.Array[SchemaAccountPermission]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#accountPermissionsListResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaAccountPermissionsListResponse {
  
  inline def apply(): SchemaAccountPermissionsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountPermissionsListResponse]
  }
  
  extension [Self <: SchemaAccountPermissionsListResponse](x: Self) {
    
    inline def setAccountPermissions(value: js.Array[SchemaAccountPermission]): Self = StObject.set(x, "accountPermissions", value.asInstanceOf[js.Any])
    
    inline def setAccountPermissionsUndefined: Self = StObject.set(x, "accountPermissions", js.undefined)
    
    inline def setAccountPermissionsVarargs(value: SchemaAccountPermission*): Self = StObject.set(x, "accountPermissions", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
