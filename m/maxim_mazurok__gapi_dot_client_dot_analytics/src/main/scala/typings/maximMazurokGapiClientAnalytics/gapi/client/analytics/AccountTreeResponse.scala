package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountTreeResponse extends StObject {
  
  /** The account created. */
  var account: js.UndefOr[Account] = js.undefined
  
  /** Resource type for account ticket. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** View (Profile) for the account. */
  var profile: js.UndefOr[Profile] = js.undefined
  
  /** Web property for the account. */
  var webproperty: js.UndefOr[Webproperty] = js.undefined
}
object AccountTreeResponse {
  
  inline def apply(): AccountTreeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountTreeResponse]
  }
  
  extension [Self <: AccountTreeResponse](x: Self) {
    
    inline def setAccount(value: Account): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setProfile(value: Profile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setWebproperty(value: Webproperty): Self = StObject.set(x, "webproperty", value.asInstanceOf[js.Any])
    
    inline def setWebpropertyUndefined: Self = StObject.set(x, "webproperty", js.undefined)
  }
}
