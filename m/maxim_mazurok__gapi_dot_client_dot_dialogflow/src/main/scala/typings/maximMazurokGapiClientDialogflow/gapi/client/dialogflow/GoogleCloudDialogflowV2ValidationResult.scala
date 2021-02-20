package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2ValidationResult extends StObject {
  
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
  implicit class GoogleCloudDialogflowV2ValidationResultMutableBuilder[Self <: GoogleCloudDialogflowV2ValidationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValidationErrors(value: js.Array[GoogleCloudDialogflowV2ValidationError]): Self = StObject.set(x, "validationErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationErrorsUndefined: Self = StObject.set(x, "validationErrors", js.undefined)
    
    @scala.inline
    def setValidationErrorsVarargs(value: GoogleCloudDialogflowV2ValidationError*): Self = StObject.set(x, "validationErrors", js.Array(value :_*))
  }
}
