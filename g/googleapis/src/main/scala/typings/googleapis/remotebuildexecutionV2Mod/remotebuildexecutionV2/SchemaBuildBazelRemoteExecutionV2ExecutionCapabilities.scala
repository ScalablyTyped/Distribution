package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Capabilities of the remote execution system.
  */
trait SchemaBuildBazelRemoteExecutionV2ExecutionCapabilities extends StObject {
  
  /**
    * Remote execution may only support a single digest function.
    */
  var digestFunction: js.UndefOr[String] = js.undefined
  
  /**
    * Whether remote execution is enabled for the particular server/instance.
    */
  var execEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Supported execution priority range.
    */
  var executionPriorityCapabilities: js.UndefOr[SchemaBuildBazelRemoteExecutionV2PriorityCapabilities] = js.undefined
}
object SchemaBuildBazelRemoteExecutionV2ExecutionCapabilities {
  
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2ExecutionCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2ExecutionCapabilities]
  }
  
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2ExecutionCapabilitiesMutableBuilder[Self <: SchemaBuildBazelRemoteExecutionV2ExecutionCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDigestFunction(value: String): Self = StObject.set(x, "digestFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestFunctionUndefined: Self = StObject.set(x, "digestFunction", js.undefined)
    
    @scala.inline
    def setExecEnabled(value: Boolean): Self = StObject.set(x, "execEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecEnabledUndefined: Self = StObject.set(x, "execEnabled", js.undefined)
    
    @scala.inline
    def setExecutionPriorityCapabilities(value: SchemaBuildBazelRemoteExecutionV2PriorityCapabilities): Self = StObject.set(x, "executionPriorityCapabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionPriorityCapabilitiesUndefined: Self = StObject.set(x, "executionPriorityCapabilities", js.undefined)
  }
}
