package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains a configuration to make dlp api calls on a repeating basis. See
  * https://cloud.google.com/dlp/docs/concepts-job-triggers to learn more.
  */
trait SchemaGooglePrivacyDlpV2JobTrigger extends StObject {
  
  /**
    * The creation timestamp of a triggeredJob, output only field.
    */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * User provided description (max 256 chars)
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Display name (max 100 chars)
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * A stream of errors encountered when the trigger was activated. Repeated
    * errors may result in the JobTrigger automatically being paused. Will
    * return the last 100 errors. Whenever the JobTrigger is modified this list
    * will be cleared. Output only field.
    */
  var errors: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Error]] = js.undefined
  
  var inspectJob: js.UndefOr[SchemaGooglePrivacyDlpV2InspectJobConfig] = js.undefined
  
  /**
    * The timestamp of the last time this trigger executed, output only field.
    */
  var lastRunTime: js.UndefOr[String] = js.undefined
  
  /**
    * Unique resource name for the triggeredJob, assigned by the service when
    * the triggeredJob is created, for example
    * `projects/dlp-test-project/triggeredJobs/53234423`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * A status for this trigger. [required]
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * A list of triggers which will be OR&#39;ed together. Only one in the list
    * needs to trigger for a job to be started. The list may contain only a
    * single Schedule trigger and must have at least one object.
    */
  var triggers: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Trigger]] = js.undefined
  
  /**
    * The last update timestamp of a triggeredJob, output only field.
    */
  var updateTime: js.UndefOr[String] = js.undefined
}
object SchemaGooglePrivacyDlpV2JobTrigger {
  
  inline def apply(): SchemaGooglePrivacyDlpV2JobTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2JobTrigger]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2JobTrigger](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setErrors(value: js.Array[SchemaGooglePrivacyDlpV2Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: SchemaGooglePrivacyDlpV2Error*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    inline def setInspectJob(value: SchemaGooglePrivacyDlpV2InspectJobConfig): Self = StObject.set(x, "inspectJob", value.asInstanceOf[js.Any])
    
    inline def setInspectJobUndefined: Self = StObject.set(x, "inspectJob", js.undefined)
    
    inline def setLastRunTime(value: String): Self = StObject.set(x, "lastRunTime", value.asInstanceOf[js.Any])
    
    inline def setLastRunTimeUndefined: Self = StObject.set(x, "lastRunTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTriggers(value: js.Array[SchemaGooglePrivacyDlpV2Trigger]): Self = StObject.set(x, "triggers", value.asInstanceOf[js.Any])
    
    inline def setTriggersUndefined: Self = StObject.set(x, "triggers", js.undefined)
    
    inline def setTriggersVarargs(value: SchemaGooglePrivacyDlpV2Trigger*): Self = StObject.set(x, "triggers", js.Array(value :_*))
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
