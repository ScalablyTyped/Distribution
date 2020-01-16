package typings.jsonwebtoken.jsonwebtokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignOptions extends js.Object {
  /**
    * Signature algorithm. Could be one of these values :
    * - HS256:    HMAC using SHA-256 hash algorithm (default)
    * - HS384:    HMAC using SHA-384 hash algorithm
    * - HS512:    HMAC using SHA-512 hash algorithm
    * - RS256:    RSASSA using SHA-256 hash algorithm
    * - RS384:    RSASSA using SHA-384 hash algorithm
    * - RS512:    RSASSA using SHA-512 hash algorithm
    * - ES256:    ECDSA using P-256 curve and SHA-256 hash algorithm
    * - ES384:    ECDSA using P-384 curve and SHA-384 hash algorithm
    * - ES512:    ECDSA using P-521 curve and SHA-512 hash algorithm
    * - none:     No digital signature or MAC value included
    */
  var algorithm: js.UndefOr[Algorithm] = js.undefined
  var audience: js.UndefOr[String | js.Array[String]] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  /** expressed in seconds or a string describing a time span [zeit/ms](https://github.com/zeit/ms.js).  Eg: 60, "2 days", "10h", "7d" */
  var expiresIn: js.UndefOr[String | Double] = js.undefined
  var header: js.UndefOr[js.Object] = js.undefined
  var issuer: js.UndefOr[String] = js.undefined
  var jwtid: js.UndefOr[String] = js.undefined
  var keyid: js.UndefOr[String] = js.undefined
  var mutatePayload: js.UndefOr[Boolean] = js.undefined
  var noTimestamp: js.UndefOr[Boolean] = js.undefined
  /** expressed in seconds or a string describing a time span [zeit/ms](https://github.com/zeit/ms.js).  Eg: 60, "2 days", "10h", "7d" */
  var notBefore: js.UndefOr[String | Double] = js.undefined
  var subject: js.UndefOr[String] = js.undefined
}

object SignOptions {
  @scala.inline
  def apply(
    algorithm: Algorithm = null,
    audience: String | js.Array[String] = null,
    encoding: String = null,
    expiresIn: String | Double = null,
    header: js.Object = null,
    issuer: String = null,
    jwtid: String = null,
    keyid: String = null,
    mutatePayload: js.UndefOr[Boolean] = js.undefined,
    noTimestamp: js.UndefOr[Boolean] = js.undefined,
    notBefore: String | Double = null,
    subject: String = null
  ): SignOptions = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (audience != null) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (expiresIn != null) __obj.updateDynamic("expiresIn")(expiresIn.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (issuer != null) __obj.updateDynamic("issuer")(issuer.asInstanceOf[js.Any])
    if (jwtid != null) __obj.updateDynamic("jwtid")(jwtid.asInstanceOf[js.Any])
    if (keyid != null) __obj.updateDynamic("keyid")(keyid.asInstanceOf[js.Any])
    if (!js.isUndefined(mutatePayload)) __obj.updateDynamic("mutatePayload")(mutatePayload.asInstanceOf[js.Any])
    if (!js.isUndefined(noTimestamp)) __obj.updateDynamic("noTimestamp")(noTimestamp.asInstanceOf[js.Any])
    if (notBefore != null) __obj.updateDynamic("notBefore")(notBefore.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignOptions]
  }
}

