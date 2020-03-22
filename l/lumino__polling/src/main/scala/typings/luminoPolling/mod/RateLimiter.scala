package typings.luminoPolling.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/polling", "RateLimiter")
@js.native
abstract class RateLimiter[T, U] protected ()
  extends typings.luminoPolling.ratelimiterMod.RateLimiter[T, U] {
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

