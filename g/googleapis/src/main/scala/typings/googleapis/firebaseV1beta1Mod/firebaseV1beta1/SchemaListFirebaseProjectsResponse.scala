package typings.googleapis.firebaseV1beta1Mod.firebaseV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListFirebaseProjectsResponse extends StObject {
  
  /**
    * If the result list is too large to fit in a single response, then a token is returned. If the string is empty, then this response is the last page of results. This token can be used in a subsequent calls to `ListFirebaseProjects` to find the next group of Projects. Page tokens are short-lived and should not be persisted.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * One page of the list of Projects that are accessible to the caller.
    */
  var results: js.UndefOr[js.Array[SchemaFirebaseProject]] = js.undefined
}
object SchemaListFirebaseProjectsResponse {
  
  inline def apply(): SchemaListFirebaseProjectsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListFirebaseProjectsResponse]
  }
  
  extension [Self <: SchemaListFirebaseProjectsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setResults(value: js.Array[SchemaFirebaseProject]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: SchemaFirebaseProject*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
