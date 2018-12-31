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

