package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for CreateJobTrigger.
  */
trait SchemaGooglePrivacyDlpV2CreateJobTriggerRequest extends StObject {
  
  /**
    * The JobTrigger to create.
    */
  var jobTrigger: js.UndefOr[SchemaGooglePrivacyDlpV2JobTrigger] = js.undefined
  
  /**
    * The trigger id can contain uppercase and lowercase letters, numbers, and
    * hyphens; that is, it must match the regular expression: `[a-zA-Z\\d-_]+`.
    * The maximum length is 100 characters. Can be empty to allow the system to
    * generate one.
    */
  var triggerId: js.UndefOr[String] = js.undefined
}
object SchemaGooglePrivacyDlpV2CreateJobTriggerRequest {
  
  inline def apply(): SchemaGooglePrivacyDlpV2CreateJobTriggerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CreateJobTriggerRequest]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2CreateJobTriggerRequest](x: Self) {
    
    inline def setJobTrigger(value: SchemaGooglePrivacyDlpV2JobTrigger): Self = StObject.set(x, "jobTrigger", value.asInstanceOf[js.Any])
    
    inline def setJobTriggerUndefined: Self = StObject.set(x, "jobTrigger", js.undefined)
    
    inline def setTriggerId(value: String): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    inline def setTriggerIdUndefined: Self = StObject.set(x, "triggerId", js.undefined)
  }
}
