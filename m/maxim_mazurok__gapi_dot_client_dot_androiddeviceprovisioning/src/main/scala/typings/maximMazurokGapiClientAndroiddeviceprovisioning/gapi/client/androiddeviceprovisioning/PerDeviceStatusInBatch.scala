package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerDeviceStatusInBatch extends StObject {
  
  /** If processing succeeds, the device ID of the device. */
  var deviceId: js.UndefOr[String] = js.native
  
  /** If processing fails, the error type. */
  var errorIdentifier: js.UndefOr[String] = js.native
  
  /** If processing fails, a developer message explaining what went wrong. */
  var errorMessage: js.UndefOr[String] = js.native
  
  /** The result status of the device after processing. */
  var status: js.UndefOr[String] = js.native
}
object PerDeviceStatusInBatch {
  
  @scala.inline
  def apply(): PerDeviceStatusInBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerDeviceStatusInBatch]
  }
  
  @scala.inline
  implicit class PerDeviceStatusInBatchMutableBuilder[Self <: PerDeviceStatusInBatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    @scala.inline
    def setErrorIdentifier(value: String): Self = StObject.set(x, "errorIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorIdentifierUndefined: Self = StObject.set(x, "errorIdentifier", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
