package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GanttCurrentTimeMarker extends StObject {
  
  var updateInterval: js.UndefOr[Double] = js.undefined
}
object GanttCurrentTimeMarker {
  
  inline def apply(): GanttCurrentTimeMarker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GanttCurrentTimeMarker]
  }
  
  extension [Self <: GanttCurrentTimeMarker](x: Self) {
    
    inline def setUpdateInterval(value: Double): Self = StObject.set(x, "updateInterval", value.asInstanceOf[js.Any])
    
    inline def setUpdateIntervalUndefined: Self = StObject.set(x, "updateInterval", js.undefined)
  }
}
