package typings
package atIonicCliDashFrameworkLib.libOutputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/output", "LogUpdateOutputStrategy")
@js.native
class LogUpdateOutputStrategy protected ()
  extends OutputStrategy
     with RedrawLine {
  def this(hasLogUpdateStreamColors: LogUpdateOutputStrategyOptions) = this()
  val colors: atIonicCliDashFrameworkLib.libColorsMod.Colors = js.native
  @JSName("logUpdate")
  val logUpdate_Original: atIonicCliDashFrameworkLib.Anon_LogUpdate with logDashUpdateLib.logDashUpdateMod.logUpdateNs.LogUpdate with logDashUpdateLib.Anon_CreateDefault = js.native
  /* CompleteClass */
  override val stream: nodeLib.NodeJSNs.WritableStream = js.native
  /* CompleteClass */
  override def createTaskChain(): atIonicCliDashFrameworkLib.libTasksMod.TaskChain = js.native
  /**
  		Log to `stdout` by overwriting the previous output in the terminal.
  		@param text - The text to log to `stdout`.
  		@example
  		```
  		import logUpdate = require('log-update');
  		const frames = ['-', '\\', '|', '/'];
  		let i = 0;
  		setInterval(() => {
  			const frame = frames[i = ++i % frames.length];
  			logUpdate(
  		`
  				♥♥
  		${frame} unicorns ${frame}
  				♥♥
  		`
  			);
  		}, 80);
  		```
  		*/
  /* protected */ def logUpdate(text: java.lang.String*): scala.Unit = js.native
}

