package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListHistoriesResponse extends StObject {
  
  /**
    * Histories.
    */
  var histories: js.UndefOr[js.Array[SchemaHistory]] = js.undefined
  
  /**
    * A continuation token to resume the query at the next item. Will only be set if there are more histories to fetch. Tokens are valid for up to one hour from the time of the first list request. For instance, if you make a list request at 1PM and use the token from this first request 10 minutes later, the token from this second response will only be valid for 50 minutes.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListHistoriesResponse {
  
  inline def apply(): SchemaListHistoriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListHistoriesResponse]
  }
  
  extension [Self <: SchemaListHistoriesResponse](x: Self) {
    
    inline def setHistories(value: js.Array[SchemaHistory]): Self = StObject.set(x, "histories", value.asInstanceOf[js.Any])
    
    inline def setHistoriesUndefined: Self = StObject.set(x, "histories", js.undefined)
    
    inline def setHistoriesVarargs(value: SchemaHistory*): Self = StObject.set(x, "histories", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
