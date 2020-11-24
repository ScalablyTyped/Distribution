package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionsResource extends js.Object {
  
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
  implicit class RegionsResourceOps[Self <: RegionsResource] (val x: Self) extends AnyVal {
    
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
    def setClusters(value: ClustersResource): Self = this.set("clusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobs(value: JobsResource): Self = this.set("jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperations(value: OperationsResource): Self = this.set("operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowTemplates(value: WorkflowTemplatesResource): Self = this.set("workflowTemplates", value.asInstanceOf[js.Any])
  }
}
