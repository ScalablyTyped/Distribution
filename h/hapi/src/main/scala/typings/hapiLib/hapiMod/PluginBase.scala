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
  var requirements: js.UndefOr[hapiLib.Anon_Hapi] = js.undefined
  /**
    * (required) the registration function with the signature async function(server, options) where:
    * * server - the server object with a plugin-specific server.realm.
    * * options - any options passed to the plugin during registration via server.register().
    */
  def register(server: Server, options: T): scala.Unit | js.Promise[scala.Unit]
}

object PluginBase {
  @scala.inline
  def apply[T](
    register: js.Function2[Server, T, scala.Unit | js.Promise[scala.Unit]],
    dependencies: Dependencies = null,
    multiple: js.UndefOr[scala.Boolean] = js.undefined,
    once: js.UndefOr[scala.Boolean] = js.undefined,
    requirements: hapiLib.Anon_Hapi = null
  ): PluginBase[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("register")(register)
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once)
    if (requirements != null) __obj.updateDynamic("requirements")(requirements)
    __obj.asInstanceOf[PluginBase[T]]
  }
}

