package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoscalingLimits extends StObject {
  
  /** Required. Maximum number of nodes to scale up to. */
  var maxServeNodes: js.UndefOr[Double] = js.undefined
  
  /** Required. Minimum number of nodes to scale down to. */
  var minServeNodes: js.UndefOr[Double] = js.undefined
}
object AutoscalingLimits {
  
  inline def apply(): AutoscalingLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoscalingLimits]
  }
  
  extension [Self <: AutoscalingLimits](x: Self) {
    
    inline def setMaxServeNodes(value: Double): Self = StObject.set(x, "maxServeNodes", value.asInstanceOf[js.Any])
    
    inline def setMaxServeNodesUndefined: Self = StObject.set(x, "maxServeNodes", js.undefined)
    
    inline def setMinServeNodes(value: Double): Self = StObject.set(x, "minServeNodes", value.asInstanceOf[js.Any])
    
    inline def setMinServeNodesUndefined: Self = StObject.set(x, "minServeNodes", js.undefined)
  }
}
