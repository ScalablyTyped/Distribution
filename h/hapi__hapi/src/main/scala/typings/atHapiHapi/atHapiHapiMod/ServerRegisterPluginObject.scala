package typings.atHapiHapi.atHapiHapiMod

import typings.atHapiHapi.Anon_PrefixVhost
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
    routes: Anon_PrefixVhost = null
  ): ServerRegisterPluginObject[T] = {
    val __obj = js.Dynamic.literal(plugin = plugin)
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (routes != null) __obj.updateDynamic("routes")(routes)
    __obj.asInstanceOf[ServerRegisterPluginObject[T]]
  }
}

