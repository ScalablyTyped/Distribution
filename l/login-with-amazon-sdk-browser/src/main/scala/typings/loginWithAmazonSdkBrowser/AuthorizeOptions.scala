package typings.loginWithAmazonSdkBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options that may be passed to `authorize`.
  */
@js.native
trait AuthorizeOptions extends StObject {
  
  /**
    * Specifies when to show a login screen to the user.
    * `"auto"` will attempt to use a cached token. If the cached token fails or does not exist, the user will be presented with a login screen.
    * `"always"` does not use the cached token and always presents a login screen.
    * `"never"` will used the cached token; if the token does not work, authorize will return `invalid_grant`.
    * Defaults to `"auto"`.
    */
  var interactive: js.UndefOr[AuthorizeInteractiveOption] = js.native
  
  /**
    * `true` to use a popup window for login, `false` to redirect the current browser window to the authorization dialog. Defaults to `true`. If `false`, the next parameter MUST be a redirect URL.
    */
  var popup: js.UndefOr[Boolean] = js.native
  
  /**
    * The grant type requested. Specify `token` to request an Implicit grant or `code` to request an Authorization Code grant. Defaults to `token`.
    */
  var response_type: js.UndefOr[AuthorizeResponseType] = js.native
  
  /**
    * The access scope requested.
    */
  var scope: AuthorizeScope = js.native
  
  var scope_data: js.UndefOr[AuthorizeScopeData] = js.native
  
  /**
    * An opaque value used by the client to maintain state between this request and the response. The Login with Amazon authorization service will include this value when redirecting the user back
    * to the client. It is also used to prevent cross-site request forgery.
    * For more information see [Cross-site Request Forgery](https://developer.amazon.com/docs/login-with-amazon/cross-site-request-forgery.html).
    *
    */
  var state: js.UndefOr[String] = js.native
}
object AuthorizeOptions {
  
  @scala.inline
  def apply(scope: AuthorizeScope): AuthorizeOptions = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeOptions]
  }
  
  @scala.inline
  implicit class AuthorizeOptionsMutableBuilder[Self <: AuthorizeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInteractive(value: AuthorizeInteractiveOption): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
    
    @scala.inline
    def setPopup(value: Boolean): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
    
    @scala.inline
    def setResponse_type(value: AuthorizeResponseType): Self = StObject.set(x, "response_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse_typeUndefined: Self = StObject.set(x, "response_type", js.undefined)
    
    @scala.inline
    def setScope(value: AuthorizeScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeVarargs(value: AuthorizationScopeOptions*): Self = StObject.set(x, "scope", js.Array(value :_*))
    
    @scala.inline
    def setScope_data(value: AuthorizeScopeData): Self = StObject.set(x, "scope_data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope_dataUndefined: Self = StObject.set(x, "scope_data", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
