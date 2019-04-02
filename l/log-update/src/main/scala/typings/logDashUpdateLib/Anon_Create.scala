package typings
package logDashUpdateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Create extends js.Object {
  /**
  	Log to `stderr` by overwriting the previous output in the terminal.
  	@param text - The text to log to `stderr`.
  	*/
  @JSName("stderr")
  val stderr_Original: logDashUpdateLib.logDashUpdateMod.logUpdateNs.LogUpdate = js.native
  /**
  	Get a `logUpdate` method that logs to the specified stream.
  	@param stream - The stream to log to.
  	*/
  def create(stream: nodeLib.NodeJSNs.WritableStream): logDashUpdateLib.logDashUpdateMod.logUpdateNs.LogUpdate = js.native
  def create(
    stream: nodeLib.NodeJSNs.WritableStream,
    options: logDashUpdateLib.logDashUpdateMod.logUpdateNs.Options
  ): logDashUpdateLib.logDashUpdateMod.logUpdateNs.LogUpdate = js.native
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
  /**
  	Log to `stderr` by overwriting the previous output in the terminal.
  	@param text - The text to log to `stderr`.
  	*/
  def stderr(text: java.lang.String*): scala.Unit = js.native
}

