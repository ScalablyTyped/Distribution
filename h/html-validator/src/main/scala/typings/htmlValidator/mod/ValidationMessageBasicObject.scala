package typings.htmlValidator.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationMessageBasicObject extends StObject {
  
  var message: String
}
object ValidationMessageBasicObject {
  
  inline def apply(message: String): ValidationMessageBasicObject = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationMessageBasicObject]
  }
  
  extension [Self <: ValidationMessageBasicObject](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
