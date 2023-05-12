package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarMessagesParentViews extends StObject {
  
  var decade: js.UndefOr[String] = js.undefined
  
  var month: js.UndefOr[String] = js.undefined
  
  var year: js.UndefOr[String] = js.undefined
}
object CalendarMessagesParentViews {
  
  inline def apply(): CalendarMessagesParentViews = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarMessagesParentViews]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CalendarMessagesParentViews] (val x: Self) extends AnyVal {
    
    inline def setDecade(value: String): Self = StObject.set(x, "decade", value.asInstanceOf[js.Any])
    
    inline def setDecadeUndefined: Self = StObject.set(x, "decade", js.undefined)
    
    inline def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    inline def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    
    inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
  }
}
