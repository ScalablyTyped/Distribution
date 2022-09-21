package typings.hellosignSdk.mod

import typings.node.httpMod.IncomingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiAppResponse
  extends StObject
     with BaseResponse {
  
  var api_app: ApiApp
}
object ApiAppResponse {
  
  inline def apply(api_app: ApiApp, resHeaders: IncomingHttpHeaders): ApiAppResponse = {
    val __obj = js.Dynamic.literal(api_app = api_app.asInstanceOf[js.Any], resHeaders = resHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiAppResponse]
  }
  
  extension [Self <: ApiAppResponse](x: Self) {
    
    inline def setApi_app(value: ApiApp): Self = StObject.set(x, "api_app", value.asInstanceOf[js.Any])
  }
}
