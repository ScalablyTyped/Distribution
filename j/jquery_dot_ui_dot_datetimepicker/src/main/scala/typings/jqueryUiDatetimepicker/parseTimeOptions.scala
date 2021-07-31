package typings.jqueryUiDatetimepicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait parseTimeOptions extends StObject {
  
  var format: String
  
  var options: js.UndefOr[DateTimePickerOptions] = js.undefined
  
  var time: String
}
object parseTimeOptions {
  
  @scala.inline
  def apply(format: String, time: String): parseTimeOptions = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[parseTimeOptions]
  }
  
  @scala.inline
  implicit class parseTimeOptionsMutableBuilder[Self <: parseTimeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: DateTimePickerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
