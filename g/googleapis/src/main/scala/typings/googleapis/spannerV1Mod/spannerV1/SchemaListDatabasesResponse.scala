package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListDatabasesResponse extends StObject {
  
  /**
    * Databases that matched the request.
    */
  var databases: js.UndefOr[js.Array[SchemaDatabase]] = js.undefined
  
  /**
    * `next_page_token` can be sent in a subsequent ListDatabases call to fetch more of the matching databases.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListDatabasesResponse {
  
  inline def apply(): SchemaListDatabasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDatabasesResponse]
  }
  
  extension [Self <: SchemaListDatabasesResponse](x: Self) {
    
    inline def setDatabases(value: js.Array[SchemaDatabase]): Self = StObject.set(x, "databases", value.asInstanceOf[js.Any])
    
    inline def setDatabasesUndefined: Self = StObject.set(x, "databases", js.undefined)
    
    inline def setDatabasesVarargs(value: SchemaDatabase*): Self = StObject.set(x, "databases", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
