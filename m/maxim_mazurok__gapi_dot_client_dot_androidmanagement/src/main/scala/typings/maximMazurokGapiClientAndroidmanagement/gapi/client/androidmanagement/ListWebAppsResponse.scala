package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWebAppsResponse extends StObject {
  
  /** If there are more results, a token to retrieve next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The list of web apps. */
  var webApps: js.UndefOr[js.Array[WebApp]] = js.undefined
}
object ListWebAppsResponse {
  
  inline def apply(): ListWebAppsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWebAppsResponse]
  }
  
  extension [Self <: ListWebAppsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setWebApps(value: js.Array[WebApp]): Self = StObject.set(x, "webApps", value.asInstanceOf[js.Any])
    
    inline def setWebAppsUndefined: Self = StObject.set(x, "webApps", js.undefined)
    
    inline def setWebAppsVarargs(value: WebApp*): Self = StObject.set(x, "webApps", js.Array(value*))
  }
}
