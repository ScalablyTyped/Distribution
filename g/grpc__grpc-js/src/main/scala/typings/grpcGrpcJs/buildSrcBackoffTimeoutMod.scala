package typings.grpcGrpcJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcBackoffTimeoutMod {
  
  @JSImport("@grpc/grpc-js/build/src/backoff-timeout", "BackoffTimeout")
  @js.native
  open class BackoffTimeout protected () extends StObject {
    def this(callback: js.Function0[Unit]) = this()
    def this(callback: js.Function0[Unit], options: BackoffOptions) = this()
    
    /* private */ var callback: Any = js.native
    
    /**
      * Indicates whether the timer should keep the Node process running if no
      * other async operation is doing so.
      */
    /* private */ var hasRef: Any = js.native
    
    /**
      * The delay time at the start, and after each reset.
      */
    /* private */ val initialDelay: Any = js.native
    
    /**
      * Check whether the timer is currently running.
      */
    def isRunning(): Boolean = js.native
    
    /**
      * The maximum fraction by which the delay time can randomly vary after
      * applying the multiplier.
      */
    /* private */ val jitter: Any = js.native
    
    /**
      * The maximum delay time
      */
    /* private */ val maxDelay: Any = js.native
    
    /**
      * The exponential backoff multiplier.
      */
    /* private */ val multiplier: Any = js.native
    
    /**
      * The delay time for the next time the timer runs.
      */
    /* private */ var nextDelay: Any = js.native
    
    /**
      * Set that while the timer is running, it should keep the Node process
      * running.
      */
    def ref(): Unit = js.native
    
    /**
      * Reset the delay time to its initial value. If the timer is still running,
      * retroactively apply that reset to the current timer.
      */
    def reset(): Unit = js.native
    
    /**
      * Call the callback after the current amount of delay time
      */
    def runOnce(): Unit = js.native
    
    /* private */ var runTimer: Any = js.native
    
    /**
      * Indicates whether the timer is currently running.
      */
    /* private */ var running: Any = js.native
    
    /**
      * The time that the currently running timer was started. Only valid if
      * running is true.
      */
    /* private */ var startTime: Any = js.native
    
    /**
      * Stop the timer. The callback will not be called until `runOnce` is called
      * again.
      */
    def stop(): Unit = js.native
    
    /**
      * The handle of the underlying timer. If running is false, this value refers
      * to an object representing a timer that has ended, but it can still be
      * interacted with without error.
      */
    /* private */ var timerId: Any = js.native
    
    /**
      * Set that while the timer is running, it should not keep the Node process
      * running.
      */
    def unref(): Unit = js.native
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BackoffOptions] (val x: Self) extends AnyVal {
      
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
