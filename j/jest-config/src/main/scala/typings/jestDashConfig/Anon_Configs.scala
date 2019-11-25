package typings.jestDashConfig

import typings.atJestTypes.buildConfigMod.GlobalConfig
import typings.atJestTypes.buildConfigMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Configs extends js.Object {
  var configs: js.Array[ProjectConfig]
  var globalConfig: GlobalConfig
  var hasDeprecationWarnings: Boolean
}

object Anon_Configs {
  @scala.inline
  def apply(configs: js.Array[ProjectConfig], globalConfig: GlobalConfig, hasDeprecationWarnings: Boolean): Anon_Configs = {
    val __obj = js.Dynamic.literal(configs = configs.asInstanceOf[js.Any], globalConfig = globalConfig.asInstanceOf[js.Any], hasDeprecationWarnings = hasDeprecationWarnings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Configs]
  }
}

