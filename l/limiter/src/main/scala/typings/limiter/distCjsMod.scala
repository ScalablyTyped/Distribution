package typings.limiter

import typings.limiter.distCjsRateLimiterMod.RateLimiterOpts
import typings.limiter.distCjsTokenBucketMod.TokenBucketOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsMod {
  
  @JSImport("limiter/dist/cjs", "RateLimiter")
  @js.native
  open class RateLimiter protected ()
    extends typings.limiter.distCjsRateLimiterMod.RateLimiter {
    def this(hasTokensPerIntervalIntervalFireImmediately: RateLimiterOpts) = this()
  }
  
  @JSImport("limiter/dist/cjs", "TokenBucket")
  @js.native
  open class TokenBucket protected ()
    extends typings.limiter.distCjsTokenBucketMod.TokenBucket {
    def this(hasBucketSizeTokensPerIntervalIntervalParentBucket: TokenBucketOpts) = this()
  }
}
