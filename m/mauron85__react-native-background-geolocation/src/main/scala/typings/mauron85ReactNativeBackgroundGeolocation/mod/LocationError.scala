package typings.mauron85ReactNativeBackgroundGeolocation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationError extends StObject {
  
  /**
    * Reason of an error occurring when using the geolocating device.
    *
    * Possible error codes:
    *  1. PERMISSION_DENIED
    *  2. LOCATION_UNAVAILABLE
    *  3. TIMEOUT
    */
  var code: LocationErrorCode
  
  /** Message describing the details of the error */
  var message: String
}
object LocationError {
  
  inline def apply(code: LocationErrorCode, message: String): LocationError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationError]
  }
  
  extension [Self <: LocationError](x: Self) {
    
    inline def setCode(value: LocationErrorCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
