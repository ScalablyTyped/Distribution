package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for CreateJobTrigger.
  */
@js.native
trait SchemaGooglePrivacyDlpV2CreateJobTriggerRequest extends js.Object {
  
  /**
    * The JobTrigger to create.
    */
  var jobTrigger: js.UndefOr[SchemaGooglePrivacyDlpV2JobTrigger] = js.native
  
  /**
    * The trigger id can contain uppercase and lowercase letters, numbers, and
    * hyphens; that is, it must match the regular expression: `[a-zA-Z\\d-_]+`.
    * The maximum length is 100 characters. Can be empty to allow the system to
    * generate one.
    */
  var triggerId: js.UndefOr[String] = js.native
}
object SchemaGooglePrivacyDlpV2CreateJobTriggerRequest {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2CreateJobTriggerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CreateJobTriggerRequest]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2CreateJobTriggerRequestOps[Self <: SchemaGooglePrivacyDlpV2CreateJobTriggerRequest] (val x: Self) extends AnyVal {
    
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
    def setJobTrigger(value: SchemaGooglePrivacyDlpV2JobTrigger): Self = this.set("jobTrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobTrigger: Self = this.set("jobTrigger", js.undefined)
    
    @scala.inline
    def setTriggerId(value: String): Self = this.set("triggerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerId: Self = this.set("triggerId", js.undefined)
  }
}
