package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allowed values for priority in ResultsCachePolicy Used for querying both
  * cache and execution valid priority ranges.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2PriorityCapabilities extends js.Object {
  
  var priorities: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange]] = js.native
}
object SchemaBuildBazelRemoteExecutionV2PriorityCapabilities {
  
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2PriorityCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2PriorityCapabilities]
  }
  
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2PriorityCapabilitiesOps[Self <: SchemaBuildBazelRemoteExecutionV2PriorityCapabilities] (val x: Self) extends AnyVal {
    
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
    def setPrioritiesVarargs(value: SchemaBuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange*): Self = this.set("priorities", js.Array(value :_*))
    
    @scala.inline
    def setPriorities(value: js.Array[SchemaBuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange]): Self = this.set("priorities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriorities: Self = this.set("priorities", js.undefined)
  }
}
