package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1ListSessionsResponse extends StObject {
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Sessions under a given environment.
    */
  var sessions: js.UndefOr[js.Array[SchemaGoogleCloudDataplexV1Session]] = js.undefined
}
object SchemaGoogleCloudDataplexV1ListSessionsResponse {
  
  inline def apply(): SchemaGoogleCloudDataplexV1ListSessionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1ListSessionsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1ListSessionsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSessions(value: js.Array[SchemaGoogleCloudDataplexV1Session]): Self = StObject.set(x, "sessions", value.asInstanceOf[js.Any])
    
    inline def setSessionsUndefined: Self = StObject.set(x, "sessions", js.undefined)
    
    inline def setSessionsVarargs(value: SchemaGoogleCloudDataplexV1Session*): Self = StObject.set(x, "sessions", js.Array(value*))
  }
}
