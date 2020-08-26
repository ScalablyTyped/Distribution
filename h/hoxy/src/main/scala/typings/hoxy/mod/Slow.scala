package typings.hoxy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slow extends js.Object {
  /**
    * Imposes a single rate-limiting bottleneck (in bytes per second) on all downloads
    */
  var down: Double = js.native
  /**
    * Imposes a single rate-limiting bottleneck (in bytes per second) on all throughput
    */
  var latency: Double = js.native
  /**
    * Imposes a delay (in milliseconds) between all requests and responses
    */
  var rate: Double = js.native
  /**
    * Imposes a single rate-limiting bottleneck (in bytes per second) on all uploads
    */
  var up: Double = js.native
}

object Slow {
  @scala.inline
  def apply(down: Double, latency: Double, rate: Double, up: Double): Slow = {
    val __obj = js.Dynamic.literal(down = down.asInstanceOf[js.Any], latency = latency.asInstanceOf[js.Any], rate = rate.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slow]
  }
  @scala.inline
  implicit class SlowOps[Self <: Slow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDown(value: Double): Self = this.set("down", value.asInstanceOf[js.Any])
    @scala.inline
    def setLatency(value: Double): Self = this.set("latency", value.asInstanceOf[js.Any])
    @scala.inline
    def setRate(value: Double): Self = this.set("rate", value.asInstanceOf[js.Any])
    @scala.inline
    def setUp(value: Double): Self = this.set("up", value.asInstanceOf[js.Any])
  }
  
}

