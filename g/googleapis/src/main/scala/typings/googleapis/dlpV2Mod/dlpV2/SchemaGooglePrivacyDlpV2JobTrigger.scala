package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2JobTrigger extends StObject {
  
  /**
    * Output only. The creation timestamp of a triggeredJob.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User provided description (max 256 chars)
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Display name (max 100 chars)
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. A stream of errors encountered when the trigger was activated. Repeated errors may result in the JobTrigger automatically being paused. Will return the last 100 errors. Whenever the JobTrigger is modified this list will be cleared.
    */
  var errors: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Error]] = js.undefined
  
  /**
    * For inspect jobs, a snapshot of the configuration.
    */
  var inspectJob: js.UndefOr[SchemaGooglePrivacyDlpV2InspectJobConfig] = js.undefined
  
  /**
    * Output only. The timestamp of the last time this trigger executed.
    */
  var lastRunTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Unique resource name for the triggeredJob, assigned by the service when the triggeredJob is created, for example `projects/dlp-test-project/jobTriggers/53234423`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. A status for this trigger.
    */
  var status: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of triggers which will be OR'ed together. Only one in the list needs to trigger for a job to be started. The list may contain only a single Schedule trigger and must have at least one object.
    */
  var triggers: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Trigger]] = js.undefined
  
  /**
    * Output only. The last update timestamp of a triggeredJob.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2JobTrigger {
  
  inline def apply(): SchemaGooglePrivacyDlpV2JobTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2JobTrigger]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2JobTrigger](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setErrors(value: js.Array[SchemaGooglePrivacyDlpV2Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: SchemaGooglePrivacyDlpV2Error*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setInspectJob(value: SchemaGooglePrivacyDlpV2InspectJobConfig): Self = StObject.set(x, "inspectJob", value.asInstanceOf[js.Any])
    
    inline def setInspectJobUndefined: Self = StObject.set(x, "inspectJob", js.undefined)
    
    inline def setLastRunTime(value: String): Self = StObject.set(x, "lastRunTime", value.asInstanceOf[js.Any])
    
    inline def setLastRunTimeNull: Self = StObject.set(x, "lastRunTime", null)
    
    inline def setLastRunTimeUndefined: Self = StObject.set(x, "lastRunTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTriggers(value: js.Array[SchemaGooglePrivacyDlpV2Trigger]): Self = StObject.set(x, "triggers", value.asInstanceOf[js.Any])
    
    inline def setTriggersUndefined: Self = StObject.set(x, "triggers", js.undefined)
    
    inline def setTriggersVarargs(value: SchemaGooglePrivacyDlpV2Trigger*): Self = StObject.set(x, "triggers", js.Array(value*))
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
