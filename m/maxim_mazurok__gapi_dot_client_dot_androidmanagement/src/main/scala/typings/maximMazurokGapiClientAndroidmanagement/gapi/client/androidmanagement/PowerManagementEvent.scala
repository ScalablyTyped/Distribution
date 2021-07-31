package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PowerManagementEvent extends StObject {
  
  /** For BATTERY_LEVEL_COLLECTED events, the battery level as a percentage. */
  var batteryLevel: js.UndefOr[Double] = js.undefined
  
  /** The creation time of the event. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Event type. */
  var eventType: js.UndefOr[String] = js.undefined
}
object PowerManagementEvent {
  
  @scala.inline
  def apply(): PowerManagementEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PowerManagementEvent]
  }
  
  @scala.inline
  implicit class PowerManagementEventMutableBuilder[Self <: PowerManagementEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatteryLevel(value: Double): Self = StObject.set(x, "batteryLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatteryLevelUndefined: Self = StObject.set(x, "batteryLevel", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTypeUndefined: Self = StObject.set(x, "eventType", js.undefined)
  }
}
