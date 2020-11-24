package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeGroupAutoscalingPolicy extends js.Object {
  
  /** The maximum number of nodes that the group should have. Must be set if autoscaling is enabled. Maximum value allowed is 100. */
  var maxNodes: js.UndefOr[Double] = js.native
  
  /** The minimum number of nodes that the group should have. */
  var minNodes: js.UndefOr[Double] = js.native
  
  /** The autoscaling mode. Set to one of: ON, OFF, or ONLY_SCALE_OUT. For more information, see  Autoscaler modes. */
  var mode: js.UndefOr[String] = js.native
}
object NodeGroupAutoscalingPolicy {
  
  @scala.inline
  def apply(): NodeGroupAutoscalingPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeGroupAutoscalingPolicy]
  }
  
  @scala.inline
  implicit class NodeGroupAutoscalingPolicyOps[Self <: NodeGroupAutoscalingPolicy] (val x: Self) extends AnyVal {
    
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
    def setMaxNodes(value: Double): Self = this.set("maxNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxNodes: Self = this.set("maxNodes", js.undefined)
    
    @scala.inline
    def setMinNodes(value: Double): Self = this.set("minNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinNodes: Self = this.set("minNodes", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
}
