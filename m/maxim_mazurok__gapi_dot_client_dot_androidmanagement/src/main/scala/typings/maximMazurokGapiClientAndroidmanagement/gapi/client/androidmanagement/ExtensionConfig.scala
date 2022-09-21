package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionConfig extends StObject {
  
  /** Fully qualified class name of the receiver service class for Android Device Policy to notify the extension app of any local command status updates. */
  var notificationReceiver: js.UndefOr[String] = js.undefined
  
  /**
    * Hex-encoded SHA-256 hash of the signing certificate of the extension app. Only hexadecimal string representations of 64 characters are valid.If not specified, the signature for the
    * corresponding package name is obtained from the Play Store instead.If this list is empty, the signature of the extension app on the device must match the signature obtained from the
    * Play Store for the app to be able to communicate with Android Device Policy.If this list is not empty, the signature of the extension app on the device must match one of the entries
    * in this list for the app to be able to communicate with Android Device Policy.In production use cases, it is recommended to leave this empty.
    */
  var signingKeyFingerprintsSha256: js.UndefOr[js.Array[String]] = js.undefined
}
object ExtensionConfig {
  
  inline def apply(): ExtensionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtensionConfig]
  }
  
  extension [Self <: ExtensionConfig](x: Self) {
    
    inline def setNotificationReceiver(value: String): Self = StObject.set(x, "notificationReceiver", value.asInstanceOf[js.Any])
    
    inline def setNotificationReceiverUndefined: Self = StObject.set(x, "notificationReceiver", js.undefined)
    
    inline def setSigningKeyFingerprintsSha256(value: js.Array[String]): Self = StObject.set(x, "signingKeyFingerprintsSha256", value.asInstanceOf[js.Any])
    
    inline def setSigningKeyFingerprintsSha256Undefined: Self = StObject.set(x, "signingKeyFingerprintsSha256", js.undefined)
    
    inline def setSigningKeyFingerprintsSha256Varargs(value: String*): Self = StObject.set(x, "signingKeyFingerprintsSha256", js.Array(value*))
  }
}
