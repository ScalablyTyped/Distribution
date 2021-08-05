package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Supported range of priorities, including boundaries.
  */
trait SchemaBuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange extends StObject {
  
  var maxPriority: js.UndefOr[Double] = js.undefined
  
  var minPriority: js.UndefOr[Double] = js.undefined
}
object SchemaBuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange {
  
  inline def apply(): SchemaBuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange]
  }
  
  extension [Self <: SchemaBuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange](x: Self) {
    
    inline def setMaxPriority(value: Double): Self = StObject.set(x, "maxPriority", value.asInstanceOf[js.Any])
    
    inline def setMaxPriorityUndefined: Self = StObject.set(x, "maxPriority", js.undefined)
    
    inline def setMinPriority(value: Double): Self = StObject.set(x, "minPriority", value.asInstanceOf[js.Any])
    
    inline def setMinPriorityUndefined: Self = StObject.set(x, "minPriority", js.undefined)
  }
}
