package typings.intlifyCoreBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.intlifyCoreBase.anon.DatetimeFormatsDefault[Default]
  - typings.intlifyCoreBase.anon.DatetimeFormatsMessages[T]
  - typings.intlifyCoreBase.anon.DatetimeFormatsMessagesNumberFormats[Default]
*/
trait LocaleParams[T, Default] extends StObject
object LocaleParams {
  
  inline def DatetimeFormatsDefault[Default](datetimeFormats: Default, messages: Default, numberFormats: Default): typings.intlifyCoreBase.anon.DatetimeFormatsDefault[Default] = {
    val __obj = js.Dynamic.literal(datetimeFormats = datetimeFormats.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], numberFormats = numberFormats.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.intlifyCoreBase.anon.DatetimeFormatsDefault[Default]]
  }
  
  inline def DatetimeFormatsMessages[T](datetimeFormats: T, messages: T, numberFormats: T): typings.intlifyCoreBase.anon.DatetimeFormatsMessages[T] = {
    val __obj = js.Dynamic.literal(datetimeFormats = datetimeFormats.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], numberFormats = numberFormats.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.intlifyCoreBase.anon.DatetimeFormatsMessages[T]]
  }
  
  inline def DatetimeFormatsMessagesNumberFormats[Default](
    datetimeFormats: LocaleParamsType[Any, Default],
    messages: LocaleParamsType[Any, Default],
    numberFormats: LocaleParamsType[Any, Default]
  ): typings.intlifyCoreBase.anon.DatetimeFormatsMessagesNumberFormats[Default] = {
    val __obj = js.Dynamic.literal(datetimeFormats = datetimeFormats.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], numberFormats = numberFormats.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.intlifyCoreBase.anon.DatetimeFormatsMessagesNumberFormats[Default]]
  }
}
