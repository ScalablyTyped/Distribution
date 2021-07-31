package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Schedule for triggeredJobs.
  */
trait SchemaGooglePrivacyDlpV2Schedule extends StObject {
  
  /**
    * With this option a job is started a regular periodic basis. For example:
    * every day (86400 seconds).  A scheduled start time will be skipped if the
    * previous execution has not ended when its scheduled time occurs.  This
    * value must be set to a time duration greater than or equal to 1 day and
    * can be no longer than 60 days.
    */
  var recurrencePeriodDuration: js.UndefOr[String] = js.undefined
}
object SchemaGooglePrivacyDlpV2Schedule {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2Schedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Schedule]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ScheduleMutableBuilder[Self <: SchemaGooglePrivacyDlpV2Schedule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecurrencePeriodDuration(value: String): Self = StObject.set(x, "recurrencePeriodDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecurrencePeriodDurationUndefined: Self = StObject.set(x, "recurrencePeriodDuration", js.undefined)
  }
}
