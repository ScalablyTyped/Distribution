package typings.intlifyCoreBase.anon

import typings.intlifyCoreBase.mod.LocaleParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatetimeFormatsDefault[Default]
  extends StObject
     with LocaleParams[Any, Default] {
  
  var datetimeFormats: Default
  
  var messages: Default
  
  var numberFormats: Default
}
object DatetimeFormatsDefault {
  
  inline def apply[Default](datetimeFormats: Default, messages: Default, numberFormats: Default): DatetimeFormatsDefault[Default] = {
    val __obj = js.Dynamic.literal(datetimeFormats = datetimeFormats.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], numberFormats = numberFormats.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatetimeFormatsDefault[Default]]
  }
  
  extension [Self <: DatetimeFormatsDefault[?], Default](x: Self & DatetimeFormatsDefault[Default]) {
    
    inline def setDatetimeFormats(value: Default): Self = StObject.set(x, "datetimeFormats", value.asInstanceOf[js.Any])
    
    inline def setMessages(value: Default): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setNumberFormats(value: Default): Self = StObject.set(x, "numberFormats", value.asInstanceOf[js.Any])
  }
}
