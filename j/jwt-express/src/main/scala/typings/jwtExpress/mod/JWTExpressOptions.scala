package typings.jwtExpress.mod

import typings.express.mod.CookieOptions
import typings.jsonwebtoken.mod.SignOptions
import typings.jsonwebtoken.mod.VerifyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JWTExpressOptions extends js.Object {
  /**
    * The name of the cookie (default: 'jwt-express')
    */
  var cookie: js.UndefOr[String] = js.undefined
  /**
    * Options to use when storing the cookie (default: {httpOnly: true})
    */
  var cookieOptions: js.UndefOr[CookieOptions] = js.undefined
  /**
    * If true, will use cookies, otherwise will use the Authorization header (default: true)
    */
  var cookies: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates if the JWT should be refreshed and stored every request (default: true)
    */
  var refresh: js.UndefOr[Boolean] = js.undefined
  /**
    * The property of req to populate (default: 'jwt')
    */
  var reqProperty: js.UndefOr[String] = js.undefined
  /**
    * jwt.revoke() will call this function (default: function(jwt) {})
    */
  var revoke: js.UndefOr[js.Function1[/* jwt */ JWT, Unit]] = js.undefined
  /**
    * Options to use when signing the JWT (default: {})
    */
  var signOptions: js.UndefOr[SignOptions] = js.undefined
  /**
    * Milliseconds when the jwt will go stale (default: 900000 (15 minutes))
    */
  var stales: js.UndefOr[Double] = js.undefined
  /**
    * Additional verification. Must return a boolean (default: function(jwt) {return true})
    */
  var verify: js.UndefOr[js.Function1[/* jwt */ JWT, Boolean]] = js.undefined
  /**
    * Options to use when verifying the JWT (default: {})
    */
  var verifyOptions: js.UndefOr[VerifyOptions] = js.undefined
}

object JWTExpressOptions {
  @scala.inline
  def apply(
    cookie: String = null,
    cookieOptions: CookieOptions = null,
    cookies: js.UndefOr[Boolean] = js.undefined,
    refresh: js.UndefOr[Boolean] = js.undefined,
    reqProperty: String = null,
    revoke: /* jwt */ JWT => Unit = null,
    signOptions: SignOptions = null,
    stales: js.UndefOr[Double] = js.undefined,
    verify: /* jwt */ JWT => Boolean = null,
    verifyOptions: VerifyOptions = null
  ): JWTExpressOptions = {
    val __obj = js.Dynamic.literal()
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (cookieOptions != null) __obj.updateDynamic("cookieOptions")(cookieOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(cookies)) __obj.updateDynamic("cookies")(cookies.get.asInstanceOf[js.Any])
    if (!js.isUndefined(refresh)) __obj.updateDynamic("refresh")(refresh.get.asInstanceOf[js.Any])
    if (reqProperty != null) __obj.updateDynamic("reqProperty")(reqProperty.asInstanceOf[js.Any])
    if (revoke != null) __obj.updateDynamic("revoke")(js.Any.fromFunction1(revoke))
    if (signOptions != null) __obj.updateDynamic("signOptions")(signOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(stales)) __obj.updateDynamic("stales")(stales.get.asInstanceOf[js.Any])
    if (verify != null) __obj.updateDynamic("verify")(js.Any.fromFunction1(verify))
    if (verifyOptions != null) __obj.updateDynamic("verifyOptions")(verifyOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWTExpressOptions]
  }
}

