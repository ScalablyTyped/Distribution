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
  
  inline def apply(): MaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaintenanceWindow] (val x: Self) extends AnyVal {
    
    inline def setDurationMs(value: String): Self = StObject.set(x, "durationMs", value.asInstanceOf[js.Any])
    
    inline def setDurationMsUndefined: Self = StObject.set(x, "durationMs", js.undefined)
    
    inline def setStartTimeAfterMidnightMs(value: String): Self = StObject.set(x, "startTimeAfterMidnightMs", value.asInstanceOf[js.Any])
    
    inline def setStartTimeAfterMidnightMsUndefined: Self = StObject.set(x, "startTimeAfterMidnightMs", js.undefined)
  }
}
