package typings.jupyterlabServices.kernelKernelMod.IKernelConnection

import typings.jupyterlabServices.kernelRestapiMod.IModel
import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options object used to initialize a kernel.
  */
trait IOptions extends js.Object {
  /**
    * The unique identifier for the kernel client.
    */
  var clientId: js.UndefOr[String] = js.undefined
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
  var handleComms: js.UndefOr[Boolean] = js.undefined
  /**
    * The kernel model.
    */
  var model: IModel
  /**
    * The server settings for the kernel.
    */
  var serverSettings: js.UndefOr[ISettings] = js.undefined
  /**
    * The username of the kernel client.
    */
  var username: js.UndefOr[String] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    model: IModel,
    clientId: String = null,
    handleComms: js.UndefOr[Boolean] = js.undefined,
    serverSettings: ISettings = null,
    username: String = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (!js.isUndefined(handleComms)) __obj.updateDynamic("handleComms")(handleComms.asInstanceOf[js.Any])
    if (serverSettings != null) __obj.updateDynamic("serverSettings")(serverSettings.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

