package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatePickerMonth extends StObject {
  
  var content: js.UndefOr[String] = js.undefined
  
  var empty: js.UndefOr[String] = js.undefined
  
  var weekNumber: js.UndefOr[String] = js.undefined
}
object DatePickerMonth {
  
  inline def apply(): DatePickerMonth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatePickerMonth]
  }
  
  extension [Self <: DatePickerMonth](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setEmpty(value: String): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
    
    inline def setWeekNumber(value: String): Self = StObject.set(x, "weekNumber", value.asInstanceOf[js.Any])
    
    inline def setWeekNumberUndefined: Self = StObject.set(x, "weekNumber", js.undefined)
  }
}
