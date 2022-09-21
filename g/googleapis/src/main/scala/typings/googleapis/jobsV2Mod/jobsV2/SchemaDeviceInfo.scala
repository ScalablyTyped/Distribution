package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeviceInfo extends StObject {
  
  /**
    * Optional. Type of the device.
    */
  var deviceType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. A device-specific ID. The ID must be a unique identifier that distinguishes the device from other devices.
    */
  var id: js.UndefOr[String | Null] = js.undefined
}
object SchemaDeviceInfo {
  
  inline def apply(): SchemaDeviceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceInfo]
  }
  
  extension [Self <: SchemaDeviceInfo](x: Self) {
    
    inline def setDeviceType(value: String): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeNull: Self = StObject.set(x, "deviceType", null)
    
    inline def setDeviceTypeUndefined: Self = StObject.set(x, "deviceType", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
