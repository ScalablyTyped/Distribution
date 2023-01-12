package typings.loginWithAmazonSdkBrowser

import typings.loginWithAmazonSdkBrowser.anon.Essential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ scope in login-with-amazon-sdk-browser.AuthorizationScopeOptions ]:? {  essential :boolean}} */
trait AuthorizeScopeData extends StObject {
  
  var postal_code: js.UndefOr[Essential] = js.undefined
  
  var profile: js.UndefOr[Essential] = js.undefined
  
  @JSName("profile:user_id")
  var profileColonuser_id: js.UndefOr[Essential] = js.undefined
}
object AuthorizeScopeData {
  
  inline def apply(): AuthorizeScopeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizeScopeData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthorizeScopeData] (val x: Self) extends AnyVal {
    
    inline def setPostal_code(value: Essential): Self = StObject.set(x, "postal_code", value.asInstanceOf[js.Any])
    
    inline def setPostal_codeUndefined: Self = StObject.set(x, "postal_code", js.undefined)
    
    inline def setProfile(value: Essential): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileColonuser_id(value: Essential): Self = StObject.set(x, "profile:user_id", value.asInstanceOf[js.Any])
    
    inline def setProfileColonuser_idUndefined: Self = StObject.set(x, "profile:user_id", js.undefined)
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
  }
}
