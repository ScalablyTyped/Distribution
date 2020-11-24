package typings.jupyterlabSettingregistry.settingregistryMod

import org.scalablytyped.runtime.StringDictionary
import typings.jupyterlabSettingregistry.settingregistryMod.SettingRegistry.IOptions
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.IPlugin
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/settingregistry/lib/settingregistry", "SettingRegistry")
@js.native
class SettingRegistry_ protected () extends ISettingRegistry {
  /**
    * Create a new setting registry.
    */
  def this(options: IOptions) = this()
  
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
    * A signal that emits the name of a plugin when its settings change.
    */
  @JSName("pluginChanged")
  def pluginChanged_MSettingRegistry_ : ISignal[this.type, String] = js.native
  
  /**
    * The collection of setting registry plugins.
    */
  @JSName("plugins")
  val plugins_SettingRegistry_ : StringDictionary[IPlugin] = js.native
}
