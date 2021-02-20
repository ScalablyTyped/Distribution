package typings.keycloakJs

import org.scalablytyped.runtime.StringDictionary
import typings.keycloakJs.anon.RedirectUri
import typings.keycloakJs.keycloakJsStrings.S256
import typings.keycloakJs.keycloakJsStrings.`cordova-native`
import typings.keycloakJs.keycloakJsStrings.cancelled
import typings.keycloakJs.keycloakJsStrings.cordova
import typings.keycloakJs.keycloakJsStrings.default
import typings.keycloakJs.keycloakJsStrings.error
import typings.keycloakJs.keycloakJsStrings.login
import typings.keycloakJs.keycloakJsStrings.none
import typings.keycloakJs.keycloakJsStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Creates a new Keycloak client instance.
    * @param config A configuration object or path to a JSON config file.
    */
  @JSImport("keycloak-js", JSImport.Namespace)
  @js.native
  def apply(): KeycloakInstance = js.native
  @JSImport("keycloak-js", JSImport.Namespace)
  @js.native
  def apply(config: String): KeycloakInstance = js.native
  @JSImport("keycloak-js", JSImport.Namespace)
  @js.native
  def apply(config: KeycloakConfig): KeycloakInstance = js.native
  
  @js.native
  trait KeycloakAdapter extends StObject {
    
    def accountManagement(): KeycloakPromise[Unit, Unit] = js.native
    
    def login(): KeycloakPromise[Unit, Unit] = js.native
    def login(options: KeycloakLoginOptions): KeycloakPromise[Unit, Unit] = js.native
    
    def logout(): KeycloakPromise[Unit, Unit] = js.native
    def logout(options: KeycloakLogoutOptions): KeycloakPromise[Unit, Unit] = js.native
    
    def redirectUri(options: RedirectUri, encodeHash: Boolean): String = js.native
    
    def register(): KeycloakPromise[Unit, Unit] = js.native
    def register(options: KeycloakRegisterOptions): KeycloakPromise[Unit, Unit] = js.native
  }
  
  @js.native
  trait KeycloakConfig extends StObject {
    
    /**
    		 * Client identifier, example: 'myapp'
    		 */
    var clientId: String = js.native
    
    /**
    		 * Name of the realm, for example: 'myrealm'
    		 */
    var realm: String = js.native
    
    /**
    		 * URL to the Keycloak server, for example: http://keycloak-server/auth
    		 */
    var url: js.UndefOr[String] = js.native
  }
  object KeycloakConfig {
    
    @scala.inline
    def apply(clientId: String, realm: String): KeycloakConfig = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeycloakConfig]
    }
    
    @scala.inline
    implicit class KeycloakConfigMutableBuilder[Self <: KeycloakConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait KeycloakError extends StObject {
    
    var error: String = js.native
    
    var error_description: String = js.native
  }
  object KeycloakError {
    
    @scala.inline
    def apply(error: String, error_description: String): KeycloakError = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], error_description = error_description.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeycloakError]
    }
    
    @scala.inline
    implicit class KeycloakErrorMutableBuilder[Self <: KeycloakError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError_description(value: String): Self = StObject.set(x, "error_description", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.keycloakJs.keycloakJsStrings.standard
    - typings.keycloakJs.keycloakJsStrings.`implicit`
    - typings.keycloakJs.keycloakJsStrings.hybrid
  */
  trait KeycloakFlow extends StObject
  object KeycloakFlow {
    
    @scala.inline
    def hybrid: typings.keycloakJs.keycloakJsStrings.hybrid = "hybrid".asInstanceOf[typings.keycloakJs.keycloakJsStrings.hybrid]
    
    @scala.inline
    def `implicit`: typings.keycloakJs.keycloakJsStrings.`implicit` = "implicit".asInstanceOf[typings.keycloakJs.keycloakJsStrings.`implicit`]
    
    @scala.inline
    def standard: typings.keycloakJs.keycloakJsStrings.standard = "standard".asInstanceOf[typings.keycloakJs.keycloakJsStrings.standard]
  }
  
  @js.native
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
    implicit class KeycloakInitOptionsMutableBuilder[Self <: KeycloakInitOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdapter(value: default | cordova | `cordova-native` | KeycloakAdapter): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdapterUndefined: Self = StObject.set(x, "adapter", js.undefined)
      
      @scala.inline
      def setCheckLoginIframe(value: Boolean): Self = StObject.set(x, "checkLoginIframe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckLoginIframeInterval(value: Double): Self = StObject.set(x, "checkLoginIframeInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckLoginIframeIntervalUndefined: Self = StObject.set(x, "checkLoginIframeInterval", js.undefined)
      
      @scala.inline
      def setCheckLoginIframeUndefined: Self = StObject.set(x, "checkLoginIframe", js.undefined)
      
      @scala.inline
      def setEnableLogging(value: Boolean): Self = StObject.set(x, "enableLogging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableLoggingUndefined: Self = StObject.set(x, "enableLogging", js.undefined)
      
      @scala.inline
      def setFlow(value: KeycloakFlow): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlowUndefined: Self = StObject.set(x, "flow", js.undefined)
      
      @scala.inline
      def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
      
      @scala.inline
      def setOnLoad(value: KeycloakOnLoad): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setPkceMethod(value: KeycloakPkceMethod): Self = StObject.set(x, "pkceMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPkceMethodUndefined: Self = StObject.set(x, "pkceMethod", js.undefined)
      
      @scala.inline
      def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
      
      @scala.inline
      def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
      
      @scala.inline
      def setResponseMode(value: KeycloakResponseMode): Self = StObject.set(x, "responseMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseModeUndefined: Self = StObject.set(x, "responseMode", js.undefined)
      
      @scala.inline
      def setSilentCheckSsoFallback(value: Boolean): Self = StObject.set(x, "silentCheckSsoFallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentCheckSsoFallbackUndefined: Self = StObject.set(x, "silentCheckSsoFallback", js.undefined)
      
      @scala.inline
      def setSilentCheckSsoRedirectUri(value: String): Self = StObject.set(x, "silentCheckSsoRedirectUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentCheckSsoRedirectUriUndefined: Self = StObject.set(x, "silentCheckSsoRedirectUri", js.undefined)
      
      @scala.inline
      def setTimeSkew(value: Double): Self = StObject.set(x, "timeSkew", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeSkewUndefined: Self = StObject.set(x, "timeSkew", js.undefined)
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      @scala.inline
      def setUseNonce(value: Boolean): Self = StObject.set(x, "useNonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseNonceUndefined: Self = StObject.set(x, "useNonce", js.undefined)
    }
  }
  
  /**
  	 * A client for the Keycloak authentication server.
  	 * @see {@link https://keycloak.gitbooks.io/securing-client-applications-guide/content/topics/oidc/javascript-adapter.html|Keycloak JS adapter documentation}
  	 */
  @js.native
  trait KeycloakInstance extends StObject {
    
    /**
    		 * Redirects to the Account Management Console.
    		 */
    def accountManagement(): KeycloakPromise[Unit, Unit] = js.native
    
    /**
    		 * @private Undocumented.
    		 */
    var authServerUrl: js.UndefOr[String] = js.native
    
    /**
    		 * Is true if the user is authenticated, false otherwise.
    		 */
    var authenticated: js.UndefOr[Boolean] = js.native
    
    /**
    		 * Clears authentication state, including tokens. This can be useful if
    		 * the application has detected the session was expired, for example if
    		 * updating token fails. Invoking this results in Keycloak#onAuthLogout
    		 * callback listener being invoked.
    		 */
    def clearToken(): Unit = js.native
    
    /**
    		 * @private Undocumented.
    		 */
    var clientId: js.UndefOr[String] = js.native
    
    /**
    		 * @private Undocumented.
    		 */
    var clientSecret: js.UndefOr[String] = js.native
    
    /**
    		 * Returns the URL to the Account Management Console.
    		 */
    def createAccountUrl(): String = js.native
    
    /**
    		 * Returns the URL to login form.
    		 * @param options Supports same options as Keycloak#login.
    		 */
    def createLoginUrl(): String = js.native
    def createLoginUrl(options: KeycloakLoginOptions): String = js.native
    
    /**
    		 * Returns the URL to logout the user.
    		 * @param options Logout options.
    		 */
    def createLogoutUrl(): String = js.native
    def createLogoutUrl(options: KeycloakLogoutOptions): String = js.native
    
    /**
    		 * Returns the URL to registration page.
    		 * @param options The options used for creating the registration URL.
    		 */
    def createRegisterUrl(): String = js.native
    def createRegisterUrl(options: KeycloakRegisterOptions): String = js.native
    
    /**
    		 * Flow passed in init.
    		 */
    var flow: js.UndefOr[KeycloakFlow] = js.native
    
    /**
    		 * Returns true if the token has the given realm role.
    		 * @param role A realm role name.
    		 */
    def hasRealmRole(role: String): Boolean = js.native
    
    /**
    		 * Returns true if the token has the given role for the resource.
    		 * @param role A role name.
    		 * @param resource If not specified, `clientId` is used.
    		 */
    def hasResourceRole(role: String): Boolean = js.native
    def hasResourceRole(role: String, resource: String): Boolean = js.native
    
    /**
    		 * The base64 encoded ID token.
    		 */
    var idToken: js.UndefOr[String] = js.native
    
    /**
    		 * The parsed id token as a JavaScript object.
    		 */
    var idTokenParsed: js.UndefOr[KeycloakTokenParsed] = js.native
    
    /**
    		 * Called to initialize the adapter.
    		 * @param initOptions Initialization options.
    		 * @returns A promise to set functions to be invoked on success or error.
    		 */
    def init(initOptions: KeycloakInitOptions): KeycloakPromise[Boolean, KeycloakError] = js.native
    
    /**
    		 * Returns true if the token has less than `minValidity` seconds left before
    		 * it expires.
    		 * @param minValidity If not specified, `0` is used.
    		 */
    def isTokenExpired(): Boolean = js.native
    def isTokenExpired(minValidity: Double): Boolean = js.native
    
    /**
    		 * @private Undocumented.
    		 */
    def loadUserInfo(): KeycloakPromise[js.Object, Unit] = js.native
    
    /**
    		 * Loads the user's profile.
    		 * @returns A promise to set functions to be invoked on success or error.
    		 */
    def loadUserProfile(): KeycloakPromise[KeycloakProfile, Unit] = js.native
    
    /**
    		 * Redirects to login form.
    		 * @param options Login options.
    		 */
    def login(): KeycloakPromise[Unit, Unit] = js.native
    def login(options: KeycloakLoginOptions): KeycloakPromise[Unit, Unit] = js.native
    
    /**
    		 * @private Undocumented.
    		 */
    var loginRequired: js.UndefOr[Boolean] = js.native
    
    /**
    		 * Redirects to logout.
    		 * @param options Logout options.
    		 */
    def logout(): KeycloakPromise[Unit, Unit] = js.native
    def logout(options: KeycloakLogoutOptions): KeycloakPromise[Unit, Unit] = js.native
    
    /**
    		 * Called when a AIA has been requested by the application.
    		 */
    var onActionUpdate: js.UndefOr[js.Function1[/* status */ success | cancelled | error, Unit]] = js.native
    
    /**
    		 * Called if there was an error during authentication.
    		 */
    var onAuthError: js.UndefOr[js.Function1[/* errorData */ KeycloakError, Unit]] = js.native
    
    /**
    		 * Called if the user is logged out (will only be called if the session
    		 * status iframe is enabled, or in Cordova mode).
    		 */
    var onAuthLogout: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
    		 * Called if there was an error while trying to refresh the token.
    		 */
    var onAuthRefreshError: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
    		 * Called when the token is refreshed.
    		 */
    var onAuthRefreshSuccess: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
    		 * Called when a user is successfully authenticated.
    		 */
    var onAuthSuccess: js.UndefOr[js.Function0[Unit]] = js.native
    
    // KeycloakUserInfo;
    /**
    		 * Called when the adapter is initialized.
    		 */
    var onReady: js.UndefOr[js.Function1[/* authenticated */ js.UndefOr[Boolean], Unit]] = js.native
    
    /**
    		 * Called when the access token is expired. If a refresh token is available
    		 * the token can be refreshed with Keycloak#updateToken, or in cases where
    		 * it's not (ie. with implicit flow) you can redirect to login screen to
    		 * obtain a new access token.
    		 */
    var onTokenExpired: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
    		 * @private Undocumented.
    		 */
    var profile: js.UndefOr[KeycloakProfile] = js.native
    
    /**
    		 * @private Undocumented.
    		 */
    var realm: js.UndefOr[String] = js.native
    
    /**
    		 * The realm roles associated with the token.
    		 */
    var realmAccess: js.UndefOr[KeycloakRoles] = js.native
    
    /**
    		 * @private Undocumented.
    		 */
    var redirectUri: js.UndefOr[String] = js.native
    
    /**
    		 * The base64 encoded refresh token that can be used to retrieve a new token.
    		 */
    var refreshToken: js.UndefOr[String] = js.native
    
    /**
    		 * The parsed refresh token as a JavaScript object.
    		 */
    var refreshTokenParsed: js.UndefOr[KeycloakTokenParsed] = js.native
    
    /**
    		 * Redirects to registration form.
    		 * @param options The options used for the registration.
    		 */
    def register(): KeycloakPromise[Unit, Unit] = js.native
    def register(options: KeycloakRegisterOptions): KeycloakPromise[Unit, Unit] = js.native
    
    /**
    		 * The resource roles associated with the token.
    		 */
    var resourceAccess: js.UndefOr[KeycloakResourceAccess] = js.native
    
    /**
    		 * Response mode passed in init (default value is `'fragment'`).
    		 */
    var responseMode: js.UndefOr[KeycloakResponseMode] = js.native
    
    /**
    		 * Response type sent to Keycloak with login requests. This is determined
    		 * based on the flow value used during initialization, but can be overridden
    		 * by setting this value.
    		 */
    var responseType: js.UndefOr[KeycloakResponseType] = js.native
    
    /**
    		 * @private Undocumented.
    		 */
    var sessionId: js.UndefOr[String] = js.native
    
    /**
    		 * The user id.
    		 */
    var subject: js.UndefOr[String] = js.native
    
    /**
    		 * The estimated time difference between the browser time and the Keycloak
    		 * server in seconds. This value is just an estimation, but is accurate
    		 * enough when determining if a token is expired or not.
    		 */
    var timeSkew: js.UndefOr[Double] = js.native
    
    /**
    		 * The base64 encoded token that can be sent in the Authorization header in
    		 * requests to services.
    		 */
    var token: js.UndefOr[String] = js.native
    
    /**
    		 * The parsed token as a JavaScript object.
    		 */
    var tokenParsed: js.UndefOr[KeycloakTokenParsed] = js.native
    
    /**
    		 * If the token expires within `minValidity` seconds, the token is refreshed.
    		 * If the session status iframe is enabled, the session status is also
    		 * checked.
    		 * @returns A promise to set functions that can be invoked if the token is
    		 *          still valid, or if the token is no longer valid.
    		 * @example
    		 * ```js
    		 * keycloak.updateToken(5).success(function(refreshed) {
    		 *   if (refreshed) {
    		 *     alert('Token was successfully refreshed');
    		 *   } else {
    		 *     alert('Token is still valid');
    		 *   }
    		 * }).error(function() {
    		 *   alert('Failed to refresh the token, or the session has expired');
    		 * });
    		 */
    def updateToken(minValidity: Double): KeycloakPromise[Boolean, Boolean] = js.native
    
    /**
    		 * @private Undocumented.
    		 */
    var userInfo: js.UndefOr[js.Object] = js.native
  }
  
  @js.native
  trait KeycloakLoginOptions extends StObject {
    
    /**
    		 * If value is `'register'` then user is redirected to registration page,
    		 * otherwise to login page.
    		 */
    var action: js.UndefOr[String] = js.native
    
    /**
    		 * Specifies arguments that are passed to the Cordova in-app-browser (if applicable).
    		 * Options 'hidden' and 'location' are not affected by these arguments.
    		 * All available options are defined at https://cordova.apache.org/docs/en/latest/reference/cordova-plugin-inappbrowser/.
    		 * Example of use: { zoom: "no", hardwareback: "yes" }
    		 */
    var cordovaOptions: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
    		 * Used to tell Keycloak which IDP the user wants to authenticate with.
    		 */
    var idpHint: js.UndefOr[String] = js.native
    
    /**
    		 * Sets the 'ui_locales' query param in compliance with section 3.1.2.1
      * of the OIDC 1.0 specification.
    		 */
    var locale: js.UndefOr[String] = js.native
    
    /**
    		 * Used to pre-fill the username/email field on the login form.
    		 */
    var loginHint: js.UndefOr[String] = js.native
    
    /**
    		 * Used just if user is already authenticated. Specifies maximum time since
    		 * the authentication of user happened. If user is already authenticated for
    		 * longer time than `'maxAge'`, the SSO is ignored and he will need to
    		 * authenticate again.
    		 */
    var maxAge: js.UndefOr[Double] = js.native
    
    /**
    		 * By default the login screen is displayed if the user is not logged into
    		 * Keycloak. To only authenticate to the application if the user is already
    		 * logged in and not display the login page if the user is not logged in, set
    		 * this option to `'none'`. To always require re-authentication and ignore
    		 * SSO, set this option to `'login'`.
    		 */
    var prompt: js.UndefOr[none | login] = js.native
    
    /**
    		 * Specifies the uri to redirect to after login.
    		 */
    var redirectUri: js.UndefOr[String] = js.native
    
    /**
    		 * @private Undocumented.
    		 */
    var scope: js.UndefOr[String] = js.native
  }
  object KeycloakLoginOptions {
    
    @scala.inline
    def apply(): KeycloakLoginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeycloakLoginOptions]
    }
    
    @scala.inline
    implicit class KeycloakLoginOptionsMutableBuilder[Self <: KeycloakLoginOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setCordovaOptions(value: StringDictionary[String]): Self = StObject.set(x, "cordovaOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCordovaOptionsUndefined: Self = StObject.set(x, "cordovaOptions", js.undefined)
      
      @scala.inline
      def setIdpHint(value: String): Self = StObject.set(x, "idpHint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdpHintUndefined: Self = StObject.set(x, "idpHint", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setLoginHint(value: String): Self = StObject.set(x, "loginHint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoginHintUndefined: Self = StObject.set(x, "loginHint", js.undefined)
      
      @scala.inline
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setPrompt(value: none | login): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      @scala.inline
      def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  @js.native
  trait KeycloakLogoutOptions extends StObject {
    
    /**
    		 * Specifies the uri to redirect to after logout.
    		 */
    var redirectUri: js.UndefOr[String] = js.native
  }
  object KeycloakLogoutOptions {
    
    @scala.inline
    def apply(): KeycloakLogoutOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeycloakLogoutOptions]
    }
    
    @scala.inline
    implicit class KeycloakLogoutOptionsMutableBuilder[Self <: KeycloakLogoutOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.keycloakJs.keycloakJsStrings.`login-required`
    - typings.keycloakJs.keycloakJsStrings.`check-sso`
  */
  trait KeycloakOnLoad extends StObject
  object KeycloakOnLoad {
    
    @scala.inline
    def `check-sso`: typings.keycloakJs.keycloakJsStrings.`check-sso` = "check-sso".asInstanceOf[typings.keycloakJs.keycloakJsStrings.`check-sso`]
    
    @scala.inline
    def `login-required`: typings.keycloakJs.keycloakJsStrings.`login-required` = "login-required".asInstanceOf[typings.keycloakJs.keycloakJsStrings.`login-required`]
  }
  
  type KeycloakPkceMethod = S256
  
  @js.native
  trait KeycloakProfile extends StObject {
    
    var createdTimestamp: js.UndefOr[Double] = js.native
    
    var email: js.UndefOr[String] = js.native
    
    var emailVerified: js.UndefOr[Boolean] = js.native
    
    var enabled: js.UndefOr[Boolean] = js.native
    
    var firstName: js.UndefOr[String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var lastName: js.UndefOr[String] = js.native
    
    var totp: js.UndefOr[Boolean] = js.native
    
    var username: js.UndefOr[String] = js.native
  }
  object KeycloakProfile {
    
    @scala.inline
    def apply(): KeycloakProfile = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeycloakProfile]
    }
    
    @scala.inline
    implicit class KeycloakProfileMutableBuilder[Self <: KeycloakProfile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreatedTimestamp(value: Double): Self = StObject.set(x, "createdTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedTimestampUndefined: Self = StObject.set(x, "createdTimestamp", js.undefined)
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setEmailVerified(value: Boolean): Self = StObject.set(x, "emailVerified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailVerifiedUndefined: Self = StObject.set(x, "emailVerified", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
      
      @scala.inline
      def setTotp(value: Boolean): Self = StObject.set(x, "totp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotpUndefined: Self = StObject.set(x, "totp", js.undefined)
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  @js.native
  trait KeycloakPromise[TSuccess, TError]
    extends js.Promise[TSuccess] {
    
    /**
    		 * Function to call if the promised action throws an error.
    		 * 
    		 * @deprecated Use `.catch()` instead.
    		 */
    def error(callback: KeycloakPromiseCallback[TError]): KeycloakPromise[TSuccess, TError] = js.native
    
    /**
    		 * Function to call if the promised action succeeds.
    		 * 
    		 * @deprecated Use `.then()` instead.
    		 */
    def success(callback: KeycloakPromiseCallback[TSuccess]): KeycloakPromise[TSuccess, TError] = js.native
  }
  
  type KeycloakPromiseCallback[T] = js.Function1[/* result */ T, Unit]
  
  /* Inlined parent std.Omit<keycloak-js.keycloak-js.KeycloakLoginOptions, 'action'> */
  @js.native
  trait KeycloakRegisterOptions extends StObject {
    
    var cordovaOptions: js.UndefOr[StringDictionary[String]] = js.native
    
    var idpHint: js.UndefOr[String] = js.native
    
    var locale: js.UndefOr[String] = js.native
    
    var loginHint: js.UndefOr[String] = js.native
    
    var maxAge: js.UndefOr[Double] = js.native
    
    var prompt: js.UndefOr[none | login] = js.native
    
    var redirectUri: js.UndefOr[String] = js.native
    
    var scope: js.UndefOr[String] = js.native
  }
  object KeycloakRegisterOptions {
    
    @scala.inline
    def apply(): KeycloakRegisterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeycloakRegisterOptions]
    }
    
    @scala.inline
    implicit class KeycloakRegisterOptionsMutableBuilder[Self <: KeycloakRegisterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCordovaOptions(value: StringDictionary[String]): Self = StObject.set(x, "cordovaOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCordovaOptionsUndefined: Self = StObject.set(x, "cordovaOptions", js.undefined)
      
      @scala.inline
      def setIdpHint(value: String): Self = StObject.set(x, "idpHint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdpHintUndefined: Self = StObject.set(x, "idpHint", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setLoginHint(value: String): Self = StObject.set(x, "loginHint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoginHintUndefined: Self = StObject.set(x, "loginHint", js.undefined)
      
      @scala.inline
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setPrompt(value: none | login): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      @scala.inline
      def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  type KeycloakResourceAccess = StringDictionary[KeycloakRoles]
  
  /* Rewritten from type alias, can be one of: 
    - typings.keycloakJs.keycloakJsStrings.query
    - typings.keycloakJs.keycloakJsStrings.fragment
  */
  trait KeycloakResponseMode extends StObject
  object KeycloakResponseMode {
    
    @scala.inline
    def fragment: typings.keycloakJs.keycloakJsStrings.fragment = "fragment".asInstanceOf[typings.keycloakJs.keycloakJsStrings.fragment]
    
    @scala.inline
    def query: typings.keycloakJs.keycloakJsStrings.query = "query".asInstanceOf[typings.keycloakJs.keycloakJsStrings.query]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.keycloakJs.keycloakJsStrings.code
    - typings.keycloakJs.keycloakJsStrings.`id_token token`
    - typings.keycloakJs.keycloakJsStrings.`code id_token token`
  */
  trait KeycloakResponseType extends StObject
  object KeycloakResponseType {
    
    @scala.inline
    def code: typings.keycloakJs.keycloakJsStrings.code = "code".asInstanceOf[typings.keycloakJs.keycloakJsStrings.code]
    
    @scala.inline
    def `code id_token token`: typings.keycloakJs.keycloakJsStrings.`code id_token token` = ("code id_token token").asInstanceOf[typings.keycloakJs.keycloakJsStrings.`code id_token token`]
    
    @scala.inline
    def `id_token token`: typings.keycloakJs.keycloakJsStrings.`id_token token` = ("id_token token").asInstanceOf[typings.keycloakJs.keycloakJsStrings.`id_token token`]
  }
  
  @js.native
  trait KeycloakRoles extends StObject {
    
    var roles: js.Array[String] = js.native
  }
  object KeycloakRoles {
    
    @scala.inline
    def apply(roles: js.Array[String]): KeycloakRoles = {
      val __obj = js.Dynamic.literal(roles = roles.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeycloakRoles]
    }
    
    @scala.inline
    implicit class KeycloakRolesMutableBuilder[Self <: KeycloakRoles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value :_*))
    }
  }
  
  @js.native
  trait KeycloakTokenParsed extends StObject {
    
    var exp: js.UndefOr[Double] = js.native
    
    var iat: js.UndefOr[Double] = js.native
    
    var nonce: js.UndefOr[String] = js.native
    
    var realm_access: js.UndefOr[KeycloakRoles] = js.native
    
    var resource_access: js.UndefOr[KeycloakResourceAccess] = js.native
    
    var session_state: js.UndefOr[String] = js.native
    
    var sub: js.UndefOr[String] = js.native
  }
  object KeycloakTokenParsed {
    
    @scala.inline
    def apply(): KeycloakTokenParsed = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeycloakTokenParsed]
    }
    
    @scala.inline
    implicit class KeycloakTokenParsedMutableBuilder[Self <: KeycloakTokenParsed] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExp(value: Double): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpUndefined: Self = StObject.set(x, "exp", js.undefined)
      
      @scala.inline
      def setIat(value: Double): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIatUndefined: Self = StObject.set(x, "iat", js.undefined)
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      @scala.inline
      def setRealm_access(value: KeycloakRoles): Self = StObject.set(x, "realm_access", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRealm_accessUndefined: Self = StObject.set(x, "realm_access", js.undefined)
      
      @scala.inline
      def setResource_access(value: KeycloakResourceAccess): Self = StObject.set(x, "resource_access", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResource_accessUndefined: Self = StObject.set(x, "resource_access", js.undefined)
      
      @scala.inline
      def setSession_state(value: String): Self = StObject.set(x, "session_state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSession_stateUndefined: Self = StObject.set(x, "session_state", js.undefined)
      
      @scala.inline
      def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubUndefined: Self = StObject.set(x, "sub", js.undefined)
    }
  }
}
