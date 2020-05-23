package typings.gulpUtil.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginErrorOptions extends js.Object {
  var error: js.UndefOr[Error] = js.undefined
  var fileName: js.UndefOr[String] = js.undefined
  var lineNumber: js.UndefOr[Double] = js.undefined
  /**
    * Can be a string or an existing error.
    */
  var message: js.UndefOr[js.Any] = js.undefined
  /**
    * The module name of your plugin.
    */
  var name: js.UndefOr[String] = js.undefined
  var plugin: js.UndefOr[String] = js.undefined
  /**
    * Error properties will be included in err.toString(). Can be omitted by
    * setting this to false.
    */
  var showProperties: js.UndefOr[Boolean] = js.undefined
  /**
    * By default the stack will not be shown. Set this to true if you think the
    * stack is important for your error.
    */
  var showStack: js.UndefOr[Boolean] = js.undefined
  /**
    * You need to include the message along with this stack. If you pass an
    * error in as the message the stack will be pulled from that, otherwise one
    * will be created.
    */
  var stack: js.UndefOr[String] = js.undefined
}

object PluginErrorOptions {
  @scala.inline
  def apply(
    error: Error = null,
    fileName: String = null,
    lineNumber: js.UndefOr[Double] = js.undefined,
    message: js.Any = null,
    name: String = null,
    plugin: String = null,
    showProperties: js.UndefOr[Boolean] = js.undefined,
    showStack: js.UndefOr[Boolean] = js.undefined,
    stack: String = null
  ): PluginErrorOptions = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (!js.isUndefined(lineNumber)) __obj.updateDynamic("lineNumber")(lineNumber.get.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (plugin != null) __obj.updateDynamic("plugin")(plugin.asInstanceOf[js.Any])
    if (!js.isUndefined(showProperties)) __obj.updateDynamic("showProperties")(showProperties.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showStack)) __obj.updateDynamic("showStack")(showStack.get.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginErrorOptions]
  }
}

