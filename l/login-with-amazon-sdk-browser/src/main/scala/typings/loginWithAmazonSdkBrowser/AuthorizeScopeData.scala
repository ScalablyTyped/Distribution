package typings.loginWithAmazonSdkBrowser

import typings.loginWithAmazonSdkBrowser.anon.Essential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ scope in login-with-amazon-sdk-browser.AuthorizationScopeOptions ]:? {  essential :boolean}} */
@js.native
trait AuthorizeScopeData extends StObject {
  
  var postal_code: js.UndefOr[Essential] = js.native
  
  var profile: js.UndefOr[Essential] = js.native
  
  @JSName("profile:user_id")
  var profileColonuser_id: js.UndefOr[Essential] = js.native
}
object AuthorizeScopeData {
  
  @scala.inline
  def apply(): AuthorizeScopeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizeScopeData]
  }
  
  @scala.inline
  implicit class AuthorizeScopeDataMutableBuilder[Self <: AuthorizeScopeData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPostal_code(value: Essential): Self = StObject.set(x, "postal_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostal_codeUndefined: Self = StObject.set(x, "postal_code", js.undefined)
    
    @scala.inline
    def setProfile(value: Essential): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileColonuser_id(value: Essential): Self = StObject.set(x, "profile:user_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileColonuser_idUndefined: Self = StObject.set(x, "profile:user_id", js.undefined)
    
    @scala.inline
    def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
  }
}
