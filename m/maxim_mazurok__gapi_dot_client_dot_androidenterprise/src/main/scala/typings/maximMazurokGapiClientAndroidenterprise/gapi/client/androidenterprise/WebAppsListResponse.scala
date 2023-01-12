package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAppsListResponse extends StObject {
  
  /** The manifest describing a web app. */
  var webApp: js.UndefOr[js.Array[WebApp]] = js.undefined
}
object WebAppsListResponse {
  
  inline def apply(): WebAppsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebAppsListResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebAppsListResponse] (val x: Self) extends AnyVal {
    
    inline def setWebApp(value: js.Array[WebApp]): Self = StObject.set(x, "webApp", value.asInstanceOf[js.Any])
    
    inline def setWebAppUndefined: Self = StObject.set(x, "webApp", js.undefined)
    
    inline def setWebAppVarargs(value: WebApp*): Self = StObject.set(x, "webApp", js.Array(value*))
  }
}
