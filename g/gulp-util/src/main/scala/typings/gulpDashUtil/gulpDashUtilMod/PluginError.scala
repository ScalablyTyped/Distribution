package typings.gulpDashUtil.gulpDashUtilMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.gulpDashUtil.gulpDashUtilMod.PluginErrorOptions because var conflicts: message, name, stack. Inlined fileName, lineNumber, showStack, showProperties, plugin, error */ @JSImport("gulp-util", "PluginError")
@js.native
class PluginError () extends Error {
  def this(options: PluginErrorOptions) = this()
  def this(pluginName: String) = this()
  def this(pluginName: String, message: String) = this()
  def this(pluginName: String, message: Error) = this()
  def this(pluginName: String, options: PluginErrorOptions) = this()
  def this(pluginName: String, message: String, options: PluginErrorOptions) = this()
  def this(pluginName: String, message: Error, options: PluginErrorOptions) = this()
  var error: js.UndefOr[Error] = js.native
  var fileName: js.UndefOr[String] = js.native
  var lineNumber: js.UndefOr[Double] = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  var plugin: js.UndefOr[String] = js.native
  /**
  	 * Error properties will be included in err.toString(). Can be omitted by
  	 * setting this to false.
  	 */
  var showProperties: js.UndefOr[Boolean] = js.native
  /**
  	 * By default the stack will not be shown. Set this to true if you think the
  	 * stack is important for your error.
  	 */
  var showStack: js.UndefOr[Boolean] = js.native
  /**
  	 * You need to include the message along with this stack. If you pass an
  	 * error in as the message the stack will be pulled from that, otherwise one
  	 * will be created.
  	 */
  @JSName("stack")
  var stack_PluginError: String = js.native
}

