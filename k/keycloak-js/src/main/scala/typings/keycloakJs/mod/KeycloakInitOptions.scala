package typings.keycloakJs.mod

import typings.keycloakJs.keycloakJsStrings.`cordova-native`
import typings.keycloakJs.keycloakJsStrings.cordova
import typings.keycloakJs.keycloakJsStrings.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeycloakInitOptions extends js.Object {
  
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
  var adapter: js.UndefOr[default | cordova | `cordova-native` | KeycloakAdapter] = js.native
  
  /**
  		 * Set to enable/disable monitoring login state.
  		 * @default true
  		 */
  var checkLoginIframe: js.UndefOr[Boolean] = js.native
  
  /**
  		 * Set the interval to check login state (in seconds).
  		 * @default 5
  		 */
  var checkLoginIframeInterval: js.UndefOr[Double] = js.native
  
  /**
  		 * Enables logging messages from Keycloak to the console.
  		 * @default false
  		 */
  var enableLogging: js.UndefOr[Boolean] = js.native
  
  /**
  		 * Set the OpenID Connect flow.
  		 * @default standard
  		 */
  var flow: js.UndefOr[KeycloakFlow] = js.native
  
  /**
  		 * Set an initial value for the id token (only together with `token` or
  		 * `refreshToken`).
  		 */
  var idToken: js.UndefOr[String] = js.native
  
  /**
  		 * Specifies an action to do on load.
  		 */
  var onLoad: js.UndefOr[KeycloakOnLoad] = js.native
  
  /**
  		 * Configures the Proof Key for Code Exchange (PKCE) method to use.
  		 * The currently allowed method is 'S256'.
  		 * If not configured, PKCE will not be used.
  		 */
  var pkceMethod: js.UndefOr[KeycloakPkceMethod] = js.native
  
  /**
  		 * Specifies a default uri to redirect to after login or logout.
  		 * This is currently supported for adapter 'cordova-native' and 'default'
  		 */
  var redirectUri: js.UndefOr[String] = js.native
  
  /**
  		 * Set an initial value for the refresh token.
  		 */
  var refreshToken: js.UndefOr[String] = js.native
  
  /**
  		 * Set the OpenID Connect response mode to send to Keycloak upon login.
  		 * @default fragment After successful authentication Keycloak will redirect
  		 *                   to JavaScript application with OpenID Connect parameters
  		 *                   added in URL fragment. This is generally safer and
  		 *                   recommended over query.
  		 */
  var responseMode: js.UndefOr[KeycloakResponseMode] = js.native
  
  /**
  		 * Specifies whether the silent check-sso should fallback to "non-silent"
  		 * check-sso when 3rd party cookies are blocked by the browser. Defaults
  		 * to true.
  		 */
  var silentCheckSsoFallback: js.UndefOr[Boolean] = js.native
  
  /**
  		 * Specifies an uri to redirect to after silent check-sso.
  		 * Silent check-sso will only happen, when this redirect uri is given and
  		 * the specified uri is available whithin the application.
  		 */
  var silentCheckSsoRedirectUri: js.UndefOr[String] = js.native
  
  /**
  		 * Set an initial value for skew between local time and Keycloak server in
  		 * seconds (only together with `token` or `refreshToken`).
  		 */
  var timeSkew: js.UndefOr[Double] = js.native
  
  /**
  		 * Set an initial value for the token.
  		 */
  var token: js.UndefOr[String] = js.native
  
  /**
  		 * Adds a [cryptographic nonce](https://en.wikipedia.org/wiki/Cryptographic_nonce)
  		 * to verify that the authentication response matches the request.
  		 * @default true
  		 */
  var useNonce: js.UndefOr[Boolean] = js.native
}
object KeycloakInitOptions {
  
  @scala.inline
  def apply(): KeycloakInitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeycloakInitOptions]
  }
  
  @scala.inline
  implicit class KeycloakInitOptionsOps[Self <: KeycloakInitOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdapter(value: default | cordova | `cordova-native` | KeycloakAdapter): Self = this.set("adapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdapter: Self = this.set("adapter", js.undefined)
    
    @scala.inline
    def setCheckLoginIframe(value: Boolean): Self = this.set("checkLoginIframe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckLoginIframe: Self = this.set("checkLoginIframe", js.undefined)
    
    @scala.inline
    def setCheckLoginIframeInterval(value: Double): Self = this.set("checkLoginIframeInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckLoginIframeInterval: Self = this.set("checkLoginIframeInterval", js.undefined)
    
    @scala.inline
    def setEnableLogging(value: Boolean): Self = this.set("enableLogging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableLogging: Self = this.set("enableLogging", js.undefined)
    
    @scala.inline
    def setFlow(value: KeycloakFlow): Self = this.set("flow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlow: Self = this.set("flow", js.undefined)
    
    @scala.inline
    def setIdToken(value: String): Self = this.set("idToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdToken: Self = this.set("idToken", js.undefined)
    
    @scala.inline
    def setOnLoad(value: KeycloakOnLoad): Self = this.set("onLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    
    @scala.inline
    def setPkceMethod(value: KeycloakPkceMethod): Self = this.set("pkceMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePkceMethod: Self = this.set("pkceMethod", js.undefined)
    
    @scala.inline
    def setRedirectUri(value: String): Self = this.set("redirectUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirectUri: Self = this.set("redirectUri", js.undefined)
    
    @scala.inline
    def setRefreshToken(value: String): Self = this.set("refreshToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshToken: Self = this.set("refreshToken", js.undefined)
    
    @scala.inline
    def setResponseMode(value: KeycloakResponseMode): Self = this.set("responseMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseMode: Self = this.set("responseMode", js.undefined)
    
    @scala.inline
    def setSilentCheckSsoFallback(value: Boolean): Self = this.set("silentCheckSsoFallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilentCheckSsoFallback: Self = this.set("silentCheckSsoFallback", js.undefined)
    
    @scala.inline
    def setSilentCheckSsoRedirectUri(value: String): Self = this.set("silentCheckSsoRedirectUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilentCheckSsoRedirectUri: Self = this.set("silentCheckSsoRedirectUri", js.undefined)
    
    @scala.inline
    def setTimeSkew(value: Double): Self = this.set("timeSkew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeSkew: Self = this.set("timeSkew", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
    
    @scala.inline
    def setUseNonce(value: Boolean): Self = this.set("useNonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseNonce: Self = this.set("useNonce", js.undefined)
  }
}
