package typings.hapiHapi.mod

import typings.hapiHapi.AnonPrefixVhost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerRegisterPluginObject[T] extends ServerRegisterOptions {
  /**
    * options passed to the plugin during registration.
    */
  var options: js.UndefOr[T] = js.undefined
  /**
    * a plugin object.
    */
  var plugin: Plugin[T]
}

object ServerRegisterPluginObject {
  @scala.inline
  def apply[T](
    plugin: Plugin[T],
    once: js.UndefOr[Boolean] = js.undefined,
    options: T = null,
    routes: AnonPrefixVhost = null
  ): ServerRegisterPluginObject[T] = {
    val __obj = js.Dynamic.literal(plugin = plugin.asInstanceOf[js.Any])
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (routes != null) __obj.updateDynamic("routes")(routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerRegisterPluginObject[T]]
  }
}

