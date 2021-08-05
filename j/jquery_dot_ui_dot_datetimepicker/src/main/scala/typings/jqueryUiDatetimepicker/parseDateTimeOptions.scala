package typings.jqueryUiDatetimepicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait parseDateTimeOptions extends StObject {
  
  var dateFormat: String
  
  var dateSettings: String
  
  var dateTimeString: String
  
  var timeFormat: String
  
  var timeSettings: String
}
object parseDateTimeOptions {
  
  inline def apply(
    dateFormat: String,
    dateSettings: String,
    dateTimeString: String,
    timeFormat: String,
    timeSettings: String
  ): parseDateTimeOptions = {
    val __obj = js.Dynamic.literal(dateFormat = dateFormat.asInstanceOf[js.Any], dateSettings = dateSettings.asInstanceOf[js.Any], dateTimeString = dateTimeString.asInstanceOf[js.Any], timeFormat = timeFormat.asInstanceOf[js.Any], timeSettings = timeSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[parseDateTimeOptions]
  }
  
  extension [Self <: parseDateTimeOptions](x: Self) {
    
    inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    inline def setDateSettings(value: String): Self = StObject.set(x, "dateSettings", value.asInstanceOf[js.Any])
    
    inline def setDateTimeString(value: String): Self = StObject.set(x, "dateTimeString", value.asInstanceOf[js.Any])
    
    inline def setTimeFormat(value: String): Self = StObject.set(x, "timeFormat", value.asInstanceOf[js.Any])
    
    inline def setTimeSettings(value: String): Self = StObject.set(x, "timeSettings", value.asInstanceOf[js.Any])
  }
}
