package typings.jupyterlabSettingregistry.settingregistryMod.Settings

import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.IPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The instantiation options for a `Settings` object.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * The setting values for a plugin.
    */
  var plugin: IPlugin = js.native
  
  /**
    * The system registry instance used by the settings manager.
    */
  var registry: ISettingRegistry = js.native
}
object IOptions {
  
  @scala.inline
  def apply(plugin: IPlugin, registry: ISettingRegistry): IOptions = {
    val __obj = js.Dynamic.literal(plugin = plugin.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPlugin(value: IPlugin): Self = this.set("plugin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistry(value: ISettingRegistry): Self = this.set("registry", value.asInstanceOf[js.Any])
  }
}
