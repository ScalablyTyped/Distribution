package typings.googleapis.loggingV2Mod.loggingV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListSinksResponse extends StObject {
  
  /**
    * If there might be more results than appear in this response, then nextPageToken is included. To get the next set of results, call the same method again using the value of nextPageToken as pageToken.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of sinks.
    */
  var sinks: js.UndefOr[js.Array[SchemaLogSink]] = js.undefined
}
object SchemaListSinksResponse {
  
  inline def apply(): SchemaListSinksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListSinksResponse]
  }
  
  extension [Self <: SchemaListSinksResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSinks(value: js.Array[SchemaLogSink]): Self = StObject.set(x, "sinks", value.asInstanceOf[js.Any])
    
    inline def setSinksUndefined: Self = StObject.set(x, "sinks", js.undefined)
    
    inline def setSinksVarargs(value: SchemaLogSink*): Self = StObject.set(x, "sinks", js.Array(value*))
  }
}
