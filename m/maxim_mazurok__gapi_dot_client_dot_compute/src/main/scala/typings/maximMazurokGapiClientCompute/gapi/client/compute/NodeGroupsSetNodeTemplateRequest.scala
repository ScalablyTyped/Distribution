package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeGroupsSetNodeTemplateRequest extends StObject {
  
  /** Full or partial URL of the node template resource to be updated for this node group. */
  var nodeTemplate: js.UndefOr[String] = js.undefined
}
object NodeGroupsSetNodeTemplateRequest {
  
  @scala.inline
  def apply(): NodeGroupsSetNodeTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeGroupsSetNodeTemplateRequest]
  }
  
  @scala.inline
  implicit class NodeGroupsSetNodeTemplateRequestMutableBuilder[Self <: NodeGroupsSetNodeTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeTemplate(value: String): Self = StObject.set(x, "nodeTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeTemplateUndefined: Self = StObject.set(x, "nodeTemplate", js.undefined)
  }
}
