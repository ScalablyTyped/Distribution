package typings.h2o2.mod.hapiAugmentingMod

import typings.h2o2.mod.ProxyHandlerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HandlerDecorations extends js.Object {
  
  /**
    * Proxies the request to an upstream endpoint.
    */
  var proxy: js.UndefOr[ProxyHandlerOptions] = js.native
}
object HandlerDecorations {
  
  @scala.inline
  def apply(): HandlerDecorations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandlerDecorations]
  }
  
  @scala.inline
  implicit class HandlerDecorationsOps[Self <: HandlerDecorations] (val x: Self) extends AnyVal {
    
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
    def setProxy(value: ProxyHandlerOptions): Self = this.set("proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
  }
}
