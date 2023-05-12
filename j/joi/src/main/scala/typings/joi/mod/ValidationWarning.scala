package typings.joi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationWarning extends StObject {
  
  var details: js.Array[ValidationErrorItem]
  
  var message: String
}
object ValidationWarning {
  
  inline def apply(details: js.Array[ValidationErrorItem], message: String): ValidationWarning = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationWarning]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValidationWarning] (val x: Self) extends AnyVal {
    
    inline def setDetails(value: js.Array[ValidationErrorItem]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsVarargs(value: ValidationErrorItem*): Self = StObject.set(x, "details", js.Array(value*))
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
