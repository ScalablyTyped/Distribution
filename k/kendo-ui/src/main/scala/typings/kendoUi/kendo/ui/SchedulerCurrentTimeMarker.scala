package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchedulerCurrentTimeMarker extends StObject {
  
  var updateInterval: js.UndefOr[Double] = js.undefined
  
  var useLocalTimezone: js.UndefOr[Boolean] = js.undefined
}
object SchedulerCurrentTimeMarker {
  
  inline def apply(): SchedulerCurrentTimeMarker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerCurrentTimeMarker]
  }
  
  extension [Self <: SchedulerCurrentTimeMarker](x: Self) {
    
    inline def setUpdateInterval(value: Double): Self = StObject.set(x, "updateInterval", value.asInstanceOf[js.Any])
    
    inline def setUpdateIntervalUndefined: Self = StObject.set(x, "updateInterval", js.undefined)
    
    inline def setUseLocalTimezone(value: Boolean): Self = StObject.set(x, "useLocalTimezone", value.asInstanceOf[js.Any])
    
    inline def setUseLocalTimezoneUndefined: Self = StObject.set(x, "useLocalTimezone", js.undefined)
  }
}
