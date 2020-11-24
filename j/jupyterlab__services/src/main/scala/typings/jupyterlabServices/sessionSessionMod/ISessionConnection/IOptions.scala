package typings.jupyterlabServices.sessionSessionMod.ISessionConnection

import typings.jupyterlabServices.anon.OmitIOptionsmodelusername
import typings.jupyterlabServices.kernelKernelMod.IKernelConnection
import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typings.jupyterlabServices.sessionSessionMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The session initialization options.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * The unique identifier for the session client.
    */
  var clientId: js.UndefOr[String] = js.native
  
  /**
    * Connects to an existing kernel
    */
  def connectToKernel(options: typings.jupyterlabServices.kernelKernelMod.IKernelConnection.IOptions): IKernelConnection = js.native
  
  /**
    * Kernel connection options
    */
  var kernelConnectionOptions: js.UndefOr[OmitIOptionsmodelusername] = js.native
  
  /**
    * Session model.
    */
  var model: IModel = js.native
  
  /**
    * The server settings.
    */
  var serverSettings: js.UndefOr[ISettings] = js.native
  
  /**
    * The username of the session client.
    */
  var username: js.UndefOr[String] = js.native
}
object IOptions {
  
  @scala.inline
  def apply(
    connectToKernel: typings.jupyterlabServices.kernelKernelMod.IKernelConnection.IOptions => IKernelConnection,
    model: IModel
  ): IOptions = {
    val __obj = js.Dynamic.literal(connectToKernel = js.Any.fromFunction1(connectToKernel), model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
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
    def setConnectToKernel(value: typings.jupyterlabServices.kernelKernelMod.IKernelConnection.IOptions => IKernelConnection): Self = this.set("connectToKernel", js.Any.fromFunction1(value))
    
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
    def setServerSettings(value: ISettings): Self = this.set("serverSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerSettings: Self = this.set("serverSettings", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
}
