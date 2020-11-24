package typings.jupyterlabServices.anon

import typings.jupyterlabServices.sessionSessionMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@jupyterlab/services.@jupyterlab/services/lib/session/session.ISessionConnection.IOptions, 'connectToKernel' | 'serverSettings'> */
@js.native
trait OmitIOptionsconnectToKern extends js.Object {
  
  var clientId: js.UndefOr[String] = js.native
  
  var kernelConnectionOptions: js.UndefOr[OmitIOptionsmodelusername] = js.native
  
  var model: IModel = js.native
  
  var username: js.UndefOr[String] = js.native
}
object OmitIOptionsconnectToKern {
  
  @scala.inline
  def apply(model: IModel): OmitIOptionsconnectToKern = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitIOptionsconnectToKern]
  }
  
  @scala.inline
  implicit class OmitIOptionsconnectToKernOps[Self <: OmitIOptionsconnectToKern] (val x: Self) extends AnyVal {
    
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
    def setModel(value: IModel): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    
    @scala.inline
    def setKernelConnectionOptions(value: OmitIOptionsmodelusername): Self = this.set("kernelConnectionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKernelConnectionOptions: Self = this.set("kernelConnectionOptions", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
}
