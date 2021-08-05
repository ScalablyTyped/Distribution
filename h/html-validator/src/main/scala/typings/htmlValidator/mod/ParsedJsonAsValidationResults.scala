package typings.htmlValidator.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParsedJsonAsValidationResults extends StObject {
  
  var messages: js.Array[ValidationMessageObject]
}
object ParsedJsonAsValidationResults {
  
  inline def apply(messages: js.Array[ValidationMessageObject]): ParsedJsonAsValidationResults = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedJsonAsValidationResults]
  }
  
  extension [Self <: ParsedJsonAsValidationResults](x: Self) {
    
    inline def setMessages(value: js.Array[ValidationMessageObject]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesVarargs(value: ValidationMessageObject*): Self = StObject.set(x, "messages", js.Array(value :_*))
  }
}
