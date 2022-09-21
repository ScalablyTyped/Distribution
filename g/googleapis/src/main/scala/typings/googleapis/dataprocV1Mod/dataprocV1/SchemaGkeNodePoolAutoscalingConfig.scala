package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGkeNodePoolAutoscalingConfig extends StObject {
  
  /**
    * The maximum number of nodes in the node pool. Must be \>= min_node_count, and must be \> 0. Note: Quota must be sufficient to scale up the cluster.
    */
  var maxNodeCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The minimum number of nodes in the node pool. Must be \>= 0 and <= max_node_count.
    */
  var minNodeCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGkeNodePoolAutoscalingConfig {
  
  inline def apply(): SchemaGkeNodePoolAutoscalingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGkeNodePoolAutoscalingConfig]
  }
  
  extension [Self <: SchemaGkeNodePoolAutoscalingConfig](x: Self) {
    
    inline def setMaxNodeCount(value: Double): Self = StObject.set(x, "maxNodeCount", value.asInstanceOf[js.Any])
    
    inline def setMaxNodeCountNull: Self = StObject.set(x, "maxNodeCount", null)
    
    inline def setMaxNodeCountUndefined: Self = StObject.set(x, "maxNodeCount", js.undefined)
    
    inline def setMinNodeCount(value: Double): Self = StObject.set(x, "minNodeCount", value.asInstanceOf[js.Any])
    
    inline def setMinNodeCountNull: Self = StObject.set(x, "minNodeCount", null)
    
    inline def setMinNodeCountUndefined: Self = StObject.set(x, "minNodeCount", js.undefined)
  }
}
