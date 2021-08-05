package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2ValidationResult extends StObject {
  
  /** Contains all validation errors. */
  var validationErrors: js.UndefOr[js.Array[GoogleCloudDialogflowV2ValidationError]] = js.undefined
}
object GoogleCloudDialogflowV2ValidationResult {
  
  inline def apply(): GoogleCloudDialogflowV2ValidationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2ValidationResult]
  }
  
  extension [Self <: GoogleCloudDialogflowV2ValidationResult](x: Self) {
    
    inline def setValidationErrors(value: js.Array[GoogleCloudDialogflowV2ValidationError]): Self = StObject.set(x, "validationErrors", value.asInstanceOf[js.Any])
    
    inline def setValidationErrorsUndefined: Self = StObject.set(x, "validationErrors", js.undefined)
    
    inline def setValidationErrorsVarargs(value: GoogleCloudDialogflowV2ValidationError*): Self = StObject.set(x, "validationErrors", js.Array(value :_*))
  }
}
