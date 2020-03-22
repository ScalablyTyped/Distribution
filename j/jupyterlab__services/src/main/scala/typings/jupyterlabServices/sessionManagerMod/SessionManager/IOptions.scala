package typings.jupyterlabServices.sessionManagerMod.SessionManager

import typings.jupyterlabServices.kernelKernelMod.IManager
import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typings.luminoPolling.pollMod.Poll.Standby
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a SessionManager.
  */
trait IOptions
  extends typings.jupyterlabServices.basemanagerMod.BaseManager.IOptions {
  /**
    * Kernel Manager
    */
  var kernelManager: IManager
  /**
    * When the manager stops polling the API. Defaults to `when-hidden`.
    */
  var standby: js.UndefOr[Standby] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(kernelManager: IManager, serverSettings: ISettings = null, standby: Standby = null): IOptions = {
    val __obj = js.Dynamic.literal(kernelManager = kernelManager.asInstanceOf[js.Any])
    if (serverSettings != null) __obj.updateDynamic("serverSettings")(serverSettings.asInstanceOf[js.Any])
    if (standby != null) __obj.updateDynamic("standby")(standby.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

