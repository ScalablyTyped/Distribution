package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiViewCalendarRange extends StObject {
  
  var end: js.UndefOr[js.Date] = js.undefined
  
  var start: js.UndefOr[js.Date] = js.undefined
}
object MultiViewCalendarRange {
  
  inline def apply(): MultiViewCalendarRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiViewCalendarRange]
  }
  
  extension [Self <: MultiViewCalendarRange](x: Self) {
    
    inline def setEnd(value: js.Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setStart(value: js.Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
