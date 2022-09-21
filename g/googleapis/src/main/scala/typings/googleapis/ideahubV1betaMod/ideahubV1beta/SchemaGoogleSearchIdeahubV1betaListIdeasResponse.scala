package typings.googleapis.ideahubV1betaMod.ideahubV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleSearchIdeahubV1betaListIdeasResponse extends StObject {
  
  /**
    * Results for the ListIdeasRequest.
    */
  var ideas: js.UndefOr[js.Array[SchemaGoogleSearchIdeahubV1betaIdea]] = js.undefined
  
  /**
    * Used to fetch the next page in a subsequent request.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleSearchIdeahubV1betaListIdeasResponse {
  
  inline def apply(): SchemaGoogleSearchIdeahubV1betaListIdeasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleSearchIdeahubV1betaListIdeasResponse]
  }
  
  extension [Self <: SchemaGoogleSearchIdeahubV1betaListIdeasResponse](x: Self) {
    
    inline def setIdeas(value: js.Array[SchemaGoogleSearchIdeahubV1betaIdea]): Self = StObject.set(x, "ideas", value.asInstanceOf[js.Any])
    
    inline def setIdeasUndefined: Self = StObject.set(x, "ideas", js.undefined)
    
    inline def setIdeasVarargs(value: SchemaGoogleSearchIdeahubV1betaIdea*): Self = StObject.set(x, "ideas", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
