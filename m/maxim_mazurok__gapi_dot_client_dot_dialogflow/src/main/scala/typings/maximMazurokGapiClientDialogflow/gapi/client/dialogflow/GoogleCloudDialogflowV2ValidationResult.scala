package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2ValidationResult extends js.Object {
  
  /** Contains all validation errors. */
  var validationErrors: js.UndefOr[js.Array[GoogleCloudDialogflowV2ValidationError]] = js.native
}
object GoogleCloudDialogflowV2ValidationResult {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2ValidationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2ValidationResult]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2ValidationResultOps[Self <: GoogleCloudDialogflowV2ValidationResult] (val x: Self) extends AnyVal {
    
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
    def setValidationErrorsVarargs(value: GoogleCloudDialogflowV2ValidationError*): Self = this.set("validationErrors", js.Array(value :_*))
    
    @scala.inline
    def setValidationErrors(value: js.Array[GoogleCloudDialogflowV2ValidationError]): Self = this.set("validationErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationErrors: Self = this.set("validationErrors", js.undefined)
  }
}
