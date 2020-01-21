package typings.jupyterlabServices.settingMod

import typings.jupyterlabCoreutils.dataconnectorMod.DataConnector
import typings.jupyterlabCoreutils.tokensMod.ISettingRegistry.IPlugin
import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typings.jupyterlabServices.settingMod.SettingManager.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/setting", "SettingManager")
@js.native
/**
  * Create a new setting manager.
  */
class SettingManager_ () extends DataConnector[IPlugin, String, String] {
  def this(options: IOptions) = this()
  /**
    * The server settings used to make API requests.
    */
  val serverSettings: ISettings = js.native
}

