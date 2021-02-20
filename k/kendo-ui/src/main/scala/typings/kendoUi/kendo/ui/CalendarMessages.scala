package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarMessages extends StObject {
  
  var weekColumnHeader: js.UndefOr[String] = js.native
}
object CalendarMessages {
  
  @scala.inline
  def apply(): CalendarMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarMessages]
  }
  
  @scala.inline
  implicit class CalendarMessagesMutableBuilder[Self <: CalendarMessages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWeekColumnHeader(value: String): Self = StObject.set(x, "weekColumnHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekColumnHeaderUndefined: Self = StObject.set(x, "weekColumnHeader", js.undefined)
  }
}
