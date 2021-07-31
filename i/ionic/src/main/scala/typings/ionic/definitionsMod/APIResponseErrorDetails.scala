package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait APIResponseErrorDetails extends StObject {
  
  var error_type: String
  
  var errors: js.Array[String]
  
  var parameter: String
}
object APIResponseErrorDetails {
  
  @scala.inline
  def apply(error_type: String, errors: js.Array[String], parameter: String): APIResponseErrorDetails = {
    val __obj = js.Dynamic.literal(error_type = error_type.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], parameter = parameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIResponseErrorDetails]
  }
  
  @scala.inline
  implicit class APIResponseErrorDetailsMutableBuilder[Self <: APIResponseErrorDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError_type(value: String): Self = StObject.set(x, "error_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setParameter(value: String): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
  }
}
