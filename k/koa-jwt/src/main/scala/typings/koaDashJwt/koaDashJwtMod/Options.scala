package typings.koaDashJwt.koaDashJwtMod

import typings.koa.koaMod.Context
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var algorithms: js.UndefOr[js.Array[String]] = js.undefined
  var audience: js.UndefOr[String | js.Array[String]] = js.undefined
  var cookie: js.UndefOr[String] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var getToken: js.UndefOr[js.Function2[/* ctx */ Context, /* opts */ this.type, String]] = js.undefined
  var isRevoked: js.UndefOr[
    js.Function3[
      /* ctx */ Context, 
      /* decodedToken */ js.Object, 
      /* token */ String, 
      js.Promise[Boolean]
    ]
  ] = js.undefined
  var issuer: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var passthrough: js.UndefOr[Boolean] = js.undefined
  var secret: String | (js.Array[Buffer | String]) | Buffer | SecretLoader
  var tokenKey: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    secret: String | (js.Array[Buffer | String]) | Buffer | SecretLoader,
    algorithms: js.Array[String] = null,
    audience: String | js.Array[String] = null,
    cookie: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    getToken: (/* ctx */ Context, Options) => String = null,
    isRevoked: (/* ctx */ Context, /* decodedToken */ js.Object, /* token */ String) => js.Promise[Boolean] = null,
    issuer: String = null,
    key: String = null,
    passthrough: js.UndefOr[Boolean] = js.undefined,
    tokenKey: String = null
  ): Options = {
    val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
    if (algorithms != null) __obj.updateDynamic("algorithms")(algorithms.asInstanceOf[js.Any])
    if (audience != null) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (getToken != null) __obj.updateDynamic("getToken")(js.Any.fromFunction2(getToken))
    if (isRevoked != null) __obj.updateDynamic("isRevoked")(js.Any.fromFunction3(isRevoked))
    if (issuer != null) __obj.updateDynamic("issuer")(issuer.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(passthrough)) __obj.updateDynamic("passthrough")(passthrough.asInstanceOf[js.Any])
    if (tokenKey != null) __obj.updateDynamic("tokenKey")(tokenKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

