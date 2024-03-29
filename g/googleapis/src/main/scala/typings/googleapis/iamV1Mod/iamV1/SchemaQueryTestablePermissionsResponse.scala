package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQueryTestablePermissionsResponse extends StObject {
  
  /**
    * To retrieve the next page of results, set `QueryTestableRolesRequest.page_token` to this value.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Permissions testable on the requested resource.
    */
  var permissions: js.UndefOr[js.Array[SchemaPermission]] = js.undefined
}
object SchemaQueryTestablePermissionsResponse {
  
  inline def apply(): SchemaQueryTestablePermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryTestablePermissionsResponse]
  }
  
  extension [Self <: SchemaQueryTestablePermissionsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPermissions(value: js.Array[SchemaPermission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: SchemaPermission*): Self = StObject.set(x, "permissions", js.Array(value*))
  }
}
