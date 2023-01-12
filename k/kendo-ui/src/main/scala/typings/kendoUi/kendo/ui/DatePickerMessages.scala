package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatePickerMessages extends StObject {
  
  var weekColumnHeader: js.UndefOr[String] = js.undefined
}
object DatePickerMessages {
  
  inline def apply(): DatePickerMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatePickerMessages]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatePickerMessages] (val x: Self) extends AnyVal {
    
    inline def setWeekColumnHeader(value: String): Self = StObject.set(x, "weekColumnHeader", value.asInstanceOf[js.Any])
    
    inline def setWeekColumnHeaderUndefined: Self = StObject.set(x, "weekColumnHeader", js.undefined)
  }
}
