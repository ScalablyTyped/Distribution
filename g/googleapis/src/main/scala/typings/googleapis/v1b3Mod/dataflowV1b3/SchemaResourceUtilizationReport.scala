package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Worker metrics exported from workers. This contains resource utilization
  * metrics accumulated from a variety of sources. For more information, see
  * go/df-resource-signals.
  */
@js.native
trait SchemaResourceUtilizationReport extends js.Object {
  /**
    * CPU utilization samples.
    */
  var cpuTime: js.UndefOr[js.Array[SchemaCPUTime]] = js.native
}

object SchemaResourceUtilizationReport {
  @scala.inline
  def apply(cpuTime: js.Array[SchemaCPUTime] = null): SchemaResourceUtilizationReport = {
    val __obj = js.Dynamic.literal()
    if (cpuTime != null) __obj.updateDynamic("cpuTime")(cpuTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResourceUtilizationReport]
  }
}

