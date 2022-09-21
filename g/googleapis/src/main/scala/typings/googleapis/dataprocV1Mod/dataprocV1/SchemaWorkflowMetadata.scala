package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWorkflowMetadata extends StObject {
  
  /**
    * Output only. The name of the target cluster.
    */
  var clusterName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The UUID of target cluster.
    */
  var clusterUuid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The create cluster operation metadata.
    */
  var createCluster: js.UndefOr[SchemaClusterOperation] = js.undefined
  
  /**
    * Output only. DAG end time, only set for workflows with dag_timeout when DAG ends.
    */
  var dagEndTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. DAG start time, only set for workflows with dag_timeout when DAG begins.
    */
  var dagStartTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The timeout duration for the DAG of jobs, expressed in seconds (see JSON representation of duration (https://developers.google.com/protocol-buffers/docs/proto3#json)).
    */
  var dagTimeout: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The delete cluster operation metadata.
    */
  var deleteCluster: js.UndefOr[SchemaClusterOperation] = js.undefined
  
  /**
    * Output only. Workflow end time.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The workflow graph.
    */
  var graph: js.UndefOr[SchemaWorkflowGraph] = js.undefined
  
  /**
    * Map from parameter names to values that were used for those parameters.
    */
  var parameters: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Output only. Workflow start time.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The workflow state.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The resource name of the workflow template as described in https://cloud.google.com/apis/design/resource_names. For projects.regions.workflowTemplates, the resource name of the template has the following format: projects/{project_id\}/regions/{region\}/workflowTemplates/{template_id\} For projects.locations.workflowTemplates, the resource name of the template has the following format: projects/{project_id\}/locations/{location\}/workflowTemplates/{template_id\}
    */
  var template: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The version of template at the time of workflow instantiation.
    */
  var version: js.UndefOr[Double | Null] = js.undefined
}
object SchemaWorkflowMetadata {
  
  inline def apply(): SchemaWorkflowMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkflowMetadata]
  }
  
  extension [Self <: SchemaWorkflowMetadata](x: Self) {
    
    inline def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    inline def setClusterNameNull: Self = StObject.set(x, "clusterName", null)
    
    inline def setClusterNameUndefined: Self = StObject.set(x, "clusterName", js.undefined)
    
    inline def setClusterUuid(value: String): Self = StObject.set(x, "clusterUuid", value.asInstanceOf[js.Any])
    
    inline def setClusterUuidNull: Self = StObject.set(x, "clusterUuid", null)
    
    inline def setClusterUuidUndefined: Self = StObject.set(x, "clusterUuid", js.undefined)
    
    inline def setCreateCluster(value: SchemaClusterOperation): Self = StObject.set(x, "createCluster", value.asInstanceOf[js.Any])
    
    inline def setCreateClusterUndefined: Self = StObject.set(x, "createCluster", js.undefined)
    
    inline def setDagEndTime(value: String): Self = StObject.set(x, "dagEndTime", value.asInstanceOf[js.Any])
    
    inline def setDagEndTimeNull: Self = StObject.set(x, "dagEndTime", null)
    
    inline def setDagEndTimeUndefined: Self = StObject.set(x, "dagEndTime", js.undefined)
    
    inline def setDagStartTime(value: String): Self = StObject.set(x, "dagStartTime", value.asInstanceOf[js.Any])
    
    inline def setDagStartTimeNull: Self = StObject.set(x, "dagStartTime", null)
    
    inline def setDagStartTimeUndefined: Self = StObject.set(x, "dagStartTime", js.undefined)
    
    inline def setDagTimeout(value: String): Self = StObject.set(x, "dagTimeout", value.asInstanceOf[js.Any])
    
    inline def setDagTimeoutNull: Self = StObject.set(x, "dagTimeout", null)
    
    inline def setDagTimeoutUndefined: Self = StObject.set(x, "dagTimeout", js.undefined)
    
    inline def setDeleteCluster(value: SchemaClusterOperation): Self = StObject.set(x, "deleteCluster", value.asInstanceOf[js.Any])
    
    inline def setDeleteClusterUndefined: Self = StObject.set(x, "deleteCluster", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setGraph(value: SchemaWorkflowGraph): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
    
    inline def setGraphUndefined: Self = StObject.set(x, "graph", js.undefined)
    
    inline def setParameters(value: StringDictionary[String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersNull: Self = StObject.set(x, "parameters", null)
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateNull: Self = StObject.set(x, "template", null)
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
