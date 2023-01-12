package typings.maximMazurokGapiClientAdmob.gapi.client.admob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppLinkedAppInfo extends StObject {
  
  /**
    * The app store ID of the app; present if and only if the app is linked to an app store. If the app is added to the Google Play store, it will be the application ID of the app. For
    * example: "com.example.myapp". See https://developer.android.com/studio/build/application-id. If the app is added to the Apple App Store, it will be app store ID. For example
    * "105169111". Note that setting the app store id is considered an irreversible action. Once an app is linked, it cannot be unlinked.
    */
  var appStoreId: js.UndefOr[String] = js.undefined
  
  /** Output only. Display name of the app as it appears in the app store. This is an output-only field, and may be empty if the app cannot be found in the store. */
  var displayName: js.UndefOr[String] = js.undefined
}
object AppLinkedAppInfo {
  
  inline def apply(): AppLinkedAppInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppLinkedAppInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppLinkedAppInfo] (val x: Self) extends AnyVal {
    
    inline def setAppStoreId(value: String): Self = StObject.set(x, "appStoreId", value.asInstanceOf[js.Any])
    
    inline def setAppStoreIdUndefined: Self = StObject.set(x, "appStoreId", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
