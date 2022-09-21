package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1Task extends StObject {
  
  /**
    * Output only. The time when the task was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Description of the task.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. User friendly display name.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Spec related to how a task is executed.
    */
  var executionSpec: js.UndefOr[SchemaGoogleCloudDataplexV1TaskExecutionSpec] = js.undefined
  
  /**
    * Output only. Status of the latest task executions.
    */
  var executionStatus: js.UndefOr[SchemaGoogleCloudDataplexV1TaskExecutionStatus] = js.undefined
  
  /**
    * Optional. User-defined labels for the task.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Output only. The relative resource name of the task, of the form: projects/{project_number\}/locations/{location_id\}/lakes/{lake_id\}/ tasks/{task_id\}.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Config related to running custom Spark tasks.
    */
  var spark: js.UndefOr[SchemaGoogleCloudDataplexV1TaskSparkTaskConfig] = js.undefined
  
  /**
    * Output only. Current state of the task.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Spec related to how often and when a task should be triggered.
    */
  var triggerSpec: js.UndefOr[SchemaGoogleCloudDataplexV1TaskTriggerSpec] = js.undefined
  
  /**
    * Output only. System generated globally unique ID for the task. This ID will be different if the task is deleted and re-created with the same name.
    */
  var uid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time when the task was last updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1Task {
  
  inline def apply(): SchemaGoogleCloudDataplexV1Task = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1Task]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1Task](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setExecutionSpec(value: SchemaGoogleCloudDataplexV1TaskExecutionSpec): Self = StObject.set(x, "executionSpec", value.asInstanceOf[js.Any])
    
    inline def setExecutionSpecUndefined: Self = StObject.set(x, "executionSpec", js.undefined)
    
    inline def setExecutionStatus(value: SchemaGoogleCloudDataplexV1TaskExecutionStatus): Self = StObject.set(x, "executionStatus", value.asInstanceOf[js.Any])
    
    inline def setExecutionStatusUndefined: Self = StObject.set(x, "executionStatus", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSpark(value: SchemaGoogleCloudDataplexV1TaskSparkTaskConfig): Self = StObject.set(x, "spark", value.asInstanceOf[js.Any])
    
    inline def setSparkUndefined: Self = StObject.set(x, "spark", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTriggerSpec(value: SchemaGoogleCloudDataplexV1TaskTriggerSpec): Self = StObject.set(x, "triggerSpec", value.asInstanceOf[js.Any])
    
    inline def setTriggerSpecUndefined: Self = StObject.set(x, "triggerSpec", js.undefined)
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidNull: Self = StObject.set(x, "uid", null)
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
