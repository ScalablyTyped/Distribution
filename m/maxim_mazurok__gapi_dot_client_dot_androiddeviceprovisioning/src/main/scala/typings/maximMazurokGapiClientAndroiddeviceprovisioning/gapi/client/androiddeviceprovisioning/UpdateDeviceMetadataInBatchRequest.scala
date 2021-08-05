package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDeviceMetadataInBatchRequest extends StObject {
  
  /** Required. The list of metadata updates. */
  var updates: js.UndefOr[js.Array[UpdateMetadataArguments]] = js.undefined
}
object UpdateDeviceMetadataInBatchRequest {
  
  inline def apply(): UpdateDeviceMetadataInBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDeviceMetadataInBatchRequest]
  }
  
  extension [Self <: UpdateDeviceMetadataInBatchRequest](x: Self) {
    
    inline def setUpdates(value: js.Array[UpdateMetadataArguments]): Self = StObject.set(x, "updates", value.asInstanceOf[js.Any])
    
    inline def setUpdatesUndefined: Self = StObject.set(x, "updates", js.undefined)
    
    inline def setUpdatesVarargs(value: UpdateMetadataArguments*): Self = StObject.set(x, "updates", js.Array(value :_*))
  }
}
