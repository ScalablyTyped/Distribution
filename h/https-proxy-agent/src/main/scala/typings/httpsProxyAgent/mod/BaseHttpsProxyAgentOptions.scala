package typings.httpsProxyAgent.mod

import typings.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseHttpsProxyAgentOptions extends js.Object {
  
  var headers: js.UndefOr[OutgoingHttpHeaders] = js.native
  
  var host: js.UndefOr[String | Null] = js.native
  
  var path: js.UndefOr[String | Null] = js.native
  
  var port: js.UndefOr[String | Double | Null] = js.native
  
  var secureProxy: js.UndefOr[Boolean] = js.native
}
object BaseHttpsProxyAgentOptions {
  
  @scala.inline
  def apply(): BaseHttpsProxyAgentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseHttpsProxyAgentOptions]
  }
  
  @scala.inline
  implicit class BaseHttpsProxyAgentOptionsOps[Self <: BaseHttpsProxyAgentOptions] (val x: Self) extends AnyVal {
    
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
    def setHeaders(value: OutgoingHttpHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setHostNull: Self = this.set("host", null)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPathNull: Self = this.set("path", null)
    
    @scala.inline
    def setPort(value: String | Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setPortNull: Self = this.set("port", null)
    
    @scala.inline
    def setSecureProxy(value: Boolean): Self = this.set("secureProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecureProxy: Self = this.set("secureProxy", js.undefined)
  }
}
