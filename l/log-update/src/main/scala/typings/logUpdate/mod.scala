package typings.logUpdate

import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  inline def apply(text: String*): Unit = ^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("log-update", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  		Clear the logged output.
  		*/
  inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
  
  /**
  	Get a `logUpdate` method that logs to the specified stream.
  	@param stream - The stream to log to.
  	*/
  inline def create(stream: WritableStream): LogUpdate = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(stream.asInstanceOf[js.Any]).asInstanceOf[LogUpdate]
  inline def create(stream: WritableStream, options: Options): LogUpdate = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LogUpdate]
  
  /**
  		Persist the logged output. Useful if you want to start a new log session below the current one.
  		*/
  inline def done(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("done")().asInstanceOf[Unit]
  
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
  inline def stderr(text: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stderr")(text.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
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
    val showCursor: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setShowCursor(value: Boolean): Self = StObject.set(x, "showCursor", value.asInstanceOf[js.Any])
      
      inline def setShowCursorUndefined: Self = StObject.set(x, "showCursor", js.undefined)
    }
  }
}
