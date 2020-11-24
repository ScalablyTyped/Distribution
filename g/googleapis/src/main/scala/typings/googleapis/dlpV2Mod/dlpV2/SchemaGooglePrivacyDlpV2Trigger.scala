package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * What event needs to occur for a new job to be started.
  */
@js.native
trait SchemaGooglePrivacyDlpV2Trigger extends js.Object {
  
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
  implicit class SchemaGooglePrivacyDlpV2TriggerOps[Self <: SchemaGooglePrivacyDlpV2Trigger] (val x: Self) extends AnyVal {
    
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
    def setSchedule(value: SchemaGooglePrivacyDlpV2Schedule): Self = this.set("schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchedule: Self = this.set("schedule", js.undefined)
  }
}
