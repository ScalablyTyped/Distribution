package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GkeNodePoolAutoscalingConfig extends StObject {
  
  /** The maximum number of nodes in the node pool. Must be >= min_node_count, and must be > 0. Note: Quota must be sufficient to scale up the cluster. */
  var maxNodeCount: js.UndefOr[Double] = js.undefined
  
  /** The minimum number of nodes in the node pool. Must be >= 0 and <= max_node_count. */
  var minNodeCount: js.UndefOr[Double] = js.undefined
}
object GkeNodePoolAutoscalingConfig {
  
  inline def apply(): GkeNodePoolAutoscalingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GkeNodePoolAutoscalingConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GkeNodePoolAutoscalingConfig] (val x: Self) extends AnyVal {
    
    inline def setMaxNodeCount(value: Double): Self = StObject.set(x, "maxNodeCount", value.asInstanceOf[js.Any])
    
    inline def setMaxNodeCountUndefined: Self = StObject.set(x, "maxNodeCount", js.undefined)
    
    inline def setMinNodeCount(value: Double): Self = StObject.set(x, "minNodeCount", value.asInstanceOf[js.Any])
    
    inline def setMinNodeCountUndefined: Self = StObject.set(x, "minNodeCount", js.undefined)
  }
}
