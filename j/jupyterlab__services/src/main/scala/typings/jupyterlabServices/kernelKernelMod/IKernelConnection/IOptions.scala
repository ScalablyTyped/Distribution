package typings.jupyterlabServices.kernelKernelMod.IKernelConnection

import typings.jupyterlabServices.kernelRestapiMod.IModel
import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options object used to initialize a kernel.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * The unique identifier for the kernel client.
    */
  var clientId: js.UndefOr[String] = js.native
  
  /**
    * Whether the kernel connection should handle comm messages
    *
    * #### Notes
    * The comm message protocol currently has implicit assumptions that only
    * one kernel connection is handling comm messages. This option allows a
    * kernel connection to opt out of handling comms.
    *
    * See https://github.com/jupyter/jupyter_client/issues/263
    */
  var handleComms: js.UndefOr[Boolean] = js.native
  
  /**
    * The kernel model.
    */
  var model: IModel = js.native
  
  /**
    * The server settings for the kernel.
    */
  var serverSettings: js.UndefOr[ISettings] = js.native
  
  /**
    * The username of the kernel client.
    */
  var username: js.UndefOr[String] = js.native
}
object IOptions {
  
  @scala.inline
  def apply(model: IModel): IOptions = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
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
    def setModel(value: IModel): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    
    @scala.inline
    def setHandleComms(value: Boolean): Self = this.set("handleComms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleComms: Self = this.set("handleComms", js.undefined)
    
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
