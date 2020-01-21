package typings.ionic.configBaseMod

import typings.ionic.definitionsMod.IConfig
import typings.ionic.ionicBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalConfigContext
  extends BaseConfigContext
     with ConfigContext {
  var config: IConfig
  var global: `true`
}

object GlobalConfigContext {
  @scala.inline
  def apply(
    config: IConfig,
    force: Boolean,
    global: `true`,
    json: Boolean,
    root: Boolean,
    property: String = null,
    value: js.Any = null
  ): GlobalConfigContext = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalConfigContext]
  }
}

