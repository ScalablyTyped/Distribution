package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DevicesLongRunningOperationMetadata extends js.Object {
  
  /** The number of metadata updates in the operation. This might be different from the number of updates in the request if the API can't parse some of the updates. */
  var devicesCount: js.UndefOr[Double] = js.native
  
  /** The processing status of the operation. */
  var processingStatus: js.UndefOr[String] = js.native
  
  /** The processing progress of the operation. Measured as a number from 0 to 100. A value of 10O doesnt always mean the operation completed—check for the inclusion of a `done` field. */
  var progress: js.UndefOr[Double] = js.native
}
object DevicesLongRunningOperationMetadata {
  
  @scala.inline
  def apply(): DevicesLongRunningOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DevicesLongRunningOperationMetadata]
  }
  
  @scala.inline
  implicit class DevicesLongRunningOperationMetadataOps[Self <: DevicesLongRunningOperationMetadata] (val x: Self) extends AnyVal {
    
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
    def setDevicesCount(value: Double): Self = this.set("devicesCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevicesCount: Self = this.set("devicesCount", js.undefined)
    
    @scala.inline
    def setProcessingStatus(value: String): Self = this.set("processingStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessingStatus: Self = this.set("processingStatus", js.undefined)
    
    @scala.inline
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
  }
}
