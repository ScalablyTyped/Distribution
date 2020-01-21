package typings.jestConfig.mod

import typings.jestTypes.configMod.GlobalConfig
import typings.jestTypes.configMod.Path
import typings.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadConfig_ extends js.Object {
  var configPath: js.UndefOr[Path | Null] = js.undefined
  var globalConfig: GlobalConfig
  var hasDeprecationWarnings: Boolean
  var projectConfig: ProjectConfig
}

object ReadConfig_ {
  @scala.inline
  def apply(
    globalConfig: GlobalConfig,
    hasDeprecationWarnings: Boolean,
    projectConfig: ProjectConfig,
    configPath: Path = null
  ): ReadConfig_ = {
    val __obj = js.Dynamic.literal(globalConfig = globalConfig.asInstanceOf[js.Any], hasDeprecationWarnings = hasDeprecationWarnings.asInstanceOf[js.Any], projectConfig = projectConfig.asInstanceOf[js.Any])
    if (configPath != null) __obj.updateDynamic("configPath")(configPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadConfig_]
  }
}

