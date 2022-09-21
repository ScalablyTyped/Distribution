package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListDatabaseRolesResponse extends StObject {
  
  /**
    * Database roles that matched the request.
    */
  var databaseRoles: js.UndefOr[js.Array[SchemaDatabaseRole]] = js.undefined
  
  /**
    * `next_page_token` can be sent in a subsequent ListDatabaseRoles call to fetch more of the matching roles.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListDatabaseRolesResponse {
  
  inline def apply(): SchemaListDatabaseRolesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDatabaseRolesResponse]
  }
  
  extension [Self <: SchemaListDatabaseRolesResponse](x: Self) {
    
    inline def setDatabaseRoles(value: js.Array[SchemaDatabaseRole]): Self = StObject.set(x, "databaseRoles", value.asInstanceOf[js.Any])
    
    inline def setDatabaseRolesUndefined: Self = StObject.set(x, "databaseRoles", js.undefined)
    
    inline def setDatabaseRolesVarargs(value: SchemaDatabaseRole*): Self = StObject.set(x, "databaseRoles", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
