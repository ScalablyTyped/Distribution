package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateTimePickerMessages extends StObject {
  
  var weekColumnHeader: js.UndefOr[String] = js.undefined
}
object DateTimePickerMessages {
  
  inline def apply(): DateTimePickerMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimePickerMessages]
  }
  
  extension [Self <: DateTimePickerMessages](x: Self) {
    
    inline def setWeekColumnHeader(value: String): Self = StObject.set(x, "weekColumnHeader", value.asInstanceOf[js.Any])
    
    inline def setWeekColumnHeaderUndefined: Self = StObject.set(x, "weekColumnHeader", js.undefined)
  }
}
