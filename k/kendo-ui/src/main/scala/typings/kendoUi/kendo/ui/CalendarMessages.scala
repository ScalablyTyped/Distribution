package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarMessages extends StObject {
  
  var navigateTo: js.UndefOr[String] = js.undefined
  
  var parentViews: js.UndefOr[CalendarMessagesParentViews] = js.undefined
  
  var weekColumnHeader: js.UndefOr[String] = js.undefined
}
object CalendarMessages {
  
  inline def apply(): CalendarMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarMessages]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CalendarMessages] (val x: Self) extends AnyVal {
    
    inline def setNavigateTo(value: String): Self = StObject.set(x, "navigateTo", value.asInstanceOf[js.Any])
    
    inline def setNavigateToUndefined: Self = StObject.set(x, "navigateTo", js.undefined)
    
    inline def setParentViews(value: CalendarMessagesParentViews): Self = StObject.set(x, "parentViews", value.asInstanceOf[js.Any])
    
    inline def setParentViewsUndefined: Self = StObject.set(x, "parentViews", js.undefined)
    
    inline def setWeekColumnHeader(value: String): Self = StObject.set(x, "weekColumnHeader", value.asInstanceOf[js.Any])
    
    inline def setWeekColumnHeaderUndefined: Self = StObject.set(x, "weekColumnHeader", js.undefined)
  }
}
