package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Schedule for triggeredJobs.
  */
@js.native
trait SchemaGooglePrivacyDlpV2Schedule extends js.Object {
  
  /**
    * With this option a job is started a regular periodic basis. For example:
    * every day (86400 seconds).  A scheduled start time will be skipped if the
    * previous execution has not ended when its scheduled time occurs.  This
    * value must be set to a time duration greater than or equal to 1 day and
    * can be no longer than 60 days.
    */
  var recurrencePeriodDuration: js.UndefOr[String] = js.native
}
object SchemaGooglePrivacyDlpV2Schedule {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2Schedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Schedule]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ScheduleOps[Self <: SchemaGooglePrivacyDlpV2Schedule] (val x: Self) extends AnyVal {
    
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
    def setRecurrencePeriodDuration(value: String): Self = this.set("recurrencePeriodDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurrencePeriodDuration: Self = this.set("recurrencePeriodDuration", js.undefined)
  }
}
