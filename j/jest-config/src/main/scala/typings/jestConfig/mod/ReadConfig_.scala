package typings.jestConfig.mod

import typings.jestTypes.configMod.GlobalConfig
import typings.jestTypes.configMod.Path
import typings.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadConfig_ extends js.Object {
  var configPath: js.UndefOr[Path | Null] = js.native
  var globalConfig: GlobalConfig = js.native
  var hasDeprecationWarnings: Boolean = js.native
  var projectConfig: ProjectConfig = js.native
}

object ReadConfig_ {
  @scala.inline
  def apply(globalConfig: GlobalConfig, hasDeprecationWarnings: Boolean, projectConfig: ProjectConfig): ReadConfig_ = {
    val __obj = js.Dynamic.literal(globalConfig = globalConfig.asInstanceOf[js.Any], hasDeprecationWarnings = hasDeprecationWarnings.asInstanceOf[js.Any], projectConfig = projectConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadConfig_]
  }
  @scala.inline
  implicit class ReadConfig_Ops[Self <: ReadConfig_] (val x: Self) extends AnyVal {
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
    def setGlobalConfig(value: GlobalConfig): Self = this.set("globalConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasDeprecationWarnings(value: Boolean): Self = this.set("hasDeprecationWarnings", value.asInstanceOf[js.Any])
    @scala.inline
    def setProjectConfig(value: ProjectConfig): Self = this.set("projectConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigPath(value: Path): Self = this.set("configPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigPath: Self = this.set("configPath", js.undefined)
    @scala.inline
    def setConfigPathNull: Self = this.set("configPath", null)
  }
  
}

