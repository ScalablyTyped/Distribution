package typings.googleapis.doubleclickbidmanagerV2Mod.doubleclickbidmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListQueriesResponse extends StObject {
  
  /**
    * A token, which can be sent as page_token to retrieve the next page of queries. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of queries.
    */
  var queries: js.UndefOr[js.Array[SchemaQuery]] = js.undefined
}
object SchemaListQueriesResponse {
  
  inline def apply(): SchemaListQueriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListQueriesResponse]
  }
  
  extension [Self <: SchemaListQueriesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setQueries(value: js.Array[SchemaQuery]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    inline def setQueriesUndefined: Self = StObject.set(x, "queries", js.undefined)
    
    inline def setQueriesVarargs(value: SchemaQuery*): Self = StObject.set(x, "queries", js.Array(value*))
  }
}
