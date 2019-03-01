package typings
package gulpDashUtilLib.gulpDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginErrorOptions extends js.Object {
  var error: js.UndefOr[nodeLib.Error] = js.undefined
  var fileName: js.UndefOr[java.lang.String] = js.undefined
  var lineNumber: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Can be a string or an existing error.
  	 */
  var message: js.UndefOr[js.Any] = js.undefined
  /**
  	 * The module name of your plugin.
  	 */
  var name: js.UndefOr[java.lang.String] = js.undefined
  var plugin: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Error properties will be included in err.toString(). Can be omitted by
  	 * setting this to false.
  	 */
  var showProperties: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * By default the stack will not be shown. Set this to true if you think the
  	 * stack is important for your error.
  	 */
  var showStack: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * You need to include the message along with this stack. If you pass an
  	 * error in as the message the stack will be pulled from that, otherwise one
  	 * will be created.
  	 */
  var stack: js.UndefOr[java.lang.String] = js.undefined
}

object PluginErrorOptions {
  @scala.inline
  def apply(
    error: nodeLib.Error = null,
    fileName: java.lang.String = null,
    lineNumber: scala.Int | scala.Double = null,
    message: js.Any = null,
    name: java.lang.String = null,
    plugin: java.lang.String = null,
    showProperties: js.UndefOr[scala.Boolean] = js.undefined,
    showStack: js.UndefOr[scala.Boolean] = js.undefined,
    stack: java.lang.String = null
  ): PluginErrorOptions = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (lineNumber != null) __obj.updateDynamic("lineNumber")(lineNumber.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message)
    if (name != null) __obj.updateDynamic("name")(name)
    if (plugin != null) __obj.updateDynamic("plugin")(plugin)
    if (!js.isUndefined(showProperties)) __obj.updateDynamic("showProperties")(showProperties)
    if (!js.isUndefined(showStack)) __obj.updateDynamic("showStack")(showStack)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[PluginErrorOptions]
  }
}

