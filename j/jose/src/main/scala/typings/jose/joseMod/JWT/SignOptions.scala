package typings.jose.joseMod.JWT

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignOptions extends js.Object {
  var algorithm: js.UndefOr[String] = js.undefined
  var audience: js.UndefOr[String | js.Array[String]] = js.undefined
  var expiresIn: js.UndefOr[String] = js.undefined
  var header: js.UndefOr[js.Object] = js.undefined
  var iat: js.UndefOr[Boolean] = js.undefined
  var issuer: js.UndefOr[String] = js.undefined
  var jti: js.UndefOr[String] = js.undefined
  var kid: js.UndefOr[Boolean] = js.undefined
  var nonce: js.UndefOr[String] = js.undefined
  var notBefore: js.UndefOr[String] = js.undefined
  var now: js.UndefOr[Date] = js.undefined
  var subject: js.UndefOr[String] = js.undefined
}

object SignOptions {
  @scala.inline
  def apply(
    algorithm: String = null,
    audience: String | js.Array[String] = null,
    expiresIn: String = null,
    header: js.Object = null,
    iat: js.UndefOr[Boolean] = js.undefined,
    issuer: String = null,
    jti: String = null,
    kid: js.UndefOr[Boolean] = js.undefined,
    nonce: String = null,
    notBefore: String = null,
    now: Date = null,
    subject: String = null
  ): SignOptions = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm)
    if (audience != null) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    if (expiresIn != null) __obj.updateDynamic("expiresIn")(expiresIn)
    if (header != null) __obj.updateDynamic("header")(header)
    if (!js.isUndefined(iat)) __obj.updateDynamic("iat")(iat)
    if (issuer != null) __obj.updateDynamic("issuer")(issuer)
    if (jti != null) __obj.updateDynamic("jti")(jti)
    if (!js.isUndefined(kid)) __obj.updateDynamic("kid")(kid)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    if (notBefore != null) __obj.updateDynamic("notBefore")(notBefore)
    if (now != null) __obj.updateDynamic("now")(now)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    __obj.asInstanceOf[SignOptions]
  }
}

