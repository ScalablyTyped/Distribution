package typings.jestConfig.anon

import typings.jestTypes.configMod.GlobalConfig
import typings.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configs extends js.Object {
  var configs: js.Array[ProjectConfig]
  var globalConfig: GlobalConfig
  var hasDeprecationWarnings: Boolean
}

object Configs {
  @scala.inline
  def apply(configs: js.Array[ProjectConfig], globalConfig: GlobalConfig, hasDeprecationWarnings: Boolean): Configs = {
    val __obj = js.Dynamic.literal(configs = configs.asInstanceOf[js.Any], globalConfig = globalConfig.asInstanceOf[js.Any], hasDeprecationWarnings = hasDeprecationWarnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configs]
  }
}

