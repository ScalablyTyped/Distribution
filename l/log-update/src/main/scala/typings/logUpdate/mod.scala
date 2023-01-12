package typings.logUpdate

import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("log-update", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  Log to `stdout` by overwriting the previous output in the terminal.
  @param text - The text to log to `stdout`.
  @example
  ```
  import logUpdate from 'log-update';
  const frames = ['-', '\\', '|', '/'];
  let index = 0;
  setInterval(() => {
  	const frame = frames[index = ++index % frames.length];
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
  @JSImport("log-update", JSImport.Default)
  @js.native
  val default: (js.Function1[/* repeated */ String, Unit]) & LogUpdateMethods = js.native
  
  inline def createLogUpdate(stream: WritableStream): (js.Function1[/* repeated */ String, Unit]) & LogUpdateMethods = ^.asInstanceOf[js.Dynamic].applyDynamic("createLogUpdate")(stream.asInstanceOf[js.Any]).asInstanceOf[(js.Function1[/* repeated */ String, Unit]) & LogUpdateMethods]
  inline def createLogUpdate(stream: WritableStream, options: Options): (js.Function1[/* repeated */ String, Unit]) & LogUpdateMethods = (^.asInstanceOf[js.Dynamic].applyDynamic("createLogUpdate")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[(js.Function1[/* repeated */ String, Unit]) & LogUpdateMethods]
  
  /**
  Log to `stderr` by overwriting the previous output in the terminal.
  @param text - The text to log to `stderr`.
  @example
  ```
  import {logUpdateStderr} from 'log-update';
  const frames = ['-', '\\', '|', '/'];
  let index = 0;
  setInterval(() => {
  	const frame = frames[index = ++index % frames.length];
  	logUpdateStderr(
  `
  		♥♥
  ${frame} unicorns ${frame}
  		♥♥
  `
  	);
  }, 80);
  ```
  */
  @JSImport("log-update", "logUpdateStderr")
  @js.native
  val logUpdateStderr: (js.Function1[/* repeated */ String, Unit]) & LogUpdateMethods = js.native
  
  trait LogUpdateMethods extends StObject {
    
    /**
    	Clear the logged output.
    	*/
    def clear(): Unit
    
    /**
    	Persist the logged output. Useful if you want to start a new log session below the current one.
    	*/
    def done(): Unit
  }
  object LogUpdateMethods {
    
    inline def apply(clear: () => Unit, done: () => Unit): LogUpdateMethods = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), done = js.Any.fromFunction0(done))
      __obj.asInstanceOf[LogUpdateMethods]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LogUpdateMethods] (val x: Self) extends AnyVal {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setDone(value: () => Unit): Self = StObject.set(x, "done", js.Any.fromFunction0(value))
    }
  }
  
  trait Options extends StObject {
    
    /**
    	Show the cursor. This can be useful when a CLI accepts input from a user.
    	@example
    	```
    	import {createLogUpdate} from 'log-update';
    	// Write output but don't hide the cursor
    	const log = createLogUpdate(process.stdout, {
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setShowCursor(value: Boolean): Self = StObject.set(x, "showCursor", value.asInstanceOf[js.Any])
      
      inline def setShowCursorUndefined: Self = StObject.set(x, "showCursor", js.undefined)
    }
  }
}
