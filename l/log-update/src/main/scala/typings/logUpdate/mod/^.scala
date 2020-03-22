package typings.logUpdate.mod

import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("log-update", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  	Log to `stderr` by overwriting the previous output in the terminal.
  	@param text - The text to log to `stderr`.
  	*/
  @JSName("stderr")
  val stderr_Original: LogUpdate = js.native
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
  def apply(text: String*): Unit = js.native
  /**
  		Clear the logged output.
  		*/
  def clear(): Unit = js.native
  /**
  	Get a `logUpdate` method that logs to the specified stream.
  	@param stream - The stream to log to.
  	*/
  def create(stream: WritableStream): LogUpdate = js.native
  def create(stream: WritableStream, options: Options): LogUpdate = js.native
  /**
  		Persist the logged output. Useful if you want to start a new log session below the current one.
  		*/
  def done(): Unit = js.native
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
  def stderr(text: String*): Unit = js.native
}

