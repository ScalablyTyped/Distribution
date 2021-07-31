package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationsResource extends StObject {
  
  var autoscalingPolicies: AutoscalingPoliciesResource
  
  var workflowTemplates: WorkflowTemplatesResource
}
object LocationsResource {
  
  @scala.inline
  def apply(autoscalingPolicies: AutoscalingPoliciesResource, workflowTemplates: WorkflowTemplatesResource): LocationsResource = {
    val __obj = js.Dynamic.literal(autoscalingPolicies = autoscalingPolicies.asInstanceOf[js.Any], workflowTemplates = workflowTemplates.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationsResource]
  }
  
  @scala.inline
  implicit class LocationsResourceMutableBuilder[Self <: LocationsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoscalingPolicies(value: AutoscalingPoliciesResource): Self = StObject.set(x, "autoscalingPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowTemplates(value: WorkflowTemplatesResource): Self = StObject.set(x, "workflowTemplates", value.asInstanceOf[js.Any])
  }
}
