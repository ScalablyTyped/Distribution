package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Detailed information of a single MDM suspicious activity event.
  */
trait SchemaSuspiciousActivitySecurityDetail extends StObject {
  
  /**
    * Required. The device ID.
    */
  var deviceId: js.UndefOr[String] = js.undefined
  
  /**
    * The model of the device.
    */
  var deviceModel: js.UndefOr[String] = js.undefined
  
  /**
    * The device property which was changed.
    */
  var deviceProperty: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the device.
    */
  var deviceType: js.UndefOr[String] = js.undefined
  
  /**
    * Required for iOS, empty for others.
    */
  var iosVendorId: js.UndefOr[String] = js.undefined
  
  /**
    * The new value of the device property after the change.
    */
  var newValue: js.UndefOr[String] = js.undefined
  
  /**
    * The old value of the device property before the change.
    */
  var oldValue: js.UndefOr[String] = js.undefined
  
  /**
    * The device resource ID.
    */
  var resourceId: js.UndefOr[String] = js.undefined
  
  /**
    * The serial number of the device.
    */
  var serialNumber: js.UndefOr[String] = js.undefined
}
object SchemaSuspiciousActivitySecurityDetail {
  
  inline def apply(): SchemaSuspiciousActivitySecurityDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuspiciousActivitySecurityDetail]
  }
  
  extension [Self <: SchemaSuspiciousActivitySecurityDetail](x: Self) {
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setDeviceModel(value: String): Self = StObject.set(x, "deviceModel", value.asInstanceOf[js.Any])
    
    inline def setDeviceModelUndefined: Self = StObject.set(x, "deviceModel", js.undefined)
    
    inline def setDeviceProperty(value: String): Self = StObject.set(x, "deviceProperty", value.asInstanceOf[js.Any])
    
    inline def setDevicePropertyUndefined: Self = StObject.set(x, "deviceProperty", js.undefined)
    
    inline def setDeviceType(value: String): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeUndefined: Self = StObject.set(x, "deviceType", js.undefined)
    
    inline def setIosVendorId(value: String): Self = StObject.set(x, "iosVendorId", value.asInstanceOf[js.Any])
    
    inline def setIosVendorIdUndefined: Self = StObject.set(x, "iosVendorId", js.undefined)
    
    inline def setNewValue(value: String): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
    
    inline def setOldValue(value: String): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
    
    inline def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
  }
}
