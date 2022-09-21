package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountTreeRequest extends StObject {
  
  var accountName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource type for account ticket.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  var profileName: js.UndefOr[String | Null] = js.undefined
  
  var timezone: js.UndefOr[String | Null] = js.undefined
  
  var webpropertyName: js.UndefOr[String | Null] = js.undefined
  
  var websiteUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaAccountTreeRequest {
  
  inline def apply(): SchemaAccountTreeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountTreeRequest]
  }
  
  extension [Self <: SchemaAccountTreeRequest](x: Self) {
    
    inline def setAccountName(value: String): Self = StObject.set(x, "accountName", value.asInstanceOf[js.Any])
    
    inline def setAccountNameNull: Self = StObject.set(x, "accountName", null)
    
    inline def setAccountNameUndefined: Self = StObject.set(x, "accountName", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setProfileName(value: String): Self = StObject.set(x, "profileName", value.asInstanceOf[js.Any])
    
    inline def setProfileNameNull: Self = StObject.set(x, "profileName", null)
    
    inline def setProfileNameUndefined: Self = StObject.set(x, "profileName", js.undefined)
    
    inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneNull: Self = StObject.set(x, "timezone", null)
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
    
    inline def setWebpropertyName(value: String): Self = StObject.set(x, "webpropertyName", value.asInstanceOf[js.Any])
    
    inline def setWebpropertyNameNull: Self = StObject.set(x, "webpropertyName", null)
    
    inline def setWebpropertyNameUndefined: Self = StObject.set(x, "webpropertyName", js.undefined)
    
    inline def setWebsiteUrl(value: String): Self = StObject.set(x, "websiteUrl", value.asInstanceOf[js.Any])
    
    inline def setWebsiteUrlNull: Self = StObject.set(x, "websiteUrl", null)
    
    inline def setWebsiteUrlUndefined: Self = StObject.set(x, "websiteUrl", js.undefined)
  }
}
