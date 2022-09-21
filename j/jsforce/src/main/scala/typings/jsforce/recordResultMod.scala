package typings.jsforce

import typings.jsforce.jsforceBooleans.`false`
import typings.jsforce.jsforceBooleans.`true`
import typings.jsforce.salesforceIdMod.SalesforceId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object recordResultMod {
  
  trait Error extends StObject {
    
    var fields: js.Array[String]
    
    var message: String
    
    var statusCode: String
  }
  object Error {
    
    inline def apply(fields: js.Array[String], message: String, statusCode: String): Error = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait ErrorResult
    extends StObject
       with RecordResult {
    
    var errors: js.Array[Error]
    
    var success: `false`
  }
  object ErrorResult {
    
    inline def apply(errors: js.Array[Error]): ErrorResult = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], success = false)
      __obj.asInstanceOf[ErrorResult]
    }
    
    extension [Self <: ErrorResult](x: Self) {
      
      inline def setErrors(value: js.Array[Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: Error*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setSuccess(value: `false`): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsforce.recordResultMod.SuccessResult
    - typings.jsforce.recordResultMod.ErrorResult
  */
  trait RecordResult extends StObject
  object RecordResult {
    
    inline def ErrorResult(errors: js.Array[Error]): typings.jsforce.recordResultMod.ErrorResult = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], success = false)
      __obj.asInstanceOf[typings.jsforce.recordResultMod.ErrorResult]
    }
    
    inline def SuccessResult(id: SalesforceId): typings.jsforce.recordResultMod.SuccessResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], success = true)
      __obj.asInstanceOf[typings.jsforce.recordResultMod.SuccessResult]
    }
  }
  
  trait SuccessResult
    extends StObject
       with RecordResult {
    
    var id: SalesforceId
    
    var success: `true`
  }
  object SuccessResult {
    
    inline def apply(id: SalesforceId): SuccessResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], success = true)
      __obj.asInstanceOf[SuccessResult]
    }
    
    extension [Self <: SuccessResult](x: Self) {
      
      inline def setId(value: SalesforceId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: `true`): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
}
