package typings.happyguestmxWebUtilities.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormErrorHandlerOutput extends StObject {
  
  var code: String
  
  var full_error_message: String
  
  var message: String
  
  var statusCode: Double
}
object FormErrorHandlerOutput {
  
  inline def apply(code: String, full_error_message: String, message: String, statusCode: Double): FormErrorHandlerOutput = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], full_error_message = full_error_message.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormErrorHandlerOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormErrorHandlerOutput] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setFull_error_message(value: String): Self = StObject.set(x, "full_error_message", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
