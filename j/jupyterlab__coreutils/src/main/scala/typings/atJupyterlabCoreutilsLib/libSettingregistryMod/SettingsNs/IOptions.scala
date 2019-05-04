package typings
package atJupyterlabCoreutilsLib.libSettingregistryMod.SettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The instantiation options for a `Settings` object.
  */
trait IOptions extends js.Object {
  /**
    * The setting values for a plugin.
    */
  var plugin: atJupyterlabCoreutilsLib.libSettingregistryMod.ISettingRegistryNs.IPlugin
  /**
    * The system registry instance used by the settings manager.
    */
  var registry: atJupyterlabCoreutilsLib.libSettingregistryMod.SettingRegistry
}

object IOptions {
  @scala.inline
  def apply(
    plugin: atJupyterlabCoreutilsLib.libSettingregistryMod.ISettingRegistryNs.IPlugin,
    registry: atJupyterlabCoreutilsLib.libSettingregistryMod.SettingRegistry
  ): IOptions = {
    val __obj = js.Dynamic.literal(plugin = plugin, registry = registry)
  
    __obj.asInstanceOf[IOptions]
  }
}

