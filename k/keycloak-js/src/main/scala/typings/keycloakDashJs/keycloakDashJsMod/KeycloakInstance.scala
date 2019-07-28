package typings.keycloakDashJs.keycloakDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// export interface KeycloakUserInfo {}
/**
	 * A client for the Keycloak authentication server.
	 * @see {@link https://keycloak.gitbooks.io/securing-client-applications-guide/content/topics/oidc/javascript-adapter.html|Keycloak JS adapter documentation}
	 */
@js.native
trait KeycloakInstance extends js.Object {
  /**
  		 * @private Undocumented.
  		 */
  var authServerUrl: js.UndefOr[String] = js.native
  /**
  		 * Is true if the user is authenticated, false otherwise.
  		 */
  var authenticated: js.UndefOr[Boolean] = js.native
  /**
  		 * @private Undocumented.
  		 */
  var clientId: js.UndefOr[String] = js.native
  /**
  		 * @private Undocumented.
  		 */
  var clientSecret: js.UndefOr[String] = js.native
  /**
  		 * Flow passed in init.
  		 */
  var flow: js.UndefOr[KeycloakFlow] = js.native
  /**
  		 * The base64 encoded ID token.
  		 */
  var idToken: js.UndefOr[String] = js.native
  /**
  		 * The parsed id token as a JavaScript object.
  		 */
  var idTokenParsed: js.UndefOr[KeycloakTokenParsed] = js.native
  /**
  		 * @private Undocumented.
  		 */
  var loginRequired: js.UndefOr[Boolean] = js.native
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
  		 * @private Undocumented.
  		 */
  var userInfo: js.UndefOr[js.Object] = js.native
  /**
  		 * Redirects to the Account Management Console.
  		 */
  def accountManagement(): KeycloakPromise[Unit, Unit] = js.native
  /**
  		 * Clears authentication state, including tokens. This can be useful if
  		 * the application has detected the session was expired, for example if
  		 * updating token fails. Invoking this results in Keycloak#onAuthLogout
  		 * callback listener being invoked.
  		 */
  def clearToken(): Unit = js.native
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
  		 * @param options.redirectUri Specifies the uri to redirect to after logout.
  		 */
  def createLogoutUrl(): String = js.native
  def createLogoutUrl(options: js.Any): String = js.native
  /**
  		 * Returns the URL to registration page.
  		 * @param options Supports same options as Keycloak#createLoginUrl but
  		 *                `action` is set to `'register'`.
  		 */
  def createRegisterUrl(): String = js.native
  def createRegisterUrl(options: KeycloakLoginOptions): String = js.native
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
  		 * Redirects to logout.
  		 * @param options Logout options.
  		 * @param options.redirectUri Specifies the uri to redirect to after logout.
  		 */
  def logout(): KeycloakPromise[Unit, Unit] = js.native
  def logout(options: js.Any): KeycloakPromise[Unit, Unit] = js.native
  /**
  		 * Redirects to registration form.
  		 * @param options Supports same options as Keycloak#login but `action` is
  		 *                set to `'register'`.
  		 */
  def register(): KeycloakPromise[Unit, Unit] = js.native
  def register(options: js.Any): KeycloakPromise[Unit, Unit] = js.native
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
}

