package typings
package atJupyterlabCoreutilsLib.libTokensMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISettingRegistry extends js.Object {
  /**
    * The data connector used by the setting registry.
    */
  val connector: atJupyterlabCoreutilsLib.libInterfacesMod.IDataConnector[
    atJupyterlabCoreutilsLib.libTokensMod.ISettingRegistryNs.IPlugin, 
    java.lang.String, 
    java.lang.String
  ]
  /**
    * A signal that emits the name of a plugin when its settings change.
    */
  val pluginChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, java.lang.String]
  /**
    * The collection of setting registry plugins.
    */
  val plugins: org.scalablytyped.runtime.StringDictionary[atJupyterlabCoreutilsLib.libTokensMod.ISettingRegistryNs.IPlugin]
  /**
    * The schema of the setting registry.
    */
  val schema: atJupyterlabCoreutilsLib.libTokensMod.ISettingRegistryNs.ISchema
  /**
    * The schema validator used by the setting registry.
    */
  val validator: atJupyterlabCoreutilsLib.libSettingregistryMod.ISchemaValidator
  /**
    * Get an individual setting.
    *
    * @param plugin - The name of the plugin whose settings are being retrieved.
    *
    * @param key - The name of the setting being retrieved.
    *
    * @returns A promise that resolves when the setting is retrieved.
    */
  def get(plugin: java.lang.String, key: java.lang.String): js.Promise[atJupyterlabCoreutilsLib.Anon_Composite]
  /**
    * Load a plugin's settings into the setting registry.
    *
    * @param plugin - The name of the plugin whose settings are being loaded.
    *
    * @returns A promise that resolves with a plugin settings object or rejects
    * if the plugin is not found.
    */
  def load(plugin: java.lang.String): js.Promise[atJupyterlabCoreutilsLib.libTokensMod.ISettingRegistryNs.ISettings]
  /**
    * Reload a plugin's settings into the registry even if they already exist.
    *
    * @param plugin - The name of the plugin whose settings are being reloaded.
    *
    * @returns A promise that resolves with a plugin settings object or rejects
    * with a list of `ISchemaValidator.IError` objects if it fails.
    */
  def reload(plugin: java.lang.String): js.Promise[atJupyterlabCoreutilsLib.libTokensMod.ISettingRegistryNs.ISettings]
  /**
    * Remove a single setting in the registry.
    *
    * @param plugin - The name of the plugin whose setting is being removed.
    *
    * @param key - The name of the setting being removed.
    *
    * @returns A promise that resolves when the setting is removed.
    */
  def remove(plugin: java.lang.String, key: java.lang.String): js.Promise[scala.Unit]
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
  ): js.Promise[scala.Unit]
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
    */ atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibStrings.ISettingRegistry with js.Any
  ): atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable
  /**
    * Upload a plugin's settings.
    *
    * @param plugin - The name of the plugin whose settings are being set.
    *
    * @param raw - The raw plugin settings being uploaded.
    *
    * @returns A promise that resolves when the settings have been saved.
    */
  def upload(plugin: java.lang.String, raw: java.lang.String): js.Promise[scala.Unit]
}

object ISettingRegistry {
  @scala.inline
  def apply(
    connector: atJupyterlabCoreutilsLib.libInterfacesMod.IDataConnector[
      atJupyterlabCoreutilsLib.libTokensMod.ISettingRegistryNs.IPlugin, 
      java.lang.String, 
      java.lang.String
    ],
    get: (java.lang.String, java.lang.String) => js.Promise[atJupyterlabCoreutilsLib.Anon_Composite],
    load: java.lang.String => js.Promise[atJupyterlabCoreutilsLib.libTokensMod.ISettingRegistryNs.ISettings],
    pluginChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[ISettingRegistry, java.lang.String],
    plugins: org.scalablytyped.runtime.StringDictionary[atJupyterlabCoreutilsLib.libTokensMod.ISettingRegistryNs.IPlugin],
    reload: java.lang.String => js.Promise[atJupyterlabCoreutilsLib.libTokensMod.ISettingRegistryNs.ISettings],
    remove: (java.lang.String, java.lang.String) => js.Promise[scala.Unit],
    schema: atJupyterlabCoreutilsLib.libTokensMod.ISettingRegistryNs.ISchema,
    set: (java.lang.String, java.lang.String, atPhosphorCoreutilsLib.libJsonMod.JSONValue) => js.Promise[scala.Unit],
    transform: (java.lang.String, /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ phase in @jupyterlab/coreutils.@jupyterlab/coreutils/lib/tokens.ISettingRegistry.IPlugin.Phase ]:? @jupyterlab/coreutils.@jupyterlab/coreutils/lib/tokens.ISettingRegistry.IPlugin.Transform}
    */ atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibStrings.ISettingRegistry with js.Any) => atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable,
    upload: (java.lang.String, java.lang.String) => js.Promise[scala.Unit],
    validator: atJupyterlabCoreutilsLib.libSettingregistryMod.ISchemaValidator
  ): ISettingRegistry = {
    val __obj = js.Dynamic.literal(connector = connector, get = js.Any.fromFunction2(get), load = js.Any.fromFunction1(load), pluginChanged = pluginChanged, plugins = plugins, reload = js.Any.fromFunction1(reload), remove = js.Any.fromFunction2(remove), schema = schema, set = js.Any.fromFunction3(set), transform = js.Any.fromFunction2(transform), upload = js.Any.fromFunction2(upload), validator = validator)
  
    __obj.asInstanceOf[ISettingRegistry]
  }
}

