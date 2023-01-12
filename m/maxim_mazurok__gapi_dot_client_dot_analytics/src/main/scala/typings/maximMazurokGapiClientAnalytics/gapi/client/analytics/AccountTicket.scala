package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountTicket extends StObject {
  
  /** Account for this ticket. */
  var account: js.UndefOr[Account] = js.undefined
  
  /** Account ticket ID used to access the account ticket. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Resource type for account ticket. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** View (Profile) for the account. */
  var profile: js.UndefOr[Profile] = js.undefined
  
  /** Redirect URI where the user will be sent after accepting Terms of Service. Must be configured in APIs console as a callback URL. */
  var redirectUri: js.UndefOr[String] = js.undefined
  
  /** Web property for the account. */
  var webproperty: js.UndefOr[Webproperty] = js.undefined
}
object AccountTicket {
  
  inline def apply(): AccountTicket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountTicket]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountTicket] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: Account): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setProfile(value: Profile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
    
    inline def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
    
    inline def setWebproperty(value: Webproperty): Self = StObject.set(x, "webproperty", value.asInstanceOf[js.Any])
    
    inline def setWebpropertyUndefined: Self = StObject.set(x, "webproperty", js.undefined)
  }
}
