package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodePoolAutoscaling extends StObject {
  
  /** Can this node pool be deleted automatically. */
  var autoprovisioned: js.UndefOr[Boolean] = js.undefined
  
  /** Is autoscaling enabled for this node pool. */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /** Maximum number of nodes in the NodePool. Must be >= min_node_count. There has to enough quota to scale up the cluster. */
  var maxNodeCount: js.UndefOr[Double] = js.undefined
  
  /** Minimum number of nodes in the NodePool. Must be >= 1 and <= max_node_count. */
  var minNodeCount: js.UndefOr[Double] = js.undefined
}
object NodePoolAutoscaling {
  
  @scala.inline
  def apply(): NodePoolAutoscaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodePoolAutoscaling]
  }
  
  @scala.inline
  implicit class NodePoolAutoscalingMutableBuilder[Self <: NodePoolAutoscaling] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoprovisioned(value: Boolean): Self = StObject.set(x, "autoprovisioned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoprovisionedUndefined: Self = StObject.set(x, "autoprovisioned", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setMaxNodeCount(value: Double): Self = StObject.set(x, "maxNodeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxNodeCountUndefined: Self = StObject.set(x, "maxNodeCount", js.undefined)
    
    @scala.inline
    def setMinNodeCount(value: Double): Self = StObject.set(x, "minNodeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinNodeCountUndefined: Self = StObject.set(x, "minNodeCount", js.undefined)
  }
}
