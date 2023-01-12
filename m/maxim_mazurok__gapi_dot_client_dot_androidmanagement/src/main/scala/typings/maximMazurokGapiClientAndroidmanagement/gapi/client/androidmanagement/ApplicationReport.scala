package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationReport extends StObject {
  
  /** The source of the package. */
  var applicationSource: js.UndefOr[String] = js.undefined
  
  /** The display name of the app. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** List of app events. The most recent 20 events are stored in the list. */
  var events: js.UndefOr[js.Array[ApplicationEvent]] = js.undefined
  
  /** The package name of the app that installed this app. */
  var installerPackageName: js.UndefOr[String] = js.undefined
  
  /** List of keyed app states reported by the app. */
  var keyedAppStates: js.UndefOr[js.Array[KeyedAppState]] = js.undefined
  
  /** Package name of the app. */
  var packageName: js.UndefOr[String] = js.undefined
  
  /** The SHA-256 hash of the app's APK file, which can be used to verify the app hasn't been modified. Each byte of the hash value is represented as a two-digit hexadecimal number. */
  var packageSha256Hash: js.UndefOr[String] = js.undefined
  
  /**
    * The SHA-1 hash of each android.content.pm.Signature (https://developer.android.com/reference/android/content/pm/Signature.html) associated with the app package. Each byte of each
    * hash value is represented as a two-digit hexadecimal number.
    */
  var signingKeyCertFingerprints: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Application state. */
  var state: js.UndefOr[String] = js.undefined
  
  /** The app version code, which can be used to determine whether one version is more recent than another. */
  var versionCode: js.UndefOr[Double] = js.undefined
  
  /** The app version as displayed to the user. */
  var versionName: js.UndefOr[String] = js.undefined
}
object ApplicationReport {
  
  inline def apply(): ApplicationReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationReport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationReport] (val x: Self) extends AnyVal {
    
    inline def setApplicationSource(value: String): Self = StObject.set(x, "applicationSource", value.asInstanceOf[js.Any])
    
    inline def setApplicationSourceUndefined: Self = StObject.set(x, "applicationSource", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEvents(value: js.Array[ApplicationEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: ApplicationEvent*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setInstallerPackageName(value: String): Self = StObject.set(x, "installerPackageName", value.asInstanceOf[js.Any])
    
    inline def setInstallerPackageNameUndefined: Self = StObject.set(x, "installerPackageName", js.undefined)
    
    inline def setKeyedAppStates(value: js.Array[KeyedAppState]): Self = StObject.set(x, "keyedAppStates", value.asInstanceOf[js.Any])
    
    inline def setKeyedAppStatesUndefined: Self = StObject.set(x, "keyedAppStates", js.undefined)
    
    inline def setKeyedAppStatesVarargs(value: KeyedAppState*): Self = StObject.set(x, "keyedAppStates", js.Array(value*))
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setPackageSha256Hash(value: String): Self = StObject.set(x, "packageSha256Hash", value.asInstanceOf[js.Any])
    
    inline def setPackageSha256HashUndefined: Self = StObject.set(x, "packageSha256Hash", js.undefined)
    
    inline def setSigningKeyCertFingerprints(value: js.Array[String]): Self = StObject.set(x, "signingKeyCertFingerprints", value.asInstanceOf[js.Any])
    
    inline def setSigningKeyCertFingerprintsUndefined: Self = StObject.set(x, "signingKeyCertFingerprints", js.undefined)
    
    inline def setSigningKeyCertFingerprintsVarargs(value: String*): Self = StObject.set(x, "signingKeyCertFingerprints", js.Array(value*))
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setVersionCode(value: Double): Self = StObject.set(x, "versionCode", value.asInstanceOf[js.Any])
    
    inline def setVersionCodeUndefined: Self = StObject.set(x, "versionCode", js.undefined)
    
    inline def setVersionName(value: String): Self = StObject.set(x, "versionName", value.asInstanceOf[js.Any])
    
    inline def setVersionNameUndefined: Self = StObject.set(x, "versionName", js.undefined)
  }
}
