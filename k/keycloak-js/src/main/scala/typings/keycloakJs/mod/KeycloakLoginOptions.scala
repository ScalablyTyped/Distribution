package typings.keycloakJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.keycloakJs.keycloakJsStrings.login
import typings.keycloakJs.keycloakJsStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeycloakLoginOptions extends js.Object {
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
  implicit class KeycloakLoginOptionsOps[Self <: KeycloakLoginOptions] (val x: Self) extends AnyVal {
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setCordovaOptions(value: StringDictionary[String]): Self = this.set("cordovaOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCordovaOptions: Self = this.set("cordovaOptions", js.undefined)
    @scala.inline
    def setIdpHint(value: String): Self = this.set("idpHint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdpHint: Self = this.set("idpHint", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setLoginHint(value: String): Self = this.set("loginHint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoginHint: Self = this.set("loginHint", js.undefined)
    @scala.inline
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    @scala.inline
    def setPrompt(value: none | login): Self = this.set("prompt", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrompt: Self = this.set("prompt", js.undefined)
    @scala.inline
    def setRedirectUri(value: String): Self = this.set("redirectUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirectUri: Self = this.set("redirectUri", js.undefined)
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
  
}

