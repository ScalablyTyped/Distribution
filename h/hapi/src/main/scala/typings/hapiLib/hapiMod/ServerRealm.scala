package typings
package hapiLib.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerRealm extends js.Object {
  /** when the server object is provided as an argument to the plugin register() method, modifiers provides the registration preferences passed the server.register() method and includes: */
  var modifiers: hapiLib.Anon_Route
  /** the realm of the parent server object, or null for the root server. */
  var parent: ServerRealm | scala.Null
  /** the active plugin name (empty string if at the server root). */
  var plugin: java.lang.String
  /** the plugin options object passed at registration. */
  var pluginOptions: js.Object
  /** plugin-specific state to be shared only among activities sharing the same active state. plugins is an object where each key is a plugin name and the value is the plugin state. */
  var plugins: PluginsStates
  /** settings overrides */
  var settings: hapiLib.Anon_Bind
}

