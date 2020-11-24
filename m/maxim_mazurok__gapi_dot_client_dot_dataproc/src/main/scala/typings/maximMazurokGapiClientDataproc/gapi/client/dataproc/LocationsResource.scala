package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends js.Object {
  
  var autoscalingPolicies: AutoscalingPoliciesResource = js.native
  
  var workflowTemplates: WorkflowTemplatesResource = js.native
}
object LocationsResource {
  
  @scala.inline
  def apply(autoscalingPolicies: AutoscalingPoliciesResource, workflowTemplates: WorkflowTemplatesResource): LocationsResource = {
    val __obj = js.Dynamic.literal(autoscalingPolicies = autoscalingPolicies.asInstanceOf[js.Any], workflowTemplates = workflowTemplates.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationsResource]
  }
  
  @scala.inline
  implicit class LocationsResourceOps[Self <: LocationsResource] (val x: Self) extends AnyVal {
    
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
    def setAutoscalingPolicies(value: AutoscalingPoliciesResource): Self = this.set("autoscalingPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowTemplates(value: WorkflowTemplatesResource): Self = this.set("workflowTemplates", value.asInstanceOf[js.Any])
  }
}
