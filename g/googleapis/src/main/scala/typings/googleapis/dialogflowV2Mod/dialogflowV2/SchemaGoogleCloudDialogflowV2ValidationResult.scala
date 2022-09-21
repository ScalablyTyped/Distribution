package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2ValidationResult extends StObject {
  
  /**
    * Contains all validation errors.
    */
  var validationErrors: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2ValidationError]] = js.undefined
}
object SchemaGoogleCloudDialogflowV2ValidationResult {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2ValidationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2ValidationResult]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2ValidationResult](x: Self) {
    
    inline def setValidationErrors(value: js.Array[SchemaGoogleCloudDialogflowV2ValidationError]): Self = StObject.set(x, "validationErrors", value.asInstanceOf[js.Any])
    
    inline def setValidationErrorsUndefined: Self = StObject.set(x, "validationErrors", js.undefined)
    
    inline def setValidationErrorsVarargs(value: SchemaGoogleCloudDialogflowV2ValidationError*): Self = StObject.set(x, "validationErrors", js.Array(value*))
  }
}
