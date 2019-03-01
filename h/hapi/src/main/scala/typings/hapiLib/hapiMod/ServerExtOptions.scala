package typings
package hapiLib.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerExtOptions extends js.Object {
  /**
    * a string or array of strings of plugin names this method must execute after (on the same event). Otherwise, extension methods are executed in the order added.
    */
  var after: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * a string or array of strings of plugin names this method must execute before (on the same event). Otherwise, extension methods are executed in the order added.
    */
  var before: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * a context object passed back to the provided method (via this) when called. Ignored if the method is an arrow function.
    */
  var bind: js.UndefOr[js.Object] = js.undefined
  /**
    * if set to 'plugin' when adding a request extension points the extension is only added to routes defined by the current plugin. Not allowed when configuring route-level extensions, or when
    * adding server extensions. Defaults to 'server' which applies to any route added to the server the extension is added to.
    */
  var sandbox: js.UndefOr[hapiLib.hapiLibStrings.server | hapiLib.hapiLibStrings.plugin] = js.undefined
}

object ServerExtOptions {
  @scala.inline
  def apply(
    after: java.lang.String | js.Array[java.lang.String] = null,
    before: java.lang.String | js.Array[java.lang.String] = null,
    bind: js.Object = null,
    sandbox: hapiLib.hapiLibStrings.server | hapiLib.hapiLibStrings.plugin = null
  ): ServerExtOptions = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (bind != null) __obj.updateDynamic("bind")(bind)
    if (sandbox != null) __obj.updateDynamic("sandbox")(sandbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerExtOptions]
  }
}

