package typings.jose.mod.JWT

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
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (audience != null) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    if (expiresIn != null) __obj.updateDynamic("expiresIn")(expiresIn.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(iat)) __obj.updateDynamic("iat")(iat.get.asInstanceOf[js.Any])
    if (issuer != null) __obj.updateDynamic("issuer")(issuer.asInstanceOf[js.Any])
    if (jti != null) __obj.updateDynamic("jti")(jti.asInstanceOf[js.Any])
    if (!js.isUndefined(kid)) __obj.updateDynamic("kid")(kid.get.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (notBefore != null) __obj.updateDynamic("notBefore")(notBefore.asInstanceOf[js.Any])
    if (now != null) __obj.updateDynamic("now")(now.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignOptions]
  }
}

