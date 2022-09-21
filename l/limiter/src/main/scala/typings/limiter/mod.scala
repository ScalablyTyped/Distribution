package typings.limiter

import typings.limiter.rateLimiterMod.RateLimiterOpts
import typings.limiter.tokenBucketMod.TokenBucketOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("limiter/dist/cjs", "RateLimiter")
  @js.native
  open class RateLimiter protected ()
    extends typings.limiter.rateLimiterMod.RateLimiter {
    def this(hasTokensPerIntervalIntervalFireImmediately: RateLimiterOpts) = this()
  }
  
  @JSImport("limiter/dist/cjs", "TokenBucket")
  @js.native
  open class TokenBucket protected ()
    extends typings.limiter.tokenBucketMod.TokenBucket {
    def this(hasBucketSizeTokensPerIntervalIntervalParentBucket: TokenBucketOpts) = this()
  }
}
