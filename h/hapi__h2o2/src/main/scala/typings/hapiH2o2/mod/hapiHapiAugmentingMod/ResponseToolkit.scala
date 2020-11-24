package typings.hapiH2o2.mod.hapiHapiAugmentingMod

import typings.hapiH2o2.mod.ProxyHandlerOptions
import typings.hapiHapi.mod.ResponseObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseToolkit extends js.Object {
  
  /**
    * Proxies the request to an upstream endpoint. `async`, so you'll need to `await` the `ResponseObject` to work on it before returning it.
    */
  def proxy(options: ProxyHandlerOptions): js.Promise[ResponseObject] = js.native
}
object ResponseToolkit {
  
  @scala.inline
  def apply(proxy: ProxyHandlerOptions => js.Promise[ResponseObject]): ResponseToolkit = {
    val __obj = js.Dynamic.literal(proxy = js.Any.fromFunction1(proxy))
    __obj.asInstanceOf[ResponseToolkit]
  }
  
  @scala.inline
  implicit class ResponseToolkitOps[Self <: ResponseToolkit] (val x: Self) extends AnyVal {
    
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
    def setProxy(value: ProxyHandlerOptions => js.Promise[ResponseObject]): Self = this.set("proxy", js.Any.fromFunction1(value))
  }
}
