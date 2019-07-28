package typings.atJupyterlabServices.libSettingMod

import typings.atJupyterlabCoreutils.atJupyterlabCoreutilsMod.DataConnector
import typings.atJupyterlabCoreutils.libTokensMod.ISettingRegistryNs.IPlugin
import typings.atJupyterlabServices.libServerconnectionMod.ServerConnectionNs.ISettings
import typings.atJupyterlabServices.libSettingMod.SettingManagerNs.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/setting", "SettingManager")
@js.native
/**
  * Create a new setting manager.
  */
class SettingManager () extends DataConnector[IPlugin, String, String] {
  def this(options: IOptions) = this()
  /**
    * The server settings used to make API requests.
    */
  val serverSettings: ISettings = js.native
}

