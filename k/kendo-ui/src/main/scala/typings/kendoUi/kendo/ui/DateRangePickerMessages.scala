package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateRangePickerMessages extends StObject {
  
  var endLabel: js.UndefOr[String] = js.undefined
  
  var startLabel: js.UndefOr[String] = js.undefined
}
object DateRangePickerMessages {
  
  inline def apply(): DateRangePickerMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateRangePickerMessages]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateRangePickerMessages] (val x: Self) extends AnyVal {
    
    inline def setEndLabel(value: String): Self = StObject.set(x, "endLabel", value.asInstanceOf[js.Any])
    
    inline def setEndLabelUndefined: Self = StObject.set(x, "endLabel", js.undefined)
    
    inline def setStartLabel(value: String): Self = StObject.set(x, "startLabel", value.asInstanceOf[js.Any])
    
    inline def setStartLabelUndefined: Self = StObject.set(x, "startLabel", js.undefined)
  }
}
