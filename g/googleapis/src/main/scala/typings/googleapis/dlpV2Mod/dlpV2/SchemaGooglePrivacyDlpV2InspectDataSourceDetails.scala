package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The results of an inspect DataSource job.
  */
@js.native
trait SchemaGooglePrivacyDlpV2InspectDataSourceDetails extends js.Object {
  
  /**
    * The configuration used for this job.
    */
  var requestedOptions: js.UndefOr[SchemaGooglePrivacyDlpV2RequestedOptions] = js.native
  
  /**
    * A summary of the outcome of this inspect job.
    */
  var result: js.UndefOr[SchemaGooglePrivacyDlpV2Result] = js.native
}
object SchemaGooglePrivacyDlpV2InspectDataSourceDetails {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2InspectDataSourceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InspectDataSourceDetails]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2InspectDataSourceDetailsOps[Self <: SchemaGooglePrivacyDlpV2InspectDataSourceDetails] (val x: Self) extends AnyVal {
    
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
    def setRequestedOptions(value: SchemaGooglePrivacyDlpV2RequestedOptions): Self = this.set("requestedOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestedOptions: Self = this.set("requestedOptions", js.undefined)
    
    @scala.inline
    def setResult(value: SchemaGooglePrivacyDlpV2Result): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
  }
}
