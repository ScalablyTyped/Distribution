package typings.hapi.hapiMod

import typings.hapi.Anon_Hapi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginBase[T] extends js.Object {
  /** (optional) a string or an array of strings indicating a plugin dependency. Same as setting dependencies via server.dependency(). */
  var dependencies: js.UndefOr[Dependencies] = js.undefined
  /** (optional) if true, allows the plugin to be registered multiple times with the same server. Defaults to false. */
  var multiple: js.UndefOr[Boolean] = js.undefined
  /** once - (optional) if true, will only register the plugin once per server. If set, overrides the once option passed to server.register(). Defaults to no override. */
  var once: js.UndefOr[Boolean] = js.undefined
  /**
    * Allows defining semver requirements for node and hapi.
    * @default Allows all.
    */
  var requirements: js.UndefOr[Anon_Hapi] = js.undefined
  /**
    * (required) the registration function with the signature async function(server, options) where:
    * * server - the server object with a plugin-specific server.realm.
    * * options - any options passed to the plugin during registration via server.register().
    */
  def register(server: Server, options: T): Unit | js.Promise[Unit]
}

object PluginBase {
  @scala.inline
  def apply[T](
    register: (Server, T) => Unit | js.Promise[Unit],
    dependencies: Dependencies = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    once: js.UndefOr[Boolean] = js.undefined,
    requirements: Anon_Hapi = null
  ): PluginBase[T] = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction2(register))
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once.asInstanceOf[js.Any])
    if (requirements != null) __obj.updateDynamic("requirements")(requirements.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginBase[T]]
  }
}

