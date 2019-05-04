package typings
package atJupyterlabCoreutilsLib.libSettingregistryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils/lib/settingregistry", "SettingRegistry")
@js.native
class SettingRegistry protected () extends js.Object {
  /**
    * Create a new setting registry.
    */
  def this(options: atJupyterlabCoreutilsLib.libSettingregistryMod.SettingRegistryNs.IOptions) = this()
  var _connector: js.Any = js.native
  var _pluginChanged: js.Any = js.native
  var _plugins: js.Any = js.native
  /**
    * Save a plugin in the registry.
    */
  var _save: js.Any = js.native
  /**
    * Validate a plugin's data and schema, compose the `composite` data.
    */
  var _validate: js.Any = js.native
  /**
    * A signal that emits the name of a plugin when its settings change.
    */
  val pluginChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, java.lang.String] = js.native
  /**
    * Returns a list of plugin settings held in the registry.
    */
  val plugins: js.Array[atJupyterlabCoreutilsLib.libSettingregistryMod.ISettingRegistryNs.IPlugin] = js.native
  /**
    * The schema of the setting registry.
    */
  val schema: atJupyterlabCoreutilsLib.libSettingregistryMod.ISettingRegistryNs.ISchema = js.native
  /**
    * The schema validator used by the setting registry.
    */
  val validator: ISchemaValidator = js.native
  /**
    * Get an individual setting.
    *
    * @param plugin - The name of the plugin whose settings are being retrieved.
    *
    * @param key - The name of the setting being retrieved.
    *
    * @returns A promise that resolves when the setting is retrieved.
    */
  def get(plugin: java.lang.String, key: java.lang.String): js.Promise[atJupyterlabCoreutilsLib.Anon_Composite] = js.native
  /**
    * Load a plugin's settings into the setting registry.
    *
    * @param plugin - The name of the plugin whose settings are being loaded.
    *
    * @returns A promise that resolves with a plugin settings object or rejects
    * if the plugin is not found.
    */
  def load(plugin: java.lang.String): js.Promise[atJupyterlabCoreutilsLib.libSettingregistryMod.ISettingRegistryNs.ISettings] = js.native
  /**
    * Reload a plugin's settings into the registry even if they already exist.
    *
    * @param plugin - The name of the plugin whose settings are being reloaded.
    *
    * @returns A promise that resolves with a plugin settings object or rejects
    * with a list of `ISchemaValidator.IError` objects if it fails.
    */
  def reload(plugin: java.lang.String): js.Promise[atJupyterlabCoreutilsLib.libSettingregistryMod.ISettingRegistryNs.ISettings] = js.native
  /**
    * Remove a single setting in the registry.
    *
    * @param plugin - The name of the plugin whose setting is being removed.
    *
    * @param key - The name of the setting being removed.
    *
    * @returns A promise that resolves when the setting is removed.
    */
  def remove(plugin: java.lang.String, key: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Set a single setting in the registry.
    *
    * @param plugin - The name of the plugin whose setting is being set.
    *
    * @param key - The name of the setting being set.
    *
    * @param value - The value of the setting being set.
    *
    * @returns A promise that resolves when the setting has been saved.
    *
    */
  def set(
    plugin: java.lang.String,
    key: java.lang.String,
    value: atPhosphorCoreutilsLib.libJsonMod.JSONValue
  ): js.Promise[scala.Unit] = js.native
  /**
    * Upload a plugin's settings.
    *
    * @param plugin - The name of the plugin whose settings are being set.
    *
    * @param raw - The raw plugin settings being uploaded.
    *
    * @returns A promise that resolves when the settings have been saved.
    */
  def upload(plugin: java.lang.String, raw: java.lang.String): js.Promise[scala.Unit] = js.native
}

