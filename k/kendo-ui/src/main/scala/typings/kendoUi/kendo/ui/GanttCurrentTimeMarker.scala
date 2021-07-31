package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GanttCurrentTimeMarker extends StObject {
  
  var updateInterval: js.UndefOr[Double] = js.undefined
}
object GanttCurrentTimeMarker {
  
  @scala.inline
  def apply(): GanttCurrentTimeMarker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GanttCurrentTimeMarker]
  }
  
  @scala.inline
  implicit class GanttCurrentTimeMarkerMutableBuilder[Self <: GanttCurrentTimeMarker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUpdateInterval(value: Double): Self = StObject.set(x, "updateInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateIntervalUndefined: Self = StObject.set(x, "updateInterval", js.undefined)
  }
}
