package typings.googleapis.pubsubliteV1Mod.pubsubliteV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListTopicsResponse extends StObject {
  
  /**
    * A token that can be sent as `page_token` to retrieve the next page of results. If this field is omitted, there are no more results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of topic in the requested parent. The order of the topics is unspecified.
    */
  var topics: js.UndefOr[js.Array[SchemaTopic]] = js.undefined
}
object SchemaListTopicsResponse {
  
  inline def apply(): SchemaListTopicsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTopicsResponse]
  }
  
  extension [Self <: SchemaListTopicsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTopics(value: js.Array[SchemaTopic]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    inline def setTopicsUndefined: Self = StObject.set(x, "topics", js.undefined)
    
    inline def setTopicsVarargs(value: SchemaTopic*): Self = StObject.set(x, "topics", js.Array(value*))
  }
}
