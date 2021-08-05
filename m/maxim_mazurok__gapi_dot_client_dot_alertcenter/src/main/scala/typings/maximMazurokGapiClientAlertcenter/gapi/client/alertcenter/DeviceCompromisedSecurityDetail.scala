package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceCompromisedSecurityDetail extends StObject {
  
  /** The device compromised state. Possible values are "`Compromised`" or "`Not Compromised`". */
  var deviceCompromisedState: js.UndefOr[String] = js.undefined
  
  /** Required. The device ID. */
  var deviceId: js.UndefOr[String] = js.undefined
  
  /** The model of the device. */
  var deviceModel: js.UndefOr[String] = js.undefined
  
  /** The type of the device. */
  var deviceType: js.UndefOr[String] = js.undefined
  
  /** Required for iOS, empty for others. */
  var iosVendorId: js.UndefOr[String] = js.undefined
  
  /** The device resource ID. */
  var resourceId: js.UndefOr[String] = js.undefined
  
  /** The serial number of the device. */
  var serialNumber: js.UndefOr[String] = js.undefined
}
object DeviceCompromisedSecurityDetail {
  
  inline def apply(): DeviceCompromisedSecurityDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceCompromisedSecurityDetail]
  }
  
  extension [Self <: DeviceCompromisedSecurityDetail](x: Self) {
    
    inline def setDeviceCompromisedState(value: String): Self = StObject.set(x, "deviceCompromisedState", value.asInstanceOf[js.Any])
    
    inline def setDeviceCompromisedStateUndefined: Self = StObject.set(x, "deviceCompromisedState", js.undefined)
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setDeviceModel(value: String): Self = StObject.set(x, "deviceModel", value.asInstanceOf[js.Any])
    
    inline def setDeviceModelUndefined: Self = StObject.set(x, "deviceModel", js.undefined)
    
    inline def setDeviceType(value: String): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeUndefined: Self = StObject.set(x, "deviceType", js.undefined)
    
    inline def setIosVendorId(value: String): Self = StObject.set(x, "iosVendorId", value.asInstanceOf[js.Any])
    
    inline def setIosVendorIdUndefined: Self = StObject.set(x, "iosVendorId", js.undefined)
    
    inline def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
  }
}
