package typings.mangopay2NodejsSdk.mod.models

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiError extends StObject {
  
  var Date: Double
  
  var Id: String
  
  var Message: String
  
  var Type: String
  
  var errors: js.Tuple2[String, String]
}
object ApiError {
  
  inline def apply(Date: Double, Id: String, Message: String, Type: String, errors: js.Tuple2[String, String]): ApiError = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApiError] (val x: Self) extends AnyVal {
    
    inline def setDate(value: Double): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    
    inline def setErrors(value: js.Tuple2[String, String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
