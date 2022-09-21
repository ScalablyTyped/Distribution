package typings.maximMazurokGapiClientAdmob.gapi.client.admob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAppsResponse extends StObject {
  
  /** The resulting apps for the requested account. */
  var apps: js.UndefOr[js.Array[App]] = js.undefined
  
  /** If not empty, indicates that there may be more apps for the request; this value should be passed in a new `ListAppsRequest`. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListAppsResponse {
  
  inline def apply(): ListAppsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAppsResponse]
  }
  
  extension [Self <: ListAppsResponse](x: Self) {
    
    inline def setApps(value: js.Array[App]): Self = StObject.set(x, "apps", value.asInstanceOf[js.Any])
    
    inline def setAppsUndefined: Self = StObject.set(x, "apps", js.undefined)
    
    inline def setAppsVarargs(value: App*): Self = StObject.set(x, "apps", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
