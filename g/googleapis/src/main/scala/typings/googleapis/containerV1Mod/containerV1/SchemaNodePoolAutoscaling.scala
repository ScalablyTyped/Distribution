package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NodePoolAutoscaling contains information required by cluster autoscaler to
  * adjust the size of the node pool to the current cluster usage.
  */
trait SchemaNodePoolAutoscaling extends StObject {
  
  /**
    * Is autoscaling enabled for this node pool.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Maximum number of nodes in the NodePool. Must be &gt;= min_node_count.
    * There has to enough quota to scale up the cluster.
    */
  var maxNodeCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Minimum number of nodes in the NodePool. Must be &gt;= 1 and &lt;=
    * max_node_count.
    */
  var minNodeCount: js.UndefOr[Double] = js.undefined
}
object SchemaNodePoolAutoscaling {
  
  @scala.inline
  def apply(): SchemaNodePoolAutoscaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodePoolAutoscaling]
  }
  
  @scala.inline
  implicit class SchemaNodePoolAutoscalingMutableBuilder[Self <: SchemaNodePoolAutoscaling] (val x: Self) extends AnyVal {
    
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
