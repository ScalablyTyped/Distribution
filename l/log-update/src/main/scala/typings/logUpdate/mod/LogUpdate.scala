package typings.logUpdate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogUpdate extends js.Object {
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
  		Persist the logged output. Useful if you want to start a new log session below the current one.
  		*/
  def done(): Unit = js.native
}

