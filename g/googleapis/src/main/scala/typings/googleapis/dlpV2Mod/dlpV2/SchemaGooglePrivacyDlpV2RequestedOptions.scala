package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaGooglePrivacyDlpV2RequestedOptions extends js.Object {
  
  var jobConfig: js.UndefOr[SchemaGooglePrivacyDlpV2InspectJobConfig] = js.native
  
  /**
    * If run with an InspectTemplate, a snapshot of its state at the time of
    * this run.
    */
  var snapshotInspectTemplate: js.UndefOr[SchemaGooglePrivacyDlpV2InspectTemplate] = js.native
}
object SchemaGooglePrivacyDlpV2RequestedOptions {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2RequestedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2RequestedOptions]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2RequestedOptionsOps[Self <: SchemaGooglePrivacyDlpV2RequestedOptions] (val x: Self) extends AnyVal {
    
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
    def setJobConfig(value: SchemaGooglePrivacyDlpV2InspectJobConfig): Self = this.set("jobConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobConfig: Self = this.set("jobConfig", js.undefined)
    
    @scala.inline
    def setSnapshotInspectTemplate(value: SchemaGooglePrivacyDlpV2InspectTemplate): Self = this.set("snapshotInspectTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotInspectTemplate: Self = this.set("snapshotInspectTemplate", js.undefined)
  }
}
