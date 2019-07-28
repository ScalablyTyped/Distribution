package typings.atJupyterlabCoreutils.atJupyterlabCoreutilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils", "RateLimiter")
@js.native
abstract class RateLimiter[T, U] protected ()
  extends typings.atJupyterlabCoreutils.libRatelimiterMod.RateLimiter[T, U] {
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

