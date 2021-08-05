package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * What event needs to occur for a new job to be started.
  */
trait SchemaGooglePrivacyDlpV2Trigger extends StObject {
  
  /**
    * Create a job on a repeating basis based on the elapse of time.
    */
  var schedule: js.UndefOr[SchemaGooglePrivacyDlpV2Schedule] = js.undefined
}
object SchemaGooglePrivacyDlpV2Trigger {
  
  inline def apply(): SchemaGooglePrivacyDlpV2Trigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Trigger]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2Trigger](x: Self) {
    
    inline def setSchedule(value: SchemaGooglePrivacyDlpV2Schedule): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
  }
}
