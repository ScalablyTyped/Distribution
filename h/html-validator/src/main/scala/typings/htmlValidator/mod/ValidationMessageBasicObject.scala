package typings.htmlValidator.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationMessageBasicObject extends StObject {
  
  var message: String
}
object ValidationMessageBasicObject {
  
  @scala.inline
  def apply(message: String): ValidationMessageBasicObject = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationMessageBasicObject]
  }
  
  @scala.inline
  implicit class ValidationMessageBasicObjectMutableBuilder[Self <: ValidationMessageBasicObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
