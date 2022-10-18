package typings.intlifyCoreBase

import typings.intlifyCoreBase.mod.DateTimeFormat
import typings.intlifyCoreBase.mod.LocaleMessage
import typings.intlifyCoreBase.mod.NumberFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Datetime extends StObject {
    
    var datetime: js.UndefOr[Any] = js.undefined
    
    var message: js.UndefOr[Any] = js.undefined
    
    var number: js.UndefOr[Any] = js.undefined
  }
  object Datetime {
    
    inline def apply(): Datetime = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Datetime]
    }
    
    extension [Self <: Datetime](x: Self) {
      
      inline def setDatetime(value: Any): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
      
      inline def setDatetimeUndefined: Self = StObject.set(x, "datetime", js.undefined)
      
      inline def setMessage(value: Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setNumber(value: Any): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    }
  }
  
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
  
  trait Number[Message] extends StObject {
    
    var datetime: DateTimeFormat
    
    var message: LocaleMessage[Message]
    
    var number: NumberFormat
  }
  object Number {
    
    inline def apply[Message](datetime: DateTimeFormat, message: LocaleMessage[Message], number: NumberFormat): Number[Message] = {
      val __obj = js.Dynamic.literal(datetime = datetime.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
      __obj.asInstanceOf[Number[Message]]
    }
    
    extension [Self <: Number[?], Message](x: Self & Number[Message]) {
      
      inline def setDatetime(value: DateTimeFormat): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: LocaleMessage[Message]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: NumberFormat): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    }
  }
}
