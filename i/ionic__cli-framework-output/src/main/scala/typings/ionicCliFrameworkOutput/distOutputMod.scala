package typings.ionicCliFrameworkOutput

import typings.ionicCliFrameworkOutput.distColorsMod.Colors
import typings.ionicCliFrameworkOutput.distTasksMod.TaskChain
import typings.node.NodeJS.WritableStream
import typings.node.processMod.global.NodeJS.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOutputMod {
  
  @JSImport("@ionic/cli-framework-output/dist/output", "StreamOutputStrategy")
  @js.native
  open class StreamOutputStrategy protected ()
    extends StObject
       with OutputStrategy {
    def this(hasStreamColors: StreamOutputStrategyOptions) = this()
    
    /* CompleteClass */
    override val colors: Colors = js.native
    
    /* CompleteClass */
    override def createTaskChain(): TaskChain = js.native
    
    /* CompleteClass */
    override val stream: WritableStream = js.native
    
    /* CompleteClass */
    override def write(msg: String): Boolean = js.native
  }
  
  @JSImport("@ionic/cli-framework-output/dist/output", "TTYOutputRedrawer")
  @js.native
  open class TTYOutputRedrawer protected () extends StObject {
    def this(hasStream: TTYOutputRedrawerOptions) = this()
    
    def clear(): Unit = js.native
    
    def end(): Unit = js.native
    
    def redraw(msg: String): Unit = js.native
    
    val stream: WriteStream = js.native
    
    def width: Double = js.native
  }
  
  @JSImport("@ionic/cli-framework-output/dist/output", "TTYOutputStrategy")
  @js.native
  open class TTYOutputStrategy () extends StreamOutputStrategy {
    def this(hasStreamColors: TTYOutputStrategyOptions) = this()
    
    /* protected */ val redrawer: TTYOutputRedrawer = js.native
    
    @JSName("stream")
    val stream_TTYOutputStrategy: WriteStream = js.native
  }
  
  trait OutputStrategy extends StObject {
    
    val colors: Colors
    
    def createTaskChain(): TaskChain
    
    val stream: WritableStream
    
    def write(msg: String): Boolean
  }
  object OutputStrategy {
    
    inline def apply(colors: Colors, createTaskChain: () => TaskChain, stream: WritableStream, write: String => Boolean): OutputStrategy = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], createTaskChain = js.Any.fromFunction0(createTaskChain), stream = stream.asInstanceOf[js.Any], write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[OutputStrategy]
    }
    
    extension [Self <: OutputStrategy](x: Self) {
      
      inline def setColors(value: Colors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setCreateTaskChain(value: () => TaskChain): Self = StObject.set(x, "createTaskChain", js.Any.fromFunction0(value))
      
      inline def setStream(value: WritableStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setWrite(value: String => Boolean): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
  
  trait StreamOutputStrategyOptions extends StObject {
    
    val colors: js.UndefOr[Colors] = js.undefined
    
    val stream: js.UndefOr[WritableStream] = js.undefined
  }
  object StreamOutputStrategyOptions {
    
    inline def apply(): StreamOutputStrategyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StreamOutputStrategyOptions]
    }
    
    extension [Self <: StreamOutputStrategyOptions](x: Self) {
      
      inline def setColors(value: Colors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setStream(value: WritableStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    }
  }
  
  trait TTYOutputRedrawerOptions extends StObject {
    
    val stream: js.UndefOr[WriteStream] = js.undefined
  }
  object TTYOutputRedrawerOptions {
    
    inline def apply(): TTYOutputRedrawerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TTYOutputRedrawerOptions]
    }
    
    extension [Self <: TTYOutputRedrawerOptions](x: Self) {
      
      inline def setStream(value: WriteStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    }
  }
  
  trait TTYOutputStrategyOptions
    extends StObject
       with StreamOutputStrategyOptions {
    
    @JSName("stream")
    val stream_TTYOutputStrategyOptions: js.UndefOr[WriteStream] = js.undefined
  }
  object TTYOutputStrategyOptions {
    
    inline def apply(): TTYOutputStrategyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TTYOutputStrategyOptions]
    }
    
    extension [Self <: TTYOutputStrategyOptions](x: Self) {
      
      inline def setStream(value: WriteStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    }
  }
}
