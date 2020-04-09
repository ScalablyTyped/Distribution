package typings.keycloakJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeycloakInitOptions extends js.Object {
  /**
  		 * Allows to use different adapter:
  		 * 
  		 * - {string} default - using browser api for redirects
  		 * - {string} cordova - using cordova plugins 
  		 * - {function} - allows to provide custom function as adapter.
  		 */
  var adapter: js.UndefOr[KeycloakAdapterName] = js.undefined
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
  		 * Specifies an uri to redirect to after silent check-sso.
  		 * Silent check-sso will only happen, when this redirect uri is given and
  		 * the specified uri is available whithin the application.
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
  @scala.inline
  def apply(
    adapter: KeycloakAdapterName = null,
    checkLoginIframe: js.UndefOr[Boolean] = js.undefined,
    checkLoginIframeInterval: Int | Double = null,
    enableLogging: js.UndefOr[Boolean] = js.undefined,
    flow: KeycloakFlow = null,
    idToken: String = null,
    onLoad: KeycloakOnLoad = null,
    pkceMethod: KeycloakPkceMethod = null,
    redirectUri: String = null,
    refreshToken: String = null,
    responseMode: KeycloakResponseMode = null,
    silentCheckSsoRedirectUri: String = null,
    timeSkew: Int | Double = null,
    token: String = null,
    useNonce: js.UndefOr[Boolean] = js.undefined
  ): KeycloakInitOptions = {
    val __obj = js.Dynamic.literal()
    if (adapter != null) __obj.updateDynamic("adapter")(adapter.asInstanceOf[js.Any])
    if (!js.isUndefined(checkLoginIframe)) __obj.updateDynamic("checkLoginIframe")(checkLoginIframe.asInstanceOf[js.Any])
    if (checkLoginIframeInterval != null) __obj.updateDynamic("checkLoginIframeInterval")(checkLoginIframeInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLogging)) __obj.updateDynamic("enableLogging")(enableLogging.asInstanceOf[js.Any])
    if (flow != null) __obj.updateDynamic("flow")(flow.asInstanceOf[js.Any])
    if (idToken != null) __obj.updateDynamic("idToken")(idToken.asInstanceOf[js.Any])
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad.asInstanceOf[js.Any])
    if (pkceMethod != null) __obj.updateDynamic("pkceMethod")(pkceMethod.asInstanceOf[js.Any])
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri.asInstanceOf[js.Any])
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken.asInstanceOf[js.Any])
    if (responseMode != null) __obj.updateDynamic("responseMode")(responseMode.asInstanceOf[js.Any])
    if (silentCheckSsoRedirectUri != null) __obj.updateDynamic("silentCheckSsoRedirectUri")(silentCheckSsoRedirectUri.asInstanceOf[js.Any])
    if (timeSkew != null) __obj.updateDynamic("timeSkew")(timeSkew.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (!js.isUndefined(useNonce)) __obj.updateDynamic("useNonce")(useNonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeycloakInitOptions]
  }
}

