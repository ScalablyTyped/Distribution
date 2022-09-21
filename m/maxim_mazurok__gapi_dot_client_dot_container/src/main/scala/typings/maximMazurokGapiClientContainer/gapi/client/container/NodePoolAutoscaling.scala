package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodePoolAutoscaling extends StObject {
  
  /** Can this node pool be deleted automatically. */
  var autoprovisioned: js.UndefOr[Boolean] = js.undefined
  
  /** Is autoscaling enabled for this node pool. */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /** Location policy used when scaling up a nodepool. */
  var locationPolicy: js.UndefOr[String] = js.undefined
  
  /** Maximum number of nodes for one location in the NodePool. Must be >= min_node_count. There has to be enough quota to scale up the cluster. */
  var maxNodeCount: js.UndefOr[Double] = js.undefined
  
  /** Minimum number of nodes for one location in the NodePool. Must be >= 1 and <= max_node_count. */
  var minNodeCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Maximum number of nodes in the node pool. Must be greater than total_min_node_count. There has to be enough quota to scale up the cluster. The total_*_node_count fields are mutually
    * exclusive with the *_node_count fields.
    */
  var totalMaxNodeCount: js.UndefOr[Double] = js.undefined
  
  /** Minimum number of nodes in the node pool. Must be greater than 1 less than total_max_node_count. The total_*_node_count fields are mutually exclusive with the *_node_count fields. */
  var totalMinNodeCount: js.UndefOr[Double] = js.undefined
}
object NodePoolAutoscaling {
  
  inline def apply(): NodePoolAutoscaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodePoolAutoscaling]
  }
  
  extension [Self <: NodePoolAutoscaling](x: Self) {
    
    inline def setAutoprovisioned(value: Boolean): Self = StObject.set(x, "autoprovisioned", value.asInstanceOf[js.Any])
    
    inline def setAutoprovisionedUndefined: Self = StObject.set(x, "autoprovisioned", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setLocationPolicy(value: String): Self = StObject.set(x, "locationPolicy", value.asInstanceOf[js.Any])
    
    inline def setLocationPolicyUndefined: Self = StObject.set(x, "locationPolicy", js.undefined)
    
    inline def setMaxNodeCount(value: Double): Self = StObject.set(x, "maxNodeCount", value.asInstanceOf[js.Any])
    
    inline def setMaxNodeCountUndefined: Self = StObject.set(x, "maxNodeCount", js.undefined)
    
    inline def setMinNodeCount(value: Double): Self = StObject.set(x, "minNodeCount", value.asInstanceOf[js.Any])
    
    inline def setMinNodeCountUndefined: Self = StObject.set(x, "minNodeCount", js.undefined)
    
    inline def setTotalMaxNodeCount(value: Double): Self = StObject.set(x, "totalMaxNodeCount", value.asInstanceOf[js.Any])
    
    inline def setTotalMaxNodeCountUndefined: Self = StObject.set(x, "totalMaxNodeCount", js.undefined)
    
    inline def setTotalMinNodeCount(value: Double): Self = StObject.set(x, "totalMinNodeCount", value.asInstanceOf[js.Any])
    
    inline def setTotalMinNodeCountUndefined: Self = StObject.set(x, "totalMinNodeCount", js.undefined)
  }
}
