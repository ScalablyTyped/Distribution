package typings.googleapis.firebaseappcheckV1betaMod.firebaseappcheckV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirebaseAppcheckV1betaExchangeDeviceCheckTokenRequest extends StObject {
  
  /**
    * Required. The `device_token` as returned by Apple's client-side [DeviceCheck API](https://developer.apple.com/documentation/devicecheck/dcdevice). This is the base64 encoded `Data` (Swift) or `NSData` (ObjC) object.
    */
  var deviceToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleFirebaseAppcheckV1betaExchangeDeviceCheckTokenRequest {
  
  inline def apply(): SchemaGoogleFirebaseAppcheckV1betaExchangeDeviceCheckTokenRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirebaseAppcheckV1betaExchangeDeviceCheckTokenRequest]
  }
  
  extension [Self <: SchemaGoogleFirebaseAppcheckV1betaExchangeDeviceCheckTokenRequest](x: Self) {
    
    inline def setDeviceToken(value: String): Self = StObject.set(x, "deviceToken", value.asInstanceOf[js.Any])
    
    inline def setDeviceTokenNull: Self = StObject.set(x, "deviceToken", null)
    
    inline def setDeviceTokenUndefined: Self = StObject.set(x, "deviceToken", js.undefined)
  }
}
