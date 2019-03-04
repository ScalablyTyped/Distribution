package typings
package koaDashJwtLib.koaDashJwtMod.jwtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var algorithms: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var audience: js.UndefOr[java.lang.String] = js.undefined
  var cookie: js.UndefOr[java.lang.String] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var getToken: js.UndefOr[
    js.Function2[
      /* ctx */ koaLib.koaMod.ApplicationNs.Context, 
      /* opts */ this.type, 
      java.lang.String
    ]
  ] = js.undefined
  var isRevoked: js.UndefOr[
    js.Function3[
      /* ctx */ koaLib.koaMod.ApplicationNs.Context, 
      /* decodedToken */ js.Object, 
      /* token */ java.lang.String, 
      js.Promise[scala.Boolean]
    ]
  ] = js.undefined
  var issuer: js.UndefOr[java.lang.String] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var passthrough: js.UndefOr[scala.Boolean] = js.undefined
  var secret: java.lang.String | js.Array[java.lang.String] | nodeLib.Buffer | js.Array[nodeLib.Buffer] | SecretLoader
  var tokenKey: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    secret: java.lang.String | js.Array[java.lang.String] | nodeLib.Buffer | js.Array[nodeLib.Buffer] | SecretLoader,
    algorithms: js.Array[java.lang.String] = null,
    audience: java.lang.String = null,
    cookie: java.lang.String = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    getToken: js.Function2[/* ctx */ koaLib.koaMod.ApplicationNs.Context, Options, java.lang.String] = null,
    isRevoked: js.Function3[
      /* ctx */ koaLib.koaMod.ApplicationNs.Context, 
      /* decodedToken */ js.Object, 
      /* token */ java.lang.String, 
      js.Promise[scala.Boolean]
    ] = null,
    issuer: java.lang.String = null,
    key: java.lang.String = null,
    passthrough: js.UndefOr[scala.Boolean] = js.undefined,
    tokenKey: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
    if (algorithms != null) __obj.updateDynamic("algorithms")(algorithms)
    if (audience != null) __obj.updateDynamic("audience")(audience)
    if (cookie != null) __obj.updateDynamic("cookie")(cookie)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (getToken != null) __obj.updateDynamic("getToken")(getToken)
    if (isRevoked != null) __obj.updateDynamic("isRevoked")(isRevoked)
    if (issuer != null) __obj.updateDynamic("issuer")(issuer)
    if (key != null) __obj.updateDynamic("key")(key)
    if (!js.isUndefined(passthrough)) __obj.updateDynamic("passthrough")(passthrough)
    if (tokenKey != null) __obj.updateDynamic("tokenKey")(tokenKey)
    __obj.asInstanceOf[Options]
  }
}

