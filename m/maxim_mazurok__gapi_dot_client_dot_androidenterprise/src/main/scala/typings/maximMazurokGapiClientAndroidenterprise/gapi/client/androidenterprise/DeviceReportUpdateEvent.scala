package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceReportUpdateEvent extends StObject {
  
  /** The Android ID of the device. This field will always be present. */
  var deviceId: js.UndefOr[String] = js.undefined
  
  /** The device report updated with the latest app states. This field will always be present. */
  var report: js.UndefOr[DeviceReport] = js.undefined
  
  /** The ID of the user. This field will always be present. */
  var userId: js.UndefOr[String] = js.undefined
}
object DeviceReportUpdateEvent {
  
  inline def apply(): DeviceReportUpdateEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceReportUpdateEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceReportUpdateEvent] (val x: Self) extends AnyVal {
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setReport(value: DeviceReport): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
    
    inline def setReportUndefined: Self = StObject.set(x, "report", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
