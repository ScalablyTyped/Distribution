package typings.atJupyterlabCoreutils.libInterfacesMod.IPollNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The polling frequency parameters.
  *
  * #### Notes
  * We implement the "decorrelated jitter" strategy from
  * https://aws.amazon.com/blogs/architecture/exponential-backoff-and-jitter/.
  * Essentially, if consecutive retries are needed, we choose an integer:
  * `sleep = min(max, rand(interval, backoff * sleep))`
  * This ensures that the poll is never less than `interval`, and nicely
  * spreads out retries for consecutive tries. Over time, if (interval < max),
  * the random number will be above `max` about (1 - 1/backoff) of the time
  * (sleeping the `max`), and the rest of the time the sleep will be a random
  * number below `max`, decorrelating our trigger time from other pollers.
  */
trait Frequency extends js.Object {
  /**
    * Whether poll frequency backs off (boolean) or the backoff growth rate
    * (float > 1).
    *
    * #### Notes
    * If `true`, the default backoff growth rate is `3`.
    */
  val backoff: Boolean | Double
  /**
    * The basic polling interval in milliseconds (integer).
    */
  val interval: Double
  /**
    * The maximum milliseconds (integer) between poll requests.
    */
  val max: Double
}

object Frequency {
  @scala.inline
  def apply(backoff: Boolean | Double, interval: Double, max: Double): Frequency = {
    val __obj = js.Dynamic.literal(backoff = backoff.asInstanceOf[js.Any], interval = interval, max = max)
  
    __obj.asInstanceOf[Frequency]
  }
}

