package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiViewCalendarMessages extends StObject {
  
  var weekColumnHeader: js.UndefOr[String] = js.undefined
}
object MultiViewCalendarMessages {
  
  inline def apply(): MultiViewCalendarMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiViewCalendarMessages]
  }
  
  extension [Self <: MultiViewCalendarMessages](x: Self) {
    
    inline def setWeekColumnHeader(value: String): Self = StObject.set(x, "weekColumnHeader", value.asInstanceOf[js.Any])
    
    inline def setWeekColumnHeaderUndefined: Self = StObject.set(x, "weekColumnHeader", js.undefined)
  }
}
