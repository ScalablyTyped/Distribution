package typings
package gulpDashUtilLib.gulpDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- gulpDashUtilLib.gulpDashUtilMod.PluginErrorOptions because var conflicts: message, name, stack. Inlined fileName, lineNumber, showStack, showProperties, plugin, error */ @JSImport("gulp-util", "PluginError")
@js.native
class PluginError ()
  extends stdLib.Error {
  def this(options: PluginErrorOptions) = this()
  def this(pluginName: java.lang.String) = this()
  def this(pluginName: java.lang.String, message: java.lang.String) = this()
  def this(pluginName: java.lang.String, message: stdLib.Error) = this()
  def this(pluginName: java.lang.String, options: PluginErrorOptions) = this()
  def this(pluginName: java.lang.String, message: java.lang.String, options: PluginErrorOptions) = this()
  def this(pluginName: java.lang.String, message: stdLib.Error, options: PluginErrorOptions) = this()
  var error: js.UndefOr[stdLib.Error] = js.native
  var fileName: js.UndefOr[java.lang.String] = js.native
  var lineNumber: js.UndefOr[scala.Double] = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  var plugin: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Error properties will be included in err.toString(). Can be omitted by
  	 * setting this to false.
  	 */
  var showProperties: js.UndefOr[scala.Boolean] = js.native
  /**
  	 * By default the stack will not be shown. Set this to true if you think the
  	 * stack is important for your error.
  	 */
  var showStack: js.UndefOr[scala.Boolean] = js.native
  /**
  	 * You need to include the message along with this stack. If you pass an
  	 * error in as the message the stack will be pulled from that, otherwise one
  	 * will be created.
  	 */
  @JSName("stack")
  var stack_PluginError: java.lang.String = js.native
}

