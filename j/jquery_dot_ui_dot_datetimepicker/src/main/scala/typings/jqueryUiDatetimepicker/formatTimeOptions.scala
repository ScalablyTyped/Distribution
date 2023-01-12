package typings.jqueryUiDatetimepicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait formatTimeOptions extends StObject {
  
  var format: String
  
  var options: js.UndefOr[DateTimePickerOptions] = js.undefined
  
  var time: Time
}
object formatTimeOptions {
  
  inline def apply(format: String, time: Time): formatTimeOptions = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[formatTimeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: formatTimeOptions] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: DateTimePickerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setTime(value: Time): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
