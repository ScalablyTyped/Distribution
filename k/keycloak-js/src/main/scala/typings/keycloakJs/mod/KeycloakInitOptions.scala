package typings.keycloakJs.mod

import typings.keycloakJs.keycloakJsStrings.`cordova-native`
import typings.keycloakJs.keycloakJsStrings.cordova
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeycloakInitOptions extends StObject {
  
  /**
  	 * 
  	 * Allow usage of different types of adapters or a custom adapter to make Keycloak work in different environments.
  	 *
  	 * The following options are supported:
  	 * - `default` - Use default APIs that are available in browsers.
  	 * - `cordova` - Use a WebView in Cordova.
  	 * - `cordova-native` - Use Cordova native APIs, this is recommended over `cordova`.
  	 *
  	 * It's also possible to pass in a custom adapter for the environment you are running Keycloak in. In order to do so extend the `KeycloakAdapter` interface and implement the methods that are defined there.
  	 *
  	 * For example:
  	 *
  	 * ```ts
  	 * import Keycloak, { KeycloakAdapter } from 'keycloak-js';
  	 *
  	 * // Implement the 'KeycloakAdapter' interface so that all required methods are guaranteed to be present.
  	 * const MyCustomAdapter: KeycloakAdapter = {
  	 * 	login(options) {
  	 * 		// Write your own implementation here.
  	 * 	}
  	 *
  	 * 	// The other methods go here...
  	 * };
  	 *
  	 * const keycloak = new Keycloak();
  	 *
  	 * keycloak.init({
  	 * 	adapter: MyCustomAdapter,
  	 * });
  	 * ```
  	 */
  var adapter: js.UndefOr[
    typings.keycloakJs.keycloakJsStrings.default | cordova | `cordova-native` | KeycloakAdapter
  ] = js.undefined
  
  /**
  	 * Set to enable/disable monitoring login state.
  	 * @default true
  	 */
  var checkLoginIframe: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Set the interval to check login state (in seconds).
  	 * @default 5
  	 */
  var checkLoginIframeInterval: js.UndefOr[Double] = js.undefined
  
  /**
  	 * Enables logging messages from Keycloak to the console.
  	 * @default false
  	 */
  var enableLogging: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Set the OpenID Connect flow.
  	 * @default standard
  	 */
  var flow: js.UndefOr[KeycloakFlow] = js.undefined
  
  /**
  	 * Set an initial value for the id token (only together with `token` or
  	 * `refreshToken`).
  	 */
  var idToken: js.UndefOr[String] = js.undefined
  
  /**
  	 * Configures how long will Keycloak adapter wait for receiving messages from server in ms. This is used,
  	 * for example, when waiting for response of 3rd party cookies check.
  	 *
  	 * @default 10000
  	 */
  var messageReceiveTimeout: js.UndefOr[Double] = js.undefined
  
  /**
  	 * Specifies an action to do on load.
  	 */
  var onLoad: js.UndefOr[KeycloakOnLoad] = js.undefined
  
  /**
  	 * Configures the Proof Key for Code Exchange (PKCE) method to use.
  	 * The currently allowed method is 'S256'.
  	 * If not configured, PKCE will not be used.
  	 */
  var pkceMethod: js.UndefOr[KeycloakPkceMethod] = js.undefined
  
  /**
  	 * Specifies a default uri to redirect to after login or logout.
  	 * This is currently supported for adapter 'cordova-native' and 'default'
  	 */
  var redirectUri: js.UndefOr[String] = js.undefined
  
  /**
  	 * Set an initial value for the refresh token.
  	 */
  var refreshToken: js.UndefOr[String] = js.undefined
  
  /**
  	 * Set the OpenID Connect response mode to send to Keycloak upon login.
  	 * @default fragment After successful authentication Keycloak will redirect
  	 *                   to JavaScript application with OpenID Connect parameters
  	 *                   added in URL fragment. This is generally safer and
  	 *                   recommended over query.
  	 */
  var responseMode: js.UndefOr[KeycloakResponseMode] = js.undefined
  
  /**
  	 * Set the default scope parameter to the login endpoint. Use a space-delimited list of scopes. 
  	 * Note that the scope 'openid' will be always be added to the list of scopes by the adapter.
  	 * Note that the default scope specified here is overwritten if the `login()` options specify scope explicitly.
  	 */
  var scope: js.UndefOr[String] = js.undefined
  
  /**
  	 * Specifies whether the silent check-sso should fallback to "non-silent"
  	 * check-sso when 3rd party cookies are blocked by the browser. Defaults
  	 * to true.
  	 */
  var silentCheckSsoFallback: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Specifies an uri to redirect to after silent check-sso.
  	 * Silent check-sso will only happen, when this redirect uri is given and
  	 * the specified uri is available within the application.
  	 */
  var silentCheckSsoRedirectUri: js.UndefOr[String] = js.undefined
  
  /**
  	 * Set an initial value for skew between local time and Keycloak server in
  	 * seconds (only together with `token` or `refreshToken`).
  	 */
  var timeSkew: js.UndefOr[Double] = js.undefined
  
  /**
  	 * Set an initial value for the token.
  	 */
  var token: js.UndefOr[String] = js.undefined
  
  /**
  	 * Adds a [cryptographic nonce](https://en.wikipedia.org/wiki/Cryptographic_nonce)
  	 * to verify that the authentication response matches the request.
  	 * @default true
  	 */
  var useNonce: js.UndefOr[Boolean] = js.undefined
}
object KeycloakInitOptions {
  
  inline def apply(): KeycloakInitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeycloakInitOptions]
  }
  
  extension [Self <: KeycloakInitOptions](x: Self) {
    
    inline def setAdapter(value: typings.keycloakJs.keycloakJsStrings.default | cordova | `cordova-native` | KeycloakAdapter): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
    
    inline def setAdapterUndefined: Self = StObject.set(x, "adapter", js.undefined)
    
    inline def setCheckLoginIframe(value: Boolean): Self = StObject.set(x, "checkLoginIframe", value.asInstanceOf[js.Any])
    
    inline def setCheckLoginIframeInterval(value: Double): Self = StObject.set(x, "checkLoginIframeInterval", value.asInstanceOf[js.Any])
    
    inline def setCheckLoginIframeIntervalUndefined: Self = StObject.set(x, "checkLoginIframeInterval", js.undefined)
    
    inline def setCheckLoginIframeUndefined: Self = StObject.set(x, "checkLoginIframe", js.undefined)
    
    inline def setEnableLogging(value: Boolean): Self = StObject.set(x, "enableLogging", value.asInstanceOf[js.Any])
    
    inline def setEnableLoggingUndefined: Self = StObject.set(x, "enableLogging", js.undefined)
    
    inline def setFlow(value: KeycloakFlow): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    inline def setFlowUndefined: Self = StObject.set(x, "flow", js.undefined)
    
    inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    inline def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    inline def setMessageReceiveTimeout(value: Double): Self = StObject.set(x, "messageReceiveTimeout", value.asInstanceOf[js.Any])
    
    inline def setMessageReceiveTimeoutUndefined: Self = StObject.set(x, "messageReceiveTimeout", js.undefined)
    
    inline def setOnLoad(value: KeycloakOnLoad): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
    
    inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    inline def setPkceMethod(value: KeycloakPkceMethod): Self = StObject.set(x, "pkceMethod", value.asInstanceOf[js.Any])
    
    inline def setPkceMethodUndefined: Self = StObject.set(x, "pkceMethod", js.undefined)
    
    inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
    
    inline def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
    
    inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    
    inline def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
    
    inline def setResponseMode(value: KeycloakResponseMode): Self = StObject.set(x, "responseMode", value.asInstanceOf[js.Any])
    
    inline def setResponseModeUndefined: Self = StObject.set(x, "responseMode", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSilentCheckSsoFallback(value: Boolean): Self = StObject.set(x, "silentCheckSsoFallback", value.asInstanceOf[js.Any])
    
    inline def setSilentCheckSsoFallbackUndefined: Self = StObject.set(x, "silentCheckSsoFallback", js.undefined)
    
    inline def setSilentCheckSsoRedirectUri(value: String): Self = StObject.set(x, "silentCheckSsoRedirectUri", value.asInstanceOf[js.Any])
    
    inline def setSilentCheckSsoRedirectUriUndefined: Self = StObject.set(x, "silentCheckSsoRedirectUri", js.undefined)
    
    inline def setTimeSkew(value: Double): Self = StObject.set(x, "timeSkew", value.asInstanceOf[js.Any])
    
    inline def setTimeSkewUndefined: Self = StObject.set(x, "timeSkew", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    inline def setUseNonce(value: Boolean): Self = StObject.set(x, "useNonce", value.asInstanceOf[js.Any])
    
    inline def setUseNonceUndefined: Self = StObject.set(x, "useNonce", js.undefined)
  }
}
