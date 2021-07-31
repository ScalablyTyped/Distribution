package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkflowMetadata extends StObject {
  
  /** Output only. The name of the target cluster. */
  var clusterName: js.UndefOr[String] = js.undefined
  
  /** Output only. The UUID of target cluster. */
  var clusterUuid: js.UndefOr[String] = js.undefined
  
  /** Output only. The create cluster operation metadata. */
  var createCluster: js.UndefOr[ClusterOperation] = js.undefined
  
  /** Output only. The delete cluster operation metadata. */
  var deleteCluster: js.UndefOr[ClusterOperation] = js.undefined
  
  /** Output only. Workflow end time. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The workflow graph. */
  var graph: js.UndefOr[WorkflowGraph] = js.undefined
  
  /** Map from parameter names to values that were used for those parameters. */
  var parameters: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.WorkflowMetadata & TopLevel[js.Any]
  ] = js.undefined
  
  /** Output only. Workflow start time. */
  var startTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The workflow state. */
  var state: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The resource name of the workflow template as described in https://cloud.google.com/apis/design/resource_names. For projects.regions.workflowTemplates, the resource
    * name of the template has the following format: projects/{project_id}/regions/{region}/workflowTemplates/{template_id} For projects.locations.workflowTemplates, the resource name of
    * the template has the following format: projects/{project_id}/locations/{location}/workflowTemplates/{template_id}
    */
  var template: js.UndefOr[String] = js.undefined
  
  /** Output only. The version of template at the time of workflow instantiation. */
  var version: js.UndefOr[Double] = js.undefined
}
object WorkflowMetadata {
  
  @scala.inline
  def apply(): WorkflowMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkflowMetadata]
  }
  
  @scala.inline
  implicit class WorkflowMetadataMutableBuilder[Self <: WorkflowMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterNameUndefined: Self = StObject.set(x, "clusterName", js.undefined)
    
    @scala.inline
    def setClusterUuid(value: String): Self = StObject.set(x, "clusterUuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterUuidUndefined: Self = StObject.set(x, "clusterUuid", js.undefined)
    
    @scala.inline
    def setCreateCluster(value: ClusterOperation): Self = StObject.set(x, "createCluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateClusterUndefined: Self = StObject.set(x, "createCluster", js.undefined)
    
    @scala.inline
    def setDeleteCluster(value: ClusterOperation): Self = StObject.set(x, "deleteCluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteClusterUndefined: Self = StObject.set(x, "deleteCluster", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setGraph(value: WorkflowGraph): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphUndefined: Self = StObject.set(x, "graph", js.undefined)
    
    @scala.inline
    def setParameters(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.WorkflowMetadata & TopLevel[js.Any]
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
