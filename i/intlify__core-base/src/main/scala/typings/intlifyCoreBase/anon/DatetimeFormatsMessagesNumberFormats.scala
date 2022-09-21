package typings.intlifyCoreBase.anon

import typings.intlifyCoreBase.mod.LocaleParams
import typings.intlifyCoreBase.mod.LocaleParamsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatetimeFormatsMessagesNumberFormats[Default]
  extends StObject
     with LocaleParams[Any, Default] {
  
  var datetimeFormats: LocaleParamsType[Any, Default]
  
  var messages: LocaleParamsType[Any, Default]
  
  var numberFormats: LocaleParamsType[Any, Default]
}
object DatetimeFormatsMessagesNumberFormats {
  
  inline def apply[Default](
    datetimeFormats: LocaleParamsType[Any, Default],
    messages: LocaleParamsType[Any, Default],
    numberFormats: LocaleParamsType[Any, Default]
  ): DatetimeFormatsMessagesNumberFormats[Default] = {
    val __obj = js.Dynamic.literal(datetimeFormats = datetimeFormats.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], numberFormats = numberFormats.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatetimeFormatsMessagesNumberFormats[Default]]
  }
  
  extension [Self <: DatetimeFormatsMessagesNumberFormats[?], Default](x: Self & DatetimeFormatsMessagesNumberFormats[Default]) {
    
    inline def setDatetimeFormats(value: LocaleParamsType[Any, Default]): Self = StObject.set(x, "datetimeFormats", value.asInstanceOf[js.Any])
    
    inline def setMessages(value: LocaleParamsType[Any, Default]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setNumberFormats(value: LocaleParamsType[Any, Default]): Self = StObject.set(x, "numberFormats", value.asInstanceOf[js.Any])
  }
}
