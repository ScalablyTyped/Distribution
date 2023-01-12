package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteAppId extends StObject {
  
  /** Enum indicating the type of App this is. */
  var appType: js.UndefOr[String] = js.undefined
  
  /**
    * Enum indicating which 1P App this is when app_type is GSUITE_APP. Determined & set by the 1P API as a convenience for all users of this identifier(Eg. clients, chime, backend etc.)
    * to map to 1P properties.
    */
  var gsuiteAppType: js.UndefOr[String] = js.undefined
  
  /** Numeric identifier of the App. Set to Project number for 1/3P Apps. For Webhook, this is WebhookId. Determined & set by the 1P API from App credentials on the side channel. */
  var id: js.UndefOr[String] = js.undefined
}
object AppsDynamiteAppId {
  
  inline def apply(): AppsDynamiteAppId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteAppId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteAppId] (val x: Self) extends AnyVal {
    
    inline def setAppType(value: String): Self = StObject.set(x, "appType", value.asInstanceOf[js.Any])
    
    inline def setAppTypeUndefined: Self = StObject.set(x, "appType", js.undefined)
    
    inline def setGsuiteAppType(value: String): Self = StObject.set(x, "gsuiteAppType", value.asInstanceOf[js.Any])
    
    inline def setGsuiteAppTypeUndefined: Self = StObject.set(x, "gsuiteAppType", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
