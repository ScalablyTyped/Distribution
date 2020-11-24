package typings.luminoPolling.mod

import typings.luminoPolling.ratelimiterMod.Throttler.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/polling", "Throttler")
@js.native
class Throttler[T, U] protected ()
  extends typings.luminoPolling.ratelimiterMod.Throttler[T, U] {
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
}
