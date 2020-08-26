package typings.luminoPolling.ratelimiterMod

import typings.luminoPolling.ratelimiterMod.Throttler.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/polling/types/ratelimiter", "Throttler")
@js.native
class Throttler_[T, U] protected () extends RateLimiter[T, U] {
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

