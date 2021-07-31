package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaintenanceWindow extends StObject {
  
  /** Duration of the maintenance window, in milliseconds. The duration must be between 30 minutes and 24 hours (inclusive). */
  var durationMs: js.UndefOr[String] = js.undefined
  
  /** Start time of the maintenance window, in milliseconds after midnight on the device. Windows can span midnight. */
  var startTimeAfterMidnightMs: js.UndefOr[String] = js.undefined
}
object MaintenanceWindow {
  
  @scala.inline
  def apply(): MaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindow]
  }
  
  @scala.inline
  implicit class MaintenanceWindowMutableBuilder[Self <: MaintenanceWindow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDurationMs(value: String): Self = StObject.set(x, "durationMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationMsUndefined: Self = StObject.set(x, "durationMs", js.undefined)
    
    @scala.inline
    def setStartTimeAfterMidnightMs(value: String): Self = StObject.set(x, "startTimeAfterMidnightMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeAfterMidnightMsUndefined: Self = StObject.set(x, "startTimeAfterMidnightMs", js.undefined)
  }
}
