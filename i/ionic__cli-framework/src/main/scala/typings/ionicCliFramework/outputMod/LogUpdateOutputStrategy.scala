package typings.ionicCliFramework.outputMod

import typings.ionicCliFramework.colorsMod.Colors
import typings.logUpdate.mod.LogUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/cli-framework/lib/output", "LogUpdateOutputStrategy")
@js.native
class LogUpdateOutputStrategy ()
  extends OutputStrategy
     with RedrawLine {
  def this(hasStreamColors: LogUpdateOutputStrategyOptions) = this()
  
  val colors: Colors = js.native
  
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
  /* protected */ def logUpdate(text: String*): Unit = js.native
  @JSName("logUpdate")
  val logUpdate_Original: LogUpdate = js.native
}
