package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountTreeRequest extends StObject {
  
  var accountName: js.UndefOr[String] = js.undefined
  
  /** Resource type for account ticket. */
  var kind: js.UndefOr[String] = js.undefined
  
  var profileName: js.UndefOr[String] = js.undefined
  
  var timezone: js.UndefOr[String] = js.undefined
  
  var webpropertyName: js.UndefOr[String] = js.undefined
  
  var websiteUrl: js.UndefOr[String] = js.undefined
}
object AccountTreeRequest {
  
  inline def apply(): AccountTreeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountTreeRequest]
  }
  
  extension [Self <: AccountTreeRequest](x: Self) {
    
    inline def setAccountName(value: String): Self = StObject.set(x, "accountName", value.asInstanceOf[js.Any])
    
    inline def setAccountNameUndefined: Self = StObject.set(x, "accountName", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setProfileName(value: String): Self = StObject.set(x, "profileName", value.asInstanceOf[js.Any])
    
    inline def setProfileNameUndefined: Self = StObject.set(x, "profileName", js.undefined)
    
    inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
    
    inline def setWebpropertyName(value: String): Self = StObject.set(x, "webpropertyName", value.asInstanceOf[js.Any])
    
    inline def setWebpropertyNameUndefined: Self = StObject.set(x, "webpropertyName", js.undefined)
    
    inline def setWebsiteUrl(value: String): Self = StObject.set(x, "websiteUrl", value.asInstanceOf[js.Any])
    
    inline def setWebsiteUrlUndefined: Self = StObject.set(x, "websiteUrl", js.undefined)
  }
}
