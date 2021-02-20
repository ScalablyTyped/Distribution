package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountTreeResponse extends StObject {
  
  /** The account created. */
  var account: js.UndefOr[Account] = js.native
  
  /** Resource type for account ticket. */
  var kind: js.UndefOr[String] = js.native
  
  /** View (Profile) for the account. */
  var profile: js.UndefOr[Profile] = js.native
  
  /** Web property for the account. */
  var webproperty: js.UndefOr[Webproperty] = js.native
}
object AccountTreeResponse {
  
  @scala.inline
  def apply(): AccountTreeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountTreeResponse]
  }
  
  @scala.inline
  implicit class AccountTreeResponseMutableBuilder[Self <: AccountTreeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: Account): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setProfile(value: Profile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    @scala.inline
    def setWebproperty(value: Webproperty): Self = StObject.set(x, "webproperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebpropertyUndefined: Self = StObject.set(x, "webproperty", js.undefined)
  }
}
