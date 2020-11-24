package typings.intercomjs.intercom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SocketBindingOptions extends js.Object {
  
   /* boolean | (name: string, message: any)=>any */ var receive: js.UndefOr[js.Any] = js.native
  
  var send: js.UndefOr[js.Any] = js.native
}
object SocketBindingOptions {
  
  @scala.inline
  def apply(): SocketBindingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocketBindingOptions]
  }
  
  @scala.inline
  implicit class SocketBindingOptionsOps[Self <: SocketBindingOptions] (val x: Self) extends AnyVal {
    
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
    def setReceive(value: js.Any): Self = this.set("receive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReceive: Self = this.set("receive", js.undefined)
    
    @scala.inline
    def setSend(value: js.Any): Self = this.set("send", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSend: Self = this.set("send", js.undefined)
  }
}
