package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DevicesLongRunningOperationResponse extends StObject {
  
  /** The processing status for each device in the operation. One `PerDeviceStatus` per device. The list order matches the items in the original request. */
  var perDeviceStatus: js.UndefOr[js.Array[OperationPerDevice]] = js.undefined
  
  /** A summary of how many items in the operation the server processed successfully. Updated as the operation progresses. */
  var successCount: js.UndefOr[Double] = js.undefined
}
object DevicesLongRunningOperationResponse {
  
  inline def apply(): DevicesLongRunningOperationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DevicesLongRunningOperationResponse]
  }
  
  extension [Self <: DevicesLongRunningOperationResponse](x: Self) {
    
    inline def setPerDeviceStatus(value: js.Array[OperationPerDevice]): Self = StObject.set(x, "perDeviceStatus", value.asInstanceOf[js.Any])
    
    inline def setPerDeviceStatusUndefined: Self = StObject.set(x, "perDeviceStatus", js.undefined)
    
    inline def setPerDeviceStatusVarargs(value: OperationPerDevice*): Self = StObject.set(x, "perDeviceStatus", js.Array(value :_*))
    
    inline def setSuccessCount(value: Double): Self = StObject.set(x, "successCount", value.asInstanceOf[js.Any])
    
    inline def setSuccessCountUndefined: Self = StObject.set(x, "successCount", js.undefined)
  }
}
