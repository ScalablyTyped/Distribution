package typings.jupyterlabSettingregistry.settingregistryMod

import typings.jupyterlabSettingregistry.settingregistryMod.Settings.IOptions
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.IPlugin
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.ISchema
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.ISettings
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/settingregistry/lib/settingregistry", "Settings")
@js.native
class Settings_ protected () extends ISettings {
  /**
    * Instantiate a new plugin settings manager.
    */
  def this(options: IOptions) = this()
  
  var _changed: js.Any = js.native
  
  var _isDisposed: js.Any = js.native
  
  /**
    * Handle plugin changes in the setting registry.
    */
  var _onPluginChanged: js.Any = js.native
  
  /**
    * A signal that emits when the plugin's settings have changed.
    */
  @JSName("changed")
  def changed_MSettings_ : ISignal[this.type, Unit] = js.native
  
  /**
    * The composite of user settings and extension defaults.
    */
  @JSName("composite")
  def composite_MSettings_ : ReadonlyPartialJSONObject = js.native
  
  /**
    * Test whether the plugin settings manager disposed.
    */
  @JSName("isDisposed")
  def isDisposed_MSettings_ : Boolean = js.native
  
  @JSName("plugin")
  def plugin_MSettings_ : IPlugin = js.native
  
  /**
    * The plugin settings raw text value.
    */
  @JSName("raw")
  def raw_MSettings_ : String = js.native
  
  /**
    * The setting registry instance used as a back-end for these settings.
    */
  val registry: ISettingRegistry = js.native
  
  /**
    * The plugin's schema.
    */
  @JSName("schema")
  def schema_MSettings_ : ISchema = js.native
  
  /**
    * The user settings.
    */
  @JSName("user")
  def user_MSettings_ : ReadonlyPartialJSONObject = js.native
  
  /**
    * The published version of the NPM package containing these settings.
    */
  @JSName("version")
  def version_MSettings_ : String = js.native
}
