package typings.hapi.mod

import typings.hapi.hapiStrings.plugin
import typings.hapi.hapiStrings.server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerExtOptions extends js.Object {
  /**
    * a string or array of strings of plugin names this method must execute after (on the same event). Otherwise, extension methods are executed in the order added.
    */
  var after: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * a string or array of strings of plugin names this method must execute before (on the same event). Otherwise, extension methods are executed in the order added.
    */
  var before: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * a context object passed back to the provided method (via this) when called. Ignored if the method is an arrow function.
    */
  var bind: js.UndefOr[js.Object] = js.undefined
  /**
    * if set to 'plugin' when adding a request extension points the extension is only added to routes defined by the current plugin. Not allowed when configuring route-level extensions, or when
    * adding server extensions. Defaults to 'server' which applies to any route added to the server the extension is added to.
    */
  var sandbox: js.UndefOr[server | plugin] = js.undefined
}

object ServerExtOptions {
  @scala.inline
  def apply(
    after: String | js.Array[String] = null,
    before: String | js.Array[String] = null,
    bind: js.Object = null,
    sandbox: server | plugin = null
  ): ServerExtOptions = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (bind != null) __obj.updateDynamic("bind")(bind.asInstanceOf[js.Any])
    if (sandbox != null) __obj.updateDynamic("sandbox")(sandbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerExtOptions]
  }
}

