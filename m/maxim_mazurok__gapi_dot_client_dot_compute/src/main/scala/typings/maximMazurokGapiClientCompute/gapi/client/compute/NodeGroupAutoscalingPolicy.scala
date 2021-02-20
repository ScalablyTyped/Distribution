package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeGroupAutoscalingPolicy extends StObject {
  
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
  implicit class NodeGroupAutoscalingPolicyMutableBuilder[Self <: NodeGroupAutoscalingPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxNodes(value: Double): Self = StObject.set(x, "maxNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxNodesUndefined: Self = StObject.set(x, "maxNodes", js.undefined)
    
    @scala.inline
    def setMinNodes(value: Double): Self = StObject.set(x, "minNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinNodesUndefined: Self = StObject.set(x, "minNodes", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
