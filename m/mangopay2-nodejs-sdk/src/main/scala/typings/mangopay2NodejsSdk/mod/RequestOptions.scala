package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.anon.ApiVersion
import typings.mangopay2NodejsSdk.anon.PartialHeaders
import typings.mangopay2NodejsSdk.anon.Timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestOptions extends js.Object {
  
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
  implicit class RequestOptionsOps[Self <: RequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHeaders(value: PartialHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: ApiVersion): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestConfig(value: Timeout): Self = this.set("requestConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseConfig(value: Timeout): Self = this.set("responseConfig", value.asInstanceOf[js.Any])
  }
}
