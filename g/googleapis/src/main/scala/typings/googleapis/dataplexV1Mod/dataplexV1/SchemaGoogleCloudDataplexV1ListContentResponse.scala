package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1ListContentResponse extends StObject {
  
  /**
    * Content under the given parent lake.
    */
  var content: js.UndefOr[js.Array[SchemaGoogleCloudDataplexV1Content]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1ListContentResponse {
  
  inline def apply(): SchemaGoogleCloudDataplexV1ListContentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1ListContentResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1ListContentResponse](x: Self) {
    
    inline def setContent(value: js.Array[SchemaGoogleCloudDataplexV1Content]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setContentVarargs(value: SchemaGoogleCloudDataplexV1Content*): Self = StObject.set(x, "content", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
