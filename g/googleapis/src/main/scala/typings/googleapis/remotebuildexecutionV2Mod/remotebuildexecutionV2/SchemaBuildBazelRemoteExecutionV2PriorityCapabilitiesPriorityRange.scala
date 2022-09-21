package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange extends StObject {
  
  /**
    * The maximum numeric value for this priority range, which represents the least urgent task or shortest retained item.
    */
  var maxPriority: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The minimum numeric value for this priority range, which represents the most urgent task or longest retained item.
    */
  var minPriority: js.UndefOr[Double | Null] = js.undefined
}
object SchemaBuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange {
  
  inline def apply(): SchemaBuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange]
  }
  
  extension [Self <: SchemaBuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange](x: Self) {
    
    inline def setMaxPriority(value: Double): Self = StObject.set(x, "maxPriority", value.asInstanceOf[js.Any])
    
    inline def setMaxPriorityNull: Self = StObject.set(x, "maxPriority", null)
    
    inline def setMaxPriorityUndefined: Self = StObject.set(x, "maxPriority", js.undefined)
    
    inline def setMinPriority(value: Double): Self = StObject.set(x, "minPriority", value.asInstanceOf[js.Any])
    
    inline def setMinPriorityNull: Self = StObject.set(x, "minPriority", null)
    
    inline def setMinPriorityUndefined: Self = StObject.set(x, "minPriority", js.undefined)
  }
}
