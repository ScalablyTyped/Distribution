package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulerCurrentTimeMarker extends StObject {
  
  var updateInterval: js.UndefOr[Double] = js.native
  
  var useLocalTimezone: js.UndefOr[Boolean] = js.native
}
object SchedulerCurrentTimeMarker {
  
  @scala.inline
  def apply(): SchedulerCurrentTimeMarker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerCurrentTimeMarker]
  }
  
  @scala.inline
  implicit class SchedulerCurrentTimeMarkerMutableBuilder[Self <: SchedulerCurrentTimeMarker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUpdateInterval(value: Double): Self = StObject.set(x, "updateInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateIntervalUndefined: Self = StObject.set(x, "updateInterval", js.undefined)
    
    @scala.inline
    def setUseLocalTimezone(value: Boolean): Self = StObject.set(x, "useLocalTimezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseLocalTimezoneUndefined: Self = StObject.set(x, "useLocalTimezone", js.undefined)
  }
}
