package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListRolesResponse extends StObject {
  
  /**
    * To retrieve the next page of results, set `ListRolesRequest.page_token` to this value.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Roles defined on this resource.
    */
  var roles: js.UndefOr[js.Array[SchemaRole]] = js.undefined
}
object SchemaListRolesResponse {
  
  inline def apply(): SchemaListRolesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListRolesResponse]
  }
  
  extension [Self <: SchemaListRolesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRoles(value: js.Array[SchemaRole]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    inline def setRolesVarargs(value: SchemaRole*): Self = StObject.set(x, "roles", js.Array(value*))
  }
}
