package typings.keycloakJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.keycloakJs.keycloakJsStrings.login
import typings.keycloakJs.keycloakJsStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeycloakLoginOptions extends StObject {
  
  /**
  	 * Sets the `acr` claim of the ID token sent inside the `claims` parameter. See section 5.5.1 of the OIDC 1.0 specification.
  	 */
  var acr: js.UndefOr[Acr] = js.undefined
  
  /**
  	 * If value is `'register'` then user is redirected to registration page,
  	 * otherwise to login page.
  	 */
  var action: js.UndefOr[String] = js.undefined
  
  /**
  	 * Specifies arguments that are passed to the Cordova in-app-browser (if applicable).
  	 * Options 'hidden' and 'location' are not affected by these arguments.
  	 * All available options are defined at https://cordova.apache.org/docs/en/latest/reference/cordova-plugin-inappbrowser/.
  	 * Example of use: { zoom: "no", hardwareback: "yes" }
  	 */
  var cordovaOptions: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
  	 * Used to tell Keycloak which IDP the user wants to authenticate with.
  	 */
  var idpHint: js.UndefOr[String] = js.undefined
  
  /**
  	 * Sets the 'ui_locales' query param in compliance with section 3.1.2.1
  							 * of the OIDC 1.0 specification.
  	 */
  var locale: js.UndefOr[String] = js.undefined
  
  /**
  	 * Used to pre-fill the username/email field on the login form.
  	 */
  var loginHint: js.UndefOr[String] = js.undefined
  
  /**
  	 * Used just if user is already authenticated. Specifies maximum time since
  	 * the authentication of user happened. If user is already authenticated for
  	 * longer time than `'maxAge'`, the SSO is ignored and he will need to
  	 * authenticate again.
  	 */
  var maxAge: js.UndefOr[Double] = js.undefined
  
  /**
  	 * By default the login screen is displayed if the user is not logged into
  	 * Keycloak. To only authenticate to the application if the user is already
  	 * logged in and not display the login page if the user is not logged in, set
  	 * this option to `'none'`. To always require re-authentication and ignore
  	 * SSO, set this option to `'login'`.
  	 */
  var prompt: js.UndefOr[none | login] = js.undefined
  
  /**
  	 * Specifies the uri to redirect to after login.
  	 */
  var redirectUri: js.UndefOr[String] = js.undefined
  
  /**
  	 * Specifies the scope parameter for the login url
  	 * The scope 'openid' will be added to the scope if it is missing or undefined.
  	 */
  var scope: js.UndefOr[String] = js.undefined
}
object KeycloakLoginOptions {
  
  inline def apply(): KeycloakLoginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeycloakLoginOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeycloakLoginOptions] (val x: Self) extends AnyVal {
    
    inline def setAcr(value: Acr): Self = StObject.set(x, "acr", value.asInstanceOf[js.Any])
    
    inline def setAcrUndefined: Self = StObject.set(x, "acr", js.undefined)
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setCordovaOptions(value: StringDictionary[String]): Self = StObject.set(x, "cordovaOptions", value.asInstanceOf[js.Any])
    
    inline def setCordovaOptionsUndefined: Self = StObject.set(x, "cordovaOptions", js.undefined)
    
    inline def setIdpHint(value: String): Self = StObject.set(x, "idpHint", value.asInstanceOf[js.Any])
    
    inline def setIdpHintUndefined: Self = StObject.set(x, "idpHint", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setLoginHint(value: String): Self = StObject.set(x, "loginHint", value.asInstanceOf[js.Any])
    
    inline def setLoginHintUndefined: Self = StObject.set(x, "loginHint", js.undefined)
    
    inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    
    inline def setPrompt(value: none | login): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
    
    inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
    
    inline def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
