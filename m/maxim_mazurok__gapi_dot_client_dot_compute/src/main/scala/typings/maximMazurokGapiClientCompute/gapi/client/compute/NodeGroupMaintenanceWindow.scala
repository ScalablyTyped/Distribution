package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeGroupMaintenanceWindow extends StObject {
  
  /** [Output only] A predetermined duration for the window, automatically chosen to be the smallest possible in the given scenario. */
  var maintenanceDuration: js.UndefOr[Duration] = js.undefined
  
  /** Start time of the window. This must be in UTC format that resolves to one of 00:00, 04:00, 08:00, 12:00, 16:00, or 20:00. For example, both 13:00-5 and 08:00 are valid. */
  var startTime: js.UndefOr[String] = js.undefined
}
object NodeGroupMaintenanceWindow {
  
  inline def apply(): NodeGroupMaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeGroupMaintenanceWindow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeGroupMaintenanceWindow] (val x: Self) extends AnyVal {
    
    inline def setMaintenanceDuration(value: Duration): Self = StObject.set(x, "maintenanceDuration", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceDurationUndefined: Self = StObject.set(x, "maintenanceDuration", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
