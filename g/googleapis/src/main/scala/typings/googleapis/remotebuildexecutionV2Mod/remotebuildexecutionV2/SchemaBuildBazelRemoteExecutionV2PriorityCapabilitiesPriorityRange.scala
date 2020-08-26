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
  def apply(): SchemaBuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange]
  }
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRangeOps[Self <: SchemaBuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange] (val x: Self) extends AnyVal {
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
    def setMaxPriority(value: Double): Self = this.set("maxPriority", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxPriority: Self = this.set("maxPriority", js.undefined)
    @scala.inline
    def setMinPriority(value: Double): Self = this.set("minPriority", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinPriority: Self = this.set("minPriority", js.undefined)
  }
  
}

