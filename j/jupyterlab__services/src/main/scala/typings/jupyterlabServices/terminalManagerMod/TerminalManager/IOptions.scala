package typings.jupyterlabServices.terminalManagerMod.TerminalManager

import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typings.luminoPolling.pollMod.Poll.Standby
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a terminal manager.
  */
trait IOptions
  extends typings.jupyterlabServices.basemanagerMod.BaseManager.IOptions {
  /**
    * When the manager stops polling the API. Defaults to `when-hidden`.
    */
  var standby: js.UndefOr[Standby] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(serverSettings: ISettings = null, standby: Standby = null): IOptions = {
    val __obj = js.Dynamic.literal()
    if (serverSettings != null) __obj.updateDynamic("serverSettings")(serverSettings.asInstanceOf[js.Any])
    if (standby != null) __obj.updateDynamic("standby")(standby.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

