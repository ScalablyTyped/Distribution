package typings.hapiBell.mod

import typings.hapiBell.anon.ExtendedProfile
import typings.hapiBell.anon.Uri
import typings.hapiHapi.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionalOptions extends js.Object {
  /**
    * allows passing query parameters from a bell protected endpoint to the auth request.
    * It will merge the query params you pass along with the providerParams and any other predefined ones.
    * Be aware that this will override predefined query parameters!
    * Default to false.
    */
  var allowRuntimeProviderParams: js.UndefOr[StringLikeMap | Boolean] = js.native
  /**
    * a configuration object used to customize the provider settings.
    * The built-in 'twitter' provider accepts the `extendedProfile` & `getMethod` options.
    * option which allows disabling the extra profile request when the provider
    * returns the user information in the callback (defaults to true).
    * The built-in 'github' and 'phabricator' providers accept the uri
    * option which allows pointing to a private enterprise installation (e.g. 'https://vpn.example.com').
    * See Providers documentation for more information.
    */
  var config: js.UndefOr[ExtendedProfile | Uri] = js.native
  /**
    * the name of the cookie used to manage the temporary state.
    * Defaults to 'bell-provider' where 'provider' is the provider name (or 'custom' for custom providers).
    * For example, the Twitter cookie name defaults to 'bell-twitter'.
    */
  var cookie: js.UndefOr[String] = js.native
  /**
    * the domain scope.
    * Defaults to null (no domain).
    */
  var domain: js.UndefOr[String] = js.native
  // THESE ARE IN THE *REQUIRED* section but are actually not...
  /**
    * A boolean indicating whether or not you want the redirect_uri to be forced to https.
    * Useful if your hapi application runs as http, but is accessed through https.
    */
  var forceHttps: js.UndefOr[Boolean] = js.native
  /**
    * sets the cookie HTTP only flag.
    * Defaults to true.
    */
  var isHttpOnly: js.UndefOr[Boolean] = js.native
  /**
    * sets the cookie secure flag.
    * Defaults to true.
    */
  var isSecure: js.UndefOr[Boolean] = js.native
  /**
    * Set the base redirect_uri manually if it cannot be inferred properly from server settings.
    * Useful to override port, protocol, and host if proxied or forwarded.
    */
  var location: js.UndefOr[String | (js.Function1[/* req */ Request, String])] = js.native
  /**
    * an object of key-value pairs that specify additional
    * URL query parameters to send with the profile request to the provider.
    * The built-in facebook provider,
    * for example, could have fields specified to determine the fields returned from the user's graph,
    * which would then be available to you in the auth.credentials.profile.raw object.
    */
  var profileParams: js.UndefOr[StringLikeMap] = js.native
  /**
    * provider-specific query parameters for the authentication endpoint.
    * It may be passed either as an object to merge into the query string,
    * or a function which takes the client's request and returns an object.
    * Each provider supports its own set of parameters which customize the user's login experience.
    * For example:
    * * Facebook supports `display` ('page', 'popup', or 'touch'), `auth_type`, `auth_nonce`.
    * * Google supports `access_type`, `approval_prompt`, `prompt`, `login_hint`, `user_id`, `hd`.
    * * Twitter supports `force_login`, `screen_name`.
    * * Linkedin supports `fields`.
    */
  var providerParams: js.UndefOr[StringLikeMap | (js.Function1[/* request */ Request, StringLikeMap])] = js.native
  /**
    * allows passing additional OAuth state from initial request.
    * This must be a function returning a string,
    * which will be appended to the bell internal state parameter for OAuth code flow.
    */
  var runtimeStateCallback: js.UndefOr[js.Function1[/* req */ Request, String]] = js.native
  /**
    * Each built-in vendor comes with the required scope for basic profile information.
    * Use scope to specify a different scope as required by your application.
    * It may be passed either as an object to merge into the query string,
    * or a function which takes the client's request and returns an object.
    * Consult the provider for their specific supported scopes.
    */
  var scope: js.UndefOr[js.Array[String] | (js.Function1[/* request */ Request, js.Array[String]])] = js.native
  /**
    * skips obtaining a user profile from the provider.
    * Useful if you need specific scopes,
    * but not the user profile.
    * Defaults to false.
    */
  var skipProfile: js.UndefOr[Boolean] = js.native
  /**
    * cookie time-to-live in milliseconds.
    * Defaults to null (session time-life - cookies are deleted when the browser is closed).
    */
  var ttl: js.UndefOr[Double] = js.native
}

object OptionalOptions {
  @scala.inline
  def apply(): OptionalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionalOptions]
  }
  @scala.inline
  implicit class OptionalOptionsOps[Self <: OptionalOptions] (val x: Self) extends AnyVal {
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
    def setAllowRuntimeProviderParams(value: StringLikeMap | Boolean): Self = this.set("allowRuntimeProviderParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowRuntimeProviderParams: Self = this.set("allowRuntimeProviderParams", js.undefined)
    @scala.inline
    def setConfig(value: ExtendedProfile | Uri): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setCookie(value: String): Self = this.set("cookie", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookie: Self = this.set("cookie", js.undefined)
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setForceHttps(value: Boolean): Self = this.set("forceHttps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceHttps: Self = this.set("forceHttps", js.undefined)
    @scala.inline
    def setIsHttpOnly(value: Boolean): Self = this.set("isHttpOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsHttpOnly: Self = this.set("isHttpOnly", js.undefined)
    @scala.inline
    def setIsSecure(value: Boolean): Self = this.set("isSecure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSecure: Self = this.set("isSecure", js.undefined)
    @scala.inline
    def setLocationFunction1(value: /* req */ Request => String): Self = this.set("location", js.Any.fromFunction1(value))
    @scala.inline
    def setLocation(value: String | (js.Function1[/* req */ Request, String])): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setProfileParams(value: StringLikeMap): Self = this.set("profileParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileParams: Self = this.set("profileParams", js.undefined)
    @scala.inline
    def setProviderParamsFunction1(value: /* request */ Request => StringLikeMap): Self = this.set("providerParams", js.Any.fromFunction1(value))
    @scala.inline
    def setProviderParams(value: StringLikeMap | (js.Function1[/* request */ Request, StringLikeMap])): Self = this.set("providerParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProviderParams: Self = this.set("providerParams", js.undefined)
    @scala.inline
    def setRuntimeStateCallback(value: /* req */ Request => String): Self = this.set("runtimeStateCallback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRuntimeStateCallback: Self = this.set("runtimeStateCallback", js.undefined)
    @scala.inline
    def setScopeVarargs(value: String*): Self = this.set("scope", js.Array(value :_*))
    @scala.inline
    def setScopeFunction1(value: /* request */ Request => js.Array[String]): Self = this.set("scope", js.Any.fromFunction1(value))
    @scala.inline
    def setScope(value: js.Array[String] | (js.Function1[/* request */ Request, js.Array[String]])): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setSkipProfile(value: Boolean): Self = this.set("skipProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipProfile: Self = this.set("skipProfile", js.undefined)
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
  }
  
}

