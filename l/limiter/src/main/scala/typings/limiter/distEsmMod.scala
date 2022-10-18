package typings.limiter

import typings.limiter.distEsmRateLimiterMod.RateLimiterOpts
import typings.limiter.distEsmTokenBucketMod.TokenBucketOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmMod {
  
  @JSImport("limiter/dist/esm", "RateLimiter")
  @js.native
  open class RateLimiter protected ()
    extends typings.limiter.distEsmRateLimiterMod.RateLimiter {
    def this(hasTokensPerIntervalIntervalFireImmediately: RateLimiterOpts) = this()
  }
  
  @JSImport("limiter/dist/esm", "TokenBucket")
  @js.native
  open class TokenBucket protected ()
    extends typings.limiter.distEsmTokenBucketMod.TokenBucket {
    def this(hasBucketSizeTokensPerIntervalIntervalParentBucket: TokenBucketOpts) = this()
  }
}
