package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DevicesLongRunningOperationMetadata extends StObject {
  
  /** The number of metadata updates in the operation. This might be different from the number of updates in the request if the API can't parse some of the updates. */
  var devicesCount: js.UndefOr[Double] = js.undefined
  
  /** The processing status of the operation. */
  var processingStatus: js.UndefOr[String] = js.undefined
  
  /** The processing progress of the operation. Measured as a number from 0 to 100. A value of 10O doesnt always mean the operation completed—check for the inclusion of a `done` field. */
  var progress: js.UndefOr[Double] = js.undefined
}
object DevicesLongRunningOperationMetadata {
  
  inline def apply(): DevicesLongRunningOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DevicesLongRunningOperationMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DevicesLongRunningOperationMetadata] (val x: Self) extends AnyVal {
    
    inline def setDevicesCount(value: Double): Self = StObject.set(x, "devicesCount", value.asInstanceOf[js.Any])
    
    inline def setDevicesCountUndefined: Self = StObject.set(x, "devicesCount", js.undefined)
    
    inline def setProcessingStatus(value: String): Self = StObject.set(x, "processingStatus", value.asInstanceOf[js.Any])
    
    inline def setProcessingStatusUndefined: Self = StObject.set(x, "processingStatus", js.undefined)
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
  }
}
