package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProcessingError extends StObject {
  
  /**
    * Error code indicating the nature of the error.
    */
  var code: js.UndefOr[String] = js.undefined
  
  /**
    * Description of the error.
    */
  var errorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * In case the item fields are invalid, this field contains the details
    * about the validation errors.
    */
  var fieldViolations: js.UndefOr[js.Array[SchemaFieldViolation]] = js.undefined
}
object SchemaProcessingError {
  
  @scala.inline
  def apply(): SchemaProcessingError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProcessingError]
  }
  
  @scala.inline
  implicit class SchemaProcessingErrorMutableBuilder[Self <: SchemaProcessingError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    @scala.inline
    def setFieldViolations(value: js.Array[SchemaFieldViolation]): Self = StObject.set(x, "fieldViolations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldViolationsUndefined: Self = StObject.set(x, "fieldViolations", js.undefined)
    
    @scala.inline
    def setFieldViolationsVarargs(value: SchemaFieldViolation*): Self = StObject.set(x, "fieldViolations", js.Array(value :_*))
  }
}
