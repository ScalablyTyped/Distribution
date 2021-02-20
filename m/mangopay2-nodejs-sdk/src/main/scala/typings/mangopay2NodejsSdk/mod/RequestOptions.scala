package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.anon.ApiVersion
import typings.mangopay2NodejsSdk.anon.PartialHeaders
import typings.mangopay2NodejsSdk.anon.Timeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestOptions extends StObject {
  
  var headers: PartialHeaders = js.native
  
  /**
    * Path options are replacing the ${placeholders} from apiMethods
    */
  var path: ApiVersion = js.native
  
  var requestConfig: Timeout = js.native
  
  var responseConfig: Timeout = js.native
}
object RequestOptions {
  
  @scala.inline
  def apply(headers: PartialHeaders, path: ApiVersion, requestConfig: Timeout, responseConfig: Timeout): RequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], requestConfig = requestConfig.asInstanceOf[js.Any], responseConfig = responseConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
  
  @scala.inline
  implicit class RequestOptionsMutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: PartialHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: ApiVersion): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestConfig(value: Timeout): Self = StObject.set(x, "requestConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseConfig(value: Timeout): Self = StObject.set(x, "responseConfig", value.asInstanceOf[js.Any])
  }
}
