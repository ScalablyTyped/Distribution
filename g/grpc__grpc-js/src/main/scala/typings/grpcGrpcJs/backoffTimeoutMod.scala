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
    
    var callback: js.Any = js.native
    
    var initialDelay: js.Any = js.native
    
    def isRunning(): Boolean = js.native
    
    var jitter: js.Any = js.native
    
    var maxDelay: js.Any = js.native
    
    var multiplier: js.Any = js.native
    
    var nextDelay: js.Any = js.native
    
    /**
      * Reset the delay time to its initial value.
      */
    def reset(): Unit = js.native
    
    /**
      * Call the callback after the current amount of delay time
      */
    def runOnce(): Unit = js.native
    
    var running: js.Any = js.native
    
    /**
      * Stop the timer. The callback will not be called until `runOnce` is called
      * again.
      */
    def stop(): Unit = js.native
    
    var timerId: js.Any = js.native
  }
  
  trait BackoffOptions extends StObject {
    
    var initialDelay: js.UndefOr[Double] = js.undefined
    
    var jitter: js.UndefOr[Double] = js.undefined
    
    var maxDelay: js.UndefOr[Double] = js.undefined
    
    var multiplier: js.UndefOr[Double] = js.undefined
  }
  object BackoffOptions {
    
    @scala.inline
    def apply(): BackoffOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackoffOptions]
    }
    
    @scala.inline
    implicit class BackoffOptionsMutableBuilder[Self <: BackoffOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitialDelay(value: Double): Self = StObject.set(x, "initialDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialDelayUndefined: Self = StObject.set(x, "initialDelay", js.undefined)
      
      @scala.inline
      def setJitter(value: Double): Self = StObject.set(x, "jitter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJitterUndefined: Self = StObject.set(x, "jitter", js.undefined)
      
      @scala.inline
      def setMaxDelay(value: Double): Self = StObject.set(x, "maxDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDelayUndefined: Self = StObject.set(x, "maxDelay", js.undefined)
      
      @scala.inline
      def setMultiplier(value: Double): Self = StObject.set(x, "multiplier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiplierUndefined: Self = StObject.set(x, "multiplier", js.undefined)
    }
  }
}
