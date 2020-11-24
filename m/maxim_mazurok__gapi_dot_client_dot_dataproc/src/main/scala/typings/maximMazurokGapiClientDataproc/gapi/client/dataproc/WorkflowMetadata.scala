package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkflowMetadata extends js.Object {
  
  /** Output only. The name of the target cluster. */
  var clusterName: js.UndefOr[String] = js.native
  
  /** Output only. The UUID of target cluster. */
  var clusterUuid: js.UndefOr[String] = js.native
  
  /** Output only. The create cluster operation metadata. */
  var createCluster: js.UndefOr[ClusterOperation] = js.native
  
  /** Output only. The delete cluster operation metadata. */
  var deleteCluster: js.UndefOr[ClusterOperation] = js.native
  
  /** Output only. Workflow end time. */
  var endTime: js.UndefOr[String] = js.native
  
  /** Output only. The workflow graph. */
  var graph: js.UndefOr[WorkflowGraph] = js.native
  
  /** Map from parameter names to values that were used for those parameters. */
  var parameters: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.WorkflowMetadata with TopLevel[js.Any]
  ] = js.native
  
  /** Output only. Workflow start time. */
  var startTime: js.UndefOr[String] = js.native
  
  /** Output only. The workflow state. */
  var state: js.UndefOr[String] = js.native
  
  /**
    * Output only. The resource name of the workflow template as described in https://cloud.google.com/apis/design/resource_names. For projects.regions.workflowTemplates, the resource
    * name of the template has the following format: projects/{project_id}/regions/{region}/workflowTemplates/{template_id} For projects.locations.workflowTemplates, the resource name of
    * the template has the following format: projects/{project_id}/locations/{location}/workflowTemplates/{template_id}
    */
  var template: js.UndefOr[String] = js.native
  
  /** Output only. The version of template at the time of workflow instantiation. */
  var version: js.UndefOr[Double] = js.native
}
object WorkflowMetadata {
  
  @scala.inline
  def apply(): WorkflowMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkflowMetadata]
  }
  
  @scala.inline
  implicit class WorkflowMetadataOps[Self <: WorkflowMetadata] (val x: Self) extends AnyVal {
    
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
    def setClusterName(value: String): Self = this.set("clusterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterName: Self = this.set("clusterName", js.undefined)
    
    @scala.inline
    def setClusterUuid(value: String): Self = this.set("clusterUuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterUuid: Self = this.set("clusterUuid", js.undefined)
    
    @scala.inline
    def setCreateCluster(value: ClusterOperation): Self = this.set("createCluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateCluster: Self = this.set("createCluster", js.undefined)
    
    @scala.inline
    def setDeleteCluster(value: ClusterOperation): Self = this.set("deleteCluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteCluster: Self = this.set("deleteCluster", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setGraph(value: WorkflowGraph): Self = this.set("graph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGraph: Self = this.set("graph", js.undefined)
    
    @scala.inline
    def setParameters(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.WorkflowMetadata with TopLevel[js.Any]
    ): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
