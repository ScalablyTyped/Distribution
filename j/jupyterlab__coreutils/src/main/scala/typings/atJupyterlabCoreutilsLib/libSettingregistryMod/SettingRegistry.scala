package typings
package atJupyterlabCoreutilsLib.libSettingregistryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils/lib/settingregistry", "SettingRegistry")
@js.native
class SettingRegistry protected ()
  extends atJupyterlabCoreutilsLib.libTokensMod.ISettingRegistry {
  /**
    * Create a new setting registry.
    */
  def this(options: atJupyterlabCoreutilsLib.libSettingregistryMod.SettingRegistryNs.IOptions) = this()
  /**
    * Load a plugin into the registry.
    */
  var _load: js.Any = js.native
  var _pluginChanged: js.Any = js.native
  /**
    * Preload a list of plugins and fail gracefully.
    */
  var _preload: js.Any = js.native
  var _ready: js.Any = js.native
  /**
    * Save a plugin in the registry.
    */
  var _save: js.Any = js.native
  var _timeout: js.Any = js.native
  /**
    * Transform the plugin if necessary.
    */
  var _transform: js.Any = js.native
  var _transformers: js.Any = js.native
  /**
    * Validate and preload a plugin, compose the `composite` data.
    */
  var _validate: js.Any = js.native
  /**
    * The data connector used by the setting registry.
    */
  /* CompleteClass */
  override val connector: atJupyterlabCoreutilsLib.libInterfacesMod.IDataConnector[
    atJupyterlabCoreutilsLib.libTokensMod.ISettingRegistryNs.IPlugin, 
    java.lang.String, 
    java.lang.String
  ] = js.native
  /**
    * A signal that emits the name of a plugin when its settings change.
    */
  /* CompleteClass */
  override val pluginChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, java.lang.String] = js.native
  /**
    * The collection of setting registry plugins.
    */
  /* CompleteClass */
  override val plugins: org.scalablytyped.runtime.StringDictionary[atJupyterlabCoreutilsLib.libTokensMod.ISettingRegistryNs.IPlugin] = js.native
  /**
    * The schema of the setting registry.
    */
  /* CompleteClass */
  override val schema: atJupyterlabCoreutilsLib.libTokensMod.ISettingRegistryNs.ISchema = js.native
  /**
    * The schema validator used by the setting registry.
    */
  /* CompleteClass */
  override val validator: ISchemaValidator = js.native
  /**
    * Get an individual setting.
    *
    * @param plugin - The name of the plugin whose settings are being retrieved.
    *
    * @param key - The name of the setting being retrieved.
    *
    * @returns A promise that resolves when the setting is retrieved.
    */
  /* CompleteClass */
  override def get(plugin: java.lang.String, key: java.lang.String): js.Promise[atJupyterlabCoreutilsLib.Anon_Composite] = js.native
  /**
    * Load a plugin's settings into the setting registry.
    *
    * @param plugin - The name of the plugin whose settings are being loaded.
    *
    * @returns A promise that resolves with a plugin settings object or rejects
    * if the plugin is not found.
    */
  /* CompleteClass */
  override def load(plugin: java.lang.String): js.Promise[atJupyterlabCoreutilsLib.libTokensMod.ISettingRegistryNs.ISettings] = js.native
  /**
    * Reload a plugin's settings into the registry even if they already exist.
    *
    * @param plugin - The name of the plugin whose settings are being reloaded.
    *
    * @returns A promise that resolves with a plugin settings object or rejects
    * with a list of `ISchemaValidator.IError` objects if it fails.
    */
  /* CompleteClass */
  override def reload(plugin: java.lang.String): js.Promise[atJupyterlabCoreutilsLib.libTokensMod.ISettingRegistryNs.ISettings] = js.native
  /**
    * Remove a single setting in the registry.
    *
    * @param plugin - The name of the plugin whose setting is being removed.
    *
    * @param key - The name of the setting being removed.
    *
    * @returns A promise that resolves when the setting is removed.
    */
  /* CompleteClass */
  override def remove(plugin: java.lang.String, key: java.lang.String): js.Promise[scala.Unit] = js.native
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
  /* CompleteClass */
  override def set(
    plugin: java.lang.String,
    key: java.lang.String,
    value: atPhosphorCoreutilsLib.libJsonMod.JSONValue
  ): js.Promise[scala.Unit] = js.native
  /**
    * Register a plugin transform function to act on a specific plugin.
    *
    * @param plugin - The name of the plugin whose settings are transformed.
    *
    * @param transforms - The transform functions applied to the plugin.
    *
    * @returns A disposable that removes the transforms from the registry.
    *
    * #### Notes
    * - `compose` transformations: The registry automatically overwrites a
    * plugin's default values with user overrides, but a plugin may instead wish
    * to merge values. This behavior can be accomplished in a `compose`
    * transformation.
    * - `fetch` transformations: The registry uses the plugin data that is
    * fetched from its connector. If a plugin wants to override, e.g. to update
    * its schema with dynamic defaults, a `fetch` transformation can be applied.
    */
  def transform(
    plugin: java.lang.String,
    transforms: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ phase in @jupyterlab/coreutils.@jupyterlab/coreutils/lib/tokens.ISettingRegistry.IPlugin.Phase ]:? @jupyterlab/coreutils.@jupyterlab/coreutils/lib/tokens.ISettingRegistry.IPlugin.Transform}
    */ atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibStrings.SettingRegistry with js.Any
  ): atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable = js.native
  /**
    * Register a plugin transform function to act on a specific plugin.
    *
    * @param plugin - The name of the plugin whose settings are transformed.
    *
    * @param transforms - The transform functions applied to the plugin.
    *
    * @returns A disposable that removes the transforms from the registry.
    *
    * #### Notes
    * - `compose` transformations: The registry automatically overwrites a
    * plugin's default values with user overrides, but a plugin may instead wish
    * to merge values. This behavior can be accomplished in a `compose`
    * transformation.
    * - `fetch` transformations: The registry uses the plugin data that is
    * fetched from its connector. If a plugin wants to override, e.g. to update
    * its schema with dynamic defaults, a `fetch` transformation can be applied.
    */
  /* CompleteClass */
  override def transform(
    plugin: java.lang.String,
    transforms: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ phase in @jupyterlab/coreutils.@jupyterlab/coreutils/lib/tokens.ISettingRegistry.IPlugin.Phase ]:? @jupyterlab/coreutils.@jupyterlab/coreutils/lib/tokens.ISettingRegistry.IPlugin.Transform}
    */ atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibStrings.ISettingRegistry with js.Any
  ): atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable = js.native
  /**
    * Upload a plugin's settings.
    *
    * @param plugin - The name of the plugin whose settings are being set.
    *
    * @param raw - The raw plugin settings being uploaded.
    *
    * @returns A promise that resolves when the settings have been saved.
    */
  /* CompleteClass */
  override def upload(plugin: java.lang.String, raw: java.lang.String): js.Promise[scala.Unit] = js.native
}

