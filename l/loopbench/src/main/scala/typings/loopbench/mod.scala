package typings.loopbench

import typings.loopbench.loopbenchStrings.load
import typings.loopbench.loopbenchStrings.unload
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Creates a new instance of loopbench.
    */
  @JSImport("loopbench", JSImport.Namespace)
  @js.native
  def apply(): LoopBench = js.native
  @JSImport("loopbench", JSImport.Namespace)
  @js.native
  def apply(options: Options): LoopBench = js.native
  
  /**
    * Events:
    * - `load`, emitted when `instance.delay > instance.limit`
    * - `unload`, emitted when `overLimit` goes from `true` and `false`
    */
  @js.native
  trait LoopBench extends EventEmitter {
    
    @JSName("addListener")
    def addListener_load(event: load, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_unload(event: unload, listener: js.Function0[Unit]): this.type = js.native
    
    /**
      * The delay in milliseconds (and fractions) from the expected run. It might be negative (in older nodes).
      */
    val delay: Double = js.native
    
    @JSName("emit")
    def emit_load(event: load): Boolean = js.native
    @JSName("emit")
    def emit_unload(event: unload): Boolean = js.native
    
    /**
      * The maximum amount of delay that is tolerated before `overLimit` becomes true,
      * and the `load` event is emitted.
      */
    val limit: Double = js.native
    
    @JSName("listenerCount")
    def listenerCount_load(`type`: load): Double = js.native
    @JSName("listenerCount")
    def listenerCount_unload(`type`: unload): Double = js.native
    
    @JSName("listeners")
    def listeners_load(event: load): js.Array[js.Function0[Unit]] = js.native
    @JSName("listeners")
    def listeners_unload(event: unload): js.Array[js.Function0[Unit]] = js.native
    
    @JSName("off")
    def off_load(event: load, listener: js.Function0[Unit]): this.type = js.native
    @JSName("off")
    def off_unload(event: unload, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("on")
    def on_load(event: load, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_unload(event: unload, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("once")
    def once_load(event: load, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_unload(event: unload, listener: js.Function0[Unit]): this.type = js.native
    
    /**
      * Is `true` if the `instance.delay > instance.limit`.
      */
    val overLimit: Boolean = js.native
    
    @JSName("prependListener")
    def prependListener_load(event: load, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_unload(event: unload, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_load(event: load, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_unload(event: unload, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("rawListeners")
    def rawListeners_load(event: load): js.Array[js.Function0[Unit]] = js.native
    @JSName("rawListeners")
    def rawListeners_unload(event: unload): js.Array[js.Function0[Unit]] = js.native
    
    @JSName("removeAllListeners")
    def removeAllListeners_load(event: load): this.type = js.native
    @JSName("removeAllListeners")
    def removeAllListeners_unload(event: unload): this.type = js.native
    
    @JSName("removeListener")
    def removeListener_load(event: load, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_unload(event: unload, listener: js.Function0[Unit]): this.type = js.native
    
    /**
      * Stops the sampling.
      */
    def stop(): Unit = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * The maximum amount of delay that is tolerated before `overLimit` becomes true,
      * and the `load` event is emitted, defaults to `42`.
      */
    var limit: js.UndefOr[Double] = js.native
    
    /**
      * The interval at which the eventLoop should be sampled, defaults to `5`.
      */
    var sampleInterval: js.UndefOr[Double] = js.native
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
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setSampleInterval(value: Double): Self = StObject.set(x, "sampleInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSampleIntervalUndefined: Self = StObject.set(x, "sampleInterval", js.undefined)
    }
  }
}
