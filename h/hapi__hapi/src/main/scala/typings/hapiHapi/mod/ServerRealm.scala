package typings.hapiHapi.mod

import typings.hapiHapi.anon.Bind
import typings.hapiHapi.anon.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerRealm extends js.Object {
  /** when the server object is provided as an argument to the plugin register() method, modifiers provides the registration preferences passed the server.register() method and includes: */
  var modifiers: Route
  /** the realm of the parent server object, or null for the root server. */
  var parent: ServerRealm | Null
  /** the active plugin name (empty string if at the server root). */
  var plugin: String
  /** the plugin options object passed at registration. */
  var pluginOptions: js.Object
  /** plugin-specific state to be shared only among activities sharing the same active state. plugins is an object where each key is a plugin name and the value is the plugin state. */
  var plugins: PluginsStates
  /** settings overrides */
  var settings: Bind
}

object ServerRealm {
  @scala.inline
  def apply(
    modifiers: Route,
    plugin: String,
    pluginOptions: js.Object,
    plugins: PluginsStates,
    settings: Bind,
    parent: ServerRealm = null
  ): ServerRealm = {
    val __obj = js.Dynamic.literal(modifiers = modifiers.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any], pluginOptions = pluginOptions.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerRealm]
  }
}

