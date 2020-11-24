package typings.jupyterlabServices.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@jupyterlab/services.@jupyterlab/services/lib/kernel/kernel.IKernelConnection.IOptions, 'clientId' | 'username' | 'handleComms'> */
@js.native
trait PickIOptionsclientIdusern extends js.Object {
  
  var clientId: js.UndefOr[String] = js.native
  
  var handleComms: js.UndefOr[Boolean] = js.native
  
  var username: js.UndefOr[String] = js.native
}
object PickIOptionsclientIdusern {
  
  @scala.inline
  def apply(): PickIOptionsclientIdusern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickIOptionsclientIdusern]
  }
  
  @scala.inline
  implicit class PickIOptionsclientIdusernOps[Self <: PickIOptionsclientIdusern] (val x: Self) extends AnyVal {
    
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
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    
    @scala.inline
    def setHandleComms(value: Boolean): Self = this.set("handleComms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleComms: Self = this.set("handleComms", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
}
