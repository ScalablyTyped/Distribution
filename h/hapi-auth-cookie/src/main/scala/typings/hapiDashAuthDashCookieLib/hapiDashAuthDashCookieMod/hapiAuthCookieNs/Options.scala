package typings
package hapiDashAuthDashCookieLib.hapiDashAuthDashCookieMod.hapiAuthCookieNs

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
  var appendNext: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /**
    * Any authentication cookie that fails validation will be marked as expired in the response and cleared.
    *
    * @default false
    */
  var clearInvalid: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The cookie name.
    *
    * @default 'sid'
    */
  var cookie: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets the cookie Domain value.
    * Defaults to none.
    */
  var domain: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If false, the cookie will not include the 'HttpOnly' flag.
    *
    * @default true
    */
  var isHttpOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If false omitted.
    * Other options Strict or Lax.
    *
    * @default 'Strict'
    */
  var isSameSite: js.UndefOr[
    hapiDashAuthDashCookieLib.hapiDashAuthDashCookieLibNumbers.`false` | hapiDashAuthDashCookieLib.hapiDashAuthDashCookieLibStrings.Strict | hapiDashAuthDashCookieLib.hapiDashAuthDashCookieLibStrings.Lax
  ] = js.undefined
  /**
    * If false, the cookie is allowed to be transmitted over insecure connections which exposes it to attacks.
    *
    * @default true
    */
  var isSecure: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Automatically sets the session cookie after validation to extend the current session for a new TTL duration.
    *
    * @default false
    */
  var keepAlive: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Used for Iron cookie encoding.
    * Should be at least 32 characters long.
    */
  var password: java.lang.String
  /**
    * Sets the cookie path value.
    *
    * @default '/'
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Login URI or function that returns a URI to redirect unauthenticated requests to.
    * Note that it will only trigger when the authentication mode is 'required'.
    * Defaults to no redirection.
    */
  var redirectTo: js.UndefOr[java.lang.String | RedirectToFunction] = js.undefined
  /**
    * A name to use with decorating the request object.
    * Using multiple decorator names for separate authentication strategies could allow a developer to call the methods for the wrong strategy.
    * Potentially resulting in unintended authorized access.
    *
    * @default 'cookieAuth'
    */
  var requestDecoratorName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets the cookie expires time in milliseconds.
    * Required when 'keepAlive' is true.
    * Defaults to single browser session (ends when browser closes).
    */
  var ttl: js.UndefOr[scala.Double] = js.undefined
  /**
    * An optional session validation function used to validate the content of the session cookie on each request.
    * Used to verify that the internal session state is still valid (e.g. user account still exists).
    */
  var validateFunc: js.UndefOr[ValidateFunction] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    password: java.lang.String,
    appendNext: scala.Boolean | java.lang.String = null,
    clearInvalid: js.UndefOr[scala.Boolean] = js.undefined,
    cookie: java.lang.String = null,
    domain: java.lang.String = null,
    isHttpOnly: js.UndefOr[scala.Boolean] = js.undefined,
    isSameSite: hapiDashAuthDashCookieLib.hapiDashAuthDashCookieLibNumbers.`false` | hapiDashAuthDashCookieLib.hapiDashAuthDashCookieLibStrings.Strict | hapiDashAuthDashCookieLib.hapiDashAuthDashCookieLibStrings.Lax = null,
    isSecure: js.UndefOr[scala.Boolean] = js.undefined,
    keepAlive: js.UndefOr[scala.Boolean] = js.undefined,
    path: java.lang.String = null,
    redirectTo: java.lang.String | RedirectToFunction = null,
    requestDecoratorName: java.lang.String = null,
    ttl: scala.Int | scala.Double = null,
    validateFunc: ValidateFunction = null
  ): Options = {
    val __obj = js.Dynamic.literal(password = password)
    if (appendNext != null) __obj.updateDynamic("appendNext")(appendNext.asInstanceOf[js.Any])
    if (!js.isUndefined(clearInvalid)) __obj.updateDynamic("clearInvalid")(clearInvalid)
    if (cookie != null) __obj.updateDynamic("cookie")(cookie)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (!js.isUndefined(isHttpOnly)) __obj.updateDynamic("isHttpOnly")(isHttpOnly)
    if (isSameSite != null) __obj.updateDynamic("isSameSite")(isSameSite.asInstanceOf[js.Any])
    if (!js.isUndefined(isSecure)) __obj.updateDynamic("isSecure")(isSecure)
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive)
    if (path != null) __obj.updateDynamic("path")(path)
    if (redirectTo != null) __obj.updateDynamic("redirectTo")(redirectTo.asInstanceOf[js.Any])
    if (requestDecoratorName != null) __obj.updateDynamic("requestDecoratorName")(requestDecoratorName)
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    if (validateFunc != null) __obj.updateDynamic("validateFunc")(validateFunc)
    __obj.asInstanceOf[Options]
  }
}

