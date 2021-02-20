package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Detailed information of a single MDM suspicious activity event.
  */
@js.native
trait SchemaSuspiciousActivitySecurityDetail extends StObject {
  
  /**
    * Required. The device ID.
    */
  var deviceId: js.UndefOr[String] = js.native
  
  /**
    * The model of the device.
    */
  var deviceModel: js.UndefOr[String] = js.native
  
  /**
    * The device property which was changed.
    */
  var deviceProperty: js.UndefOr[String] = js.native
  
  /**
    * The type of the device.
    */
  var deviceType: js.UndefOr[String] = js.native
  
  /**
    * Required for iOS, empty for others.
    */
  var iosVendorId: js.UndefOr[String] = js.native
  
  /**
    * The new value of the device property after the change.
    */
  var newValue: js.UndefOr[String] = js.native
  
  /**
    * The old value of the device property before the change.
    */
  var oldValue: js.UndefOr[String] = js.native
  
  /**
    * The device resource ID.
    */
  var resourceId: js.UndefOr[String] = js.native
  
  /**
    * The serial number of the device.
    */
  var serialNumber: js.UndefOr[String] = js.native
}
object SchemaSuspiciousActivitySecurityDetail {
  
  @scala.inline
  def apply(): SchemaSuspiciousActivitySecurityDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuspiciousActivitySecurityDetail]
  }
  
  @scala.inline
  implicit class SchemaSuspiciousActivitySecurityDetailMutableBuilder[Self <: SchemaSuspiciousActivitySecurityDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    @scala.inline
    def setDeviceModel(value: String): Self = StObject.set(x, "deviceModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceModelUndefined: Self = StObject.set(x, "deviceModel", js.undefined)
    
    @scala.inline
    def setDeviceProperty(value: String): Self = StObject.set(x, "deviceProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicePropertyUndefined: Self = StObject.set(x, "deviceProperty", js.undefined)
    
    @scala.inline
    def setDeviceType(value: String): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceTypeUndefined: Self = StObject.set(x, "deviceType", js.undefined)
    
    @scala.inline
    def setIosVendorId(value: String): Self = StObject.set(x, "iosVendorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosVendorIdUndefined: Self = StObject.set(x, "iosVendorId", js.undefined)
    
    @scala.inline
    def setNewValue(value: String): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
    
    @scala.inline
    def setOldValue(value: String): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
    
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
