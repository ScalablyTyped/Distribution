package typings.ionic.commandsConfigBaseMod

import typings.atIonicCliDashFramework.atIonicCliDashFrameworkMod.BaseConfig
import typings.ionic.definitionsMod.IProjectConfig
import typings.ionic.ionicNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectConfigContext
  extends BaseConfigContext
     with ConfigContext {
  var config: BaseConfig[IProjectConfig]
  var global: `false`
}

object ProjectConfigContext {
  @scala.inline
  def apply(
    config: BaseConfig[IProjectConfig],
    force: Boolean,
    global: `false`,
    json: Boolean,
    root: Boolean,
    property: String = null,
    value: js.Any = null
  ): ProjectConfigContext = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectConfigContext]
  }
}

