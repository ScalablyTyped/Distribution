package typings.less.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginManager extends js.Object {
  var pluginManager: typings.less.Less.PluginManager
}

object PluginManager {
  @scala.inline
  def apply(pluginManager: typings.less.Less.PluginManager): PluginManager = {
    val __obj = js.Dynamic.literal(pluginManager = pluginManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginManager]
  }
}

