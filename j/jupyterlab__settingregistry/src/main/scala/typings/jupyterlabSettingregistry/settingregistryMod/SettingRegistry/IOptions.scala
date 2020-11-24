package typings.jupyterlabSettingregistry.settingregistryMod.SettingRegistry

import typings.jupyterlabSettingregistry.settingregistryMod.ISchemaValidator
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.IPlugin
import typings.jupyterlabStatedb.interfacesMod.IDataConnector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The instantiation options for a setting registry
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * The data connector used by the setting registry.
    */
  var connector: IDataConnector[IPlugin, String, String, String] = js.native
  
  /**
    * Preloaded plugin data to populate the setting registry.
    */
  var plugins: js.UndefOr[js.Array[IPlugin]] = js.native
  
  /**
    * The number of milliseconds before a `load()` call to the registry waits
    * before timing out if it requires a transformation that has not been
    * registered.
    *
    * #### Notes
    * The default value is 7000.
    */
  var timeout: js.UndefOr[Double] = js.native
  
  /**
    * The validator used to enforce the settings JSON schema.
    */
  var validator: js.UndefOr[ISchemaValidator] = js.native
}
object IOptions {
  
  @scala.inline
  def apply(connector: IDataConnector[IPlugin, String, String, String]): IOptions = {
    val __obj = js.Dynamic.literal(connector = connector.asInstanceOf[js.Any])
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
    def setConnector(value: IDataConnector[IPlugin, String, String, String]): Self = this.set("connector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginsVarargs(value: IPlugin*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: js.Array[IPlugin]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setValidator(value: ISchemaValidator): Self = this.set("validator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidator: Self = this.set("validator", js.undefined)
  }
}
