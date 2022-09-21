package typings.maximMazurokGapiClientAdmob.gapi.client.admob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait App extends StObject {
  
  /** The externally visible ID of the app which can be used to integrate with the AdMob SDK. This is a read only property. Example: ca-app-pub-9876543210987654~0123456789 */
  var appId: js.UndefOr[String] = js.undefined
  
  /** Immutable. The information for an app that is linked to an app store. This field is present if and only if the app is linked to an app store. */
  var linkedAppInfo: js.UndefOr[AppLinkedAppInfo] = js.undefined
  
  /**
    * The information for an app that is not linked to any app store. After an app is linked, this information is still retrivable. If no name is provided for the app upon creation, a
    * placeholder name will be used.
    */
  var manualAppInfo: js.UndefOr[AppManualAppInfo] = js.undefined
  
  /** Resource name for this app. Format is accounts/{publisher_id}/apps/{app_id_fragment} Example: accounts/pub-9876543210987654/apps/0123456789 */
  var name: js.UndefOr[String] = js.undefined
  
  /** Describes the platform of the app. Limited to "IOS" and "ANDROID". */
  var platform: js.UndefOr[String] = js.undefined
}
object App {
  
  inline def apply(): App = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[App]
  }
  
  extension [Self <: App](x: Self) {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setLinkedAppInfo(value: AppLinkedAppInfo): Self = StObject.set(x, "linkedAppInfo", value.asInstanceOf[js.Any])
    
    inline def setLinkedAppInfoUndefined: Self = StObject.set(x, "linkedAppInfo", js.undefined)
    
    inline def setManualAppInfo(value: AppManualAppInfo): Self = StObject.set(x, "manualAppInfo", value.asInstanceOf[js.Any])
    
    inline def setManualAppInfoUndefined: Self = StObject.set(x, "manualAppInfo", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
  }
}
