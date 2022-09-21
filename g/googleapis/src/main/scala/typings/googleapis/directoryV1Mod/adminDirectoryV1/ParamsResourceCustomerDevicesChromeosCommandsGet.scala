package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCustomerDevicesChromeosCommandsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Immutable. ID of Chrome OS Device Command.
    */
  var commandId: js.UndefOr[String] = js.undefined
  
  /**
    * Immutable. ID of the Google Workspace account.
    */
  var customerId: js.UndefOr[String] = js.undefined
  
  /**
    * Immutable. ID of Chrome OS Device.
    */
  var deviceId: js.UndefOr[String] = js.undefined
}
object ParamsResourceCustomerDevicesChromeosCommandsGet {
  
  inline def apply(): ParamsResourceCustomerDevicesChromeosCommandsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCustomerDevicesChromeosCommandsGet]
  }
  
  extension [Self <: ParamsResourceCustomerDevicesChromeosCommandsGet](x: Self) {
    
    inline def setCommandId(value: String): Self = StObject.set(x, "commandId", value.asInstanceOf[js.Any])
    
    inline def setCommandIdUndefined: Self = StObject.set(x, "commandId", js.undefined)
    
    inline def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    inline def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
  }
}
