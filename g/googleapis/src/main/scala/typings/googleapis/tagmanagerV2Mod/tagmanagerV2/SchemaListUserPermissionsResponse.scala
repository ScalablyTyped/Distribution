package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListUserPermissionsResponse extends StObject {
  
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * All GTM UserPermissions of a GTM Account.
    */
  var userPermission: js.UndefOr[js.Array[SchemaUserPermission]] = js.undefined
}
object SchemaListUserPermissionsResponse {
  
  inline def apply(): SchemaListUserPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListUserPermissionsResponse]
  }
  
  extension [Self <: SchemaListUserPermissionsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUserPermission(value: js.Array[SchemaUserPermission]): Self = StObject.set(x, "userPermission", value.asInstanceOf[js.Any])
    
    inline def setUserPermissionUndefined: Self = StObject.set(x, "userPermission", js.undefined)
    
    inline def setUserPermissionVarargs(value: SchemaUserPermission*): Self = StObject.set(x, "userPermission", js.Array(value*))
  }
}
