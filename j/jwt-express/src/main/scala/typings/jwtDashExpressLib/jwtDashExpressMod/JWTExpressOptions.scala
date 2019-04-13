package typings
package jwtDashExpressLib.jwtDashExpressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JWTExpressOptions extends js.Object {
  /**
    * The name of the cookie (default: 'jwt-express')
    */
  var cookie: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Options to use when storing the cookie (default: {httpOnly: true})
    */
  var cookieOptions: js.UndefOr[expressLib.expressMod.CookieOptions] = js.undefined
  /**
    * If true, will use cookies, otherwise will use the Authorization header (default: true)
    */
  var cookies: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates if the JWT should be refreshed and stored every request (default: true)
    */
  var refresh: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The property of req to populate (default: 'jwt')
    */
  var reqProperty: js.UndefOr[java.lang.String] = js.undefined
  /**
    * jwt.revoke() will call this function (default: function(jwt) {})
    */
  var revoke: js.UndefOr[js.Function1[/* jwt */ JWT, scala.Unit]] = js.undefined
  /**
    * Options to use when signing the JWT (default: {})
    */
  var signOptions: js.UndefOr[jsonwebtokenLib.jsonwebtokenMod.SignOptions] = js.undefined
  /**
    * Milliseconds when the jwt will go stale (default: 900000 (15 minutes))
    */
  var stales: js.UndefOr[scala.Double] = js.undefined
  /**
    * Additional verification. Must return a boolean (default: function(jwt) {return true})
    */
  var verify: js.UndefOr[js.Function1[/* jwt */ JWT, scala.Boolean]] = js.undefined
  /**
    * Options to use when verifying the JWT (default: {})
    */
  var verifyOptions: js.UndefOr[jsonwebtokenLib.jsonwebtokenMod.VerifyOptions] = js.undefined
}

object JWTExpressOptions {
  @scala.inline
  def apply(
    cookie: java.lang.String = null,
    cookieOptions: expressLib.expressMod.CookieOptions = null,
    cookies: js.UndefOr[scala.Boolean] = js.undefined,
    refresh: js.UndefOr[scala.Boolean] = js.undefined,
    reqProperty: java.lang.String = null,
    revoke: /* jwt */ JWT => scala.Unit = null,
    signOptions: jsonwebtokenLib.jsonwebtokenMod.SignOptions = null,
    stales: scala.Int | scala.Double = null,
    verify: /* jwt */ JWT => scala.Boolean = null,
    verifyOptions: jsonwebtokenLib.jsonwebtokenMod.VerifyOptions = null
  ): JWTExpressOptions = {
    val __obj = js.Dynamic.literal()
    if (cookie != null) __obj.updateDynamic("cookie")(cookie)
    if (cookieOptions != null) __obj.updateDynamic("cookieOptions")(cookieOptions)
    if (!js.isUndefined(cookies)) __obj.updateDynamic("cookies")(cookies)
    if (!js.isUndefined(refresh)) __obj.updateDynamic("refresh")(refresh)
    if (reqProperty != null) __obj.updateDynamic("reqProperty")(reqProperty)
    if (revoke != null) __obj.updateDynamic("revoke")(js.Any.fromFunction1(revoke))
    if (signOptions != null) __obj.updateDynamic("signOptions")(signOptions)
    if (stales != null) __obj.updateDynamic("stales")(stales.asInstanceOf[js.Any])
    if (verify != null) __obj.updateDynamic("verify")(js.Any.fromFunction1(verify))
    if (verifyOptions != null) __obj.updateDynamic("verifyOptions")(verifyOptions)
    __obj.asInstanceOf[JWTExpressOptions]
  }
}

