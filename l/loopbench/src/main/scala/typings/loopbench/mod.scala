package typings.loopbench

import typings.loopbench.loopbenchStrings.load
import typings.loopbench.loopbenchStrings.unload
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Creates a new instance of loopbench.
    */
  inline def apply(): LoopBench = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[LoopBench]
  inline def apply(options: Options): LoopBench = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[LoopBench]
  
  @JSImport("loopbench", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Events:
    * - `load`, emitted when `instance.delay > instance.limit`
    * - `unload`, emitted when `overLimit` goes from `true` and `false`
    */
  @js.native
  trait LoopBench extends EventEmitter {
    
    def addListener(event: load | unload, listener: js.Function0[Unit]): this.type = js.native
    
    /**
      * The delay in milliseconds (and fractions) from the expected run. It might be negative (in older nodes).
      */
    val delay: Double = js.native
    
    def emit(event: load | unload): Boolean = js.native
    
    /**
      * The maximum amount of delay that is tolerated before `overLimit` becomes true,
      * and the `load` event is emitted.
      */
    val limit: Double = js.native
    
    def listenerCount(`type`: load | unload): Double = js.native
    
    def listeners(event: load | unload): js.Array[js.Function0[Unit]] = js.native
    
    def off(event: load | unload, listener: js.Function0[Unit]): this.type = js.native
    
    def on(event: load | unload, listener: js.Function0[Unit]): this.type = js.native
    
    def once(event: load | unload, listener: js.Function0[Unit]): this.type = js.native
    
    /**
      * Is `true` if the `instance.delay > instance.limit`.
      */
    val overLimit: Boolean = js.native
    
    def prependListener(event: load | unload, listener: js.Function0[Unit]): this.type = js.native
    
    def prependOnceListener(event: load | unload, listener: js.Function0[Unit]): this.type = js.native
    
    def rawListeners(event: load | unload): js.Array[js.Function0[Unit]] = js.native
    
    def removeAllListeners(event: load | unload): this.type = js.native
    
    def removeListener(event: load | unload, listener: js.Function0[Unit]): this.type = js.native
    
    /**
      * Stops the sampling.
      */
    def stop(): Unit = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * The maximum amount of delay that is tolerated before `overLimit` becomes true,
      * and the `load` event is emitted, defaults to `42`.
      */
    var limit: js.UndefOr[Double] = js.undefined
    
    /**
      * The interval at which the eventLoop should be sampled, defaults to `5`.
      */
    var sampleInterval: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setSampleInterval(value: Double): Self = StObject.set(x, "sampleInterval", value.asInstanceOf[js.Any])
      
      inline def setSampleIntervalUndefined: Self = StObject.set(x, "sampleInterval", js.undefined)
    }
  }
}
