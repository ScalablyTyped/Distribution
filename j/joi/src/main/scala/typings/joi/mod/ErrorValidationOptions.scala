package typings.joi.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorValidationOptions
  extends StObject
     with BaseValidationOptions {
  
  var messages: js.UndefOr[Record[String, LanguageMessageTemplate]] = js.undefined
}
object ErrorValidationOptions {
  
  inline def apply(): ErrorValidationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorValidationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorValidationOptions] (val x: Self) extends AnyVal {
    
    inline def setMessages(value: Record[String, LanguageMessageTemplate]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
  }
}
