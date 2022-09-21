package typings.hellosignSdk.mod

import typings.hellosignSdk.anon.Numpages
import typings.node.httpMod.IncomingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiAppListResponse
  extends StObject
     with BaseResponse
     with ListInfo {
  
  var api_apps: js.Array[ApiApp]
}
object ApiAppListResponse {
  
  inline def apply(api_apps: js.Array[ApiApp], list_info: Numpages, resHeaders: IncomingHttpHeaders): ApiAppListResponse = {
    val __obj = js.Dynamic.literal(api_apps = api_apps.asInstanceOf[js.Any], list_info = list_info.asInstanceOf[js.Any], resHeaders = resHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiAppListResponse]
  }
  
  extension [Self <: ApiAppListResponse](x: Self) {
    
    inline def setApi_apps(value: js.Array[ApiApp]): Self = StObject.set(x, "api_apps", value.asInstanceOf[js.Any])
    
    inline def setApi_appsVarargs(value: ApiApp*): Self = StObject.set(x, "api_apps", js.Array(value*))
  }
}
