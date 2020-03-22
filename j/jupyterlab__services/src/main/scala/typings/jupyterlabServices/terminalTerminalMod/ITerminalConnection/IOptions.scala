package typings.jupyterlabServices.terminalTerminalMod.ITerminalConnection

import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typings.jupyterlabServices.terminalRestapiMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  /**
    * Terminal model.
    */
  var model: IModel
  /**
    * The server settings.
    */
  var serverSettings: js.UndefOr[ISettings] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(model: IModel, serverSettings: ISettings = null): IOptions = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    if (serverSettings != null) __obj.updateDynamic("serverSettings")(serverSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

