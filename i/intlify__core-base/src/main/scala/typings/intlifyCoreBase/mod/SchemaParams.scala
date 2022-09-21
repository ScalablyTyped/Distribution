package typings.intlifyCoreBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.intlifyCoreBase.anon.Number[Message]
  - typings.intlifyCoreBase.anon.DatetimeMessageNumber[Message]
  - typings.intlifyCoreBase.anon.DatetimeMessage[T]
*/
trait SchemaParams[T, Message] extends StObject
object SchemaParams {
  
  inline def DatetimeMessage[T](datetime: DateTimeFormat, message: First[T], number: NumberFormat): typings.intlifyCoreBase.anon.DatetimeMessage[T] = {
    val __obj = js.Dynamic.literal(datetime = datetime.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.intlifyCoreBase.anon.DatetimeMessage[T]]
  }
  
  inline def DatetimeMessageNumber[Message](datetime: DateTimeFormat, message: LocaleMessage[Message], number: NumberFormat): typings.intlifyCoreBase.anon.DatetimeMessageNumber[Message] = {
    val __obj = js.Dynamic.literal(datetime = datetime.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.intlifyCoreBase.anon.DatetimeMessageNumber[Message]]
  }
  
  inline def Number[Message](datetime: DateTimeFormat, message: LocaleMessage[Message], number: NumberFormat): typings.intlifyCoreBase.anon.Number[Message] = {
    val __obj = js.Dynamic.literal(datetime = datetime.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.intlifyCoreBase.anon.Number[Message]]
  }
}
