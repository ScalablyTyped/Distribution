package typings.intlifyCoreBase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatetimeFormats extends StObject {
  
  var datetimeFormats: Any
  
  var messages: Any
  
  var numberFormats: Any
}
object DatetimeFormats {
  
  inline def apply(datetimeFormats: Any, messages: Any, numberFormats: Any): DatetimeFormats = {
    val __obj = js.Dynamic.literal(datetimeFormats = datetimeFormats.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], numberFormats = numberFormats.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatetimeFormats]
  }
  
  extension [Self <: DatetimeFormats](x: Self) {
    
    inline def setDatetimeFormats(value: Any): Self = StObject.set(x, "datetimeFormats", value.asInstanceOf[js.Any])
    
    inline def setMessages(value: Any): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setNumberFormats(value: Any): Self = StObject.set(x, "numberFormats", value.asInstanceOf[js.Any])
  }
}
