package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListFormResponsesResponse extends StObject {
  
  /**
    * If set, there are more responses. To get the next page of responses, provide this as `page_token` in a future request.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The returned responses.
    */
  var responses: js.UndefOr[js.Array[SchemaFormResponse]] = js.undefined
}
object SchemaListFormResponsesResponse {
  
  inline def apply(): SchemaListFormResponsesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListFormResponsesResponse]
  }
  
  extension [Self <: SchemaListFormResponsesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setResponses(value: js.Array[SchemaFormResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    inline def setResponsesVarargs(value: SchemaFormResponse*): Self = StObject.set(x, "responses", js.Array(value*))
  }
}
