package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Returns the errors encountered during DICOM store import.
  */
trait SchemaImportDicomDataErrorDetails extends StObject {
  
  /**
    * Deprecated. Use only for debugging purposes.  Contains sample errors
    * encountered in imports of individual resources (for example, a Cloud
    * Storage object).
    */
  var sampleErrors: js.UndefOr[js.Array[SchemaErrorDetail]] = js.undefined
}
object SchemaImportDicomDataErrorDetails {
  
  @scala.inline
  def apply(): SchemaImportDicomDataErrorDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImportDicomDataErrorDetails]
  }
  
  @scala.inline
  implicit class SchemaImportDicomDataErrorDetailsMutableBuilder[Self <: SchemaImportDicomDataErrorDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSampleErrors(value: js.Array[SchemaErrorDetail]): Self = StObject.set(x, "sampleErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleErrorsUndefined: Self = StObject.set(x, "sampleErrors", js.undefined)
    
    @scala.inline
    def setSampleErrorsVarargs(value: SchemaErrorDetail*): Self = StObject.set(x, "sampleErrors", js.Array(value :_*))
  }
}
