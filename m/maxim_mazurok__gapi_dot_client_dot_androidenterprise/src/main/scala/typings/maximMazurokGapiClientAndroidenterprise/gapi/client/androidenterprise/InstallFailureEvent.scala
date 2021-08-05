package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstallFailureEvent extends StObject {
  
  /** The Android ID of the device. This field will always be present. */
  var deviceId: js.UndefOr[String] = js.undefined
  
  /** Additional details on the failure if applicable. */
  var failureDetails: js.UndefOr[String] = js.undefined
  
  /** The reason for the installation failure. This field will always be present. */
  var failureReason: js.UndefOr[String] = js.undefined
  
  /** The id of the product (e.g. "app:com.google.android.gm") for which the install failure event occured. This field will always be present. */
  var productId: js.UndefOr[String] = js.undefined
  
  /** The ID of the user. This field will always be present. */
  var userId: js.UndefOr[String] = js.undefined
}
object InstallFailureEvent {
  
  inline def apply(): InstallFailureEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstallFailureEvent]
  }
  
  extension [Self <: InstallFailureEvent](x: Self) {
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setFailureDetails(value: String): Self = StObject.set(x, "failureDetails", value.asInstanceOf[js.Any])
    
    inline def setFailureDetailsUndefined: Self = StObject.set(x, "failureDetails", js.undefined)
    
    inline def setFailureReason(value: String): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
