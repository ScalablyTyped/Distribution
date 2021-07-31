package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceIdentifier extends StObject {
  
  /** The device’s IMEI number. Validated on input. */
  var imei: js.UndefOr[String] = js.undefined
  
  /**
    * The device manufacturer’s name. Matches the device's built-in value returned from `android.os.Build.MANUFACTURER`. Allowed values are listed in
    * [manufacturers](/zero-touch/resources/manufacturer-names#manufacturers-names).
    */
  var manufacturer: js.UndefOr[String] = js.undefined
  
  /** The device’s MEID number. */
  var meid: js.UndefOr[String] = js.undefined
  
  /**
    * The device model's name. Matches the device's built-in value returned from `android.os.Build.MODEL`. Allowed values are listed in
    * [models](/zero-touch/resources/manufacturer-names#model-names).
    */
  var model: js.UndefOr[String] = js.undefined
  
  /** The manufacturer's serial number for the device. This value might not be unique across different device models. */
  var serialNumber: js.UndefOr[String] = js.undefined
}
object DeviceIdentifier {
  
  @scala.inline
  def apply(): DeviceIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceIdentifier]
  }
  
  @scala.inline
  implicit class DeviceIdentifierMutableBuilder[Self <: DeviceIdentifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImei(value: String): Self = StObject.set(x, "imei", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImeiUndefined: Self = StObject.set(x, "imei", js.undefined)
    
    @scala.inline
    def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    @scala.inline
    def setMeid(value: String): Self = StObject.set(x, "meid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeidUndefined: Self = StObject.set(x, "meid", js.undefined)
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
  }
}
