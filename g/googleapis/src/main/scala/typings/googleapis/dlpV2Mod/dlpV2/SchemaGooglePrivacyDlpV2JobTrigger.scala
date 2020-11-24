package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains a configuration to make dlp api calls on a repeating basis. See
  * https://cloud.google.com/dlp/docs/concepts-job-triggers to learn more.
  */
@js.native
trait SchemaGooglePrivacyDlpV2JobTrigger extends js.Object {
  
  /**
    * The creation timestamp of a triggeredJob, output only field.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * User provided description (max 256 chars)
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Display name (max 100 chars)
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * A stream of errors encountered when the trigger was activated. Repeated
    * errors may result in the JobTrigger automatically being paused. Will
    * return the last 100 errors. Whenever the JobTrigger is modified this list
    * will be cleared. Output only field.
    */
  var errors: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Error]] = js.native
  
  var inspectJob: js.UndefOr[SchemaGooglePrivacyDlpV2InspectJobConfig] = js.native
  
  /**
    * The timestamp of the last time this trigger executed, output only field.
    */
  var lastRunTime: js.UndefOr[String] = js.native
  
  /**
    * Unique resource name for the triggeredJob, assigned by the service when
    * the triggeredJob is created, for example
    * `projects/dlp-test-project/triggeredJobs/53234423`.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * A status for this trigger. [required]
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * A list of triggers which will be OR&#39;ed together. Only one in the list
    * needs to trigger for a job to be started. The list may contain only a
    * single Schedule trigger and must have at least one object.
    */
  var triggers: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Trigger]] = js.native
  
  /**
    * The last update timestamp of a triggeredJob, output only field.
    */
  var updateTime: js.UndefOr[String] = js.native
}
object SchemaGooglePrivacyDlpV2JobTrigger {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2JobTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2JobTrigger]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2JobTriggerOps[Self <: SchemaGooglePrivacyDlpV2JobTrigger] (val x: Self) extends AnyVal {
    
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: SchemaGooglePrivacyDlpV2Error*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[SchemaGooglePrivacyDlpV2Error]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    
    @scala.inline
    def setInspectJob(value: SchemaGooglePrivacyDlpV2InspectJobConfig): Self = this.set("inspectJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInspectJob: Self = this.set("inspectJob", js.undefined)
    
    @scala.inline
    def setLastRunTime(value: String): Self = this.set("lastRunTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastRunTime: Self = this.set("lastRunTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTriggersVarargs(value: SchemaGooglePrivacyDlpV2Trigger*): Self = this.set("triggers", js.Array(value :_*))
    
    @scala.inline
    def setTriggers(value: js.Array[SchemaGooglePrivacyDlpV2Trigger]): Self = this.set("triggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggers: Self = this.set("triggers", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
