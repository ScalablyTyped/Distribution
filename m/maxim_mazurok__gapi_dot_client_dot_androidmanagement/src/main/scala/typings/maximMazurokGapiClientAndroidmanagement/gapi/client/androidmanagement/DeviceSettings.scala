package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceSettings extends StObject {
  
  /** Whether ADB (https://developer.android.com/studio/command-line/adb.html) is enabled on the device. */
  var adbEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Whether developer mode is enabled on the device. */
  var developmentSettingsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Encryption status from DevicePolicyManager. */
  var encryptionStatus: js.UndefOr[String] = js.undefined
  
  /** Whether the device is secured with PIN/password. */
  var isDeviceSecure: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the storage encryption is enabled. */
  var isEncrypted: js.UndefOr[Boolean] = js.undefined
  
  /** Whether installing apps from unknown sources is enabled. */
  var unknownSourcesEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Whether Google Play Protect verification (https://support.google.com/accounts/answer/2812853) is enforced on the device. */
  var verifyAppsEnabled: js.UndefOr[Boolean] = js.undefined
}
object DeviceSettings {
  
  inline def apply(): DeviceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceSettings]
  }
  
  extension [Self <: DeviceSettings](x: Self) {
    
    inline def setAdbEnabled(value: Boolean): Self = StObject.set(x, "adbEnabled", value.asInstanceOf[js.Any])
    
    inline def setAdbEnabledUndefined: Self = StObject.set(x, "adbEnabled", js.undefined)
    
    inline def setDevelopmentSettingsEnabled(value: Boolean): Self = StObject.set(x, "developmentSettingsEnabled", value.asInstanceOf[js.Any])
    
    inline def setDevelopmentSettingsEnabledUndefined: Self = StObject.set(x, "developmentSettingsEnabled", js.undefined)
    
    inline def setEncryptionStatus(value: String): Self = StObject.set(x, "encryptionStatus", value.asInstanceOf[js.Any])
    
    inline def setEncryptionStatusUndefined: Self = StObject.set(x, "encryptionStatus", js.undefined)
    
    inline def setIsDeviceSecure(value: Boolean): Self = StObject.set(x, "isDeviceSecure", value.asInstanceOf[js.Any])
    
    inline def setIsDeviceSecureUndefined: Self = StObject.set(x, "isDeviceSecure", js.undefined)
    
    inline def setIsEncrypted(value: Boolean): Self = StObject.set(x, "isEncrypted", value.asInstanceOf[js.Any])
    
    inline def setIsEncryptedUndefined: Self = StObject.set(x, "isEncrypted", js.undefined)
    
    inline def setUnknownSourcesEnabled(value: Boolean): Self = StObject.set(x, "unknownSourcesEnabled", value.asInstanceOf[js.Any])
    
    inline def setUnknownSourcesEnabledUndefined: Self = StObject.set(x, "unknownSourcesEnabled", js.undefined)
    
    inline def setVerifyAppsEnabled(value: Boolean): Self = StObject.set(x, "verifyAppsEnabled", value.asInstanceOf[js.Any])
    
    inline def setVerifyAppsEnabledUndefined: Self = StObject.set(x, "verifyAppsEnabled", js.undefined)
  }
}
