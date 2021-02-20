package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for CreateJobTrigger.
  */
@js.native
trait SchemaGooglePrivacyDlpV2CreateJobTriggerRequest extends StObject {
  
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
  implicit class SchemaGooglePrivacyDlpV2CreateJobTriggerRequestMutableBuilder[Self <: SchemaGooglePrivacyDlpV2CreateJobTriggerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobTrigger(value: SchemaGooglePrivacyDlpV2JobTrigger): Self = StObject.set(x, "jobTrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobTriggerUndefined: Self = StObject.set(x, "jobTrigger", js.undefined)
    
    @scala.inline
    def setTriggerId(value: String): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerIdUndefined: Self = StObject.set(x, "triggerId", js.undefined)
  }
}
