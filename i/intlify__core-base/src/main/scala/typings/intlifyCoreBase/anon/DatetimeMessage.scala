package typings.intlifyCoreBase.anon

import typings.intlifyCoreBase.mod.DateTimeFormat
import typings.intlifyCoreBase.mod.First
import typings.intlifyCoreBase.mod.NumberFormat
import typings.intlifyCoreBase.mod.SchemaParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatetimeMessage[T]
  extends StObject
     with SchemaParams[T, Any] {
  
  var datetime: DateTimeFormat
  
  var message: First[T]
  
  var number: NumberFormat
}
object DatetimeMessage {
  
  inline def apply[T](datetime: DateTimeFormat, message: First[T], number: NumberFormat): DatetimeMessage[T] = {
    val __obj = js.Dynamic.literal(datetime = datetime.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatetimeMessage[T]]
  }
  
  extension [Self <: DatetimeMessage[?], T](x: Self & DatetimeMessage[T]) {
    
    inline def setDatetime(value: DateTimeFormat): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: First[T]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: NumberFormat): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
  }
}
