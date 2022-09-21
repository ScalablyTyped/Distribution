package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1ValidationResult extends StObject {
  
  /**
    * Contains all validation errors.
    */
  var validationErrors: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1ValidationError]] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1ValidationResult {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1ValidationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1ValidationResult]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1ValidationResult](x: Self) {
    
    inline def setValidationErrors(value: js.Array[SchemaGoogleCloudDialogflowV2beta1ValidationError]): Self = StObject.set(x, "validationErrors", value.asInstanceOf[js.Any])
    
    inline def setValidationErrorsUndefined: Self = StObject.set(x, "validationErrors", js.undefined)
    
    inline def setValidationErrorsVarargs(value: SchemaGoogleCloudDialogflowV2beta1ValidationError*): Self = StObject.set(x, "validationErrors", js.Array(value*))
  }
}
