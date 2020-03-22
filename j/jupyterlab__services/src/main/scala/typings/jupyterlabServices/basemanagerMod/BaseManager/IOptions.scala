package typings.jupyterlabServices.basemanagerMod.BaseManager

import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a SessionManager.
  */
trait IOptions extends js.Object {
  /**
    * The server settings for the manager.
    */
  var serverSettings: js.UndefOr[ISettings] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(serverSettings: ISettings = null): IOptions = {
    val __obj = js.Dynamic.literal()
    if (serverSettings != null) __obj.updateDynamic("serverSettings")(serverSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

