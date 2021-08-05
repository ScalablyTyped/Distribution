package typings.loginWithAmazonSdkBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options that may be passed to `authorize`.
  */
trait AuthorizeOptions extends StObject {
  
  /**
    * Specifies when to show a login screen to the user.
    * `"auto"` will attempt to use a cached token. If the cached token fails or does not exist, the user will be presented with a login screen.
    * `"always"` does not use the cached token and always presents a login screen.
    * `"never"` will used the cached token; if the token does not work, authorize will return `invalid_grant`.
    * Defaults to `"auto"`.
    */
  var interactive: js.UndefOr[AuthorizeInteractiveOption] = js.undefined
  
  /**
    * `true` to use a popup window for login, `false` to redirect the current browser window to the authorization dialog. Defaults to `true`. If `false`, the next parameter MUST be a redirect URL.
    */
  var popup: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The grant type requested. Specify `token` to request an Implicit grant or `code` to request an Authorization Code grant. Defaults to `token`.
    */
  var response_type: js.UndefOr[AuthorizeResponseType] = js.undefined
  
  /**
    * The access scope requested.
    */
  var scope: AuthorizeScope
  
  var scope_data: js.UndefOr[AuthorizeScopeData] = js.undefined
  
  /**
    * An opaque value used by the client to maintain state between this request and the response. The Login with Amazon authorization service will include this value when redirecting the user back
    * to the client. It is also used to prevent cross-site request forgery.
    * For more information see [Cross-site Request Forgery](https://developer.amazon.com/docs/login-with-amazon/cross-site-request-forgery.html).
    *
    */
  var state: js.UndefOr[String] = js.undefined
}
object AuthorizeOptions {
  
  inline def apply(scope: AuthorizeScope): AuthorizeOptions = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeOptions]
  }
  
  extension [Self <: AuthorizeOptions](x: Self) {
    
    inline def setInteractive(value: AuthorizeInteractiveOption): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
    
    inline def setPopup(value: Boolean): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    
    inline def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
    
    inline def setResponse_type(value: AuthorizeResponseType): Self = StObject.set(x, "response_type", value.asInstanceOf[js.Any])
    
    inline def setResponse_typeUndefined: Self = StObject.set(x, "response_type", js.undefined)
    
    inline def setScope(value: AuthorizeScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeVarargs(value: AuthorizationScopeOptions*): Self = StObject.set(x, "scope", js.Array(value :_*))
    
    inline def setScope_data(value: AuthorizeScopeData): Self = StObject.set(x, "scope_data", value.asInstanceOf[js.Any])
    
    inline def setScope_dataUndefined: Self = StObject.set(x, "scope_data", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
