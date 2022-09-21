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
  
  /** Output only. DAG end time, only set for workflows with dag_timeout when DAG ends. */
  var dagEndTime: js.UndefOr[String] = js.undefined
  
  /** Output only. DAG start time, only set for workflows with dag_timeout when DAG begins. */
  var dagStartTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The timeout duration for the DAG of jobs, expressed in seconds (see JSON representation of duration (https://developers.google.com/protocol-buffers/docs/proto3#json)). */
  var dagTimeout: js.UndefOr[String] = js.undefined
  
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
    */ typings.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.WorkflowMetadata & TopLevel[Any]
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
  
  inline def apply(): WorkflowMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkflowMetadata]
  }
  
  extension [Self <: WorkflowMetadata](x: Self) {
    
    inline def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    inline def setClusterNameUndefined: Self = StObject.set(x, "clusterName", js.undefined)
    
    inline def setClusterUuid(value: String): Self = StObject.set(x, "clusterUuid", value.asInstanceOf[js.Any])
    
    inline def setClusterUuidUndefined: Self = StObject.set(x, "clusterUuid", js.undefined)
    
    inline def setCreateCluster(value: ClusterOperation): Self = StObject.set(x, "createCluster", value.asInstanceOf[js.Any])
    
    inline def setCreateClusterUndefined: Self = StObject.set(x, "createCluster", js.undefined)
    
    inline def setDagEndTime(value: String): Self = StObject.set(x, "dagEndTime", value.asInstanceOf[js.Any])
    
    inline def setDagEndTimeUndefined: Self = StObject.set(x, "dagEndTime", js.undefined)
    
    inline def setDagStartTime(value: String): Self = StObject.set(x, "dagStartTime", value.asInstanceOf[js.Any])
    
    inline def setDagStartTimeUndefined: Self = StObject.set(x, "dagStartTime", js.undefined)
    
    inline def setDagTimeout(value: String): Self = StObject.set(x, "dagTimeout", value.asInstanceOf[js.Any])
    
    inline def setDagTimeoutUndefined: Self = StObject.set(x, "dagTimeout", js.undefined)
    
    inline def setDeleteCluster(value: ClusterOperation): Self = StObject.set(x, "deleteCluster", value.asInstanceOf[js.Any])
    
    inline def setDeleteClusterUndefined: Self = StObject.set(x, "deleteCluster", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setGraph(value: WorkflowGraph): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
    
    inline def setGraphUndefined: Self = StObject.set(x, "graph", js.undefined)
    
    inline def setParameters(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.WorkflowMetadata & TopLevel[Any]
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
