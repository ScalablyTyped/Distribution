package typings.hpagent.mod

import typings.node.httpMod.AgentOptions
import typings.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpProxyAgentOptions extends AgentOptions {
  
  var proxy: String | URL_ = js.native
}
object HttpProxyAgentOptions {
  
  @scala.inline
  def apply(proxy: String | URL_): HttpProxyAgentOptions = {
    val __obj = js.Dynamic.literal(proxy = proxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpProxyAgentOptions]
  }
  
  @scala.inline
  implicit class HttpProxyAgentOptionsOps[Self <: HttpProxyAgentOptions] (val x: Self) extends AnyVal {
    
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
    def setProxy(value: String | URL_): Self = this.set("proxy", value.asInstanceOf[js.Any])
  }
}
