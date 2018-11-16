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
  var cookieOptions: js.UndefOr[expressLib.expressMod.eNs.CookieOptions] = js.undefined
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

