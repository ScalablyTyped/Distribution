package typings.jupyterlabServices.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@jupyterlab/services.@jupyterlab/services/lib/kernel.Kernel.IKernelConnection.IOptions, 'model' | 'username' | 'clientId' | 'serverSettings'> */
@js.native
trait OmitIOptionsmodelusername extends js.Object {
  
  var handleComms: js.UndefOr[Boolean] = js.native
}
object OmitIOptionsmodelusername {
  
  @scala.inline
  def apply(): OmitIOptionsmodelusername = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitIOptionsmodelusername]
  }
  
  @scala.inline
  implicit class OmitIOptionsmodelusernameOps[Self <: OmitIOptionsmodelusername] (val x: Self) extends AnyVal {
    
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
    def setHandleComms(value: Boolean): Self = this.set("handleComms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleComms: Self = this.set("handleComms", js.undefined)
  }
}
