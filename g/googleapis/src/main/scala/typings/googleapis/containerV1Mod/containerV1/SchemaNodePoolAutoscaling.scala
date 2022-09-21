package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNodePoolAutoscaling extends StObject {
  
  /**
    * Can this node pool be deleted automatically.
    */
  var autoprovisioned: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Is autoscaling enabled for this node pool.
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Location policy used when scaling up a nodepool.
    */
  var locationPolicy: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Maximum number of nodes for one location in the NodePool. Must be \>= min_node_count. There has to be enough quota to scale up the cluster.
    */
  var maxNodeCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Minimum number of nodes for one location in the NodePool. Must be \>= 1 and <= max_node_count.
    */
  var minNodeCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Maximum number of nodes in the node pool. Must be greater than total_min_node_count. There has to be enough quota to scale up the cluster. The total_*_node_count fields are mutually exclusive with the *_node_count fields.
    */
  var totalMaxNodeCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Minimum number of nodes in the node pool. Must be greater than 1 less than total_max_node_count. The total_*_node_count fields are mutually exclusive with the *_node_count fields.
    */
  var totalMinNodeCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaNodePoolAutoscaling {
  
  inline def apply(): SchemaNodePoolAutoscaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodePoolAutoscaling]
  }
  
  extension [Self <: SchemaNodePoolAutoscaling](x: Self) {
    
    inline def setAutoprovisioned(value: Boolean): Self = StObject.set(x, "autoprovisioned", value.asInstanceOf[js.Any])
    
    inline def setAutoprovisionedNull: Self = StObject.set(x, "autoprovisioned", null)
    
    inline def setAutoprovisionedUndefined: Self = StObject.set(x, "autoprovisioned", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setLocationPolicy(value: String): Self = StObject.set(x, "locationPolicy", value.asInstanceOf[js.Any])
    
    inline def setLocationPolicyNull: Self = StObject.set(x, "locationPolicy", null)
    
    inline def setLocationPolicyUndefined: Self = StObject.set(x, "locationPolicy", js.undefined)
    
    inline def setMaxNodeCount(value: Double): Self = StObject.set(x, "maxNodeCount", value.asInstanceOf[js.Any])
    
    inline def setMaxNodeCountNull: Self = StObject.set(x, "maxNodeCount", null)
    
    inline def setMaxNodeCountUndefined: Self = StObject.set(x, "maxNodeCount", js.undefined)
    
    inline def setMinNodeCount(value: Double): Self = StObject.set(x, "minNodeCount", value.asInstanceOf[js.Any])
    
    inline def setMinNodeCountNull: Self = StObject.set(x, "minNodeCount", null)
    
    inline def setMinNodeCountUndefined: Self = StObject.set(x, "minNodeCount", js.undefined)
    
    inline def setTotalMaxNodeCount(value: Double): Self = StObject.set(x, "totalMaxNodeCount", value.asInstanceOf[js.Any])
    
    inline def setTotalMaxNodeCountNull: Self = StObject.set(x, "totalMaxNodeCount", null)
    
    inline def setTotalMaxNodeCountUndefined: Self = StObject.set(x, "totalMaxNodeCount", js.undefined)
    
    inline def setTotalMinNodeCount(value: Double): Self = StObject.set(x, "totalMinNodeCount", value.asInstanceOf[js.Any])
    
    inline def setTotalMinNodeCountNull: Self = StObject.set(x, "totalMinNodeCount", null)
    
    inline def setTotalMinNodeCountUndefined: Self = StObject.set(x, "totalMinNodeCount", js.undefined)
  }
}
