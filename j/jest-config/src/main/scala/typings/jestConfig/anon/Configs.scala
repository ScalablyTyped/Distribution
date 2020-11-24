package typings.jestConfig.anon

import typings.jestTypes.configMod.GlobalConfig
import typings.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Configs extends js.Object {
  
  var configs: js.Array[ProjectConfig] = js.native
  
  var globalConfig: GlobalConfig = js.native
  
  var hasDeprecationWarnings: Boolean = js.native
}
object Configs {
  
  @scala.inline
  def apply(configs: js.Array[ProjectConfig], globalConfig: GlobalConfig, hasDeprecationWarnings: Boolean): Configs = {
    val __obj = js.Dynamic.literal(configs = configs.asInstanceOf[js.Any], globalConfig = globalConfig.asInstanceOf[js.Any], hasDeprecationWarnings = hasDeprecationWarnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configs]
  }
  
  @scala.inline
  implicit class ConfigsOps[Self <: Configs] (val x: Self) extends AnyVal {
    
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
    def setConfigsVarargs(value: ProjectConfig*): Self = this.set("configs", js.Array(value :_*))
    
    @scala.inline
    def setConfigs(value: js.Array[ProjectConfig]): Self = this.set("configs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalConfig(value: GlobalConfig): Self = this.set("globalConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasDeprecationWarnings(value: Boolean): Self = this.set("hasDeprecationWarnings", value.asInstanceOf[js.Any])
  }
}
