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
import scala.scalajs.js.`|`
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
  abstract class RateLimiter[T, U] protected () extends IRateLimiter[T, U] {
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
      * A promise that resolves on each successful invocation.
      */
    var payload: PromiseDelegate[T] | Null = js.native
    
    /**
      * The underlying poll instance used by the rate limiter.
      */
    var poll: Poll[T, U, invoked] = js.native
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
    
    var _interval: js.Any = js.native
  }
  object Throttler {
    
    /**
      * Instantiation options for a `Throttler`.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * Whether to invoke at the leading or trailing edge of throttle cycle.
        * Defaults to `leading`.
        */
      var edge: js.UndefOr[leading | trailing] = js.native
      
      /**
        * The throttling limit; defaults to 500ms.
        */
      var limit: js.UndefOr[Double] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEdge(value: leading | trailing): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
        
        @scala.inline
        def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      }
    }
  }
}
