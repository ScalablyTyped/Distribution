package typings.limiter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmTokenBucketMod {
  
  @JSImport("limiter/dist/esm/TokenBucket", "TokenBucket")
  @js.native
  open class TokenBucket protected () extends StObject {
    def this(hasBucketSizeTokensPerIntervalIntervalParentBucket: TokenBucketOpts) = this()
    
    var bucketSize: Double = js.native
    
    var content: Double = js.native
    
    /**
      * Add any new tokens to the bucket since the last drip.
      * @returns {Boolean} True if new tokens were added, otherwise false.
      */
    def drip(): Boolean = js.native
    
    var interval: Double = js.native
    
    var lastDrip: Double = js.native
    
    var parentBucket: js.UndefOr[TokenBucket] = js.native
    
    /**
      * Remove the requested number of tokens. If the bucket (and any parent
      * buckets) contains enough tokens this will happen immediately. Otherwise,
      * the removal will happen when enough tokens become available.
      * @param count The number of tokens to remove.
      * @returns A promise for the remainingTokens count.
      */
    def removeTokens(count: Double): js.Promise[Double] = js.native
    
    var tokensPerInterval: Double = js.native
    
    /**
      * Attempt to remove the requested number of tokens and return immediately.
      * If the bucket (and any parent buckets) contains enough tokens this will
      * return true, otherwise false is returned.
      * @param {Number} count The number of tokens to remove.
      * @param {Boolean} True if the tokens were successfully removed, otherwise
      *  false.
      */
    def tryRemoveTokens(count: Double): Boolean = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typings.limiter.limiterStrings.second
    - typings.limiter.limiterStrings.sec
    - typings.limiter.limiterStrings.minute
    - typings.limiter.limiterStrings.min
    - typings.limiter.limiterStrings.hour
    - typings.limiter.limiterStrings.hr
    - typings.limiter.limiterStrings.day
  */
  type Interval = _Interval | Double
  
  trait TokenBucketOpts extends StObject {
    
    var bucketSize: Double
    
    var interval: Interval
    
    var parentBucket: js.UndefOr[TokenBucket] = js.undefined
    
    var tokensPerInterval: Double
  }
  object TokenBucketOpts {
    
    inline def apply(bucketSize: Double, interval: Interval, tokensPerInterval: Double): TokenBucketOpts = {
      val __obj = js.Dynamic.literal(bucketSize = bucketSize.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], tokensPerInterval = tokensPerInterval.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenBucketOpts]
    }
    
    extension [Self <: TokenBucketOpts](x: Self) {
      
      inline def setBucketSize(value: Double): Self = StObject.set(x, "bucketSize", value.asInstanceOf[js.Any])
      
      inline def setInterval(value: Interval): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setParentBucket(value: TokenBucket): Self = StObject.set(x, "parentBucket", value.asInstanceOf[js.Any])
      
      inline def setParentBucketUndefined: Self = StObject.set(x, "parentBucket", js.undefined)
      
      inline def setTokensPerInterval(value: Double): Self = StObject.set(x, "tokensPerInterval", value.asInstanceOf[js.Any])
    }
  }
  
  trait _Interval extends StObject
}
