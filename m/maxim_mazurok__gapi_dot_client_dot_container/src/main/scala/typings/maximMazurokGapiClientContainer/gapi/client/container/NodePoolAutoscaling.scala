package typings.maximMazurokGapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodePoolAutoscaling extends js.Object {
  
  /** Can this node pool be deleted automatically. */
  var autoprovisioned: js.UndefOr[Boolean] = js.native
  
  /** Is autoscaling enabled for this node pool. */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /** Maximum number of nodes in the NodePool. Must be >= min_node_count. There has to enough quota to scale up the cluster. */
  var maxNodeCount: js.UndefOr[Double] = js.native
  
  /** Minimum number of nodes in the NodePool. Must be >= 1 and <= max_node_count. */
  var minNodeCount: js.UndefOr[Double] = js.native
}
object NodePoolAutoscaling {
  
  @scala.inline
  def apply(): NodePoolAutoscaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodePoolAutoscaling]
  }
  
  @scala.inline
  implicit class NodePoolAutoscalingOps[Self <: NodePoolAutoscaling] (val x: Self) extends AnyVal {
    
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
