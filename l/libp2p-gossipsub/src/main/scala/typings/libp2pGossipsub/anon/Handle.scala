package typings.libp2pGossipsub.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Handle extends js.Object {
  
  var handle: js.Function = js.native
  
  var register: js.Function = js.native
  
  var unregister: js.Function = js.native
}
object Handle {
  
  @scala.inline
  def apply(handle: js.Function, register: js.Function, unregister: js.Function): Handle = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], register = register.asInstanceOf[js.Any], unregister = unregister.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handle]
  }
  
  @scala.inline
  implicit class HandleOps[Self <: Handle] (val x: Self) extends AnyVal {
    
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
    def setHandle(value: js.Function): Self = this.set("handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegister(value: js.Function): Self = this.set("register", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnregister(value: js.Function): Self = this.set("unregister", value.asInstanceOf[js.Any])
  }
}
