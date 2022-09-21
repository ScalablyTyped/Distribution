package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationsResource extends StObject {
  
  var autoscalingPolicies: AutoscalingPoliciesResource
  
  var batches: BatchesResource
  
  var workflowTemplates: WorkflowTemplatesResource
}
object LocationsResource {
  
  inline def apply(
    autoscalingPolicies: AutoscalingPoliciesResource,
    batches: BatchesResource,
    workflowTemplates: WorkflowTemplatesResource
  ): LocationsResource = {
    val __obj = js.Dynamic.literal(autoscalingPolicies = autoscalingPolicies.asInstanceOf[js.Any], batches = batches.asInstanceOf[js.Any], workflowTemplates = workflowTemplates.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationsResource]
  }
  
  extension [Self <: LocationsResource](x: Self) {
    
    inline def setAutoscalingPolicies(value: AutoscalingPoliciesResource): Self = StObject.set(x, "autoscalingPolicies", value.asInstanceOf[js.Any])
    
    inline def setBatches(value: BatchesResource): Self = StObject.set(x, "batches", value.asInstanceOf[js.Any])
    
    inline def setWorkflowTemplates(value: WorkflowTemplatesResource): Self = StObject.set(x, "workflowTemplates", value.asInstanceOf[js.Any])
  }
}
