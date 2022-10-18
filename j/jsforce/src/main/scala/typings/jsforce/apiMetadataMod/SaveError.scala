package typings.jsforce.apiMetadataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveError extends StObject {
  
  var fields: String | js.Array[String]
  
  var message: String
  
  var statusCode: String
}
object SaveError {
  
  inline def apply(fields: String | js.Array[String], message: String, statusCode: String): SaveError = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveError]
  }
  
  extension [Self <: SaveError](x: Self) {
    
    inline def setFields(value: String | js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
