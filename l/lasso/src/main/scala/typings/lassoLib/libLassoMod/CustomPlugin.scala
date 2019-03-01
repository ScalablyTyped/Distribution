package typings
package lassoLib.libLassoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPlugin extends js.Object {
  var config: js.Any
  var plugin: java.lang.String
}

object CustomPlugin {
  @scala.inline
  def apply(config: js.Any, plugin: java.lang.String): CustomPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("config")(config)
    __obj.updateDynamic("plugin")(plugin)
    __obj.asInstanceOf[CustomPlugin]
  }
}

