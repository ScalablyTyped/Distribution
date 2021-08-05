package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Account Permission Group List Response
  */
trait SchemaAccountPermissionGroupsListResponse extends StObject {
  
  /**
    * Account permission group collection.
    */
  var accountPermissionGroups: js.UndefOr[js.Array[SchemaAccountPermissionGroup]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#accountPermissionGroupsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaAccountPermissionGroupsListResponse {
  
  inline def apply(): SchemaAccountPermissionGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountPermissionGroupsListResponse]
  }
  
  extension [Self <: SchemaAccountPermissionGroupsListResponse](x: Self) {
    
    inline def setAccountPermissionGroups(value: js.Array[SchemaAccountPermissionGroup]): Self = StObject.set(x, "accountPermissionGroups", value.asInstanceOf[js.Any])
    
    inline def setAccountPermissionGroupsUndefined: Self = StObject.set(x, "accountPermissionGroups", js.undefined)
    
    inline def setAccountPermissionGroupsVarargs(value: SchemaAccountPermissionGroup*): Self = StObject.set(x, "accountPermissionGroups", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
