package typings.jupyterlabServices.sessionSessionMod.ISessionConnection

import typings.jupyterlabServices.anon.OmitIOptionsmodelusername
import typings.jupyterlabServices.kernelKernelMod.IKernelConnection
import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typings.jupyterlabServices.sessionSessionMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The session initialization options.
  */
trait IOptions extends js.Object {
  /**
    * The unique identifier for the session client.
    */
  var clientId: js.UndefOr[String] = js.undefined
  /**
    * Kernel connection options
    */
  var kernelConnectionOptions: js.UndefOr[OmitIOptionsmodelusername] = js.undefined
  /**
    * Session model.
    */
  var model: IModel
  /**
    * The server settings.
    */
  var serverSettings: js.UndefOr[ISettings] = js.undefined
  /**
    * The username of the session client.
    */
  var username: js.UndefOr[String] = js.undefined
  /**
    * Connects to an existing kernel
    */
  def connectToKernel(options: typings.jupyterlabServices.kernelKernelMod.IKernelConnection.IOptions): IKernelConnection
}

object IOptions {
  @scala.inline
  def apply(
    connectToKernel: typings.jupyterlabServices.kernelKernelMod.IKernelConnection.IOptions => IKernelConnection,
    model: IModel,
    clientId: String = null,
    kernelConnectionOptions: OmitIOptionsmodelusername = null,
    serverSettings: ISettings = null,
    username: String = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(connectToKernel = js.Any.fromFunction1(connectToKernel), model = model.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (kernelConnectionOptions != null) __obj.updateDynamic("kernelConnectionOptions")(kernelConnectionOptions.asInstanceOf[js.Any])
    if (serverSettings != null) __obj.updateDynamic("serverSettings")(serverSettings.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

