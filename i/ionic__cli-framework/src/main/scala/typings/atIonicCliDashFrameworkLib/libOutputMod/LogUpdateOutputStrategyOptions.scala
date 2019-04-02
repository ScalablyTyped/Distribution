package typings
package atIonicCliDashFrameworkLib.libOutputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogUpdateOutputStrategyOptions extends js.Object {
  @JSName("LogUpdate")
  val LogUpdate_Original: atIonicCliDashFrameworkLib.Anon_LogUpdate with logDashUpdateLib.logDashUpdateMod.logUpdateNs.LogUpdate with logDashUpdateLib.Anon_CreateDefault = js.native
  val colors: js.UndefOr[atIonicCliDashFrameworkLib.libColorsMod.Colors] = js.native
  val stream: js.UndefOr[nodeLib.NodeJSNs.WritableStream] = js.native
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
  def LogUpdate(text: java.lang.String*): scala.Unit = js.native
}

