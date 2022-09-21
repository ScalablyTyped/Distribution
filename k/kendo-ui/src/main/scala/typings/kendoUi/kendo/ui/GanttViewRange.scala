package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GanttViewRange extends StObject {
  
  var end: js.UndefOr[js.Date] = js.undefined
  
  var start: js.UndefOr[js.Date] = js.undefined
}
object GanttViewRange {
  
  inline def apply(): GanttViewRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GanttViewRange]
  }
  
  extension [Self <: GanttViewRange](x: Self) {
    
    inline def setEnd(value: js.Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setStart(value: js.Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
