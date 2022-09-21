package typings.intlifyCoreBase.anon

import typings.intlifyCoreBase.mod.LocaleParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatetimeFormatsMessages[T]
  extends StObject
     with LocaleParams[T, Any] {
  
  var datetimeFormats: T
  
  var messages: T
  
  var numberFormats: T
}
object DatetimeFormatsMessages {
  
  inline def apply[T](datetimeFormats: T, messages: T, numberFormats: T): DatetimeFormatsMessages[T] = {
    val __obj = js.Dynamic.literal(datetimeFormats = datetimeFormats.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], numberFormats = numberFormats.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatetimeFormatsMessages[T]]
  }
  
  extension [Self <: DatetimeFormatsMessages[?], T](x: Self & DatetimeFormatsMessages[T]) {
    
    inline def setDatetimeFormats(value: T): Self = StObject.set(x, "datetimeFormats", value.asInstanceOf[js.Any])
    
    inline def setMessages(value: T): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setNumberFormats(value: T): Self = StObject.set(x, "numberFormats", value.asInstanceOf[js.Any])
  }
}
