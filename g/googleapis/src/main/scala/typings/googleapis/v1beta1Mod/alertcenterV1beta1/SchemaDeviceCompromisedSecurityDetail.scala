package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Detailed information of a single MDM device compromised event.
  */
trait SchemaDeviceCompromisedSecurityDetail extends StObject {
  
  /**
    * The device compromised state. Possible values are
    * &quot;`Compromised`&quot; or &quot;`Not Compromised`&quot;.
    */
  var deviceCompromisedState: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The device ID.
    */
  var deviceId: js.UndefOr[String] = js.undefined
  
  /**
    * The model of the device.
    */
  var deviceModel: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the device.
    */
  var deviceType: js.UndefOr[String] = js.undefined
  
  /**
    * Required for iOS, empty for others.
    */
  var iosVendorId: js.UndefOr[String] = js.undefined
  
  /**
    * The device resource ID.
    */
  var resourceId: js.UndefOr[String] = js.undefined
  
  /**
    * The serial number of the device.
    */
  var serialNumber: js.UndefOr[String] = js.undefined
}
object SchemaDeviceCompromisedSecurityDetail {
  
  @scala.inline
  def apply(): SchemaDeviceCompromisedSecurityDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceCompromisedSecurityDetail]
  }
  
  @scala.inline
  implicit class SchemaDeviceCompromisedSecurityDetailMutableBuilder[Self <: SchemaDeviceCompromisedSecurityDetail] (val x: Self) extends AnyVal {
    
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
