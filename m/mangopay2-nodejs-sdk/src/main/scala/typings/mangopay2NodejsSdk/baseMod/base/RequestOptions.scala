package typings.mangopay2NodejsSdk.baseMod.base

import typings.mangopay2NodejsSdk.anon.ApiVersion
import typings.mangopay2NodejsSdk.anon.PartialHeaders
import typings.mangopay2NodejsSdk.anon.Timeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestOptions extends StObject {
  
  var headers: PartialHeaders
  
  /**
    * Path options are replacing the ${placeholders} from apiMethods
    */
  var path: ApiVersion
  
  var requestConfig: Timeout
  
  var responseConfig: Timeout
}
object RequestOptions {
  
  inline def apply(headers: PartialHeaders, path: ApiVersion, requestConfig: Timeout, responseConfig: Timeout): RequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], requestConfig = requestConfig.asInstanceOf[js.Any], responseConfig = responseConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
  
  extension [Self <: RequestOptions](x: Self) {
    
    inline def setHeaders(value: PartialHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setPath(value: ApiVersion): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRequestConfig(value: Timeout): Self = StObject.set(x, "requestConfig", value.asInstanceOf[js.Any])
    
    inline def setResponseConfig(value: Timeout): Self = StObject.set(x, "responseConfig", value.asInstanceOf[js.Any])
  }
}
