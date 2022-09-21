package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DevicesListResponse extends StObject {
  
  /** A managed device. */
  var device: js.UndefOr[js.Array[Device]] = js.undefined
}
object DevicesListResponse {
  
  inline def apply(): DevicesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DevicesListResponse]
  }
  
  extension [Self <: DevicesListResponse](x: Self) {
    
    inline def setDevice(value: js.Array[Device]): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    inline def setDeviceVarargs(value: Device*): Self = StObject.set(x, "device", js.Array(value*))
  }
}
