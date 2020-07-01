package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Modeled after information exposed by /proc/stat.
  */
@js.native
trait SchemaCPUTime extends js.Object {
  /**
    * Average CPU utilization rate (% non-idle cpu / second) since previous
    * sample.
    */
  var rate: js.UndefOr[Double] = js.native
  /**
    * Timestamp of the measurement.
    */
  var timestamp: js.UndefOr[String] = js.native
  /**
    * Total active CPU time across all cores (ie., non-idle) in milliseconds
    * since start-up.
    */
  var totalMs: js.UndefOr[String] = js.native
}

object SchemaCPUTime {
  @scala.inline
  def apply(rate: js.UndefOr[Double] = js.undefined, timestamp: String = null, totalMs: String = null): SchemaCPUTime = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(rate)) __obj.updateDynamic("rate")(rate.get.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (totalMs != null) __obj.updateDynamic("totalMs")(totalMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCPUTime]
  }
}

