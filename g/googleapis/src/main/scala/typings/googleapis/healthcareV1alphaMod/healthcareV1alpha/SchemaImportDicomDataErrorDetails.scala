package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Returns the errors encountered during DICOM store import.
  */
trait SchemaImportDicomDataErrorDetails extends StObject {
  
  /**
    * Contains errors encountered in imports of individual resources (e.g., a
    * Google Cloud Storage object).
    */
  var errors: js.UndefOr[js.Array[SchemaImportError]] = js.undefined
}
object SchemaImportDicomDataErrorDetails {
  
  inline def apply(): SchemaImportDicomDataErrorDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImportDicomDataErrorDetails]
  }
  
  extension [Self <: SchemaImportDicomDataErrorDetails](x: Self) {
    
    inline def setErrors(value: js.Array[SchemaImportError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: SchemaImportError*): Self = StObject.set(x, "errors", js.Array(value :_*))
  }
}
