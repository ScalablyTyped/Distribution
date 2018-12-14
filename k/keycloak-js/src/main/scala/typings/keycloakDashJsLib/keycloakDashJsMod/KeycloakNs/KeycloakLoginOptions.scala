package typings
package keycloakDashJsLib.keycloakDashJsMod.KeycloakNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait KeycloakLoginOptions extends js.Object {
  /**
  		 * If value is `'register'` then user is redirected to registration page,
  		 * otherwise to login page.
  		 */
  var action: js.UndefOr[keycloakDashJsLib.keycloakDashJsLibStrings.register] = js.undefined
  /**
  		 * Specifies arguments that are passed to the Cordova in-app-browser (if applicable).
  		 * Options 'hidden' and 'location' are not affected by these arguments.
  		 * All available options are defined at https://cordova.apache.org/docs/en/latest/reference/cordova-plugin-inappbrowser/.
  		 * Example of use: { zoom: "no", hardwareback: "yes" }
  		 */
  var cordovaOptions: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
  		 * Used to tell Keycloak which IDP the user wants to authenticate with.
  		 */
  var idpHint: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * Specifies the desired Keycloak locale for the UI.  This differs from
                   * the locale param in that it tells the Keycloak server to set a cookie and update
                   * the user's profile to a new preferred locale.
  		 */
  var kcLocale: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * Sets the 'ui_locales' query param in compliance with section 3.1.2.1
                   * of the OIDC 1.0 specification.
  		 */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * Used to pre-fill the username/email field on the login form.
  		 */
  var loginHint: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * Used just if user is already authenticated. Specifies maximum time since
  		 * the authentication of user happened. If user is already authenticated for
  		 * longer time than `'maxAge'`, the SSO is ignored and he will need to
  		 * authenticate again.
  		 */
  var maxAge: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * By default the login screen is displayed if the user is not logged into
  		 * Keycloak. To only authenticate to the application if the user is already
  		 * logged in and not display the login page if the user is not logged in, set
  		 * this option to `'none'`. To always require re-authentication and ignore
  		 * SSO, set this option to `'login'`.
  		 */
  var prompt: js.UndefOr[
    keycloakDashJsLib.keycloakDashJsLibStrings.none | keycloakDashJsLib.keycloakDashJsLibStrings.login
  ] = js.undefined
  /**
  		 * Specifies the uri to redirect to after login.
  		 */
  var redirectUri: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * @private Undocumented.
  		 */
  var scope: js.UndefOr[java.lang.String] = js.undefined
}

