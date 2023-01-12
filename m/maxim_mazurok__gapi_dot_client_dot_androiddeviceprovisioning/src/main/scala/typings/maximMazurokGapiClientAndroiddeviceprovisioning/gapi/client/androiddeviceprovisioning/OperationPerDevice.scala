package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationPerDevice extends StObject {
  
  /** A copy of the original device-claim request received by the server. */
  var claim: js.UndefOr[PartnerClaim] = js.undefined
  
  /** The processing result for each device. */
  var result: js.UndefOr[PerDeviceStatusInBatch] = js.undefined
  
  /** A copy of the original device-unclaim request received by the server. */
  var unclaim: js.UndefOr[PartnerUnclaim] = js.undefined
  
  /** A copy of the original metadata-update request received by the server. */
  var updateMetadata: js.UndefOr[UpdateMetadataArguments] = js.undefined
}
object OperationPerDevice {
  
  inline def apply(): OperationPerDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationPerDevice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OperationPerDevice] (val x: Self) extends AnyVal {
    
    inline def setClaim(value: PartnerClaim): Self = StObject.set(x, "claim", value.asInstanceOf[js.Any])
    
    inline def setClaimUndefined: Self = StObject.set(x, "claim", js.undefined)
    
    inline def setResult(value: PerDeviceStatusInBatch): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setUnclaim(value: PartnerUnclaim): Self = StObject.set(x, "unclaim", value.asInstanceOf[js.Any])
    
    inline def setUnclaimUndefined: Self = StObject.set(x, "unclaim", js.undefined)
    
    inline def setUpdateMetadata(value: UpdateMetadataArguments): Self = StObject.set(x, "updateMetadata", value.asInstanceOf[js.Any])
    
    inline def setUpdateMetadataUndefined: Self = StObject.set(x, "updateMetadata", js.undefined)
  }
}
