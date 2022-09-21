package typings.intlifyCoreBase.anon

import typings.intlifyCoreBase.mod.DateTimeFormat
import typings.intlifyCoreBase.mod.LocaleMessage
import typings.intlifyCoreBase.mod.NumberFormat
import typings.intlifyCoreBase.mod.SchemaParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatetimeMessageNumber[Message]
  extends StObject
     with SchemaParams[Any, Message] {
  
  var datetime: DateTimeFormat
  
  var message: LocaleMessage[Message]
  
  var number: NumberFormat
}
object DatetimeMessageNumber {
  
  inline def apply[Message](datetime: DateTimeFormat, message: LocaleMessage[Message], number: NumberFormat): DatetimeMessageNumber[Message] = {
    val __obj = js.Dynamic.literal(datetime = datetime.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatetimeMessageNumber[Message]]
  }
  
  extension [Self <: DatetimeMessageNumber[?], Message](x: Self & DatetimeMessageNumber[Message]) {
    
    inline def setDatetime(value: DateTimeFormat): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: LocaleMessage[Message]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: NumberFormat): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
  }
}
