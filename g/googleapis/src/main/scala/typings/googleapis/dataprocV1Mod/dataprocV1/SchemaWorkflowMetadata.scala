package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Cloud Dataproc workflow template resource.
  */
trait SchemaWorkflowMetadata extends StObject {
  
  /**
    * Output only. The name of the target cluster.
    */
  var clusterName: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The UUID of target cluster.
    */
  var clusterUuid: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The create cluster operation metadata.
    */
  var createCluster: js.UndefOr[SchemaClusterOperation] = js.undefined
  
  /**
    * Output only. The delete cluster operation metadata.
    */
  var deleteCluster: js.UndefOr[SchemaClusterOperation] = js.undefined
  
  /**
    * Output only. Workflow end time.
    */
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The workflow graph.
    */
  var graph: js.UndefOr[SchemaWorkflowGraph] = js.undefined
  
  /**
    * Map from parameter names to values that were used for those parameters.
    */
  var parameters: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * Output only. Workflow start time.
    */
  var startTime: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The workflow state.
    */
  var state: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The &quot;resource name&quot; of the template.
    */
  var template: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The version of template at the time of workflow
    * instantiation.
    */
  var version: js.UndefOr[Double] = js.undefined
}
object SchemaWorkflowMetadata {
  
  @scala.inline
  def apply(): SchemaWorkflowMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkflowMetadata]
  }
  
  @scala.inline
  implicit class SchemaWorkflowMetadataMutableBuilder[Self <: SchemaWorkflowMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterNameUndefined: Self = StObject.set(x, "clusterName", js.undefined)
    
    @scala.inline
    def setClusterUuid(value: String): Self = StObject.set(x, "clusterUuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterUuidUndefined: Self = StObject.set(x, "clusterUuid", js.undefined)
    
    @scala.inline
    def setCreateCluster(value: SchemaClusterOperation): Self = StObject.set(x, "createCluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateClusterUndefined: Self = StObject.set(x, "createCluster", js.undefined)
    
    @scala.inline
    def setDeleteCluster(value: SchemaClusterOperation): Self = StObject.set(x, "deleteCluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteClusterUndefined: Self = StObject.set(x, "deleteCluster", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setGraph(value: SchemaWorkflowGraph): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphUndefined: Self = StObject.set(x, "graph", js.undefined)
    
    @scala.inline
    def setParameters(value: StringDictionary[String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
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
