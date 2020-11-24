package typings.hellojs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HelloJSEventArgument extends js.Object {
  
  var authResponse: js.UndefOr[HelloJSAuthResponse] = js.native
  
  var network: String = js.native
}
object HelloJSEventArgument {
  
  @scala.inline
  def apply(network: String): HelloJSEventArgument = {
    val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any])
    __obj.asInstanceOf[HelloJSEventArgument]
  }
  
  @scala.inline
  implicit class HelloJSEventArgumentOps[Self <: HelloJSEventArgument] (val x: Self) extends AnyVal {
    
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
    def setNetwork(value: String): Self = this.set("network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthResponse(value: HelloJSAuthResponse): Self = this.set("authResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthResponse: Self = this.set("authResponse", js.undefined)
  }
}
