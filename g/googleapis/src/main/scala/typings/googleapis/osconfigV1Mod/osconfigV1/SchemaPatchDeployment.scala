package typings.googleapis.osconfigV1Mod.osconfigV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPatchDeployment extends StObject {
  
  /**
    * Output only. Time the patch deployment was created. Timestamp is in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Description of the patch deployment. Length of the description is limited to 1024 characters.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Duration of the patch. After the duration ends, the patch times out.
    */
  var duration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. VM instances to patch.
    */
  var instanceFilter: js.UndefOr[SchemaPatchInstanceFilter] = js.undefined
  
  /**
    * Output only. The last time a patch job was started by this deployment. Timestamp is in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
    */
  var lastExecuteTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Unique name for the patch deployment resource in a project. The patch deployment name is in the form: `projects/{project_id\}/patchDeployments/{patch_deployment_id\}`. This field is ignored when you create a new patch deployment.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Schedule a one-time execution.
    */
  var oneTimeSchedule: js.UndefOr[SchemaOneTimeSchedule] = js.undefined
  
  /**
    * Optional. Patch configuration that is applied.
    */
  var patchConfig: js.UndefOr[SchemaPatchConfig] = js.undefined
  
  /**
    * Required. Schedule recurring executions.
    */
  var recurringSchedule: js.UndefOr[SchemaRecurringSchedule] = js.undefined
  
  /**
    * Optional. Rollout strategy of the patch job.
    */
  var rollout: js.UndefOr[SchemaPatchRollout] = js.undefined
  
  /**
    * Output only. Current state of the patch deployment.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Time the patch deployment was last updated. Timestamp is in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaPatchDeployment {
  
  inline def apply(): SchemaPatchDeployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPatchDeployment]
  }
  
  extension [Self <: SchemaPatchDeployment](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationNull: Self = StObject.set(x, "duration", null)
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setInstanceFilter(value: SchemaPatchInstanceFilter): Self = StObject.set(x, "instanceFilter", value.asInstanceOf[js.Any])
    
    inline def setInstanceFilterUndefined: Self = StObject.set(x, "instanceFilter", js.undefined)
    
    inline def setLastExecuteTime(value: String): Self = StObject.set(x, "lastExecuteTime", value.asInstanceOf[js.Any])
    
    inline def setLastExecuteTimeNull: Self = StObject.set(x, "lastExecuteTime", null)
    
    inline def setLastExecuteTimeUndefined: Self = StObject.set(x, "lastExecuteTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOneTimeSchedule(value: SchemaOneTimeSchedule): Self = StObject.set(x, "oneTimeSchedule", value.asInstanceOf[js.Any])
    
    inline def setOneTimeScheduleUndefined: Self = StObject.set(x, "oneTimeSchedule", js.undefined)
    
    inline def setPatchConfig(value: SchemaPatchConfig): Self = StObject.set(x, "patchConfig", value.asInstanceOf[js.Any])
    
    inline def setPatchConfigUndefined: Self = StObject.set(x, "patchConfig", js.undefined)
    
    inline def setRecurringSchedule(value: SchemaRecurringSchedule): Self = StObject.set(x, "recurringSchedule", value.asInstanceOf[js.Any])
    
    inline def setRecurringScheduleUndefined: Self = StObject.set(x, "recurringSchedule", js.undefined)
    
    inline def setRollout(value: SchemaPatchRollout): Self = StObject.set(x, "rollout", value.asInstanceOf[js.Any])
    
    inline def setRolloutUndefined: Self = StObject.set(x, "rollout", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
