package typings
package keycloakDashJsLib.keycloakDashJsMod.KeycloakNs

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
  var checkLoginIframe: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * Set the interval to check login state (in seconds).
  		 * @default 5
  		 */
  var checkLoginIframeInterval: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * Set the OpenID Connect flow.
  		 * @default standard
  		 */
  var flow: js.UndefOr[KeycloakFlow] = js.undefined
  /**
  		 * Set an initial value for the id token (only together with `token` or
  		 * `refreshToken`).
  		 */
  var idToken: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * Specifies an action to do on load.
  		 */
  var onLoad: js.UndefOr[KeycloakOnLoad] = js.undefined
  /**
  		 * Specifies a default uri to redirect to after login or logout.
  		 * This is currently supported for adapter 'cordova-native' and 'default'
  		 */
  var redirectUri: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * Set an initial value for the refresh token.
  		 */
  var refreshToken: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * Set the OpenID Connect response mode to send to Keycloak upon login.
  		 * @default fragment After successful authentication Keycloak will redirect
  		 *                   to JavaScript application with OpenID Connect parameters
  		 *                   added in URL fragment. This is generally safer and
  		 *                   recommended over query.
  		 */
  var responseMode: js.UndefOr[KeycloakResponseMode] = js.undefined
  /**
  		 * Set an initial value for skew between local time and Keycloak server in
  		 * seconds (only together with `token` or `refreshToken`).
  		 */
  var timeSkew: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * Set an initial value for the token.
  		 */
  var token: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * @private Undocumented.
  		 */
  var useNonce: js.UndefOr[scala.Boolean] = js.undefined
}

