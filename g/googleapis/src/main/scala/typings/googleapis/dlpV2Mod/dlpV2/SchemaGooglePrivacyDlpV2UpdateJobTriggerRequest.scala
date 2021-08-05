package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for UpdateJobTrigger.
  */
trait SchemaGooglePrivacyDlpV2UpdateJobTriggerRequest extends StObject {
  
  /**
    * New JobTrigger value.
    */
  var jobTrigger: js.UndefOr[SchemaGooglePrivacyDlpV2JobTrigger] = js.undefined
  
  /**
    * Mask to control which fields get updated.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object SchemaGooglePrivacyDlpV2UpdateJobTriggerRequest {
  
  inline def apply(): SchemaGooglePrivacyDlpV2UpdateJobTriggerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2UpdateJobTriggerRequest]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2UpdateJobTriggerRequest](x: Self) {
    
    inline def setJobTrigger(value: SchemaGooglePrivacyDlpV2JobTrigger): Self = StObject.set(x, "jobTrigger", value.asInstanceOf[js.Any])
    
    inline def setJobTriggerUndefined: Self = StObject.set(x, "jobTrigger", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
