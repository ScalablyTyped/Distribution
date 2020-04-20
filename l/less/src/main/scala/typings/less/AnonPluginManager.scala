package typings.less

import typings.less.Less_.PluginManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPluginManager extends js.Object {
  var pluginManager: PluginManager
}

object AnonPluginManager {
  @scala.inline
  def apply(pluginManager: PluginManager): AnonPluginManager = {
    val __obj = js.Dynamic.literal(pluginManager = pluginManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPluginManager]
  }
}

