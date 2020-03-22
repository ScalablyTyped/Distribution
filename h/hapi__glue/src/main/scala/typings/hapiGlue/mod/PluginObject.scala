package typings.hapiGlue.mod

import typings.hapiHapi.mod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginObject extends js.Object {
  var options: js.UndefOr[js.Any] = js.undefined
  var plugin: String | Plugin[_]
  var routes: js.UndefOr[js.Any] = js.undefined
}

object PluginObject {
  @scala.inline
  def apply(plugin: String | Plugin[_], options: js.Any = null, routes: js.Any = null): PluginObject = {
    val __obj = js.Dynamic.literal(plugin = plugin.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (routes != null) __obj.updateDynamic("routes")(routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginObject]
  }
}

