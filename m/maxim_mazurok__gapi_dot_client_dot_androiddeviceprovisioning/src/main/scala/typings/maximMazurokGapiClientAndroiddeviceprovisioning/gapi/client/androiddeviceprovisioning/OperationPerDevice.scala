package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationPerDevice extends js.Object {
  
  /** A copy of the original device-claim request received by the server. */
  var claim: js.UndefOr[PartnerClaim] = js.native
  
  /** The processing result for each device. */
  var result: js.UndefOr[PerDeviceStatusInBatch] = js.native
  
  /** A copy of the original device-unclaim request received by the server. */
  var unclaim: js.UndefOr[PartnerUnclaim] = js.native
  
  /** A copy of the original metadata-update request received by the server. */
  var updateMetadata: js.UndefOr[UpdateMetadataArguments] = js.native
}
object OperationPerDevice {
  
  @scala.inline
  def apply(): OperationPerDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationPerDevice]
  }
  
  @scala.inline
  implicit class OperationPerDeviceOps[Self <: OperationPerDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClaim(value: PartnerClaim): Self = this.set("claim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClaim: Self = this.set("claim", js.undefined)
    
    @scala.inline
    def setResult(value: PerDeviceStatusInBatch): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
    
    @scala.inline
    def setUnclaim(value: PartnerUnclaim): Self = this.set("unclaim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnclaim: Self = this.set("unclaim", js.undefined)
    
    @scala.inline
    def setUpdateMetadata(value: UpdateMetadataArguments): Self = this.set("updateMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateMetadata: Self = this.set("updateMetadata", js.undefined)
  }
}
