package typings.kendoUi.kendo.ui

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiViewCalendarRange extends StObject {
  
  var end: js.UndefOr[Date] = js.undefined
  
  var start: js.UndefOr[Date] = js.undefined
}
object MultiViewCalendarRange {
  
  inline def apply(): MultiViewCalendarRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiViewCalendarRange]
  }
  
  extension [Self <: MultiViewCalendarRange](x: Self) {
    
    inline def setEnd(value: Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setStart(value: Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
