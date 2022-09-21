package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBuildBazelRemoteExecutionV2ExecutionCapabilities extends StObject {
  
  /**
    * Remote execution may only support a single digest function.
    */
  var digestFunction: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether remote execution is enabled for the particular server/instance.
    */
  var execEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Supported execution priority range.
    */
  var executionPriorityCapabilities: js.UndefOr[SchemaBuildBazelRemoteExecutionV2PriorityCapabilities] = js.undefined
  
  /**
    * Supported node properties.
    */
  var supportedNodeProperties: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaBuildBazelRemoteExecutionV2ExecutionCapabilities {
  
  inline def apply(): SchemaBuildBazelRemoteExecutionV2ExecutionCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2ExecutionCapabilities]
  }
  
  extension [Self <: SchemaBuildBazelRemoteExecutionV2ExecutionCapabilities](x: Self) {
    
    inline def setDigestFunction(value: String): Self = StObject.set(x, "digestFunction", value.asInstanceOf[js.Any])
    
    inline def setDigestFunctionNull: Self = StObject.set(x, "digestFunction", null)
    
    inline def setDigestFunctionUndefined: Self = StObject.set(x, "digestFunction", js.undefined)
    
    inline def setExecEnabled(value: Boolean): Self = StObject.set(x, "execEnabled", value.asInstanceOf[js.Any])
    
    inline def setExecEnabledNull: Self = StObject.set(x, "execEnabled", null)
    
    inline def setExecEnabledUndefined: Self = StObject.set(x, "execEnabled", js.undefined)
    
    inline def setExecutionPriorityCapabilities(value: SchemaBuildBazelRemoteExecutionV2PriorityCapabilities): Self = StObject.set(x, "executionPriorityCapabilities", value.asInstanceOf[js.Any])
    
    inline def setExecutionPriorityCapabilitiesUndefined: Self = StObject.set(x, "executionPriorityCapabilities", js.undefined)
    
    inline def setSupportedNodeProperties(value: js.Array[String]): Self = StObject.set(x, "supportedNodeProperties", value.asInstanceOf[js.Any])
    
    inline def setSupportedNodePropertiesNull: Self = StObject.set(x, "supportedNodeProperties", null)
    
    inline def setSupportedNodePropertiesUndefined: Self = StObject.set(x, "supportedNodeProperties", js.undefined)
    
    inline def setSupportedNodePropertiesVarargs(value: String*): Self = StObject.set(x, "supportedNodeProperties", js.Array(value*))
  }
}
