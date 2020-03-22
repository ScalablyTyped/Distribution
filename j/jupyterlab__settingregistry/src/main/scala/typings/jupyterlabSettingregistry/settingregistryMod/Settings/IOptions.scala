package typings.jupyterlabSettingregistry.settingregistryMod.Settings

import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.IPlugin
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
  var plugin: IPlugin
  /**
    * The system registry instance used by the settings manager.
    */
  var registry: ISettingRegistry
}

object IOptions {
  @scala.inline
  def apply(plugin: IPlugin, registry: ISettingRegistry): IOptions = {
    val __obj = js.Dynamic.literal(plugin = plugin.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOptions]
  }
}

