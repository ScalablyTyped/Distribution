package typings
package logDashUpdateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Create extends js.Object {
  /**
  	 * Log to `stderr` by overwriting the previous output in the terminal.
  	 *
  	 * @param text - The text to log to `stderr`.
  	 */
  @JSName("stderr")
  val stderr_Original: logDashUpdateLib.logDashUpdateMod.LogUpdate = js.native
  /**
  	 * Get a `logUpdate` method that logs to the specified stream.
  	 *
  	 * @param stream - The stream to log to.
  	 */
  def create(stream: nodeLib.NodeJSNs.WritableStream): logDashUpdateLib.logDashUpdateMod.LogUpdate = js.native
  def create(stream: nodeLib.NodeJSNs.WritableStream, options: logDashUpdateLib.logDashUpdateMod.Options): logDashUpdateLib.logDashUpdateMod.LogUpdate = js.native
  /**
  	 * Log to `stderr` by overwriting the previous output in the terminal.
  	 *
  	 * @param text - The text to log to `stderr`.
  	 */
  def stderr(text: java.lang.String*): scala.Unit = js.native
}

