package typings.keycloakJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.keycloakJs.keycloakJsStrings.login
import typings.keycloakJs.keycloakJsStrings.none
import typings.keycloakJs.keycloakJsStrings.register
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeycloakLoginOptions extends js.Object {
  /**
  		 * If value is `'register'` then user is redirected to registration page,
  		 * otherwise to login page.
  		 */
  var action: js.UndefOr[register] = js.undefined
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
  		 * Specifies the desired Keycloak locale for the UI.  This differs from
    * the locale param in that it tells the Keycloak server to set a cookie and update
    * the user's profile to a new preferred locale.
  		 */
  var kcLocale: js.UndefOr[String] = js.undefined
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
  		 * @private Undocumented.
  		 */
  var scope: js.UndefOr[String] = js.undefined
}

object KeycloakLoginOptions {
  @scala.inline
  def apply(
    action: register = null,
    cordovaOptions: StringDictionary[String] = null,
    idpHint: String = null,
    kcLocale: String = null,
    locale: String = null,
    loginHint: String = null,
    maxAge: Int | Double = null,
    prompt: none | login = null,
    redirectUri: String = null,
    scope: String = null
  ): KeycloakLoginOptions = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (cordovaOptions != null) __obj.updateDynamic("cordovaOptions")(cordovaOptions.asInstanceOf[js.Any])
    if (idpHint != null) __obj.updateDynamic("idpHint")(idpHint.asInstanceOf[js.Any])
    if (kcLocale != null) __obj.updateDynamic("kcLocale")(kcLocale.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (loginHint != null) __obj.updateDynamic("loginHint")(loginHint.asInstanceOf[js.Any])
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (prompt != null) __obj.updateDynamic("prompt")(prompt.asInstanceOf[js.Any])
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeycloakLoginOptions]
  }
}

