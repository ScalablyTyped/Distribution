package typings
package hapiLib.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PluginBase[T] extends js.Object {
  /** (optional) a string or an array of strings indicating a plugin dependency. Same as setting dependencies via server.dependency(). */
  var dependencies: js.UndefOr[Dependencies] = js.undefined
  /** (optional) if true, allows the plugin to be registered multiple times with the same server. Defaults to false. */
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
  /** once - (optional) if true, will only register the plugin once per server. If set, overrides the once option passed to server.register(). Defaults to no override. */
  var once: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Allows defining semver requirements for node and hapi.
       * @default Allows all.
       */
  var requirements: js.UndefOr[hapiLib.Anon_Node] = js.undefined
  /**
       * (required) the registration function with the signature async function(server, options) where:
       * * server - the server object with a plugin-specific server.realm.
       * * options - any options passed to the plugin during registration via server.register().
       */
  def register(server: Server, options: T): scala.Unit | stdLib.Promise[scala.Unit]
}

