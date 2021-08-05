package typings.ionicCliFramework

import typings.ionicCliFramework.colorsMod.Colors
import typings.ionicCliFramework.tasksMod.TaskChain
import typings.logUpdate.mod.LogUpdate
import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outputMod {
  
  @JSImport("@ionic/cli-framework/lib/output", "LogUpdateOutputStrategy")
  @js.native
  class LogUpdateOutputStrategy ()
    extends StObject
       with OutputStrategy
       with RedrawLine {
    def this(hasStreamColors: LogUpdateOutputStrategyOptions) = this()
    
    /* protected */ val colors: Colors = js.native
    
    /* CompleteClass */
    override def createTaskChain(): TaskChain = js.native
    
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
    /* protected */ @JSName("logUpdate")
    val logUpdate_Original: LogUpdate = js.native
    
    /* CompleteClass */
    override val stream: WritableStream = js.native
  }
  
  @JSImport("@ionic/cli-framework/lib/output", "StreamOutputStrategy")
  @js.native
  class StreamOutputStrategy protected ()
    extends StObject
       with OutputStrategy {
    def this(hasStreamColors: StreamOutputStrategyOptions) = this()
    
    /* protected */ val colors: Colors = js.native
    
    /* CompleteClass */
    override def createTaskChain(): TaskChain = js.native
    
    /* CompleteClass */
    override val stream: WritableStream = js.native
  }
  
  trait LogUpdateOutputStrategyOptions extends StObject {
    
    val colors: js.UndefOr[Colors] = js.undefined
    
    val stream: js.UndefOr[WritableStream] = js.undefined
  }
  object LogUpdateOutputStrategyOptions {
    
    inline def apply(): LogUpdateOutputStrategyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogUpdateOutputStrategyOptions]
    }
    
    extension [Self <: LogUpdateOutputStrategyOptions](x: Self) {
      
      inline def setColors(value: Colors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setStream(value: WritableStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    }
  }
  
  trait OutputStrategy extends StObject {
    
    def createTaskChain(): TaskChain
    
    val stream: WritableStream
  }
  object OutputStrategy {
    
    inline def apply(createTaskChain: () => TaskChain, stream: WritableStream): OutputStrategy = {
      val __obj = js.Dynamic.literal(createTaskChain = js.Any.fromFunction0(createTaskChain), stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutputStrategy]
    }
    
    extension [Self <: OutputStrategy](x: Self) {
      
      inline def setCreateTaskChain(value: () => TaskChain): Self = StObject.set(x, "createTaskChain", js.Any.fromFunction0(value))
      
      inline def setStream(value: WritableStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RedrawLine extends StObject {
    
    def redrawLine(): Unit = js.native
    def redrawLine(msg: String): Unit = js.native
  }
  
  trait StreamOutputStrategyOptions extends StObject {
    
    val colors: js.UndefOr[Colors] = js.undefined
    
    val stream: WritableStream
  }
  object StreamOutputStrategyOptions {
    
    inline def apply(stream: WritableStream): StreamOutputStrategyOptions = {
      val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamOutputStrategyOptions]
    }
    
    extension [Self <: StreamOutputStrategyOptions](x: Self) {
      
      inline def setColors(value: Colors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setStream(value: WritableStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
}
