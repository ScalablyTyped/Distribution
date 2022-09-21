package typings.lambdaRateLimiter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Initializes the rate limiter.
    *
    * @example
    * import limiterFactory = require('lambda-rate-limiter');
    *
    * const limiter = limiterFactory({
    *   interval: 60000,
    *   uniqueTokenPerInterval: 500,
    * });
    *
    * limiter
    *   .check(10, 'USER_TOKEN') // define maximum of 10 requests per interval
    *   .catch(() => {
    *     // rate limit exceeded: 429
    *   })
    *   .then(() => {
    *     // ok
    *   });
    */
  inline def apply(): RateLimiter = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RateLimiter]
  inline def apply(options: Options): RateLimiter = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[RateLimiter]
  
  @JSImport("lambda-rate-limiter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * Rate limit interval in ms, starts on first request.
      *
      * @default 60000
      */
    var interval: js.UndefOr[Double] = js.undefined
    
    /**
      * Max unique tokens per interval. Excess causes earliest seen to drop, per instantiation.
      *
      * @default 500
      */
    var uniqueTokenPerInterval: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setUniqueTokenPerInterval(value: Double): Self = StObject.set(x, "uniqueTokenPerInterval", value.asInstanceOf[js.Any])
      
      inline def setUniqueTokenPerIntervalUndefined: Self = StObject.set(x, "uniqueTokenPerInterval", js.undefined)
    }
  }
  
  trait RateLimiter extends StObject {
    
    /**
      * Check whether rate limit was reached.
      *
      * @param limit Max requests per interval.
      * @param token Any token value. Could be the user ip or login.
      */
    def check(limit: Double, token: String): js.Promise[Double]
  }
  object RateLimiter {
    
    inline def apply(check: (Double, String) => js.Promise[Double]): RateLimiter = {
      val __obj = js.Dynamic.literal(check = js.Any.fromFunction2(check))
      __obj.asInstanceOf[RateLimiter]
    }
    
    extension [Self <: RateLimiter](x: Self) {
      
      inline def setCheck(value: (Double, String) => js.Promise[Double]): Self = StObject.set(x, "check", js.Any.fromFunction2(value))
    }
  }
}
