package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Supported range of priorities, including boundaries.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange extends js.Object {
  var maxPriority: js.UndefOr[Double] = js.native
  var minPriority: js.UndefOr[Double] = js.native
}

object SchemaBuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange {
  @scala.inline
  def apply(maxPriority: Int | Double = null, minPriority: Int | Double = null): SchemaBuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange = {
    val __obj = js.Dynamic.literal()
    if (maxPriority != null) __obj.updateDynamic("maxPriority")(maxPriority.asInstanceOf[js.Any])
    if (minPriority != null) __obj.updateDynamic("minPriority")(minPriority.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange]
  }
}

