package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NodePoolAutoscaling contains information required by cluster autoscaler to
  * adjust the size of the node pool to the current cluster usage.
  */
@js.native
trait SchemaNodePoolAutoscaling extends js.Object {
  
  /**
    * Can this node pool be deleted automatically.
    */
  var autoprovisioned: js.UndefOr[Boolean] = js.native
  
  /**
    * Is autoscaling enabled for this node pool.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Maximum number of nodes in the NodePool. Must be &gt;= min_node_count.
    * There has to enough quota to scale up the cluster.
    */
  var maxNodeCount: js.UndefOr[Double] = js.native
  
  /**
    * Minimum number of nodes in the NodePool. Must be &gt;= 1 and &lt;=
    * max_node_count.
    */
  var minNodeCount: js.UndefOr[Double] = js.native
}
object SchemaNodePoolAutoscaling {
  
  @scala.inline
  def apply(): SchemaNodePoolAutoscaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodePoolAutoscaling]
  }
  
  @scala.inline
  implicit class SchemaNodePoolAutoscalingOps[Self <: SchemaNodePoolAutoscaling] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoprovisioned(value: Boolean): Self = this.set("autoprovisioned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoprovisioned: Self = this.set("autoprovisioned", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setMaxNodeCount(value: Double): Self = this.set("maxNodeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxNodeCount: Self = this.set("maxNodeCount", js.undefined)
    
    @scala.inline
    def setMinNodeCount(value: Double): Self = this.set("minNodeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinNodeCount: Self = this.set("minNodeCount", js.undefined)
  }
}
