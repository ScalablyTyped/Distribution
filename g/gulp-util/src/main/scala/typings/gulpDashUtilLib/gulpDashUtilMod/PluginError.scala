package typings
package gulpDashUtilLib.gulpDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- gulpDashUtilLib.gulpDashUtilMod.PluginErrorOptions because var conflicts: stack. Inlined name, message, fileName, lineNumber, showStack, showProperties, plugin, error */ @JSImport("gulp-util", "PluginError")
@js.native
class PluginError ()
  extends nodeLib.Error {
  def this(options: PluginErrorOptions) = this()
  def this(pluginName: java.lang.String) = this()
  def this(pluginName: java.lang.String, message: java.lang.String) = this()
  def this(pluginName: java.lang.String, message: nodeLib.Error) = this()
  def this(pluginName: java.lang.String, options: PluginErrorOptions) = this()
  def this(pluginName: java.lang.String, message: java.lang.String, options: PluginErrorOptions) = this()
  def this(pluginName: java.lang.String, message: nodeLib.Error, options: PluginErrorOptions) = this()
  var error: nodeLib.Error | js.UndefOr[nodeLib.Error] = js.native
  var fileName: java.lang.String | js.UndefOr[java.lang.String] = js.native
  var lineNumber: scala.Double | js.UndefOr[scala.Double] = js.native
  /**
  	 * Can be a string or an existing error.
  	 */
  var message: js.Any | js.UndefOr[js.Any] = js.native
  /**
  	 * The module name of your plugin.
  	 */
  var name: java.lang.String | js.UndefOr[java.lang.String] = js.native
  var plugin: java.lang.String | js.UndefOr[java.lang.String] = js.native
  /**
  	 * Error properties will be included in err.toString(). Can be omitted by
  	 * setting this to false.
  	 */
  var showProperties: scala.Boolean | js.UndefOr[scala.Boolean] = js.native
  /**
  	 * By default the stack will not be shown. Set this to true if you think the
  	 * stack is important for your error.
  	 */
  var showStack: scala.Boolean | js.UndefOr[scala.Boolean] = js.native
  /**
  	 * You need to include the message along with this stack. If you pass an
  	 * error in as the message the stack will be pulled from that, otherwise one
  	 * will be created.
  	 */
  @JSName("stack")
  var stack_PluginError: java.lang.String = js.native
}

