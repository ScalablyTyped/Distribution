package typings.logUpdate

import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined log-update.log-update.LogUpdate & { readonly stderr :log-update.log-update.LogUpdate, readonly create (stream : node.NodeJS.WritableStream, options : log-update.log-update.Options | undefined): log-update.log-update.LogUpdate} */
object mod {
  
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
  @JSImport("log-update", JSImport.Namespace)
  @js.native
  def apply(text: String*): Unit = js.native
  
  /**
  		Clear the logged output.
  		*/
  @JSImport("log-update", "clear")
  @js.native
  def clear(): Unit = js.native
  
  /**
  	Get a `logUpdate` method that logs to the specified stream.
  	@param stream - The stream to log to.
  	*/
  @JSImport("log-update", "create")
  @js.native
  def create(stream: WritableStream): LogUpdate = js.native
  @JSImport("log-update", "create")
  @js.native
  def create(stream: WritableStream, options: Options): LogUpdate = js.native
  
  /**
  		Persist the logged output. Useful if you want to start a new log session below the current one.
  		*/
  @JSImport("log-update", "done")
  @js.native
  def done(): Unit = js.native
  
  /**
  	Log to `stderr` by overwriting the previous output in the terminal.
  	@param text - The text to log to `stderr`.
  	*/
  @JSImport("log-update", "stderr")
  @js.native
  val stderr: LogUpdate = js.native
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
  @JSImport("log-update", "stderr")
  @js.native
  def stderr(text: String*): Unit = js.native
  
  @js.native
  trait LogUpdate extends StObject {
    
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
  
  @js.native
  trait Options extends StObject {
    
    /**
    		Show the cursor. This can be useful when a CLI accepts input from a user.
    		@example
    		```
    		import logUpdate = require('log-update');
    		// Write output but don't hide the cursor
    		const log = logUpdate.create(process.stdout, {
    			showCursor: true
    		});
    		```
    		*/
    val showCursor: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShowCursor(value: Boolean): Self = StObject.set(x, "showCursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCursorUndefined: Self = StObject.set(x, "showCursor", js.undefined)
    }
  }
}
