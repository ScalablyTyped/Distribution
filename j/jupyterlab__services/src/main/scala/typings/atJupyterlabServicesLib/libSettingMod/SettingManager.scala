package typings
package atJupyterlabServicesLib.libSettingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/setting", "SettingManager")
@js.native
/**
  * Create a new setting manager.
  */
class SettingManager () extends js.Object {
  def this(options: atJupyterlabServicesLib.libSettingMod.SettingManagerNs.IOptions) = this()
  /**
    * The server settings used to make API requests.
    */
  val serverSettings: atJupyterlabServicesLib.libServerconnectionMod.ServerConnectionNs.ISettings = js.native
  /**
    * Fetch a plugin's settings.
    *
    * @param id - The plugin's ID.
    *
    * @returns A promise that resolves if successful.
    */
  def fetch(id: java.lang.String): js.Promise[atJupyterlabCoreutilsLib.libSettingregistryMod.ISettingRegistryNs.IPlugin] = js.native
  /**
    * Save a plugin's settings.
    *
    * @param id - The plugin's ID.
    *
    * @param raw - The user setting values as a raw string of JSON with comments.
    *
    * @returns A promise that resolves if successful.
    */
  def save(id: java.lang.String, raw: java.lang.String): js.Promise[scala.Unit] = js.native
}

