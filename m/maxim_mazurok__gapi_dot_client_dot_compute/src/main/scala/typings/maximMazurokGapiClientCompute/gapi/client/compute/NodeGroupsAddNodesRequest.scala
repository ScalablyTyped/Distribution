package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeGroupsAddNodesRequest extends StObject {
  
  /** Count of additional nodes to be added to the node group. */
  var additionalNodeCount: js.UndefOr[Double] = js.undefined
}
object NodeGroupsAddNodesRequest {
  
  inline def apply(): NodeGroupsAddNodesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeGroupsAddNodesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeGroupsAddNodesRequest] (val x: Self) extends AnyVal {
    
    inline def setAdditionalNodeCount(value: Double): Self = StObject.set(x, "additionalNodeCount", value.asInstanceOf[js.Any])
    
    inline def setAdditionalNodeCountUndefined: Self = StObject.set(x, "additionalNodeCount", js.undefined)
  }
}
