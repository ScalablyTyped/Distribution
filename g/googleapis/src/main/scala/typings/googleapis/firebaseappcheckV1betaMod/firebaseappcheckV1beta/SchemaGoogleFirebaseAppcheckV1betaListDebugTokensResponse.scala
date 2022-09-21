package typings.googleapis.firebaseappcheckV1betaMod.firebaseappcheckV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirebaseAppcheckV1betaListDebugTokensResponse extends StObject {
  
  /**
    * The DebugTokens retrieved.
    */
  var debugTokens: js.UndefOr[js.Array[SchemaGoogleFirebaseAppcheckV1betaDebugToken]] = js.undefined
  
  /**
    * If the result list is too large to fit in a single response, then a token is returned. If the string is empty or omitted, then this response is the last page of results. This token can be used in a subsequent call to ListDebugTokens to find the next group of DebugTokens. Page tokens are short-lived and should not be persisted.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleFirebaseAppcheckV1betaListDebugTokensResponse {
  
  inline def apply(): SchemaGoogleFirebaseAppcheckV1betaListDebugTokensResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirebaseAppcheckV1betaListDebugTokensResponse]
  }
  
  extension [Self <: SchemaGoogleFirebaseAppcheckV1betaListDebugTokensResponse](x: Self) {
    
    inline def setDebugTokens(value: js.Array[SchemaGoogleFirebaseAppcheckV1betaDebugToken]): Self = StObject.set(x, "debugTokens", value.asInstanceOf[js.Any])
    
    inline def setDebugTokensUndefined: Self = StObject.set(x, "debugTokens", js.undefined)
    
    inline def setDebugTokensVarargs(value: SchemaGoogleFirebaseAppcheckV1betaDebugToken*): Self = StObject.set(x, "debugTokens", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
