package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DevicesLongRunningOperationMetadata extends StObject {
  
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
  implicit class DevicesLongRunningOperationMetadataMutableBuilder[Self <: DevicesLongRunningOperationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevicesCount(value: Double): Self = StObject.set(x, "devicesCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicesCountUndefined: Self = StObject.set(x, "devicesCount", js.undefined)
    
    @scala.inline
    def setProcessingStatus(value: String): Self = StObject.set(x, "processingStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingStatusUndefined: Self = StObject.set(x, "processingStatus", js.undefined)
    
    @scala.inline
    def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
  }
}
