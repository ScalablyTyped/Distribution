package typings.googleapis.firebaseV1beta1Mod.firebaseV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSearchFirebaseAppsResponse extends StObject {
  
  /**
    * One page of results from a call to `SearchFirebaseApps`.
    */
  var apps: js.UndefOr[js.Array[SchemaFirebaseAppInfo]] = js.undefined
  
  /**
    * If the result list is too large to fit in a single response, then a token is returned. This token can be used in a subsequent calls to `SearchFirebaseApps` to find the next group of Apps. Page tokens are short-lived and should not be persisted.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaSearchFirebaseAppsResponse {
  
  inline def apply(): SchemaSearchFirebaseAppsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchFirebaseAppsResponse]
  }
  
  extension [Self <: SchemaSearchFirebaseAppsResponse](x: Self) {
    
    inline def setApps(value: js.Array[SchemaFirebaseAppInfo]): Self = StObject.set(x, "apps", value.asInstanceOf[js.Any])
    
    inline def setAppsUndefined: Self = StObject.set(x, "apps", js.undefined)
    
    inline def setAppsVarargs(value: SchemaFirebaseAppInfo*): Self = StObject.set(x, "apps", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
