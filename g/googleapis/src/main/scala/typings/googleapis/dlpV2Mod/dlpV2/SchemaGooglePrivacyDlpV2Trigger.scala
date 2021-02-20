package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * What event needs to occur for a new job to be started.
  */
@js.native
trait SchemaGooglePrivacyDlpV2Trigger extends StObject {
  
  /**
    * Create a job on a repeating basis based on the elapse of time.
    */
  var schedule: js.UndefOr[SchemaGooglePrivacyDlpV2Schedule] = js.native
}
object SchemaGooglePrivacyDlpV2Trigger {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2Trigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Trigger]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2TriggerMutableBuilder[Self <: SchemaGooglePrivacyDlpV2Trigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSchedule(value: SchemaGooglePrivacyDlpV2Schedule): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
  }
}
