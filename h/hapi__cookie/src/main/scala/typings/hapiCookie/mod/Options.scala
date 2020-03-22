package typings.hapiCookie.mod

import typings.hapiCookie.ServerStateCookieOptionsn
import typings.hapiHapi.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options passed to 'hapi.auth.strategy' when this plugin is used
  */
trait Options extends js.Object {
  /**
    * Only works if 'redirectTo' is true
    * If set to true, a string, or an object, appends the current request path to the query component of the 'redirectTo' URI.
    */
  var appendNext: js.UndefOr[Boolean | String] = js.undefined
  /**
    * Cookie options.
    *
    * @default { name: 'sid', clearInvalid: false, isSameSite: 'Strict', isSecure: true, isHttpOnly: true }
    */
  var cookie: js.UndefOr[ServerStateCookieOptionsn] = js.undefined
  /**
    * Automatically sets the session cookie after validation to extend the current session for a new TTL duration.
    *
    * @default false
    */
  var keepAlive: js.UndefOr[Boolean] = js.undefined
  /**
    * Login URI or function that returns a URI to redirect unauthenticated requests to.
    * Note that it will only trigger when the authentication mode is 'required'.
    * Defaults to no redirection.
    */
  var redirectTo: js.UndefOr[String | RedirectToFunction] = js.undefined
  /**
    * A name to use with decorating the request object.
    * Using multiple decorator names for separate authentication strategies could allow a developer to call the methods for the wrong strategy.
    * Potentially resulting in unintended authorized access.
    *
    * @default 'cookieAuth'
    */
  var requestDecoratorName: js.UndefOr[String] = js.undefined
  /**
    * An optional session validation function used to validate the content of the session cookie on each request.
    * Used to verify that the internal session state is still valid (e.g. user account still exists).
    */
  var validateFunc: js.UndefOr[ValidateFunction] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    appendNext: Boolean | String = null,
    cookie: ServerStateCookieOptionsn = null,
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    redirectTo: String | RedirectToFunction = null,
    requestDecoratorName: String = null,
    validateFunc: (/* request */ js.UndefOr[Request], /* session */ js.UndefOr[js.Object]) => js.Promise[ValidateResponse] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (appendNext != null) __obj.updateDynamic("appendNext")(appendNext.asInstanceOf[js.Any])
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive.asInstanceOf[js.Any])
    if (redirectTo != null) __obj.updateDynamic("redirectTo")(redirectTo.asInstanceOf[js.Any])
    if (requestDecoratorName != null) __obj.updateDynamic("requestDecoratorName")(requestDecoratorName.asInstanceOf[js.Any])
    if (validateFunc != null) __obj.updateDynamic("validateFunc")(js.Any.fromFunction2(validateFunc))
    __obj.asInstanceOf[Options]
  }
}

