package typings.luminoPolling

import typings.luminoCoreutils.mod.PromiseDelegate
import typings.luminoPolling.luminoPollingStrings.invoked
import typings.luminoPolling.luminoPollingStrings.leading
import typings.luminoPolling.luminoPollingStrings.trailing
import typings.luminoPolling.mod.IRateLimiter
import typings.luminoPolling.pollMod.Poll
import typings.luminoPolling.ratelimiterMod.Throttler.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ratelimiterMod {
  
  @JSImport("@lumino/polling/types/ratelimiter", "Debouncer")
  @js.native
  class Debouncer[T, U] protected () extends RateLimiter[T, U] {
    /**
      * Instantiate a rate limiter.
      *
      * @param fn - The function to rate limit.
      *
      * @param limit - The rate limit; defaults to 500ms.
      */
    def this(fn: js.Function0[T | js.Promise[T]]) = this()
    def this(fn: js.Function0[T | js.Promise[T]], limit: Double) = this()
  }
  
  @JSImport("@lumino/polling/types/ratelimiter", "RateLimiter")
  @js.native
  abstract class RateLimiter[T, U] protected ()
    extends StObject
       with IRateLimiter[T, U] {
    /**
      * Instantiate a rate limiter.
      *
      * @param fn - The function to rate limit.
      *
      * @param limit - The rate limit; defaults to 500ms.
      */
    def this(fn: js.Function0[T | js.Promise[T]]) = this()
    def this(fn: js.Function0[T | js.Promise[T]], limit: Double) = this()
    
    /**
      * Dispose of the resources held by the object.
      *
      * #### Notes
      * If the object's `dispose` method is called more than once, all
      * calls made after the first will be a no-op.
      *
      * #### Undefined Behavior
      * It is undefined behavior to use any functionality of the object
      * after it has been disposed unless otherwise explicitly noted.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Invoke the rate limited function.
      */
    /* CompleteClass */
    override def invoke(): js.Promise[T] = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    
    /**
      * The rate limit in milliseconds.
      */
    /* CompleteClass */
    override val limit: Double = js.native
    
    /**
      * A promise that resolves on each successful invocation.
      */
    /* protected */ var payload: PromiseDelegate[T] | Null = js.native
    
    /**
      * The underlying poll instance used by the rate limiter.
      */
    /* protected */ var poll: Poll[T, U, invoked] = js.native
    
    /**
      * Stop the function if it is mid-flight.
      */
    /* CompleteClass */
    override def stop(): js.Promise[Unit] = js.native
  }
  
  @JSImport("@lumino/polling/types/ratelimiter", "Throttler")
  @js.native
  class Throttler[T, U] protected () extends RateLimiter[T, U] {
    /**
      * Instantiate a throttler.
      *
      * @param fn - The function being throttled.
      *
      * @param options - Throttling configuration or throttling limit in ms.
      *
      * #### Notes
      * The `edge` defaults to `leading`; the `limit` defaults to `500`.
      */
    def this(fn: js.Function0[T | js.Promise[T]]) = this()
    def this(fn: js.Function0[T | js.Promise[T]], options: Double) = this()
    def this(fn: js.Function0[T | js.Promise[T]], options: IOptions) = this()
    
    /* private */ var _interval: js.Any = js.native
  }
  object Throttler {
    
    /**
      * Instantiation options for a `Throttler`.
      */
    trait IOptions extends StObject {
      
      /**
        * Whether to invoke at the leading or trailing edge of throttle cycle.
        * Defaults to `leading`.
        */
      var edge: js.UndefOr[leading | trailing] = js.undefined
      
      /**
        * The throttling limit; defaults to 500ms.
        */
      var limit: js.UndefOr[Double] = js.undefined
    }
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setEdge(value: leading | trailing): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
        
        inline def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
        
        inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
        
        inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      }
    }
  }
}
