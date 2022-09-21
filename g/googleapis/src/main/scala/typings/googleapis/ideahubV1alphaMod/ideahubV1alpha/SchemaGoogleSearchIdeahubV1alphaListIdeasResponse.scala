package typings.googleapis.ideahubV1alphaMod.ideahubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleSearchIdeahubV1alphaListIdeasResponse extends StObject {
  
  /**
    * Results for the ListIdeasRequest.
    */
  var ideas: js.UndefOr[js.Array[SchemaGoogleSearchIdeahubV1alphaIdea]] = js.undefined
  
  /**
    * Used to fetch the next page in a subsequent request.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleSearchIdeahubV1alphaListIdeasResponse {
  
  inline def apply(): SchemaGoogleSearchIdeahubV1alphaListIdeasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleSearchIdeahubV1alphaListIdeasResponse]
  }
  
  extension [Self <: SchemaGoogleSearchIdeahubV1alphaListIdeasResponse](x: Self) {
    
    inline def setIdeas(value: js.Array[SchemaGoogleSearchIdeahubV1alphaIdea]): Self = StObject.set(x, "ideas", value.asInstanceOf[js.Any])
    
    inline def setIdeasUndefined: Self = StObject.set(x, "ideas", js.undefined)
    
    inline def setIdeasVarargs(value: SchemaGoogleSearchIdeahubV1alphaIdea*): Self = StObject.set(x, "ideas", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
