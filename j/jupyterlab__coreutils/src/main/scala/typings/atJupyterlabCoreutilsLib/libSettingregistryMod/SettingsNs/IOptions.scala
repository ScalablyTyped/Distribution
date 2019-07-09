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
  var plugin: atJupyterlabCoreutilsLib.libTokensMod.ISettingRegistryNs.IPlugin
  /**
    * The system registry instance used by the settings manager.
    */
  var registry: atJupyterlabCoreutilsLib.libTokensMod.ISettingRegistry
}

object IOptions {
  @scala.inline
  def apply(
    plugin: atJupyterlabCoreutilsLib.libTokensMod.ISettingRegistryNs.IPlugin,
    registry: atJupyterlabCoreutilsLib.libTokensMod.ISettingRegistry
  ): IOptions = {
    val __obj = js.Dynamic.literal(plugin = plugin, registry = registry)
  
    __obj.asInstanceOf[IOptions]
  }
}

