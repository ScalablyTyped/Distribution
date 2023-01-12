package typings.limiter

import typings.limiter.distCjsTokenBucketMod.Interval
import typings.limiter.distCjsTokenBucketMod.TokenBucket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsRateLimiterMod {
  
  @JSImport("limiter/dist/cjs/RateLimiter", "RateLimiter")
  @js.native
  open class RateLimiter protected () extends StObject {
    def this(param0: RateLimiterOpts) = this()
    
    var curIntervalStart: Double = js.native
    
    var fireImmediately: Boolean = js.native
    
    /**
      * Returns the number of tokens remaining in the TokenBucket.
      * @returns {Number} The number of tokens remaining.
      */
    def getTokensRemaining(): Double = js.native
    
    /**
      * Remove the requested number of tokens. If the rate limiter contains enough
      * tokens and we haven't spent too many tokens in this interval already, this
      * will happen immediately. Otherwise, the removal will happen when enough
      * tokens become available.
      * @param count The number of tokens to remove.
      * @returns A promise for the remainingTokens count.
      */
    def removeTokens(count: Double): js.Promise[Double] = js.native
    
    var tokenBucket: TokenBucket = js.native
    
    var tokensThisInterval: Double = js.native
    
    /**
      * Attempt to remove the requested number of tokens and return immediately.
      * If the bucket (and any parent buckets) contains enough tokens and we
      * haven't spent too many tokens in this interval already, this will return
      * true. Otherwise, false is returned.
      * @param {Number} count The number of tokens to remove.
      * @param {Boolean} True if the tokens were successfully removed, otherwise
      *  false.
      */
    def tryRemoveTokens(count: Double): Boolean = js.native
  }
  
  trait RateLimiterOpts extends StObject {
    
    var fireImmediately: js.UndefOr[Boolean] = js.undefined
    
    var interval: Interval
    
    var tokensPerInterval: Double
  }
  object RateLimiterOpts {
    
    inline def apply(interval: Interval, tokensPerInterval: Double): RateLimiterOpts = {
      val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], tokensPerInterval = tokensPerInterval.asInstanceOf[js.Any])
      __obj.asInstanceOf[RateLimiterOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RateLimiterOpts] (val x: Self) extends AnyVal {
      
      inline def setFireImmediately(value: Boolean): Self = StObject.set(x, "fireImmediately", value.asInstanceOf[js.Any])
      
      inline def setFireImmediatelyUndefined: Self = StObject.set(x, "fireImmediately", js.undefined)
      
      inline def setInterval(value: Interval): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setTokensPerInterval(value: Double): Self = StObject.set(x, "tokensPerInterval", value.asInstanceOf[js.Any])
    }
  }
}
