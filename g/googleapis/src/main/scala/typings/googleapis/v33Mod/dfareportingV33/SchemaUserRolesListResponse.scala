package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * User Role List Response
  */
trait SchemaUserRolesListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#userRolesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * User role collection.
    */
  var userRoles: js.UndefOr[js.Array[SchemaUserRole]] = js.undefined
}
object SchemaUserRolesListResponse {
  
  inline def apply(): SchemaUserRolesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserRolesListResponse]
  }
  
  extension [Self <: SchemaUserRolesListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUserRoles(value: js.Array[SchemaUserRole]): Self = StObject.set(x, "userRoles", value.asInstanceOf[js.Any])
    
    inline def setUserRolesUndefined: Self = StObject.set(x, "userRoles", js.undefined)
    
    inline def setUserRolesVarargs(value: SchemaUserRole*): Self = StObject.set(x, "userRoles", js.Array(value :_*))
  }
}
