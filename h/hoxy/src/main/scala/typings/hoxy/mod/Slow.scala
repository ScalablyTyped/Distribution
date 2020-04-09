package typings.hoxy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Slow extends js.Object {
  /**
    * Imposes a single rate-limiting bottleneck (in bytes per second) on all downloads
    */
  var down: Double
  /**
    * Imposes a single rate-limiting bottleneck (in bytes per second) on all throughput
    */
  var latency: Double
  /**
    * Imposes a delay (in milliseconds) between all requests and responses
    */
  var rate: Double
  /**
    * Imposes a single rate-limiting bottleneck (in bytes per second) on all uploads
    */
  var up: Double
}

object Slow {
  @scala.inline
  def apply(down: Double, latency: Double, rate: Double, up: Double): Slow = {
    val __obj = js.Dynamic.literal(down = down.asInstanceOf[js.Any], latency = latency.asInstanceOf[js.Any], rate = rate.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Slow]
  }
}

