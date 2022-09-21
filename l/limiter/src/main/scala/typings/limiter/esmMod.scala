package typings.limiter

import typings.limiter.esmRateLimiterMod.RateLimiterOpts
import typings.limiter.esmTokenBucketMod.TokenBucketOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmMod {
  
  @JSImport("limiter/dist/esm", "RateLimiter")
  @js.native
  open class RateLimiter protected ()
    extends typings.limiter.esmRateLimiterMod.RateLimiter {
    def this(hasTokensPerIntervalIntervalFireImmediately: RateLimiterOpts) = this()
  }
  
  @JSImport("limiter/dist/esm", "TokenBucket")
  @js.native
  open class TokenBucket protected ()
    extends typings.limiter.esmTokenBucketMod.TokenBucket {
    def this(hasBucketSizeTokensPerIntervalIntervalParentBucket: TokenBucketOpts) = this()
  }
}
