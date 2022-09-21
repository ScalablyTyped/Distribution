package typings.googleapis.firebaseV1beta1Mod.firebaseV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListIosAppsResponse extends StObject {
  
  /**
    * List of each `IosApp` associated with the specified `FirebaseProject`.
    */
  var apps: js.UndefOr[js.Array[SchemaIosApp]] = js.undefined
  
  /**
    * If the result list is too large to fit in a single response, then a token is returned. If the string is empty, then this response is the last page of results. This token can be used in a subsequent call to `ListIosApps` to find the next group of Apps. Page tokens are short-lived and should not be persisted.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListIosAppsResponse {
  
  inline def apply(): SchemaListIosAppsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListIosAppsResponse]
  }
  
  extension [Self <: SchemaListIosAppsResponse](x: Self) {
    
    inline def setApps(value: js.Array[SchemaIosApp]): Self = StObject.set(x, "apps", value.asInstanceOf[js.Any])
    
    inline def setAppsUndefined: Self = StObject.set(x, "apps", js.undefined)
    
    inline def setAppsVarargs(value: SchemaIosApp*): Self = StObject.set(x, "apps", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
