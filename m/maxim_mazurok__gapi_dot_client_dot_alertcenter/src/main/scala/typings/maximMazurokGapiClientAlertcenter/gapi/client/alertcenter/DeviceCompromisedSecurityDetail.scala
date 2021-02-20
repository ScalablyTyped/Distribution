package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceCompromisedSecurityDetail extends StObject {
  
  /** The device compromised state. Possible values are "`Compromised`" or "`Not Compromised`". */
  var deviceCompromisedState: js.UndefOr[String] = js.native
  
  /** Required. The device ID. */
  var deviceId: js.UndefOr[String] = js.native
  
  /** The model of the device. */
  var deviceModel: js.UndefOr[String] = js.native
  
  /** The type of the device. */
  var deviceType: js.UndefOr[String] = js.native
  
  /** Required for iOS, empty for others. */
  var iosVendorId: js.UndefOr[String] = js.native
  
  /** The device resource ID. */
  var resourceId: js.UndefOr[String] = js.native
  
  /** The serial number of the device. */
  var serialNumber: js.UndefOr[String] = js.native
}
object DeviceCompromisedSecurityDetail {
  
  @scala.inline
  def apply(): DeviceCompromisedSecurityDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceCompromisedSecurityDetail]
  }
  
  @scala.inline
  implicit class DeviceCompromisedSecurityDetailMutableBuilder[Self <: DeviceCompromisedSecurityDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceCompromisedState(value: String): Self = StObject.set(x, "deviceCompromisedState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceCompromisedStateUndefined: Self = StObject.set(x, "deviceCompromisedState", js.undefined)
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    @scala.inline
    def setDeviceModel(value: String): Self = StObject.set(x, "deviceModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceModelUndefined: Self = StObject.set(x, "deviceModel", js.undefined)
    
    @scala.inline
    def setDeviceType(value: String): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceTypeUndefined: Self = StObject.set(x, "deviceType", js.undefined)
    
    @scala.inline
    def setIosVendorId(value: String): Self = StObject.set(x, "iosVendorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosVendorIdUndefined: Self = StObject.set(x, "iosVendorId", js.undefined)
    
    @scala.inline
    def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    @scala.inline
    def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
  }
}
