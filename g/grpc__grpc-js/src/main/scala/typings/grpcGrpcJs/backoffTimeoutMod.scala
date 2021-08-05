package typings.grpcGrpcJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backoffTimeoutMod {
  
  @JSImport("@grpc/grpc-js/build/src/backoff-timeout", "BackoffTimeout")
  @js.native
  class BackoffTimeout protected () extends StObject {
    def this(callback: js.Function0[Unit]) = this()
    def this(callback: js.Function0[Unit], options: BackoffOptions) = this()
    
    /* private */ var callback: js.Any = js.native
    
    /* private */ var initialDelay: js.Any = js.native
    
    def isRunning(): Boolean = js.native
    
    /* private */ var jitter: js.Any = js.native
    
    /* private */ var maxDelay: js.Any = js.native
    
    /* private */ var multiplier: js.Any = js.native
    
    /* private */ var nextDelay: js.Any = js.native
    
    /**
      * Reset the delay time to its initial value.
      */
    def reset(): Unit = js.native
    
    /**
      * Call the callback after the current amount of delay time
      */
    def runOnce(): Unit = js.native
    
    /* private */ var running: js.Any = js.native
    
    /**
      * Stop the timer. The callback will not be called until `runOnce` is called
      * again.
      */
    def stop(): Unit = js.native
    
    /* private */ var timerId: js.Any = js.native
  }
  
  trait BackoffOptions extends StObject {
    
    var initialDelay: js.UndefOr[Double] = js.undefined
    
    var jitter: js.UndefOr[Double] = js.undefined
    
    var maxDelay: js.UndefOr[Double] = js.undefined
    
    var multiplier: js.UndefOr[Double] = js.undefined
  }
  object BackoffOptions {
    
    inline def apply(): BackoffOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackoffOptions]
    }
    
    extension [Self <: BackoffOptions](x: Self) {
      
      inline def setInitialDelay(value: Double): Self = StObject.set(x, "initialDelay", value.asInstanceOf[js.Any])
      
      inline def setInitialDelayUndefined: Self = StObject.set(x, "initialDelay", js.undefined)
      
      inline def setJitter(value: Double): Self = StObject.set(x, "jitter", value.asInstanceOf[js.Any])
      
      inline def setJitterUndefined: Self = StObject.set(x, "jitter", js.undefined)
      
      inline def setMaxDelay(value: Double): Self = StObject.set(x, "maxDelay", value.asInstanceOf[js.Any])
      
      inline def setMaxDelayUndefined: Self = StObject.set(x, "maxDelay", js.undefined)
      
      inline def setMultiplier(value: Double): Self = StObject.set(x, "multiplier", value.asInstanceOf[js.Any])
      
      inline def setMultiplierUndefined: Self = StObject.set(x, "multiplier", js.undefined)
    }
  }
}
