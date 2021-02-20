package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionsResource extends StObject {
  
  var autoscalingPolicies: AutoscalingPoliciesResource = js.native
  
  var clusters: ClustersResource = js.native
  
  var jobs: JobsResource = js.native
  
  var operations: OperationsResource = js.native
  
  var workflowTemplates: WorkflowTemplatesResource = js.native
}
object RegionsResource {
  
  @scala.inline
  def apply(
    autoscalingPolicies: AutoscalingPoliciesResource,
    clusters: ClustersResource,
    jobs: JobsResource,
    operations: OperationsResource,
    workflowTemplates: WorkflowTemplatesResource
  ): RegionsResource = {
    val __obj = js.Dynamic.literal(autoscalingPolicies = autoscalingPolicies.asInstanceOf[js.Any], clusters = clusters.asInstanceOf[js.Any], jobs = jobs.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], workflowTemplates = workflowTemplates.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegionsResource]
  }
  
  @scala.inline
  implicit class RegionsResourceMutableBuilder[Self <: RegionsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoscalingPolicies(value: AutoscalingPoliciesResource): Self = StObject.set(x, "autoscalingPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusters(value: ClustersResource): Self = StObject.set(x, "clusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobs(value: JobsResource): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperations(value: OperationsResource): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowTemplates(value: WorkflowTemplatesResource): Self = StObject.set(x, "workflowTemplates", value.asInstanceOf[js.Any])
  }
}
