package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allowed values for priority in ResultsCachePolicy Used for querying both
  * cache and execution valid priority ranges.
  */
trait SchemaBuildBazelRemoteExecutionV2PriorityCapabilities extends StObject {
  
  var priorities: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange]] = js.undefined
}
object SchemaBuildBazelRemoteExecutionV2PriorityCapabilities {
  
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2PriorityCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2PriorityCapabilities]
  }
  
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2PriorityCapabilitiesMutableBuilder[Self <: SchemaBuildBazelRemoteExecutionV2PriorityCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPriorities(value: js.Array[SchemaBuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange]): Self = StObject.set(x, "priorities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrioritiesUndefined: Self = StObject.set(x, "priorities", js.undefined)
    
    @scala.inline
    def setPrioritiesVarargs(value: SchemaBuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange*): Self = StObject.set(x, "priorities", js.Array(value :_*))
  }
}
